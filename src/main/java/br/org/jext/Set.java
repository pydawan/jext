package br.org.jext;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 * @param <E>
 */
public class Set<E> extends HashSet<E> {
   
   private static final long serialVersionUID = 1L;
   
   public static java.util.HashSet<Object> of(Object... o) {
      return new HashSet<Object>(Arrays.asList(o));
   }
   
   public static java.util.HashSet<Object> set(Object... o) {
      return new HashSet<Object>(Arrays.asList(o));
   }
   
}