package br.org.jext;

/**
 * Classe utilitária contendo métodos para manipulação de arrays.
 * 
 * @author thiago-amm
 * @version v1.0.0 03/12/2017
 * @version v1.0.1 26/03/2018
 * @since v1.0.0
 */
public class Arrays {
    
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[] {};
    public static final Integer[] EMPTY_INTEGER_ARRAY = new Integer[] {};
    public static final String[] EMPTY_STRING_ARRAY = new String[] {};
    
    public static Object[] array(Object... objects) {
        return objects;
    }
    
    public static Object[] array(Object o, int length) {
        Object[] array = null;
        length = length < 0 ? 0 : length;
        if (length > 0) {
            array = new Object[length];
            for (int i = 0; i < length; i++) {
                array[i] = o;
            }
        }
        return array;
    }
    
    public static boolean isNull(Object... array) {
        return array == null;
    }
    
    public static boolean null_(Object... array) {
        return isNull(array);
    }
    
    public static boolean isNotNull(Object... array) {
        return !isNull(array);
    }
    
    public static boolean notNull(Object... array) {
        return isNotNull(array);
    }
    
    public static boolean isEmpty(Object... array) {
        return isNotNull(array) && array.length == 0;
    }
    
    public static boolean empty(Object... array) {
        return isEmpty(array);
    }
    
    public static boolean isNotEmpty(Object... array) {
        return isNotNull(array) && array.length > 0;
    }
    
    public static boolean notEmpty(Object... array) {
        return isNotEmpty(array);
    }
    
    public static boolean isNullOrEmpty(Object... array) {
        return isNull(array) || isEmpty(array);
    }
    
    public static boolean nullOrEmpty(Object... array) {
        return isNullOrEmpty(array);
    }
    
    public static boolean isNotNullOrEmpty(Object... array) {
        return !isNullOrEmpty(array);
    }
    
    public static boolean notNullOrEmpty(Object... array) {
        return isNotNullOrEmpty(array);
    }
    
    public static boolean containsNull(Object... array) {
        boolean containsNull = false;
        if (isNotNullOrEmpty(array)) {
            for (Object object : array) {
                if (object == null) {
                    containsNull = true;
                    break;
                }
            }
        }
        return containsNull;
    }
    
    public static boolean notContainsNull(Object... array) {
        return !containsNull(array);
    }
    
    /**
     * Converte um array de strings em um array de inteiros.
     * 
     * @param sArray
     * @return array de inteiros
     */
    public static Integer[] parseInt(String... sArray) {
        Integer[] iArray = sArray != null && sArray.length > 0 ? new Integer[sArray.length] : EMPTY_INTEGER_ARRAY;
        if (isNotEmpty((Object[]) sArray)) {
            String s = "";
            for (int i = 0; i < sArray.length; i++) {
                s = sArray[i];
                if (s != null && s.matches("^\\d+$")) {
                    iArray[i] = Integer.parseInt(s);
                }
            }
        }
        return iArray;
    }
    
    public static Integer[] parseInt(String text, String delimiter) {
        Integer[] iArray = EMPTY_INTEGER_ARRAY;
        text = text == null ? "" : text;
        delimiter = delimiter == null ? "," : delimiter;
        if (text.contains(",")) {
            text = text.replace(", ", ",");
            text = text.replace(" , ", ",");
            text = text.replace(" ,", ",");
            if (text.matches("(\\d+,\\d+)+")) {
                iArray = ArrayUtil.parseInt(text.split(delimiter));
            }
        } else {
            iArray = new Integer[1];
            if (text.matches("\\d+")) {
                iArray[0] = Integer.parseInt(text);
            }
        }
        return iArray;
    }
    
    public static Integer[] parseInt(String text) {
        return parseInt(text, null);
    }
    
    public static String join(String delimiter, Object... array) {
        String join = "";
        delimiter = delimiter == null ? "" : delimiter;
        if (!delimiter.isEmpty() && isNotEmpty(array)) {
            StringBuilder sql = new StringBuilder();
            for (Object obj : array) {
                sql.append(obj.toString());
                sql.append(delimiter);
            }
            sql.replace(sql.lastIndexOf(delimiter), sql.length(), "");
            join = sql.toString();
        }
        return join;
    }
    
    public static String join(Object... array) {
        return join(", ", array);
    }
    
    @SafeVarargs
    public static <T> T[] of (T... elements) {
        return elements;
    }
    
}
