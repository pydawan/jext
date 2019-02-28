package br.org.jext;


import static br.org.jext.$.capitalize;
import static br.org.jext.$.list;
import static br.org.jext.$.println;

import org.junit.Test;

/**
 * Testa os atalhos para métodos e tipos de dados.
 * 
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class ShortcutTest {
   
   @Test
   public void test() {
      println(capitalize("thiago", "alexandre", "martins", "monteiro"));
      println(list("Abacate", "Banana", "Caju", 1, 2, 3));
      $.printf("Ano atual: %s\n", $.year());
      $.printf("Data atual: %s\n", $.fulldate());
      $.println(
         Map.items(
            Map.item("nome", "Thiago"), 
            Map.item("idade", 35)
         )
      );
      $.println(
         $.map(
            $.entry("nome", "Thiago"),
            $.entry("idade", 35),
            $.entry("cpf", "003.696.631-28"),
            $.entry("cidade", "Goiânia")
         )
      );
      $.println($.range(1, 50));
      int[] numeros = {1, 2, 3, 4, 5, 6, 7};
      $.forEach(numeros, new Function<Integer>() {
          public void run() {
              $.println(this.value);
          }
      });
   }
   
}
