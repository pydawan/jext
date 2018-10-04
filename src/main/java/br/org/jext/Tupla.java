package br.org.jext;

import java.util.ArrayList;
import java.util.Arrays;

import br.org.verify.Verifique;

/**
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class Tupla {
   
   private final ElementosTupla elementos = new ElementosTupla();
   
   public Tupla(final Object... elementos) {
      this.elementos.addAll(Arrays.asList(elementos));
   }
   
   public Lista obter() {
      return elementos;
   }
   
   public static Tupla de(final Object... elementos) {
      return new Tupla(elementos);
   }
   
   public static <T> java.util.List<Tupla> enumerar(final java.util.List<?> lista) {
      java.util.List<Tupla> enumeracao = null;
      if (lista != null) {
         enumeracao = new ArrayList<>();
         for (int i = 0; i < lista.size(); i++) {
            enumeracao.add(Tupla.de(i, lista.get(i)));
         }
      }
      return enumeracao;
   }
   
   public static <T> Lista enumerar(final Lista lista) {
      Lista enumeracao = null;
      if (lista != null) {
         enumeracao = Lista.de();
         for (int i = 0; i < lista.size(); i++) {
            enumeracao.add(Tupla.de(i, lista.get(i)));
         }
      }
      return enumeracao;
   }
   
   @SafeVarargs
   public static java.util.List<?> unir(final java.util.List<?>... listas) {
      java.util.List<Object> uniao = new ArrayList<>();
      if (Verifique.eNaoVazioOuNulo((Object[]) listas)) {
         int menorTamanho = obterMenorTamanho(listas);
         java.util.List<Object> elementos = null;
         // itera através das listas.
         for (int i = 0; i < listas.length; i++) {
            elementos = new ArrayList<>();
            // itera através dos elementos.
            for (int j = 0; j < menorTamanho; j++) {
               elementos.add(listas[i].get(j));
            }
            uniao.add(Tupla.de(elementos.toArray()));
         }
      }
      return uniao;
   }
   
   @SafeVarargs
   public static Lista unir(final Lista... listas) {
      Lista uniao = Lista.de();
      if (Verifique.eNaoVazioOuNulo((Object[]) listas)) {
         int menorTamanho = obterMenorTamanho(listas);
         Lista elementos = null;
         // itera através das listas.
         for (int i = 0; i < listas.length; i++) {
            elementos = Lista.de();
            // itera através dos elementos;
            for (int j = 0; j < menorTamanho; j++) {
               elementos.add(listas[i].get(j));
            }
            uniao.add(Tupla.de(elementos.toArray()));
         }
      }
      return uniao;
   }
   
   @SafeVarargs
   public static int obterMenorTamanho(final java.util.List<?>... listas) {
      int menorTamanho = 0;
      if (Verifique.eNaoVazioOuNulo((Object[]) listas)) {
         menorTamanho = listas[0].size();
         for (java.util.List<?> lista : listas) {
            if (lista.size() < menorTamanho) {
               menorTamanho = lista.size();
            }
         }
      }
      return menorTamanho;
   }
   
   @SafeVarargs
   public static int obterMenorTamanho(final Lista... listas) {
      return obterMenorTamanho((java.util.List<?>[]) listas);
   }
   
   @SafeVarargs
   public static Tupla obterTamanhos(final java.util.List<Object>... listas) {
      java.util.List<Integer> tamanhos = new ArrayList<>();
      if (Verifique.eNaoNulo((Object[]) listas)) {
         for (java.util.List<?> lista : listas) {
            if (Verifique.eNaoNulo(lista)) {
               tamanhos.add(lista.size());
            } else {
               tamanhos.add(0);
            }
         }
      }
      return Tupla.de(tamanhos.toArray());
   }
   
   public static Tupla tupla(Object... elementos) {
       return Tupla.de(elementos);
   }
   
   public Object[] toArray() {
       return this.elementos.toArray(); 
   }
   
   @Override
   public String toString() {
      return elementos.toString();
   }
   
}
