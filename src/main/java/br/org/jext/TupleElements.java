package br.org.jext;

import java.util.ArrayList;

/**
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class TupleElements extends ArrayList<Object> {
   
   private static final long serialVersionUID = 1L;
   
   @Override
   public String toString() {
      return super.toString().replace("[", "(").replace("]", ")");
   }
   
}
