package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 27/09/2017
 * @since v1.0.0
 */
public enum Regex {
   
   CPF("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$"),
   CNPJ("^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}$"),
   CEP("^\\d{5}-\\d{3}$"),
   REGEX_CHASSI_VEICULO("^[A-Z]{3}\\.[A-Z0-9]{6}\\.[A-Z0-9]{2}\\.[A-Z0-9]{6}$"),
   REGEX_PLACA_VEICULO("^[A-Z]{3}\\-\\d{4}$"),
   TELEFONE_FIXO("^\\(\\d{2}\\) \\d{4}-\\d{4}$"),
   TELEFONE_CELULAR("^\\(\\d{2}\\) \\d{5}-\\d{4}$"),
   EMAIL("^[a-z]+[a-z0-9._-]+@(\\w+\\.\\w+)+$"),
   SQL_DATETIME_FORMAT("^\\d{2,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}(.\\d{1,6})?$"), 
   SQL_DATE_FORMAT("^\\d{2,4}-\\d{1,2}-\\d{1,2}$"), 
   SQL_TIME_FORMAT("^\\d{1,2}:\\d{1,2}:\\d{1,2}(.\\d{1,6})?$"),
   DATETIME_FORMAT("^\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}:\\d{2}(\\.\\d{1,6})?$"),
   DATE_FORMAT("^\\d{2}/\\d{2}/\\d{4}$"),
   TIME_FORMAT("^\\d{2}:\\d{2}:\\d{2}(\\.\\d{1,6})?$");
      
   private final String value;
   
   private Regex(String value) {
      this.value = value;
   }
   
   public String getValue() {
      return value;
   }
   
   public String value() {
      return getValue();
   }
   
}
