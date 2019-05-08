package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 08/04/2019
 * @version v1.0.1 03/05/2019
 * @since v1.0.0
 */
public class RegexUtil {
    public static final String REGEX_DATA_DIA_MES_ANO = "^\\d{2}/\\d{2}/\\d{4}$";
    public static final String INTEGER_REGEX_PATTERN = "^(\\-|\\+)?\\d+$";
    public static final String INTEGER_LIST_REGEX_PATTERN = "^((\\-|\\+)?\\d+,)*(\\-|\\+)?\\d+$";
    public static final String LONG_REGEX_PATTERN = "^(\\-|\\+)?\\d+(l|L)?$";
    public static final String LONG_LIST_REGEX_PATTERN = "^((\\-|\\+)?\\d+(l|L)?,)*(\\-|\\+)?\\d+(l|L)?$";
    public static final String FLOAT_REGEX_PATTERN = "^(\\-|\\+)?\\d+(\\.\\d+)?(f|F)?$";
    public static final String FLOAT_LIST_REGEX_PATTERN = "^((\\-|\\+)?\\d+(\\.\\d+)?(f|F)?,)*(\\-|\\+)?\\d+(\\.\\d+)?(f|F)?$";
    public static final String DOUBLE_REGEX_PATTERN = "^(\\-|\\+)?\\d+(\\.\\d+)?(d|D)?$";
    public static final String DOUBLE_LIST_REGEX_PATTERN = "^((\\-|\\+)?\\d+(\\.\\d+)?(d|D)?,)*(\\-|\\+)?\\d+(\\.\\d+)?(d|D)?$";
    public static final String BOOLEAN_REGEX_PATTERN = "^(false|true)$";
    public static final String BOOLEAN_LIST_REGEX_PATTERN = "^((false|true),)+(false|true)$";
    public static final String CHARACTER_REGEX_PATTERN = "^.$";
    public static final String CHARACTER_LIST_REGEX_PATTERN = "^(.,)+.$";
    public static final String CPF = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";
    public static final String CNPJ = "^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}$";
    public static final String CEP = "^\\d{5}-\\d{3}$";
    public static final String REGEX_CHASSI_VEICULO = "^[A-Z]{3}\\.[A-Z0-9]{6}\\.[A-Z0-9]{2}\\.[A-Z0-9]{6}$";
    public static final String REGEX_PLACA_VEICULO = "^[A-Z]{3}\\-\\d{4}$";
    public static final String TELEFONE_FIXO = "^\\(\\d{2}\\) \\d{4}-\\d{4}$";
    public static final String TELEFONE_CELULAR = "^\\(\\d{2}\\) \\d{5}-\\d{4}$";
    public static final String EMAIL = "^[a-z]+[a-z0-9._-]+@(\\w+\\.\\w+)+$";
    public static final String SQL_DATETIME_FORMAT = "^\\d{2,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}(.\\d{1,6})?$"; 
    public static final String SQL_DATE_FORMAT = "^\\d{2,4}-\\d{1,2}-\\d{1,2}$"; 
    public static final String SQL_TIME_FORMAT = "^\\d{1,2}:\\d{1,2}:\\d{1,2}(.\\d{1,6})?$";
    public static final String DATETIME_FORMAT = "^\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}:\\d{2}(\\.\\d{1,6})?$";
    public static final String DATE_FORMAT = "^\\d{2}/\\d{2}/\\d{4}$";
    public static final String TIME_FORMAT = "^\\d{2}:\\d{2}:\\d{2}(\\.\\d{1,6})?$";
}
