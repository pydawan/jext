package br.org.jext;

import java.lang.reflect.Array;

import org.junit.Test;

/**
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class DictTest {
   
   @Test
   public void test() {
      Dict<String, Object> dict = new Dict<>();
      dict.put("nome", "Thiago Alexandre");
      dict.put("sobrenome", "Martins Monteiro");
      System.out.println(dict.items());
      System.out.println(dict.keys());
      System.out.println(dict.values());
      System.out.println(dict);
      System.out.println($.t("nome", "thiago"));
      System.out.println($.dict().item("nome", "Lorenzo").item("sobrenome", "Roncolato Louly Monteiro").item("idade", 1));
      System.out.println($.d().i("nome", "Lorenzo").i("sobrenome", "Roncolato Louly Monteiro").i("idade", 1));
      System.out.println(new Dict<>($.kv("engine", "mysql"), $.kv("host", "localhost")));
      System.out.println($.kv("teste", 123) instanceof Object[]);
      System.out.println(Array.getLength($.kv("a", "a")));
   }
   
}
