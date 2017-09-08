package br.org.jext;

import java.util.ArrayList;
import java.util.Arrays;

import br.org.verify.Verifique;

/**
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class Lista extends ArrayList<Object> {
   
   private static final long serialVersionUID = 1L;
   
   public static final java.util.List<Object> LISTA_NULA = null;
   public static final java.util.List<Object> LISTA_VAZIA = new ArrayList<>();
   
   public Lista adicionar(Object... objetos) {
      if (objetos != null) {
         for (Object objeto : objetos) {
            if (objeto != null) {
               this.add(objeto);
            }
         }
      }
      return this;
   }
   
   public Lista remover(Object... objetos) {
      if (objetos != null) {
         for (Object objeto : objetos) {
            if (objeto != null) {
               this.remove((Object) objeto);
            }
         }
      }
      return this;
   }
   
   public static Lista de(Object... objetos) {
      Lista lista = new Lista();
      lista.addAll(Arrays.asList(objetos));
      return lista;
   }
   
   public static Lista de() {
      return new Lista();
   }
   
   public static Lista lista(Object... objetos) {
      return de(objetos);
   }
   
   public static Lista lista() {
      return new Lista();
   }
   
   public static boolean eNula(java.util.List<?> lista) {
      return Verifique.eNulo(lista);
   }
   
   public static boolean nula(java.util.List<?> lista) {
      return Verifique.nulo(lista);
   }
   
   public static boolean eNaoNula(java.util.List<?> lista) {
      return Verifique.eNaoNulo(lista);
   }
   
   public static boolean naoNula(java.util.List<?> lista) {
      return Verifique.naoNulo(lista);
   }
   
   public static boolean eVazia(java.util.List<?> lista) {
      return Verifique.eVazio(lista);
   }
   
   public static boolean vazia(java.util.List<?> lista) {
      return Verifique.vazio(lista);
   }
   
   public static boolean eNaoVazia(java.util.List<?> lista) {
      return Verifique.eNaoVazio(lista);
   }
   
   public static boolean naoVazia(java.util.List<?> lista) {
      return Verifique.naoVazio(lista);
   }
   
   public static boolean eNulaOuVazia(java.util.List<?> lista) {
      return Verifique.eNuloOuVazio(lista);
   }
   
   public static boolean nulaOuVazia(java.util.List<?> lista) {
      return Verifique.nuloOuVazio(lista);
   }
   
   public static boolean eVaziaOuNula(java.util.List<?> lista) {
      return Verifique.eVazioOuNulo(lista);
   }
   
   public static boolean vaziaOuNula(java.util.List<?> lista) {
      return Verifique.vazioOuNulo(lista);
   }
   
   public static boolean eNaoNulaOuVazia(java.util.List<?> lista) {
      return Verifique.eNaoNuloOuVazio(lista);
   }
   
   public static boolean naoNulaOuVazia(java.util.List<?> lista) {
      return Verifique.naoNuloOuVazio(lista);
   }
   
   public static boolean eNaoVaziaOuNula(java.util.List<?> lista) {
      return Verifique.eNaoVazioOuNulo(lista);
   }
   
   public static boolean naoVaziaOuNula(java.util.List<?> lista) {
      return Verifique.vazioOuNulo(lista);
   }
   
}
