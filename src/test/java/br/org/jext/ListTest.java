package br.org.jext;


import static br.org.jext.Lists.list;
import static br.org.jext.Tuple.tuple;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class ListTest {
   
   @Test
   public void test() {
      Assert.assertTrue(List.emptyOrNull(List.EMPTY_LIST));
      for (String string : Strings.array("?", 5)) {
         System.out.println(string);
      }
      System.out.println(list());
      System.out.println(list(1, 2, 3, "Thiago", true, 5.5, list(), tuple(1, 2, 3)));
   }
   
}
