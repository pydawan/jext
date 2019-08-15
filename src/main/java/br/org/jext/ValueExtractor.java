package br.org.jext;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author thiago-amm
 *
 */
public class ValueExtractor {
    
    private static ValueExtractor instance;
    private List<Object> objects;
    private List<String> fields;
    
    private ValueExtractor() {
        this.objects = new ArrayList<>();
        this.fields = new ArrayList<>();
    }
    
    private static ValueExtractor of() {
        return new ValueExtractor();
    }
    
    public static ValueExtractor extract(List<String> fields) throws IllegalArgumentException {
        if (fields == null) {
            throw new IllegalArgumentException("Argumento inválido: fields == null!");
        }
        instance = ValueExtractor.of();
        instance.fields = fields;
        return instance;
    }
    
    public ValueExtractor from(Object... objects) throws IllegalArgumentException {
        if (objects == null) {
            throw new IllegalArgumentException("Argumento inválido: objects == null!");
        }
        for (Object object : objects) {
            instance.objects.add(object);
        }
        return instance;
    }
    
    public ValueExtractor from(List<Object> objects) throws IllegalArgumentException {
        if (objects == null) {
            throw new IllegalArgumentException("Argumento inválido: objects == null!");
        }
        instance.objects = objects;
        return instance;
    }
    
    public static ValueExtractor extract(String... fields) throws IllegalArgumentException {
        if (fields == null) {
            throw new IllegalArgumentException("Argumento inválido: fields == null!");
        }
        instance = ValueExtractor.of();
        for (String field : fields) {
            instance.fields.add(field);
        }
        return instance;
    }
    
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(Class<T> _class) throws IllegalArgumentException, IllegalStateException {
        if (_class == null) {
            throw new IllegalArgumentException("Argumento inválido: _classes == null!");
        }
        T[] extractedValues = null;
        try {
            extractedValues = (T[]) Array.newInstance(_class, instance.objects.size());
            Object object = null;
            Field _field = null;
            for (int i = 0; i < instance.objects.size(); i++) {
                object = instance.objects.get(i);
                _field = object.getClass().getDeclaredField(instance.fields.get(0));
                _field.setAccessible(true);
                Array.set(extractedValues, i, _field.get(object));
            }
        } catch (Exception e) {
            // TODO tratar exceções específicas para cada caso.
            System.out.println(e.getMessage()); 
        }
        return (T[]) extractedValues; 
    }
    
    @SuppressWarnings("unchecked")
    public <T> T[] toArray() throws IllegalArgumentException, IllegalStateException {
        if (instance.objects == null || instance.objects.isEmpty()) {
            throw new IllegalStateException("Estado inválido: nenhuma coleção de objetos foi informada!");
        }
        if (instance.fields == null || instance.fields.isEmpty()) {
            throw new IllegalStateException("Estado inválido: nenhum campo a ser extraído dos objetos da coleção foi informado!");
        }
        T[] extractedValues = null;
        if (instance.fields.size() == 1) {
            try {
                Object object = instance.objects.get(0);
                Field _field = object.getClass().getDeclaredField(instance.fields.get(0));
                _field.setAccessible(true);
                extractedValues = (T[]) Array.newInstance(_field.get(object).getClass(), instance.objects.size());
                for (int i = 0; i < instance.objects.size(); i++) {
                    object = instance.objects.get(i);
                    _field = object.getClass().getDeclaredField(instance.fields.get(0));
                    _field.setAccessible(true);
                    Array.set(extractedValues, i, _field.get(object));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage()); 
            }
        }
        return (T[]) extractedValues; 
    }
    
    public Object toArray(Class<?>... _classes) throws IllegalArgumentException, IllegalStateException {
        String exceptionMessage = "";
        if (_classes == null) {
            exceptionMessage = "Argumento inválido: _classes == null!";
            throw new IllegalArgumentException(exceptionMessage);
        }
        if (_classes.length != instance.fields.size()) {
            exceptionMessage = "Estado inválido: a quantidade de fields e tipos não é a mesma!";
            throw new IllegalStateException(exceptionMessage);
        }
        Object extractedValues = null;
        try {
            extractedValues = Array.newInstance(Object.class, instance.objects.size());
            Object object = null;
            Field _field = null;
            String field = "";
            Object[] extractedValue = null;
            int fieldsSize = instance.fields.size();
            Class<?> _class = null;
            for (int i = 0; i < instance.objects.size(); i++) {
                object = instance.objects.get(i);
                extractedValue = (Object[]) Array.newInstance(Object.class, fieldsSize);
                for (int j = 0; j < fieldsSize; j++) {
                    _class = _classes[j];
                    field = instance.fields.get(j);
                    _field = object.getClass().getDeclaredField(field);
                    _field.setAccessible(true);
                    if (_field.getType().getClass().equals(_class.getClass())) {
                        Array.set(extractedValue, j, _field.get(object));
                    } else {
                        exceptionMessage = String.format(
                            "Argumento inválido: o tipo de dado recebido para %s é %s e o esperado é %s!", 
                            field, 
                            _field.getClass().getName(), 
                            _class.getName()
                        );
                        throw new IllegalArgumentException();
                    }
                }
                Array.set(extractedValues, i, extractedValue);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return extractedValues;
    }
    
}

