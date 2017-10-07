package br.org.jext;

import java.util.Random;

/**
 * <p>
 * Reune dados e operações para se trabalhar com enumerações.
 * </p>
 * 
 * @author thiago-amm
 * @version v1.0.0 07/10/2017
 * @since v1.0.0
 */
public class EnumUtil {
   
   public static Class<?> getRandom(Class<?> clazz) {
      Class<?> value = null;
      if (clazz.isEnum()) {
         Random random = new Random();
         Class<?>[] values = (Class<?>[]) clazz.getEnumConstants();
         value = values[random.nextInt(values.length)];
      } else {
         throw new IllegalArgumentException("ATENÇÃO: A classe passada como parâmetro não é um Enum!");
      }
      return value;
   }
   
   public static Class<?> random(Class<?> clazz) {
      return getRandom(clazz);
   }
   
}
