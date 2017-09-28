package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 27/09/2017
 * @since v1.0.0
 */
public enum Regex {
   
   CPF("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}"),
   CNPJ("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}"),
   SQL_DATETIME_FORMAT("\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}"), 
   SQL_DATE_FORMAT("\\d{4}-\\d{1,2}-\\d{1,2}"), 
   SQL_TIME_FORMAT("\\d{1,2}:\\d{1,2}:\\d{1,2}");
      
   private final String value;
   
   private Regex(String value) {
      this.value = value;
   }
   
   public String getValue() {
      return value;
   }
   
}
