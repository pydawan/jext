package br.org.jext;

import static br.org.jext.StringUtil.arrayToString;
import static br.org.jext.StringUtil.mapToString;
import static br.org.verify.Verify.isArray;
import static br.org.verify.Verify.isMap;

/**
 * <p>Classe utilitária para impressão na saída padrão.</p>
 * 
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class PrintUtil {
   
   public static void println(Object object) {
      if (isArray(object)) {
         System.out.println(arrayToString(object));
      } else if (isMap(object)) {
         System.out.println(mapToString(object));
      } else {
         System.out.println(object);
      }
   }
   
   public static void print(Object object) {
      if (isArray(object)) {
         System.out.print(arrayToString(object));
      } else if (isMap(object)) {
         System.out.print(mapToString(object));
      } else {
         System.out.print(object);
      }
   }
   
   public static void printf(String format, Object... object) {
      System.out.printf(format, object);
   }
   
   public static String format(String format, Object... object) {
      return String.format(format, object);
   }
   
}
