package br.org.jext;

import java.util.HashMap;

import br.org.verify.Verifique;

/**
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class Mapa extends HashMap<Object, Object> {
   
   private static final long serialVersionUID = 1L;
   
   public static final java.util.Map<Object, Object> MAPA_NULO = null;
   public static final java.util.Map<Object, Object> MAPA_VAZIO = new HashMap<>();
   
   public static Mapa de(Object chave, Object valor) {
      Mapa mapa = new Mapa();
      mapa.put(chave, valor);
      return mapa;
   }
   
   public static Mapa mapa(Object chave, Object valor) {
      return de(chave, valor);
   }
   
   public static Mapa mapa() {
      return new Mapa();
   }
   
   public static boolean eNulo(java.util.Map<?, ?> mapa) {
      return Verifique.eNulo(mapa);
   }
   
   public static boolean nulo(java.util.Map<?, ?> mapa) {
      return Verifique.nulo(mapa);
   }
   
   public static boolean eNaoNulo(java.util.Map<?, ?> mapa) {
      return Verifique.eNaoNulo(mapa);
   }
   
   public static boolean naoNulo(java.util.Map<?, ?> mapa) {
      return Verifique.naoNulo(mapa);
   }
   
   public static boolean eVazio(java.util.Map<?, ?> mapa) {
      return Verifique.eVazio(mapa);
   }
   
   public static boolean vazio(java.util.Map<?, ?> mapa) {
      return Verifique.vazio(mapa);
   }
   
   public static boolean eNaoVazio(java.util.Map<?, ?> mapa) {
      return Verifique.eNaoVazio(mapa);
   }
   
   public static boolean naoVazio(java.util.Map<?, ?> mapa) {
      return Verifique.naoVazio(mapa);
   }
   
   public static boolean eNuloOuVazio(java.util.Map<?, ?> mapa) {
      return Verifique.eNuloOuVazio(mapa);
   }
   
   public static boolean nuloOuVazio(java.util.Map<?, ?> mapa) {
      return Verifique.nuloOuVazio(mapa);
   }
   
   public static boolean eVazioOuNUlo(java.util.Map<?, ?> mapa) {
      return Verifique.eVazioOuNulo(mapa);
   }
   
   public static boolean vazioOuNulo(java.util.Map<?, ?> mapa) {
      return Verifique.vazioOuNulo(mapa);
   }
   
   public static boolean eNaoNuloOuVazio(java.util.Map<?, ?> mapa) {
      return Verifique.eNaoNuloOuVazio(mapa);
   }
   
   public static boolean naoNuloOuVazio(java.util.Map<?, ?> mapa) {
      return Verifique.naoNuloOuVazio(mapa);
   }
   
   public static boolean eNaoVazioOuNulo(java.util.Map<?, ?> mapa) {
      return Verifique.eNaoVazioOuNulo(mapa);
   }
   
   public static boolean naoVazioOuNulo(java.util.Map<?, ?> mapa) {
      return Verifique.naoVazioOuNulo(mapa);
   }
   
}
