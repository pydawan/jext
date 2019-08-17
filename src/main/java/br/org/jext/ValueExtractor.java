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
 * Extrai valores dos atributos indicados de cada objeto em uma coleção de
 * objetos.
 * 
 * @author thiago-amm
 * @version v1.0.0 14/08/2019
 * @since v1.0.0
 */
public class ValueExtractor {
    
    class ValueExtraction {
        
        private List<String> fields;
        private List<Object> objects;
        private Map<String, Integer> mapper;
        private Object[] array;
        private List<Map<String, Object>> maps;
        private static final String ARRAY_VALUE_EXTRACTION = "ARRAY_VALUE_EXTRACTION";
        private static final String MAP_VALUE_EXTRACTION = "MAP_VALUE_EXTRACTION";
        private String extractionType;
        
        public ValueExtraction() {
            this.fields = new ArrayList<>();
            this.objects = new ArrayList<>();
            this.mapper = new HashMap<>();
        }
        
        public List<String> getFields() {
            return fields;
        }
        
        public List<Object> getObjects() {
            return objects;
        }
        
        public Map<String, Integer> getMapper() {
            return mapper;
        }
        
        public void setFields(String... fields) throws IllegalArgumentException {
            validateIfNullOrEmpty("fields", fields);
            for (int i = 0; i < fields.length; i++) {
                this.fields.add(fields[i]);
                this.mapper.put(fields[i], i);
            }
        }
        
        public void setFields(List<String> fields) throws IllegalArgumentException {
            this.setFields(fields != null ? fields.toArray(new String[0]) : null);
        }
        
        public void setObjects(Object... objects) throws IllegalArgumentException {
            validateIfNullOrEmpty("objects", objects);
            for (Object object : objects) {
                this.objects.add(object);
            }
        }
        
        public void setObjects(List<Object> objects) throws IllegalArgumentException {
            this.setObjects(objects != null ? objects.toArray() : null);
        }
        
        @SuppressWarnings("unchecked")
        public <T> T[] toArray(Class<T> clazz) throws IllegalArgumentException, IllegalStateException {
            validateIfNullOrEmpty("clazz", clazz);
            validateIfNullOrEmpty("objects", this.objects);
            validateIfNullOrEmpty("fields", this.fields);
            T[] _extractedValues = null;
            try {
                _extractedValues = (T[]) Array.newInstance(clazz, this.objects.size());
                Object _object = this.objects.get(0);
                Class<?> _class = _object.getClass();
                String _fieldName = this.fields.get(0);
                Field _field = _class.getDeclaredField(_fieldName);
                Object _fieldValue = null;
                _field.setAccessible(true);
                for (int i = 0; i < this.objects.size(); i++) {
                    _object = this.objects.get(i);
                    _fieldValue = _field.get(_object);
                    Array.set(_extractedValues, i, _fieldValue);
                }
                this.extractionType = ValueExtraction.ARRAY_VALUE_EXTRACTION;
            } catch (Exception e) {
                // TODO tratar exceções específicas para cada caso.
                System.out.println(e.getMessage());
            }
            return (T[]) _extractedValues;
        }
        
