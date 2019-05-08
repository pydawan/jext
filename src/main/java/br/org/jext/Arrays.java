package br.org.jext;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Classe utilitária contendo métodos para manipulação de arrays.
 * 
 * @author thiago-amm
 * @version v1.0.0 03/12/2017
 * @version v1.0.1 26/03/2018
 * @since v1.0.0
 */
public class Arrays {
    
    public static final Boolean[] EMPTY_BOOLEAN_ARRAY = new Boolean[] {};
    public static final Character[] EMPTY_CHARACTER_ARRAY = new Character[] {};
    public static final String[] EMPTY_STRING_ARRAY = new String[] {};
    public static final Byte[] EMPTY_BYTE_ARRAY = new Byte[] {};
    public static final Short[] EMPTY_SHORT_ARRAY = new Short[] {};
    public static final Integer[] EMPTY_INTEGER_ARRAY = new Integer[] {};
    public static final Long[] EMPTY_LONG_ARRAY = new Long[] {};
    public static final Float[] EMPTY_FLOAT_ARRAY = new Float[] {};
    public static final Double[] EMPTY_DOUBLE_ARRAY = new Double[] {};
    public static final BigInteger[] EMPTY_BIGINTEGER_ARRAY = new BigInteger[] {};
    public static final BigDecimal[] EMPTY_BIGDECIMAL_ARRAY = new BigDecimal[] {};
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[] {};
    
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
    
    public static Byte[] parseByte(String... sArray) {
        Byte[] byArray = sArray != null && sArray.length > 0 ? new Byte[sArray.length] : EMPTY_BYTE_ARRAY;
        if (isNotEmpty((Object[]) sArray)) {
            String s = "";
            for (int i = 0; i < sArray.length; i++) {
                s = sArray[i];
                if (s != null && s.matches(RegexUtil.INTEGER_REGEX_PATTERN)) {
                    byArray[i] = Byte.parseByte(s);
                }
            }
        }
        return byArray;
    }
    
    public static Byte[] parseByte(String text, String delimiter) {
        Byte[] byArray = EMPTY_BYTE_ARRAY;
        text = text == null ? "" : text.trim();
        text = text.endsWith(",") ? text.substring(0, text.length() - 1) : text;
        delimiter = delimiter == null ? "," : delimiter;
        if (text.contains(",")) {
            text = text.replace(", ", ",");
            text = text.replace(" , ", ",");
            text = text.replace(" ,", ",");
            if (text.matches(RegexUtil.INTEGER_LIST_REGEX_PATTERN)) {
                byArray = ArrayUtil.parseByte(text.split(delimiter));
            }
        } else {
            byArray = new Byte[1];
            if (text.matches(RegexUtil.INTEGER_REGEX_PATTERN)) {
                byArray[0] = Byte.parseByte(text);
            }
        }
        return byArray;
    }
    
    public static Byte[] parseByte(String text) {
        return parseByte(text, null);
    }
    
    public static Short[] parseShort(String... sArray) {
        Short[] stArray = sArray != null && sArray.length > 0 ? new Short[sArray.length] : EMPTY_SHORT_ARRAY;
        if (isNotEmpty((Object[]) sArray)) {
            String s = "";
            for (int i = 0; i < sArray.length; i++) {
                s = sArray[i];
                if (s != null && s.matches(RegexUtil.INTEGER_REGEX_PATTERN)) {
                    stArray[i] = Short.parseShort(s);
                }
            }
        }
        return stArray;
    }
    
    public static Short[] parseShort(String text, String delimiter) {
        Short[] stArray = EMPTY_SHORT_ARRAY;
        text = text == null ? "" : text.trim();
        text = text.endsWith(",") ? text.substring(0, text.length() - 1) : text;
        delimiter = delimiter == null ? "," : delimiter;
        if (text.contains(",")) {
            text = text.replace(", ", ",");
            text = text.replace(" , ", ",");
            text = text.replace(" ,", ",");
            if (text.matches(RegexUtil.INTEGER_LIST_REGEX_PATTERN)) {
                stArray = ArrayUtil.parseShort(text.split(delimiter));
            }
        } else {
            stArray = new Short[1];
            if (text.matches(RegexUtil.INTEGER_REGEX_PATTERN)) {
                stArray[0] = Short.parseShort(text);
            }
        }
        return stArray;
    }
    
