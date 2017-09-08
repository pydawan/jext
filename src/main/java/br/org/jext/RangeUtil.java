package br.org.jext;

import java.util.ArrayList;

/**
 * <p>Classe utilitária que produz intervalos numéricos.</p>
 * 
 * <p>
 * Possui as mesmas funcionalidades da classe br.gov.go.agr.tipo.Intervalo
 * porém possui a nomenclatura em inglês para projetos que prefiram
 * esse idioma na definição dos nomes de estruturas do sistema.
 * </p>
 * 
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public final class RangeUtil {
   
   public static java.util.List<Integer> range(Integer start, Integer end, Integer increment) {
      java.util.List<Integer> range = new ArrayList<>();
      if (start == null) {
         start = 0;
      }
      if (end == null) {
         end = 0;
      }
      if (increment == null) {
         increment = 1;
      }
      if (start < end && increment > 0) {
         for (int i = start; i < end; i += increment) {
            range.add(i);
         }
      }
      if (start > end && increment < 0) {
         for (int i = start; i > end; i += increment) {
            range.add(i);
         }
      }
      return range;
   }
   
   public static java.util.List<Integer> range(Integer start, Integer end) {
      return range(start, end, null);
   }
   
}
