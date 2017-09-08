package br.org.jext;

import java.util.Arrays;
import java.util.HashMap;

import br.org.verify.Verify;

/**
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class Map extends HashMap<Object, Object> {
   
   private static final long serialVersionUID = 1L;
   
   public static final java.util.Map<Object, Object> NULL_MAP = null;
   public static final java.util.Map<Object, Object> EMPTY_MAP = new HashMap<>();
   
   public static Map map() {
      return new Map();
   }
   
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
   
   public static Map of(MapItem... items) {
      Map map = new Map();
      if (Verify.notContainsEmptyOrNull((Object[]) items)) {
         for (MapItem item : items) {
            map.put(item.getKey(), item.getValue());
         }
      }
      return map;
   }
   
   public static Map map(MapItem... items) {
      return of(items);
   }
   
   public static boolean isNull(java.util.Map<?, ?> map) {
      return Verify.isNull(map);
   }
   
   public static boolean Null(java.util.Map<?, ?> map) {
      return Verify.Null(map);
   }
   
   public static boolean isNotNull(java.util.Map<?, ?> map) {
      return Verify.isNotNull(map);
   }
   
   public static boolean notNull(java.util.Map<?, ?> map) {
      return Verify.notNull(map);
   }
   
   public static boolean isEmpty(java.util.Map<?, ?> map) {
      return Verify.isEmpty(map);
   }
   
   public static boolean empty(java.util.Map<?, ?> map) {
      return Verify.empty(map);
   }
   
   public static boolean isNotEmpty(java.util.Map<?, ?> map) {
      return Verify.isNotEmpty(map);
   }
   
   public static boolean notEmpty(java.util.Map<?, ?> map) {
      return Verify.notEmpty(map);
   }
   
   public static boolean isNullOrEmpty(java.util.Map<?, ?> map) {
      return Verify.isNullOrEmpty(map);
   }
   
   public static boolean nullOrEmpty(java.util.Map<?, ?> map) {
      return Verify.nullOrEmpty(map);
   }
   
   public static boolean isEmptyOrNull(java.util.Map<?, ?> map) {
      return Verify.isEmptyOrNull(map);
   }
   
   public static boolean emptyOrNull(java.util.Map<?, ?> map) {
      return Verify.emptyOrNull(map);
   }
   
   public static boolean isNotNullOrEmpty(java.util.Map<?, ?> map) {
      return Verify.isNotNullOrEmpty(map);
   }
   
   public static boolean notNullOrEmpty(java.util.Map<?, ?> map) {
      return Verify.notNullOrEmpty(map);
   }
   
   public static boolean isNotEmptyOrNull(java.util.Map<?, ?> map) {
      return Verify.isNotEmptyOrNull(map);
   }
   
   public static boolean notEmptyOrNull(java.util.Map<?, ?> map) {
      return Verify.notEmptyOrNull(map);
   }
   
}
