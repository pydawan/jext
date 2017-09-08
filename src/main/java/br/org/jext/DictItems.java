package br.org.jext;

import java.util.HashSet;
import java.util.Map.Entry;

/**
 * Itens de dicionário.
 * 
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class DictItems<K, V> extends HashSet<Entry<K, V>> {
   
   private static final long serialVersionUID = 1L;
   
   public DictItems(Set<Entry<K, V>> entrySet) {
      super.addAll(entrySet);
   }

   public DictItems() {
      
   }
   
}
