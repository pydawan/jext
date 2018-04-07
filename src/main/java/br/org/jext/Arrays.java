package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 03/12/2017
 * @version v1.0.1 07/04/2018
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
   
   public static boolean isNotNull(Object... array) {
      return !isNull(array);
   }
   
   public static boolean isEmpty(Object... array) {
      return isNotNull(array) && array.length == 0;
   }
   
   public static boolean isNotEmpty(Object... array) {
      return isNotNull(array) && array.length > 0;
   }
   
   public static boolean isNullOrEmpty(Object... array) {
      return isNull(array) || isEmpty(array);
   }
   
   public static boolean isNotNullOrEmpty(Object... array) {
      return !isNullOrEmpty(array);
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
   
}
