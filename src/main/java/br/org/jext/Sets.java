package br.org.jext;

import java.util.HashSet;
import java.util.Set;

/**
 * @author thiago-amm
 * @version v1.0.0 16/10/2017
 * @since v1.0.0
 */
public final class Sets<T> {
   
   public static <T> Set<T> of() {
      return new HashSet<T>();
   }
   
}
