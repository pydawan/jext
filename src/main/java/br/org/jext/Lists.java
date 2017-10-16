package br.org.jext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.org.verify.Verify;

/**
 * @author thiago-amm
 * @version v1.0.0 16/10/2017
 * @since v1.0.0
 */
public final class Lists<T> {
   
   public static final List<?> NULL_LIST = null;
   public static final List<?> EMPTY_LIST = new ArrayList<>(0);
   
   @SafeVarargs
   public static <T> List<T> of(T... o) {
      List<T> list = new ArrayList<>();
      list.addAll(Arrays.asList(o));
      return list;
   }
   
   public static <T> List<T> of() {
      return new ArrayList<T>(); 
   }
   
   public static <T> boolean isNull(List<?> list) {
      return Verify.isNull(list);
   }
   
   public static <T> boolean Null(List<?> list) {
      return Verify.Null(list);
   }
   
   public static <T> boolean isNotNull(List<?> list) {
      return Verify.isNotNull(list);
   }
   
   public static <T> boolean notNull(List<?> list) {
      return Verify.notNull(list);
   }
   
   public static <T> boolean isEmpty(List<?> list) {
      return Verify.isEmpty(list);
   }
   
   public static <T> boolean empty(List<?> list) {
      return Verify.empty(list);
   }
   
   public static <T> boolean isNotEmpty(List<?> list) {
      return Verify.isNotEmpty(list);
   }
   
   public static <T> boolean notEmpty(List<?> list) {
      return Verify.notEmpty(list);
   }
   
   public static <T> boolean isNullOrEmpty(List<?> list) {
      return Verify.isNullOrEmpty(list);
   }
   
   public static <T> boolean nullOrEmpty(List<?> list) {
      return Verify.nullOrEmpty(list);
   }
   
   public static <T> boolean isEmptyOrNull(List<?> list) {
      return Verify.isEmptyOrNull(list);
   }
   
   public static <T> boolean emptyOrNull(List<?> list) {
      return Verify.emptyOrNull(list);
   }
   
   public static <T> boolean isNotNullOrEmpty(List<?> list) {
      return Verify.isNotNullOrEmpty(list);
   }
   
   public static <T> boolean notNullOrEmpty(List<?> list) {
      return Verify.notNullOrEmpty(list);
   }
   
   public static <T> boolean isNotEmptyOrNull(List<?> list) {
      return Verify.isNotEmptyOrNull(list);
   }
   
   public static <T> boolean notEmptyOrNull(List<?> list) {
      return Verify.notEmptyOrNull(list);
   }
   
}
