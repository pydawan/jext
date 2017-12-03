package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 03/12/2017
 * @since v1.0.0
 */
public class Arrays {
   
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
   
}
