package br.org.jext;

import java.util.ArrayList;
import java.util.Arrays;

import br.org.verify.Verify;

/**
 * @author thiago-amm
 * @version v1.0.0 16/10/2017
 * @since v1.0.0
 */
public final class List<T> {
   
   public static final java.util.List<?> NULL_LIST = null;
   public static final java.util.List<?> EMPTY_LIST = new ArrayList<>(0);
   
   @SafeVarargs
   public static <T> java.util.List<T> of(T... o) {
      java.util.List<T> list = new ArrayList<>();
      list.addAll(Arrays.asList(o));
      return list;
   }
   
   public static <T> java.util.List<T> of() {
      return new ArrayList<T>(); 
   }
   
   @SafeVarargs
   public static <T> java.util.List<T> list(T... o) {
       return List.of(o);
   }
   
   public static <T> java.util.List<T> list() {
       return List.of();
   }
   
   public static <T> boolean isNull(java.util.List<?> list) {
      return Verify.isNull(list);
   }
   
   public static <T> boolean Null(java.util.List<?> list) {
      return Verify.Null(list);
   }
   
   public static <T> boolean isNotNull(java.util.List<?> list) {
      return Verify.isNotNull(list);
   }
   
   public static <T> boolean notNull(java.util.List<?> list) {
      return Verify.notNull(list);
   }
   
   public static <T> boolean isEmpty(java.util.List<?> list) {
      return Verify.isEmpty(list);
   }
   
   public static <T> boolean empty(java.util.List<?> list) {
      return Verify.empty(list);
   }
   
   public static <T> boolean isNotEmpty(java.util.List<?> list) {
      return Verify.isNotEmpty(list);
   }
   
   public static <T> boolean notEmpty(java.util.List<?> list) {
      return Verify.notEmpty(list);
   }
   
   public static <T> boolean isNullOrEmpty(java.util.List<?> list) {
      return Verify.isNullOrEmpty(list);
   }
   
   public static <T> boolean nullOrEmpty(java.util.List<?> list) {
      return Verify.nullOrEmpty(list);
   }
   
   public static <T> boolean isEmptyOrNull(java.util.List<?> list) {
      return Verify.isEmptyOrNull(list);
   }
   
   public static <T> boolean emptyOrNull(java.util.List<?> list) {
      return Verify.emptyOrNull(list);
   }
   
   public static <T> boolean isNotNullOrEmpty(java.util.List<?> list) {
      return Verify.isNotNullOrEmpty(list);
   }
   
   public static <T> boolean notNullOrEmpty(java.util.List<?> list) {
      return Verify.notNullOrEmpty(list);
   }
   
   public static <T> boolean isNotEmptyOrNull(java.util.List<?> list) {
      return Verify.isNotEmptyOrNull(list);
   }
   
   public static <T> boolean notEmptyOrNull(java.util.List<?> list) {
      return Verify.notEmptyOrNull(list);
   }
   
}
