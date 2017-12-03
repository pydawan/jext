package br.org.jext;


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
   }
   
}
