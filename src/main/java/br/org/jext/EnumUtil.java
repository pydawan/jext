package br.org.jext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
   
   private static final java.util.List<?> EMPTY_LIST = Collections.unmodifiableList(new ArrayList<>(0));
   
   public static Class<?> getRandom(Class<?> clazz) {
      Class<?> value = null;
      if (clazz != null && clazz.isEnum()) {
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
   
   public static java.util.List<?> asList(Class<?> clazz) {
      if (clazz != null && clazz.isEnum()) {
         return Arrays.asList(clazz.getEnumConstants());
      }
      return EMPTY_LIST;
   }
   
   public static java.util.List<?> list(Class<?> clazz) {
      return asList(clazz);
   }
   
}