    public static Short[] parseShort(String text) {
        return parseShort(text, null);
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
                if (s != null && s.matches(RegexUtil.INTEGER_REGEX_PATTERN)) {
                    iArray[i] = Integer.parseInt(s);
                }
            }
        }
        return iArray;
    }
    
    public static Integer[] parseInt(String text, String delimiter) {
        Integer[] iArray = EMPTY_INTEGER_ARRAY;
        text = text == null ? "" : text.trim();
        text = text.endsWith(",") ? text.substring(0, text.length() - 1) : text;
        delimiter = delimiter == null ? "," : delimiter;
        if (text.contains(",")) {
            text = text.replace(", ", ",");
            text = text.replace(" , ", ",");
            text = text.replace(" ,", ",");
            if (text.matches(RegexUtil.INTEGER_LIST_REGEX_PATTERN)) {
                iArray = ArrayUtil.parseInt(text.split(delimiter));
            }
        } else {
            iArray = new Integer[1];
            if (text.matches(RegexUtil.INTEGER_REGEX_PATTERN)) {
                iArray[0] = Integer.parseInt(text);
            }
        }
        return iArray;
    }
    
    public static Integer[] parseInt(String text) {
        return parseInt(text, null);
    }
    
    public static Long[] parseLong(String... sArray) {
        Long[] lArray = sArray != null && sArray.length > 0 ? new Long[sArray.length] : EMPTY_LONG_ARRAY;
        if (isNotEmpty((Object[]) sArray)) {
            String s = "";
            for (int i = 0; i < sArray.length; i++) {
                s = sArray[i];
                if (s != null && s.matches(RegexUtil.LONG_REGEX_PATTERN)) {
                    lArray[i] = Long.parseLong(s);
                }
            }
        }
        return lArray;
    }
    
    public static Long[] parseLong(String text, String delimiter) {
        Long[] lArray = EMPTY_LONG_ARRAY;
        text = text == null ? "" : text.trim();
        text = text.endsWith(",") ? text.substring(0, text.length() - 1) : text;
        delimiter = delimiter == null ? "," : delimiter;
        if (text.contains(",")) {
            text = text.replace(", ", ",");
            text = text.replace(" , ", ",");
            text = text.replace(" ,", ",");
            if (text.matches(RegexUtil.LONG_LIST_REGEX_PATTERN)) {
                lArray = ArrayUtil.parseLong(text.split(delimiter));
            }
        } else {
            lArray = new Long[1];
            if (text.matches("^(\\-|\\+)?\\d+(l|L)$")) {
                lArray[0] = Long.parseLong(text);
            }
        }
        return lArray;
    }
    
    public static Long[] parseLong(String text) {
        return parseLong(text, null);
    }
    
    public static Float[] parseFloat(String... sArray) {
        Float[] fArray = sArray != null && sArray.length > 0 ? new Float[sArray.length] : EMPTY_FLOAT_ARRAY;
        if (isNotEmpty((Object[]) sArray)) {
            String s = "";
            for (int i = 0; i < sArray.length; i++) {
                s = sArray[i];
                if (s != null && s.matches(RegexUtil.FLOAT_REGEX_PATTERN)) {
                    fArray[i] = Float.parseFloat(s);
                }
            }
        }
        return fArray;
    }
    
    public static Float[] parseFloat(String text, String delimiter) {
        Float[] fArray = EMPTY_FLOAT_ARRAY;
        text = text == null ? "" : text.trim();
        text = text.endsWith(",") ? text.substring(0, text.length() - 1) : text;
        delimiter = delimiter == null ? "," : delimiter;
        if (text.contains(",")) {
            text = text.replace(", ", ",");
            text = text.replace(" , ", ",");
            text = text.replace(" ,", ",");
            if (text.matches(RegexUtil.FLOAT_LIST_REGEX_PATTERN)) {
                fArray = ArrayUtil.parseFloat(text.split(delimiter));
            }
        } else {
            fArray = new Float[1];
            if (text.matches(RegexUtil.FLOAT_REGEX_PATTERN)) {
                fArray[0] = Float.parseFloat(text);
            }
        }
        return fArray;
    }
    
    public static Float[] parseFloat(String text) {
        return parseFloat(text, null);
    }
    
    public static Double[] parseDouble(String... sArray) {
        Double[] dArray = sArray != null && sArray.length > 0 ? new Double[sArray.length] : EMPTY_DOUBLE_ARRAY;
        if (isNotEmpty((Object[]) sArray)) {
            String s = "";
            for (int i = 0; i < sArray.length; i++) {
                s = sArray[i];
                if (s != null && s.matches(RegexUtil.DOUBLE_REGEX_PATTERN)) {
                    dArray[i] = Double.parseDouble(s);
                }
            }
        }
        return dArray;
    }
    
    public static Double[] parseDouble(String text, String delimiter) {
        Double[] dArray = EMPTY_DOUBLE_ARRAY;
        text = text == null ? "" : text.trim();
        text = text.endsWith(",") ? text.substring(0, text.length() - 1) : text;
        delimiter = delimiter == null ? "," : delimiter;
        if (text.contains(",")) {
            text = text.replace(", ", ",");
            text = text.replace(" , ", ",");
            text = text.replace(" ,", ",");
            if (text.matches(RegexUtil.DOUBLE_LIST_REGEX_PATTERN)) {
                dArray = ArrayUtil.parseDouble(text.split(delimiter));
            }
        } else {
            dArray = new Double[1];
            if (text.matches(RegexUtil.DOUBLE_REGEX_PATTERN)) {
                dArray[0] = Double.parseDouble(text);
            }
        }
        return dArray;
    }
    
    public static Double[] parseDouble(String text) {
        return parseDouble(text, null);
    }
    
    public static Boolean[] parseBoolean(String... sArray) {
        Boolean[] bArray = sArray != null && sArray.length > 0 ? new Boolean[sArray.length] : EMPTY_BOOLEAN_ARRAY;
        if (isNotEmpty((Object[]) sArray)) {
            String s = "";
            for (int i = 0; i < sArray.length; i++) {
                s = sArray[i];
                if (s != null && s.matches(RegexUtil.BOOLEAN_REGEX_PATTERN)) {
                    bArray[i] = Boolean.parseBoolean(s);
                }
            }
        }
        return bArray;
    }
    
    public static Boolean[] parseBoolean(String text, String delimiter) {
        Boolean[] bArray = EMPTY_BOOLEAN_ARRAY;
        text = text == null ? "" : text.trim();
        text = text.endsWith(",") ? text.substring(0, text.length() - 1) : text;
        delimiter = delimiter == null ? "," : delimiter;
        if (text.contains(",")) {
            text = text.replace(", ", ",");
            text = text.replace(" , ", ",");
            text = text.replace(" ,", ",");
            if (text.matches(RegexUtil.BOOLEAN_LIST_REGEX_PATTERN)) {
                bArray = ArrayUtil.parseBoolean(text.split(delimiter));
            }
        } else {
            bArray = new Boolean[1];
            if (text.matches(RegexUtil.BOOLEAN_REGEX_PATTERN)) {
                bArray[0] = Boolean.parseBoolean(text);
            }
        }
        return bArray;
    }
    
    public static Boolean[] parseBoolean(String text) {
        return parseBoolean(text, null);
    }
    
    public static Character[] parseCharacter(String... sArray) {
        Character[] cArray = sArray != null && sArray.length > 0 ? new Character[sArray.length] : EMPTY_CHARACTER_ARRAY;
        if ( isNotEmpty((Object[]) sArray) ) {
            String s = "";
            for (int i = 0; i < sArray.length; i++) {
                s = sArray[i];
                if (s != null && s.matches(RegexUtil.CHARACTER_REGEX_PATTERN)) {
                    cArray[i] = s.charAt(0);
                }
            }
        }
        return cArray;
    }
    
    public static Character[] parseCharacter(String text, String delimiter) {
        Character[] cArray = EMPTY_CHARACTER_ARRAY;
        text = text == null ? "" : text.trim();
        text = text.endsWith(",") ? text.substring(0, text.length() - 1) : text;
        delimiter = delimiter == null ? "," : delimiter;
        if (text.contains(",")) {
            text = text.replace(", ", ",");
            text = text.replace(" , ", ",");
            text = text.replace(" ,", ",");
            if (text.matches(RegexUtil.CHARACTER_LIST_REGEX_PATTERN)) {
                cArray = ArrayUtil.parseCharacter(text.split(delimiter));
            }
        } else {
            cArray = new Character[1];
            if (text.matches(RegexUtil.CHARACTER_REGEX_PATTERN)) {
                cArray[0] = text.charAt(0);
            }
        }
        return cArray;
    }
    
    public static Character[] parseCharacter(String text) {
        return parseCharacter(text, null);
    }
    
    public static BigInteger[] parseBigInt(String... sArray) {
        BigInteger[] biArray = sArray != null && sArray.length > 0 ? new BigInteger[sArray.length] : EMPTY_BIGINTEGER_ARRAY;
        if ( isNotEmpty((Object[]) sArray) ) {
            String s = "";
            for (int i = 0; i < sArray.length; i++) {
                s = sArray[i];
                if (s != null && s.matches(RegexUtil.INTEGER_REGEX_PATTERN)) {
                    biArray[i] = new BigInteger(s);
                }
            }
        }
        return biArray;
    }
    
    public static BigInteger[] parseBigInt(String text, String delimiter) {
        BigInteger[] biArray = EMPTY_BIGINTEGER_ARRAY;
        text = text == null ? "" : text.trim();
        text = text.endsWith(",") ? text.substring(0, text.length() - 1) : text;
        delimiter = delimiter == null ? "," : delimiter;
        if (text.contains(",")) {
            text = text.replace(", ", ",");
            text = text.replace(" , ", ",");
            text = text.replace(" ,", ",");
            if (text.matches(RegexUtil.INTEGER_LIST_REGEX_PATTERN)) {
                biArray = ArrayUtil.parseBigInt(text.split(delimiter));
            }
        } else {
            biArray = new BigInteger[1];
            if (text.matches(RegexUtil.INTEGER_REGEX_PATTERN)) {
                biArray[0] = new BigInteger(text);
            }
        }
        return biArray;
    }
    
    public static BigInteger[] parseBigInt(String text) {
        return parseBigInt(text, null);
    }
    
    public static BigDecimal[] parseBigDecimal(String... sArray) {
        BigDecimal[] bdArray = sArray != null && sArray.length > 0 ? new BigDecimal[sArray.length] : EMPTY_BIGDECIMAL_ARRAY;
        if ( isNotEmpty((Object[]) sArray) ) {
            String s = "";
            for (int i = 0; i < sArray.length; i++) {
                s = sArray[i];
                if (s != null && s.matches(RegexUtil.DOUBLE_REGEX_PATTERN)) {
                    bdArray[i] = new BigDecimal(s);
                }
            }
        }
        return bdArray;
    }
    
    public static BigDecimal[] parseBigDecimal(String text, String delimiter) {
        BigDecimal[] bdArray = EMPTY_BIGDECIMAL_ARRAY;
        text = text == null ? "" : text.trim();
        text = text.endsWith(",") ? text.substring(0, text.length() - 1) : text;
        delimiter = delimiter == null ? "," : delimiter;
        if (text.contains(",")) {
            text = text.replace(", ", ",");
            text = text.replace(" , ", ",");
            text = text.replace(" ,", ",");
            if (text.matches(RegexUtil.DOUBLE_LIST_REGEX_PATTERN)) {
                bdArray = ArrayUtil.parseBigDecimal(text.split(delimiter));
            }
        } else {
            bdArray = new BigDecimal[1];
            if (text.matches(RegexUtil.DOUBLE_REGEX_PATTERN)) {
                bdArray[0] = new BigDecimal(text);
            }
        }
        return bdArray;
    }
    
    public static BigDecimal[] parseBigDecimal(String text) {
        return parseBigDecimal(text, null);
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
