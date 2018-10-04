package br.org.jext;

import java.util.ArrayList;
import java.util.Arrays;

import br.org.verify.Verify;

/**
 * @author thiago-amm
 * @version v1.0.0 08/09/2107
 * @since v1.0.0
 */
public class Tuple {
   
   private final TupleElements elements = new TupleElements();
   
   public Tuple(final Object... elements) {
      this.elements.addAll(Arrays.asList(elements));
   }
   
   public java.util.List<Object> get() {
      return elements;
   }
   
   public static Tuple of(final Object... elements) {
      return new Tuple(elements);
   }
   
   public static Tuple pair(Object first, Object second) {
      return new Tuple(first, second);
   }
   
   public static <T> java.util.List<Tuple> enumerate(final java.util.List<?> list) {
      java.util.List<Tuple> enumerate = null;
      if (list != null) {
         enumerate = new ArrayList<>();
         for (int i = 0; i < list.size(); i++) {
            enumerate.add(Tuple.of(i, list.get(i)));
         }
      }
      return enumerate;
   }
   
   @SafeVarargs
   public static java.util.List<Object> zip(final java.util.List<?>... lists) {
      java.util.List<Object> zip = new ArrayList<>();
      if (Verify.isNotEmptyOrNull((Object[]) lists)) {
         int shortestSize = shortestSize(lists);
         java.util.List<Object> elements = null;
         // iterate over lists.
         for (int i = 0; i < lists.length; i++) {
            elements = new ArrayList<>();
            // iterate over elements.
            for (int j = 0; j < shortestSize; j++) {
               elements.add(lists[i].get(j));
            }
            zip.add(Tuple.of(elements.toArray()));
         }
      }
      return zip;
   }
   
   @SafeVarargs
   public static int shortestSize(final java.util.List<?>... lists) {
      int shortestSize = 0;
      if (Verify.isNotEmptyOrNull((Object[]) lists)) {
         shortestSize = lists[0].size();
         for (java.util.List<?> list : lists) {
            if (list.size() < shortestSize) {
               shortestSize = list.size();
            }
         }
      }
      return shortestSize;
   }
   
   @SafeVarargs
   public static Tuple sizes(final java.util.List<?>... lists) {
      java.util.List<Integer> sizes = new ArrayList<>();
      if (Verify.isNotNull((Object[]) lists)) {
         for (java.util.List<?> list : lists) {
            if (Verify.isNotNull(list)) {
               sizes.add(list.size());
            } else {
               sizes.add(0);
            }
         }
      }
      return Tuple.of(sizes.toArray());
   }
   
   public static Tuple tuple(final Object...elements) {
       return Tuple.of(elements);
   }
   
   public Object[] toArray() {
      return this.elements.toArray(); 
   }
   
   @Override
   public String toString() {
      return elements.toString();
   }
   
}