        public ValueExtraction toArray() throws IllegalArgumentException, IllegalStateException {
            Object[] _extractedValues = null;
            try {
                validateIfNullOrEmpty("objects", this.objects);
                validateIfNullOrEmpty("fields", this.fields);
                Object _object = null;
                Class<?> _class = null;
                String _fieldName = "";
                Field _field = null;
                Object _fieldValue = null;
                _extractedValues = (Object[]) Array.newInstance(Object.class, this.objects.size());
                for (int i = 0; i < this.objects.size(); i++) {
                    _object = this.objects.get(i);
                    _class = _object.getClass();
                    Object[] _extractedValue = (Object[]) Array.newInstance(Object.class, this.fields.size());
                    for (int j = 0; j < this.fields.size(); j++) {
                        _fieldName = this.fields.get(j);
                        _field = _class.getDeclaredField(_fieldName);
                        _field.setAccessible(true);
                        _fieldValue = _field.get(_object);
                        Array.set(_extractedValue, j, _fieldValue);
                    }
                    Array.set(_extractedValues, i, _extractedValue);
                }
                this.array = _extractedValues;
                this.extractionType = ValueExtraction.ARRAY_VALUE_EXTRACTION;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return this;
        }
        
        public ValueExtraction toMap() throws IllegalArgumentException, IllegalStateException {
            List<Map<String, Object>> _extractedValues = null;
            try {
                validateIfNullOrEmpty("objects", this.objects);
                validateIfNullOrEmpty("fields", this.fields);
                Object _object = null;
                Class<?> _class = null;
                String _fieldName = "";
                Field _field = null;
                Object _fieldValue = null;
                _extractedValues = new ArrayList<>();
                for (int i = 0; i < this.objects.size(); i++) {
                    _object = this.objects.get(i);
                    _class = _object.getClass();
                    Map<String, Object> _extractedValue = new HashMap<>();
                    for (int j = 0; j < this.fields.size(); j++) {
                        _fieldName = this.fields.get(j);
                        _field = _class.getDeclaredField(_fieldName);
                        _field.setAccessible(true);
                        _fieldValue = _field.get(_object);
                        _extractedValue.put(_fieldName, _fieldValue);
                    }
                    _extractedValues.add(_extractedValue);
                }
                this.maps = _extractedValues;
                this.extractionType = ValueExtraction.MAP_VALUE_EXTRACTION;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return this;
        }
        
        public String format(String formatter) throws IllegalArgumentException {
            validateIfNullOrEmpty("formatter", formatter);
            validateIfNullOrEmpty("array", array);
            String regex = "\\$\\{\\w+\\}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(formatter);
            StringBuilder sb = new StringBuilder();
            String text = new String(formatter);
            String placeholder = "";
            String field = "";
            Object value = null;
            if (this.extractionType.equals(ARRAY_VALUE_EXTRACTION)) {
                Integer index = null;
                for (Object object : this.array) {
                    text = new String(formatter);
                    placeholder = "";
                    field = "";
                    value = null;
                    index = null;
                    pattern = Pattern.compile(regex);
                    matcher = pattern.matcher(formatter);
                    while (matcher.find()) {
                        placeholder = matcher.group();
                        field = placeholder.replace("$", "");
                        field = field.replace("{", "");
                        field = field.replace("}", "");
                        index = instance.valueExtraction.getMapper().get(field);
                        value = ValueExtractor.field(field, object);
                        if (index != null) {
                            text = text.replace(placeholder, "" + value);
                        } else {
                            text = text.replace(placeholder, "" + null);
                        }
                    }
                    sb.append(text);
                }
            } else if (this.extractionType.equals(MAP_VALUE_EXTRACTION)) {
                for (Map<String, Object> map : this.maps) {
                    text = new String(formatter);
                    placeholder = "";
                    field = "";
                    value = null;
                    pattern = Pattern.compile(regex);
                    matcher = pattern.matcher(formatter);
                    while (matcher.find()) {
                        placeholder = matcher.group();
                        field = placeholder.replace("$", "");
                        field = field.replace("{", "");
                        field = field.replace("}", "");
                        value = map.get(field);
                        text = text.replace(placeholder, "" + value);
                    }
                    sb.append(text);
                }
            } else {
                
            }
            return sb.toString();
        }
        
        public void print(String formatter) throws IllegalArgumentException {
            if (this.extractionType.equals(ARRAY_VALUE_EXTRACTION)) {
                System.out.printf(this.format(formatter));
            } else if (this.extractionType.equals(MAP_VALUE_EXTRACTION)) {
                System.out.printf(this.format(formatter));
            } else {
                
            }
        }
        
        public Object[] getArray() throws IllegalStateException {
            if (this.extractionType.equals(MAP_VALUE_EXTRACTION)) {
                throw new IllegalArgumentException("Estado inválido: não é possível obter um array com uma extração que não produziu um array!");
            }
            return this.array;
        }
        
        public List<Map<String, Object>> getMap() throws IllegalArgumentException {
            if (this.extractionType.equals(ARRAY_VALUE_EXTRACTION)) {
                throw new IllegalArgumentException("Estado inválido: não é possível obter um mapa com uma extração que não produziu um mapa!");
            }
            return this.maps;
        }
        
    }

    private static ValueExtractor instance;
    private ValueExtraction valueExtraction;
    private Object object;

    private ValueExtractor() {
        this.valueExtraction = new ValueExtraction();
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
                exceptionMessage = String.format(
                    "Argumento inválido: %s não pode estar vazio (%s.length == 0)!", name, name
                );
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
        if (!exceptionMessage.isEmpty()) {
            throw new IllegalArgumentException(exceptionMessage);
        }
    }

    public static ValueExtractor extract(String... fields) throws IllegalArgumentException {
        instance = ValueExtractor.of();
        instance.valueExtraction.setFields(fields);
        return instance;
    }

    public static ValueExtractor extract(List<String> fields) throws IllegalArgumentException {
        extract(fields != null ? fields.toArray(new String[0]) : null);
        return instance;
    }

    public ValueExtractor from(Object... objects) throws IllegalArgumentException {
        instance.valueExtraction.setObjects(objects);
        return instance;
    }

    public ValueExtractor from(List<Object> objects) throws IllegalArgumentException {
        instance.from(objects != null ? objects.toArray() : null);
        return instance;
    }
    
    public <T> T[] toArray(Class<T> clazz) throws IllegalArgumentException, IllegalStateException {
        return instance.valueExtraction.toArray(clazz);
    }

    public ValueExtraction toArray() throws IllegalArgumentException, IllegalStateException {
        instance.valueExtraction.toArray();
        return instance.valueExtraction;
    }

    public ValueExtraction toMap() throws IllegalArgumentException, IllegalStateException {
        instance.valueExtraction.toMap();
        return instance.valueExtraction;
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
        Integer index = instance.valueExtraction.getMapper().get(field);
        return index != null ? objects[index] : null;
    }

    public static Object field(String field, Object object) throws IllegalArgumentException {
        ValueExtractor.on(object);
        return instance.field(field);
    }

}
