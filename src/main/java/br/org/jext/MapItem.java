package br.org.jext;

/**
 * <p>Entrada ou item de um mapa.</p>
 * 
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class MapItem {
   
   private Object key;
   private Object value;
   
   public MapItem(Object key, Object value) {
      this.key = key;
      this.value = value;
   }
   
   public Object getKey() {
      return key;
   }
   
   public Object getValue() {
      return value;
   }
   
   public static MapItem of(Object key, Object value) {
      return new MapItem(key, value);
   }
   
   public static MapItem item(Object key, Object value) {
      return of(key, value);
   }
   
   @Override
   public String toString() {
      return String.format("%s: %s", key, value);
   }
   
}
