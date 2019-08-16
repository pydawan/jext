package br.org.jext;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extrai valores dos atributos indicados de cada objeto em uma coleção de objetos.
 * 
 * @author thiago-amm
 * @version v1.0.0 14/08/2019
 * @since v1.0.0
 */
public class ValueExtractor {
    
    private static ValueExtractor instance;
    private List<Object> objects;
    private List<String> fields;
    private Map<String, Integer> mapper;
    private Object object;
    
    private ValueExtractor() {
        this.objects = new ArrayList<>();
        this.fields = new ArrayList<>();
        this.mapper = new HashMap<>(); 
    }
    
    private static ValueExtractor of() {
        return new ValueExtractor();
    }
    
    private static void validateIfNullOrEmpty(String name, Object object) throws IllegalArgumentException {
        String exceptionMessage = "";
        if (object == null) {
            exceptionMessage = String.format("Argumento inválido: %s não existe (%s == null)!", name, name);
        }
        if (object.getClass().isArray()) {
            if (Array.getLength(object) == 0) {
                exceptionMessage = String.format("Argumento inválido: %s não pode estar vazio (%s.length == 0)!", name, name);
            }
        }
        if (object.getClass().isAssignableFrom(Collection.class)) {
            Collection<?> collection = (Collection<?>) object;
            if (collection.isEmpty()) {
                exceptionMessage = String.format("Argumento inválido: %s não pode estar vazio ( %s.isEmpty() )!", name, name);
            }
        }
        if (object.getClass().isAssignableFrom(String.class)) {
            String string = (String) object;
            if (string.isEmpty()) {
                exceptionMessage = String.format("Argumento inválido: %s não pode estar vazio ( %s.isEmpty() )!", name, name);
            }
        }
        if ( !exceptionMessage.isEmpty() ) {
            throw new IllegalArgumentException(exceptionMessage);
        }
    }
    
    public static ValueExtractor extract(String... fields) throws IllegalArgumentException {
        validateIfNullOrEmpty("fields", fields);
        instance = ValueExtractor.of();
        for (int i = 0; i < fields.length; i++) {
            instance.fields.add(fields[i]);
            instance.mapper.put(fields[i], i);
        }
        return instance;
    }
    
    public static ValueExtractor extract(List<String> fields) throws IllegalArgumentException {
        validateIfNullOrEmpty("fields", fields);
        extract(fields.toArray(new String[0]));
        return instance;
    }
    
    public ValueExtractor from(Object... objects) throws IllegalArgumentException {
        validateIfNullOrEmpty("objects", objects);
        for (Object object : objects) {
            instance.objects.add(object);
        }
        return instance;
    }
    
    public ValueExtractor from(List<Object> objects) throws IllegalArgumentException {
        validateIfNullOrEmpty("objects", objects);
        from(objects.toArray());
        return instance;
    }
    
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(Class<T> clazz) throws IllegalArgumentException, IllegalStateException {
        validateIfNullOrEmpty("clazz", clazz);
        validateIfNullOrEmpty("objects", instance.objects);
        validateIfNullOrEmpty("fields", instance.fields);
        T[] _extractedValues = null;
        try {
            _extractedValues = (T[]) Array.newInstance(clazz, instance.objects.size());
            Object _object = instance.objects.get(0);
            Class<?> _class = _object.getClass();
            String _fieldName = instance.fields.get(0);
            Field _field = _class.getDeclaredField(_fieldName);
            Object _fieldValue = null;
            _field.setAccessible(true);
            for (int i = 0; i < instance.objects.size(); i++) {
                _object = instance.objects.get(i);
                _fieldValue = _field.get(_object);
                Array.set(_extractedValues, i, _fieldValue);
            }
        } catch (Exception e) {
            // TODO tratar exceções específicas para cada caso.
            System.out.println(e.getMessage()); 
        }
        return (T[]) _extractedValues; 
    }
    
    public Object[] toArray() throws IllegalArgumentException, IllegalStateException {
        Object[] _extractedValues = null;
        try {
            validateIfNullOrEmpty("objects", instance.objects);
            validateIfNullOrEmpty("fields", instance.fields);
            Object _object = null;
            Class<?> _class = null;
            String _fieldName = "";
            Field _field = null;
            Object _fieldValue = null;
            _extractedValues = (Object[]) Array.newInstance(Object.class, instance.objects.size());
            for (int i = 0; i < instance.objects.size(); i++) {
                _object = instance.objects.get(i);
                _class = _object.getClass();
                Object[] _extractedValue = (Object[]) Array.newInstance(Object.class, instance.fields.size());
                for (int j = 0; j < instance.fields.size(); j++) {
                    _fieldName = instance.fields.get(j);
                    _field = _class.getDeclaredField(_fieldName);
                    _field.setAccessible(true);
                    _fieldValue = _field.get(_object);
                    Array.set(_extractedValue, j, _fieldValue);
                }
                Array.set(_extractedValues, i, _extractedValue);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return _extractedValues; 
    }
    
    public static ValueExtractor on(Object object) throws IllegalArgumentException {
        if (!object.getClass().isArray()) {
            throw new IllegalArgumentException("Argumento inválido: object não é um Object[]!");
        }
        instance.object = object;
        return instance;
    }
    
    public Object field(String field) throws IllegalArgumentException {
        validateIfNullOrEmpty("object", instance.object);
        validateIfNullOrEmpty("field", field);
        Object[] objects = (Object[]) instance.object;
        Integer index = instance.mapper.get(field);
        return index != null ? objects[index] : null;
    }
    
    public static Object field(String field, Object object) throws IllegalArgumentException {
        ValueExtractor.on(object);
        return instance.field(field);
    }
    
    public static String format(String formatter, Object[] array) throws IllegalArgumentException {
        validateIfNullOrEmpty("formatter", formatter);
        validateIfNullOrEmpty("array", array);
        String regex = "\\$\\{\\w+\\}";
        StringBuilder sb = new StringBuilder();
        for (Object object : array) {
            String text = new String(formatter);
            String placeholder = "";
            String field = "";
            Object value = null;
            Integer index = null;
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(formatter);
            while (matcher.find()) {
                placeholder = matcher.group();
                field = placeholder.replace("$", "");
                field = field.replace("{", "");
                field = field.replace("}", "");
                index = instance.mapper.get(field);
                value = ValueExtractor.field(field, object);
                if (index != null) {
                    text = text.replace(placeholder, "" + value);
                } else {
                    text = text.replace(placeholder, "" + null);
                }
            }
            sb.append(text);
        }
        return sb.toString();
    }
    
}
