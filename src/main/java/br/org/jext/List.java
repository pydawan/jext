package br.org.jext;

import java.util.ArrayList;
import java.util.Arrays;

import br.org.verify.Verify;

/**
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class List extends ArrayList<Object> {
   
   private static final long serialVersionUID = 1L;
   
   public static final java.util.List<Object> NULL_LIST = null;
   public static final java.util.List<Object> EMPTY_LIST = new ArrayList<>();
   
   public List append(Object... objects) {
      if (objects != null) {
         for (Object object : objects) {
            if (object != null) {
               this.add(object);
            }
         }
      }
      return this;
   }
   
   public List remove(Object... objects) {
      if (objects != null) {
         for (Object object : objects) {
            if (object != null) {
               this.remove((Object) object);
            }
         }
      }
      return this;
   }
   
   public static List of(Object... o) {
      List list = new List();
      list.addAll(Arrays.asList(o));
      return list;
   }
   
   public static List of() {
      return new List();
   }
   
   public static List list(Object... o) {
      return of(o);
   }
   
   public static List list() {
      return new List();
   }
   
   public static boolean isNull(java.util.List<?> list) {
      return Verify.isNull(list);
   }
   
   public static boolean Null(java.util.List<?> list) {
      return Verify.Null(list);
   }
   
   public static boolean isNotNull(java.util.List<?> list) {
      return Verify.isNotNull(list);
   }
   
   public static boolean notNull(java.util.List<?> list) {
      return Verify.notNull(list);
   }
   
   public static boolean isEmpty(java.util.List<?> list) {
      return Verify.isEmpty(list);
   }
   
   public static boolean empty(java.util.List<?> list) {
      return Verify.empty(list);
   }
   
   public static boolean isNotEmpty(java.util.List<?> list) {
      return Verify.isNotEmpty(list);
   }
   
   public static boolean notEmpty(java.util.List<?> list) {
      return Verify.notEmpty(list);
   }
   
   public static boolean isNullOrEmpty(java.util.List<?> list) {
      return Verify.isNullOrEmpty(list);
   }
   
   public static boolean nullOrEmpty(java.util.List<?> list) {
      return Verify.nullOrEmpty(list);
   }
   
   public static boolean isEmptyOrNull(java.util.List<?> list) {
      return Verify.isEmptyOrNull(list);
   }
   
   public static boolean emptyOrNull(java.util.List<?> list) {
      return Verify.emptyOrNull(list);
   }
   
   public static boolean isNotNullOrEmpty(java.util.List<?> list) {
      return Verify.isNotNullOrEmpty(list);
   }
   
   public static boolean notNullOrEmpty(java.util.List<?> list) {
      return Verify.notNullOrEmpty(list);
   }
   
   public static boolean isNotEmptyOrNull(java.util.List<?> list) {
      return Verify.isNotEmptyOrNull(list);
   }
   
   public static boolean notEmptyOrNull(java.util.List<?> list) {
      return Verify.notEmptyOrNull(list);
   }
   
}
