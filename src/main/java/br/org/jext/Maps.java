package br.org.jext;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import br.org.verify.Verify;

/**
 * @author thiago-amm
 * @version v1.0.0 16/10/2017
 * @since v1.0.0
 */
public final class Maps<K, V> {
   
   public static final Map<Object, Object> NULL_MAP = null;
   public static final Map<Object, Object> EMPTY_MAP = Collections.unmodifiableMap(new HashMap<>(0));
   
   public static <K, V> Map<K, V> of() {
      return new HashMap<K, V>();
   }
   
   public static <K, V> boolean isNull(Map<K, V> map) {
      return Verify.isNull(map);
   }
   
   public static <K, V> boolean Null(Map<K, V> map) {
      return Verify.Null(map);
   }
   
   public static <K, V> boolean isNotNull(Map<K, V> map) {
      return Verify.isNotNull(map);
   }
   
   public static <K, V> boolean notNull(Map<K, V> map) {
      return Verify.notNull(map);
   }
   
   public static <K, V> boolean isEmpty(Map<K, V> map) {
      return Verify.isEmpty(map);
   }
   
   public static <K, V> boolean empty(Map<K, V> map) {
      return Verify.empty(map);
   }
   
   public static <K, V> boolean isNotEmpty(Map<K, V> map) {
      return Verify.isNotEmpty(map);
   }
   
   public static <K, V> boolean notEmpty(Map<K, V> map) {
      return Verify.notEmpty(map);
   }
   
   public static <K, V> boolean isNullOrEmpty(Map<K, V> map) {
      return Verify.isNullOrEmpty(map);
   }
   
   public static <K, V> boolean nullOrEmpty(Map<K, V> map) {
      return Verify.nullOrEmpty(map);
   }
   
   public static <K, V> boolean isEmptyOrNull(Map<K, V> map) {
      return Verify.isEmptyOrNull(map);
   }
   
   public static <K, V> boolean emptyOrNull(Map<K, V> map) {
      return Verify.emptyOrNull(map);
   }
   
   public static <K, V> boolean isNotNullOrEmpty(Map<K, V> map) {
      return Verify.isNotNullOrEmpty(map);
   }
   
   public static <K, V> boolean notNullOrEmpty(Map<K, V> map) {
      return Verify.notNullOrEmpty(map);
   }
   
   public static <K, V> boolean isNotEmptyOrNull(Map<K, V> map) {
      return Verify.isNotEmptyOrNull(map);
   }
   
   public static <K, V> boolean notEmptyOrNull(Map<K, V> map) {
      return Verify.notEmptyOrNull(map);
   }
   
}

