package br.org.jext;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import br.org.verify.Verify;

/**
 * <p>Representa um dicionário.</p>
 * <p>O dicionário é um tipo de dados semelhante a um Mapa.</p>
 * 
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 * @see java.util.HashMap
 */
public class Dict<K, V> extends HashMap<K, V> {
   
   private static final long serialVersionUID = 1L;
   
   public static final java.util.Map<Object, Object> NULL_DICT = null;
   public static final java.util.Map<Object, Object> EMPTY_DICT = new HashMap<>();
   
   @SuppressWarnings("unchecked")
   public Dict(Object... objects) {
      if (Verify.containsOnlyPairs(objects)) {
         Object key = null;
         Object value = null;
         for (Object object : objects) {
            key = ((Object[]) object)[0];
            value = ((Object[]) object)[1];
            this.put((K) key, (V) value);
         }
      }
   }
   
   public static <K, V> Dict<K, V> of(K key, V value) {
      Dict<K, V> dict = new Dict<>();
      dict.put(key, value);
      return dict;
   }
   
   public static <K, V> Dict<K, V> dict() {
      return new Dict<>();
   }
   
   public DictItems<K, V> items() {
      DictItems<K, V> items = new DictItems<>();
      items.addAll(this.entrySet());
      return items;
   }
   
   public DictItems<K, V> getItems() {
      return items();
   }
   
   public Set<K> keys() {
      return super.keySet();
   }
   
   public Set<K> getKeys() {
      return keys();
   }
   
   public Collection<V> getValues() {
      return this.values();
   }
   
   public Dict<K, V> add(K key, V value) {
      if (Verify.isNotNullOrEmpty(key)) {
         this.put(key, value);
      } else {
         throw new IllegalArgumentException("A chave do dicionário não pode ser nula ou vazia!");
      }
      return this;
   }
   
   public Dict<K, V> item(K key, V value) {
      return add(key, value);
   }
   
   public Dict<K, V> i(K key, V value) {
      return item(key, value);
   }
   
   public Dict<K, V> keyValue(K key, V value) {
      return add(key, value);
   }
   
   public Dict<K, V> kv(K k, V v) {
      return keyValue(k, v);
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
