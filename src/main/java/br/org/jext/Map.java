package br.org.jext;

import java.util.Arrays;
import java.util.HashMap;

import br.org.verify.Verify;

/**
 * @author thiago-amm
 * @version v1.0.0 16/10/2017
 * @since v1.0.0
 */
public final class Map<K, V> {
   
   public static final java.util.Map<Object, Object> NULL_MAP = null;
   public static final java.util.Map<Object, Object> EMPTY_MAP = new HashMap<>(0);
   
   public static MapItem item(Object key, Object value) {
      if (Verify.notContainsEmptyOrNull(key, value)) {
         return new MapItem(key, value);
      } else {
         throw new IllegalArgumentException("É necessário informar a chave o valor para criar o item no mapa!");
      }
   }
   
   public static MapItems items(MapItem... item) {
      if (Verify.isNotEmptyOrNull((Object[]) item)) {
         MapItems items = new MapItems();
         items.addAll(Arrays.asList(item));
         return items;
      } else {
         throw new IllegalArgumentException("É necessário informar os itens a serem adicionados no mapa!");
      }
   }
   
   public static <K, V> java.util.Map<K, V> of() {
      return new HashMap<K, V>();
   }
   
   public static <K, V> boolean isNull(java.util.Map<K, V> map) {
      return Verify.isNull(map);
   }
   
   public static <K, V> boolean Null(java.util.Map<K, V> map) {
      return Verify.Null(map);
   }
   
   public static <K, V> boolean isNotNull(java.util.Map<K, V> map) {
      return Verify.isNotNull(map);
   }
   
   public static <K, V> boolean notNull(java.util.Map<K, V> map) {
      return Verify.notNull(map);
   }
   
   public static <K, V> boolean isEmpty(java.util.Map<K, V> map) {
      return Verify.isEmpty(map);
   }
   
   public static <K, V> boolean empty(java.util.Map<K, V> map) {
      return Verify.empty(map);
   }
   
   public static <K, V> boolean isNotEmpty(java.util.Map<K, V> map) {
      return Verify.isNotEmpty(map);
   }
   
   public static <K, V> boolean notEmpty(java.util.Map<K, V> map) {
      return Verify.notEmpty(map);
   }
   
   public static <K, V> boolean isNullOrEmpty(java.util.Map<K, V> map) {
      return Verify.isNullOrEmpty(map);
   }
   
   public static <K, V> boolean nullOrEmpty(java.util.Map<K, V> map) {
      return Verify.nullOrEmpty(map);
   }
   
   public static <K, V> boolean isEmptyOrNull(java.util.Map<K, V> map) {
      return Verify.isEmptyOrNull(map);
   }
   
   public static <K, V> boolean emptyOrNull(java.util.Map<K, V> map) {
      return Verify.emptyOrNull(map);
   }
   
   public static <K, V> boolean isNotNullOrEmpty(java.util.Map<K, V> map) {
      return Verify.isNotNullOrEmpty(map);
   }
   
   public static <K, V> boolean notNullOrEmpty(java.util.Map<K, V> map) {
      return Verify.notNullOrEmpty(map);
   }
   
   public static <K, V> boolean isNotEmptyOrNull(java.util.Map<K, V> map) {
      return Verify.isNotEmptyOrNull(map);
   }
   
   public static <K, V> boolean notEmptyOrNull(java.util.Map<K, V> map) {
      return Verify.notEmptyOrNull(map);
   }
   
}
