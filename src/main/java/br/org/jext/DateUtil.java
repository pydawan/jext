package br.org.jext;

import static br.org.verify.Verify.isEmptyOrNull;
import static br.org.verify.Verify.isNotEmpty;
import static br.org.verify.Verify.isNotNullOrEmpty;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * <p>Classe de métodos utilitários para manipulação de data e hora.</p>
 * 
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 * @see java.util.Date
 */
@SuppressWarnings("deprecation")
public final class DateUtil {
   
   private static SimpleDateFormat formatador = new SimpleDateFormat();
   
   public static String getDiaMesAno(Date data) {
      verificarData(data);
      formatador.applyPattern("dd/MM/yyyy");
      return formatador.format(data);
   }
   
   public static String diaMesAno(Date data) {
      return getDiaMesAno(data);
   }
   
   public static String getYearMonthDay(Date date) {
      verificarData(date);
      formatador.applyPattern("yyyy-MM-dd");
      return formatador.format(date);
   }
   
   public static String yearMonthDay(Date date) {
      return getYearMonthDay(date);
   }
   
   public static String getHorasMinutosSegundos(Date data) {
      verificarData(data);
      formatador.applyPattern("HH:mm:ss");
      return formatador.format(data);
   }
   
   public static String horasMinutosSegundos(Date data) {
      return getHorasMinutosSegundos(data);
   }
   
   public static String getHoursMinutesSeconds(Date date) {
      return getHorasMinutosSegundos(date);
   }
   
   public static String hoursMinutesSeconds(Date date) {
      return horasMinutosSegundos(date);
   }
   
   public static String getSqlTimestamp(Date data) {
      verificarData(data);
      formatador.applyPattern("yyyy-MM-dd HH:mm:ss");
      return formatador.format(data);
   }
   
   public static String sqlTimestamp(Date date) {
      return getSqlTimestamp(date);
   }
   
   public static String getDataPorExtenso(Date data) {
      verificarData(data);
      formatador.applyPattern("EEEEE dd 'de' MMMMM 'de' yyyy");
      return formatador.format(data);
   }
   
   public static String dataPorExtenso(Date data) {
      return getDataPorExtenso(data);
   }
   
   public static String getFullDate(Date date) {
      return getDataPorExtenso(date);
   }
   
   public static String getDataAtualPorExtenso() {
      return getDataPorExtenso(new Date());
   }
   
   public static String dataAtualPorExtenso() {
      return getDataAtualPorExtenso();
   }
   
   public static String getFullCurrentDate() {
      return getFullDate(new Date());
   }
   
   public static String fullCurrentDate() {
      return getFullCurrentDate();
   }
   
   public static String getDataFormatada(Date data, String formato) {
      verificarData(data);
      verificarFormato(formato);
      formatador.applyPattern(formato);
      return formatador.format(data);
   }
   
   public static String dataFormatada(Date data, String formato) {
      return getDataFormatada(data, formato);
   }
   
   public static String getFormattedDate(Date date, String format) {
      return getDataFormatada(date, format);
   }
   
   public static String formattedDate(Date date, String format) {
      return getFormattedDate(date, format);
   }
   
   public static String getDataAtualFormatada(String formato) {
      verificarFormato(formato);
      formatador.applyPattern(formato);
      return formatador.format(new Date());
   }
   
   public static String dataAtualFormatada(String formato) {
      return getDataAtualFormatada(formato);
   }
   
   public static String getCurrentDate(String format) {
      return getDataAtualFormatada(format);
   }
   
   public static String currentDate(String format) {
      return getCurrentDate(format);
   }
   
   public static String currdate(String format) {
      return currentDate(format);
   }
   
   public static String currdate() {
      return currentDate("dd/MM/yyyy");
   }
   
   public static void verificarData(Date data) {
      if (data == null) {
         throw new IllegalArgumentException("A data não pode ser nula!");
      }
   }
   
   public static void verifyDate(Date date) {
      verificarData(date);
   }
   
   public static void verificarFormato(String formato) {
      if (isEmptyOrNull(formato)) {
         throw new IllegalArgumentException("O formato não pode ser vazio!");
      }
   }
   
   public static void verifyFormat(String format) {
      verificarFormato(format);
   }
   
   public static void verificarLocalizacao(Locale locale) {
      if (locale == null) {
         throw new IllegalArgumentException("A localização não pode ser nula!");
      }
   }
   
   public static void verifyLocale(Locale locale) {
      verificarLocalizacao(locale);
   }
   
   public static String getSqlDate(String data) {
      if (isNotEmpty(data)) {
         String[] array = data.split("/");
         return String.format("%s-%s-%s", array[2], array[1], array[0]);
      }
      return "";
   }
   
   public static String sqlDate(String data) {
      return getSqlDate(data);
   }
   
   public static String sqlDate(Date data) {
      return sqlDate(diaMesAno(data));
   }
   
   public static String sqlTime(Date data) {
      return horasMinutosSegundos(data);
   }
   
   public static String formatarData(Date data, String formato) {
      verificarData(data);
      verificarFormato(formato);
      formatador.applyPattern(formato);
      return formatador.format(data);
   }
   
   public static String formatDate(Date date, String format) {
      return formatarData(date, format);
   }
   
   public static String getAno(Date data) {
      String ano = "";
      if (data != null) {
         ano = "" + (data.getYear() + 1900);
      }
      return ano;
   }
   
   public static String getYear(Date date) {
      return getAno(date);
   }
   
   public static String getAnoAtual() {
      return getAno(new Date());
   }
   
   public static String getAno() {
      return getAnoAtual();
   }
   
   public static String getCurrentYear() {
      return getYear(new Date());
   }
   
   public static String getYear() {
      return getCurrentYear();
   }
   
   public static String ano(Date data) {
      return getAno(data);
   }
   
   public static String ano() {
      return getAno();
   }
   
   public static String year(Date date) {
      return getYear(date);
   }
   
   public static String anoAtual() {
      return getAnoAtual();
   }
   
   public static String currentYear() {
      return getCurrentYear();
   }
   
   public static String year() {
      return getYear();
   }
   
   public static Date date(int year, int month, int day) {
      Date date = new Date();
      date.setYear(year - 1900);
      date.setMonth(month - 1);
      date.setDate(day);
      return date;
   }
   
   public static Date data(int dia, int mes, int ano) {
      return date(ano, mes, dia);
   }
   
   public static Date date() {
      return new Date();
   }
   
   public static Date data() {
      return date();
   }
   
   public static Date datetime(int year, int month, int day, int hours, int minutes, int seconds) {
      Date datetime = new Date();
      datetime.setYear(year - 1900);
      datetime.setMonth(month - 1);
      datetime.setDate(day);
      datetime.setHours(hours);
      datetime.setMinutes(minutes);
      datetime.setSeconds(seconds);
      return datetime;
   }
   
   public static Date datahora(int dia, int mes, int ano, int horas, int minutos, int segundos) {
      return datetime(ano, mes, dia, horas, minutos, segundos);
   }
   
   public static Date datetime() {
      return new Date();
   }
   
   public static Date datahora() {
      return datetime();
   }
   
   public static String getMonth(Date date) {
      String month = "";
      if (date != null) {
         switch(date.getMonth()) {
            case 0:
               month = "Janeiro";
               break;
            case 1:
               month = "Fevereiro";
               break;
            case 2:
               month = "Março";
               break;
            case 3:
               month = "Abril";
               break;
            case 4:
               month = "Maio";
               break;
            case 5:
               month = "Junho";
               break;
            case 6:
               month = "Julho";
               break;
            case 7:
               month = "Agosto";
               break;
            case 8:
               month = "Setembro";
               break;
            case 9:
               month = "Outubro";
               break;
            case 10:
               month = "Novembro";
               break;
            case 11:
               month = "Dezembro";
               break;
         }
      }
      return month;
   }
   
   public static String month(Date date) {
      return getMonth(date);
   }
   
   public static String getMes(Date data) {
      return month(data);
   }
   
   public static String mes(Date data) {
      return getMes(data);
   }
   
   public static String getMonth() {
      return getMonth(new Date());
   }
   
   public static String month() {
      return getMonth();
   }
   
   public static String getMes() {
      return getMonth();
   }
   
   public static String mes() {
      return getMes();
   }
   
   public static String getDay(Date date) {
      String day = "";
      if (date != null) {
         switch(date.getDay()) {
            case 0:
               day = "Domingo";
               break;
            case 1:
               day = "Segunda-feira";
               break;
            case 2:
               day = "Terça-feira";
               break;
            case 3:
               day = "Quarta-feira";
               break;
            case 4:
               day = "Quinta-feira";
               break;
            case 5:
               day = "Sexta-feira";
               break;
            case 6:
               day = "Sábado";
               break;
         }
      }
      return day;
   }
   
   public static String day(Date date) {
      return getDay(date);
   }
   
   public static String getDia(Date data) {
      return day(data);
   }
   
   public static String dia(Date data) {
      return getDia(data);
   }
   
   public static String getDay() {
      return getDay(new Date());
   }
   
   public static String day() {
      return getDay();
   }
   
   public static String getDia() {
      return getDia(new Date());
   }
   
   public static String dia() {
      return getDia();
   }
   
   public static String format(Date date, String format) {
      verificarData(date);
      verificarFormato(format);
      formatador.applyPattern(format);
      return formatador.format(date);
   }
   
   public static String formatar(Date data, String formato) {
      return format(data, formato);
   }
   
   public static Date now() {
      return new Date();
   }
   
   public static String now(String format) {
      return DateUtil.currdate(format);
   }
   
   public static String currentTimestamp() {
      return now("yyyy-MM-dd HH:mm:ss");
   }
   
   public static String currtimestamp() {
      return currentTimestamp();
   }
   
   public static Date agora() {
      return new Date();
   }
   
   public static String agora(String formato) {
      return now(formato);
   }
   
   public static Date date(String value, String format, Locale locale) {
      Date date = null;
      if (isNotNullOrEmpty(value)) {
         SimpleDateFormat formatter = new SimpleDateFormat(format, locale);
         formatter.applyPattern(format);
         try {
            date = formatter.parse(value);
         } catch (ParseException e) {
            e.printStackTrace();
         }
      }
      return date;
   }
   
   public static Date date(String value, String format) {
      Date date = null;
      if (isNotNullOrEmpty(value)) {
         try {
            formatador.applyPattern(format);
            date = formatador.parse(value);
         } catch (ParseException e) {
            e.printStackTrace();
         }
      }
      return date;
   }
   
   public static Date date(String value) {
      Date date = null;
      if (isNotNullOrEmpty(value)) {
         try {
            formatador.applyPattern("dd/MM/yyyy");
            date = formatador.parse(value);
         } catch (ParseException e) {
            e.printStackTrace();
         }
      }
      return date;
   }
   
   public static Date datetime(String value) {
      Date datetime = null;
      if (value.matches(Regex.DATETIME_FORMAT.value())) {
         if (value.endsWith(".S")) {
            datetime = date(value, "dd/MM/yyyy HH:mm:ss.S");
         } else if (value.endsWith(".SS")) {
            datetime = date(value, "dd/MM/yyyy HH:mm:ss.SS");
         } else if (value.endsWith(".SSS")) {
            datetime = date(value, "dd/MM/yyyy HH:mm:ss.SSS");
         } else if (value.endsWith(".SSSS")) {
            datetime = date(value, "dd/MM/yyyy HH:mm:ss.SSSS");
         } else if (value.endsWith(".SSSSS")) {
            datetime = date(value, "dd/MM/yyyy HH:mm:ss.SSSSS");
         } else if (value.endsWith(".SSSSSS")) {
            datetime = date(value, "dd/MM/yyyy HH:mm:ss.SSSSSS");
         } else {
            datetime = date(value, "dd/MM/yyyy HH:mm:ss");
         }
      }
      return datetime;
   }
   
   public static Date time(String value) {
      Date time = null;
      if (value.matches(Regex.SQL_TIME_FORMAT.value())) {
         if (value.endsWith(".S")) {
            time = date(value, "HH:mm:ss.S");
         } else if (value.endsWith(".SS")) {
            time = date(value, "HH:mm:ss.SS");
         } else if (value.endsWith(".SSS")) {
            time = date(value, "HH:mm:ss.SSS");
         } else if (value.endsWith(".SSSS")) {
            time = date(value, "HH:mm:ss.SSSS");
         } else if (value.endsWith(".SSSSS")) {
            time = date(value, "HH:mm:ss.SSSSS");
         } else if (value.endsWith(".SSSSSS")) {
            time = date(value, "HH:mm:ss.SSSSSS");
         } else {
            time = date(value, "HH:mm:ss");
         }
      }
      return time;
   }
   
   public static Date toDatetimeSql(String value) {
      Date datetime = null;
      if (value.matches(Regex.SQL_DATETIME_FORMAT.value())) {
         if (value.endsWith(".S")) {
            datetime = date(value, "yyyy-MM-dd HH:mm:ss.S");
         } else if (value.endsWith(".SS")) {
            datetime = date(value, "yyyy-MM-dd HH:mm:ss.SS");
         } else if (value.endsWith(".SSS")) {
            datetime = date(value, "yyyy-MM-dd HH:mm:ss.SSS");
         } else if (value.endsWith(".SSSS")) {
            datetime = date(value, "yyyy-MM-dd HH:mm:ss.SSSS");
         } else if (value.endsWith(".SSSSS")) {
            datetime = date(value, "yyyy-MM-dd HH:mm:ss.SSSSS");
         } else if (value.endsWith(".SSSSSS")) {
            datetime = date(value, "yyyy-MM-dd HH:mm:ss.SSSSSS");
         } else {
            datetime = date(value, "yyyy-MM-dd HH:mm:ss");
         }
      }
      return datetime;
   }
   
   public static Date datetimeSql(String value) {
      return toDatetimeSql(value);
   }
   
   public static Date toDateSql(String value) {
      return date(value, "yyyy-MM-dd");
   }
   
   public static Date dateSql(String value) {
      return toDateSql(value);
   }
   
   public static Date toTimeSql(String value) {
      return time(value);
   }
   
   public static Date timeSql(String value) {
      return toTimeSql(value);
   }
   
   public static String toSqlFormat(String dateFormat) {
      String sqlFormat = "";
      String datahora[] = null;
      String data = null;
      String dia = null;
      String mes = null;
      String ano = null;
      String horas = null;
      if (isNotNullOrEmpty(dateFormat)) {
         if (dateFormat.matches(Regex.DATETIME_FORMAT.value())) {
            datahora = dateFormat.split(" ");
            data = datahora[0];
            horas = datahora[1];
            datahora = data.split("/");
            dia = datahora[0];
            mes = datahora[1];
            ano = datahora[2];
            data = String.format("%s-%s-%s", ano, mes, dia);
            sqlFormat = String.format("%s %s", data, horas);
         } else if (dateFormat.matches(Regex.DATE_FORMAT.value())) {
            datahora = dateFormat.split("/");
            dia = datahora[0];
            mes = datahora[1];
            ano = datahora[2];
            sqlFormat = String.format("%s-%s-%s", ano, mes, dia);
         } else if (dateFormat.matches(Regex.TIME_FORMAT.value())) {
            sqlFormat = dateFormat;
         } else {
            throw new IllegalArgumentException("ATENÇÃO: formato de data SQL inválido!");
         }
      }
      return sqlFormat;
   }
   
   public static String sqlFormat(String dateFormat) {
      return toSqlFormat(dateFormat);
   }
   
   public static String toDateFormat(String sqlFormat) {
      String dateFormat = null;
      String[] datahora = null;
      String data = null;
      String horas = null;
      String dia = null;
      String mes = null;
      String ano = null;
      if (isNotNullOrEmpty(sqlFormat)) {
         if (sqlFormat.matches(Regex.SQL_DATETIME_FORMAT.value())) {
            datahora = sqlFormat.split(" ");
            data = datahora[0];
            horas = datahora[1];
            datahora = data.split("-");
            ano = datahora[0];
            mes = datahora[1];
            dia = datahora[2];
            data = String.format("%s/%s/%s", dia, mes, ano);
            dateFormat = String.format("%s %s", data, horas);
         } else if (sqlFormat.matches(Regex.SQL_DATE_FORMAT.value())) {
            datahora = sqlFormat.split("-");
            ano = datahora[0];
            mes = datahora[1];
            dia = datahora[2];
            dateFormat = String.format("%s/%s/%s", dia, mes, ano);
         } else if (sqlFormat.matches(Regex.TIME_FORMAT.value())) {
            dateFormat = sqlFormat;
         } else {
            throw new IllegalArgumentException("ATENÇÃO: formato de data inválido!");
         }
      }
      return dateFormat;
   }
   
   public static String dateFormat(String sqlFormat) {
      return toDateFormat(sqlFormat);
   }
   
   public static String datetime(Date date, int dateStyle, int timeStyle, Locale locale) {
      verifyDate(date);
      verifyLocale(locale);
      DateFormat dateFormat = DateFormat.getDateTimeInstance(dateStyle, timeStyle, locale);
      return dateFormat.format(date);
   }
   
   public static String datetime(Date date, Locale locale) {
      return datetime(date, DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
   }
   
   public static String datetime(Date date) {
      return datetime(date, Locale.getDefault());
   }
   
   public static String datetime(Date date, int dateStyle, int timeStyle) {
      return datetime(date, dateStyle, timeStyle, Locale.getDefault());
   }
   
   public static String datetime(Locale locale) {
      return datetime(new Date(), locale);
   }
   
   public static String datetime(int dateStyle, int timeStyle, Locale locale) {
      return datetime(new Date(), dateStyle, timeStyle, locale);
   }
   
   public static String date(Date date, int style, Locale locale) {
      verifyDate(date);
      verifyLocale(locale);
      DateFormat dateFormat = DateFormat.getDateInstance(style, locale);
      return dateFormat.format(date);
   }
   
   public static String date(Date date, Locale locale) {
      return date(date, DateFormat.DEFAULT, locale);
   }
   
   public static String date(Date date) {
      return date(date, Locale.getDefault());
   }
   
   public static String date(Locale locale) {
      return date(new Date(), locale);
   }
   
   public static String date(Date date, int dateStyle) {
      return date(date, dateStyle, Locale.getDefault());
   }
   
   public static String date(int dateStyle, Locale locale) {
      return date(new Date(), dateStyle, locale);
   }
   
   public static String shortDate(Date date, Locale locale) {
      return date(date, DateFormat.SHORT, locale);
   }
   
   public static String shortdate(Date date, Locale locale) {
      return shortDate(date, locale);
   }
   
   public static String shortDate(Date date) {
      return shortDate(date, Locale.getDefault());
   }
   
   public static String shortdate(Date date) {
      return shortDate(date);
   }
   
   public static String shortDate(Locale locale) {
      return shortDate(new Date(), locale);
   }
   
   public static String shortdate(Locale locale) {
      return shortDate(locale);
   }
   
   public static String shortDate() {
      return shortDate(new Date(), Locale.getDefault());
   }
   
   public static String shortdate() {
      return shortDate();
   }
   
   public static String mediumDate(Date date, Locale locale) {
      return date(date, DateFormat.MEDIUM, locale);
   }
   
   public static String mediumdate(Date date, Locale locale) {
      return mediumDate(date, locale);
   }
   
   public static String mediumDate(Date date) {
      return mediumDate(date, Locale.getDefault());
   }
   
   public static String mediumdate(Date date) {
      return mediumDate(date);
   }
   
   public static String mediumDate(Locale locale) {
      return mediumDate(new Date(), locale);
   }
   
   public static String mediumdate(Locale locale) {
      return mediumDate(locale);
   }
   
   public static String mediumDate() {
      return mediumDate(new Date(), Locale.getDefault());
   }
   
   public static String mediumdate() {
      return mediumDate();
   }
   
   public static String longDate(Date date, Locale locale) {
      return date(date, DateFormat.LONG, locale);
   }
   
   public static String longdate(Date date, Locale locale) {
      return longDate(date, locale);
   }
   
   public static String longDate(Date date) {
      return longDate(date, Locale.getDefault());
   }
   
   public static String longdate(Date date) {
      return longDate(date);
   }
   
   public static String longDate(Locale locale) {
      return longDate(new Date(), locale);
   }
   
   public static String longdate(Locale locale) {
      return longDate(locale);
   }
   
   public static String longDate() {
      return longDate(new Date(), Locale.getDefault());
   }
   
   public static String longdate() {
      return longDate(new Date(), Locale.getDefault());
   }
   
   public static String fullDate(Date date, Locale locale) {
      return date(date, DateFormat.FULL, locale);
   }
   
   public static String fulldate(Date date, Locale locale) {
      return fullDate(date, locale);
   }
   
   public static String fullDate(Date date) {
      return fullDate(date, Locale.getDefault());
   }
   
   public static String fulldate(Date date) {
      return fullDate(date);
   }
   
   public static String fullDate(Locale locale) {
      verifyLocale(locale);
      return fullDate(new Date(), locale);
   }
   
   public static String fulldate(Locale locale) {
      return fullDate(locale);
   }
   
   public static String fullDate() {
      return fullDate(new Date(), Locale.getDefault());
   }
   
   public static String fulldate() {
      return fullDate();
   }
   
   public static String time(Date date, int style, Locale locale) {
      verifyDate(date);
      verifyLocale(locale);
      DateFormat dateFormat = DateFormat.getTimeInstance(style, locale);
      return dateFormat.format(date);
   }
   
   public static String time(Date date, Locale locale) {
      return time(date, DateFormat.DEFAULT, locale);
   }
   
   public static String time(Date date, int style) {
      return time(date, style);
   }
   
   public static String time(int style, Locale locale) {
      return time(style, locale);
   }
   
   public static String time(Date date) {
      return time(date, Locale.getDefault());
   }
   
   public static String time(Locale locale) {
      return time(new Date(), locale);
   }
   
   public static String time() {
      return time(new Date(), Locale.getDefault());
   }
   
   public static String shortTime(Date date, Locale locale) {
      return time(date, DateFormat.SHORT, locale);
   }
   
   public static String shorttime(Date date, Locale locale) {
      return shortTime(date, locale);
   }
   
   public static String shortTime(Date date) {
      return shortTime(date, Locale.getDefault());
   }
   
   public static String shorttime(Date date) {
      return shortTime(date, Locale.getDefault());
   }
   
   public static String shortTime(Locale locale) {
      return shortTime(new Date(), locale);
   }
   
   public static String shorttime(Locale locale) {
      return shortTime(locale);
   }
   
   public static String shortTime() {
      return shortTime(new Date(), Locale.getDefault());
   }
   
   public static String shorttime() {
      return shortTime();
   }
   
   public static String mediumTime(Date date, Locale locale) {
      return time(date, DateFormat.MEDIUM, locale);
   }
   
   public static String mediumtime(Date date, Locale locale) {
      return mediumtime(date, locale);
   }
   
   public static String mediumTime(Date date) {
      return mediumTime(date, Locale.getDefault());
   }
   
   public static String mediumtime(Date date) {
      return mediumTime(date);
   }
   
   public static String mediumTime(Locale locale) {
      return mediumTime(new Date(), locale);
   }
   
   public static String mediumtime(Locale locale) {
      return mediumTime(locale);
   }
   
   public static String mediumTime() {
      return mediumTime(new Date(), Locale.getDefault());
   }
   
   public static String mediumtime() {
      return mediumTime();
   }
   
   public static String longTime(Date date, Locale locale) {
      return time(date, DateFormat.LONG, locale);
   }
   
   public static String longtime(Date date, Locale locale) {
      return longTime(date, locale);
   }
   
   public static String longTime(Date date) {
      return longTime(date, Locale.getDefault());
   }
   
   public static String longtime(Date date) {
      return longTime(date);
   }
   
   public static String longTime(Locale locale) {
      return longTime(new Date(), locale);
   }
   
   public static String longtime(Locale locale) {
      return longTime(locale);
   }
   
   public static String longTime() {
      return longTime(new Date(), Locale.getDefault());
   }
   
   public static String longtime() {
      return longTime();
   }
   
   public static String fullTime(Date date, Locale locale) {
      return time(date, DateFormat.FULL, locale);
   }
   
   public static String fulltime(Date date, Locale locale) {
      return time(date, locale);
   }
   
   public static String fullTime(Date date) {
      return fullTime(date, Locale.getDefault());
   }
   
   public static String fulltime(Date date) {
      return fullTime(date);
   }
   
   public static String fullTime(Locale locale) {
      return fullTime(new Date(), locale);
   }
   
   public static String fulltime(Locale locale) {
      return fullTime(locale);
   }
   
   public static String fullTime() {
      return fullTime(new Date(), Locale.getDefault());
   }
   
   public static String fulltime() {
      return fullTime();
   }
   
   public static String datahora(Date data, int estiloData, int estiloHora, Locale localizacao) {
      verificarData(data);
      verificarLocalizacao(localizacao);
      DateFormat formatoData = DateFormat.getDateTimeInstance(estiloData, estiloHora, localizacao);
      return formatoData.format(data);
   }
   
   public static String datahora(Date data, Locale localizacao) {
      return datahora(data, DateFormat.DEFAULT, DateFormat.DEFAULT, localizacao);
   }
   
   public static String datahora(Date data) {
      return datahora(data, Locale.getDefault());
   }
   
   public static String datahora(Date data, int estiloData, int estiloHora) {
      return datahora(data, estiloData, estiloHora, Locale.getDefault());
   }
   
   public static String datahora(Locale localizacao) {
      return datahora(new Date(), localizacao);
   }
   
   public static String datahora(int estiloData, int estiloHora, Locale localizacao) {
      return datahora(new Date(), estiloData, estiloHora, localizacao);
   }
   
   public static String datahora(int estiloData,  int estiloHora) {
      return datahora(new Date(), estiloData, estiloHora, Locale.getDefault());
   }
   
   public static String data(Date data, int estilo, Locale localizacao) {
      verificarData(data);
      verificarLocalizacao(localizacao);
      DateFormat formatoData = DateFormat.getDateInstance(estilo, localizacao);
      return formatoData.format(data);
   }
   
   public static String data(Date data, Locale localizacao) {
      return data(data, DateFormat.DEFAULT, localizacao);
   }
   
   public static String data(Date data) {
      return data(data, Locale.getDefault());
   }
   
   public static String data(Locale localizacao) {
      return data(new Date(), localizacao);
   }
   
   public static String data(Date data, int estiloData) {
      return data(data, estiloData, Locale.getDefault());
   }
   
   public static String data(int estiloData, Locale localizacao) {
      return data(new Date(), estiloData, localizacao);
   }
   
   public static String dataCurta(Date data, Locale locale) {
      return data(data, DateFormat.SHORT, locale);
   }
   
   public static String datacurta(Date data, Locale localizacao) {
      return dataCurta(data, localizacao);
   }
   
   public static String dataCurta(Date data) {
      return dataCurta(data, Locale.getDefault());
   }
   
   public static String datacurta(Date data) {
      return dataCurta(data);
   }
   
   public static String dataCurta(Locale localizacao) {
      return dataCurta(new Date(), localizacao);
   }
   
   public static String datacurta(Locale localizacao) {
      return dataCurta(localizacao);
   }
   
   public static String dataCurta() {
      return dataCurta(new Date(), Locale.getDefault());
   }
   
   public static String datacurta() {
      return dataCurta();
   }
   
   public static String dataMedia(Date data, Locale localizacao) {
      return data(data, DateFormat.MEDIUM, localizacao);
   }
   
   public static String datamedia(Date data, Locale localizacao) {
      return dataMedia(data, localizacao);
   }
   
   public static String dataMedia(Date data) {
      return dataMedia(data, Locale.getDefault());
   }
   
   public static String datamedia(Date data) {
      return dataMedia(data);
   }
   
   public static String dataMedia(Locale localizacao) {
      return dataMedia(new Date(), localizacao);
   }
   
   public static String datamedia(Locale localizacao) {
      return dataMedia(localizacao);
   }
   
   public static String dataMedia() {
      return dataMedia(new Date(), Locale.getDefault());
   }
   
   public static String datamedia() {
      return dataMedia();
   }
   
   public static String dataLonga(Date data, Locale localizacao) {
      return data(data, DateFormat.LONG, localizacao);
   }
   
   public static String datalonga(Date data, Locale localizacao) {
      return dataLonga(data, localizacao);
   }
   
   public static String dataLonga(Date data) {
      return dataLonga(data, Locale.getDefault());
   }
   
   public static String datalonga(Date data) {
      return dataLonga(data);
   }
   
   public static String dataLonga(Locale localizacao) {
      return dataLonga(new Date(), localizacao);
   }
   
   public static String datalonga(Locale localizacao) {
      return dataLonga(localizacao);
   }
   
   public static String dataLonga() {
      return dataLonga(new Date(), Locale.getDefault());
   }
   
   public static String datalonga() {
      return dataLonga(new Date(), Locale.getDefault());
   }
   
   public static String dataCompleta(Date data, Locale localizacao) {
      return data(data, DateFormat.FULL, localizacao);
   }
   
   public static String datacompleta(Date data, Locale localizacao) {
      return dataCompleta(data, localizacao);
   }
   
   public static String dataCompleta(Date data) {
      return dataCompleta(data, Locale.getDefault());
   }
   
   public static String datacompleta(Date data) {
      return dataCompleta(data);
   }
   
   public static String dataCompleta(Locale localizacao) {
      return dataCompleta(new Date(), localizacao);
   }
   
   public static String datacompleta(Locale localizacao) {
      return dataCompleta(localizacao);
   }
   
   public static String dataCompleta() {
      return dataCompleta(new Date(), Locale.getDefault());
   }
   
   public static String datacompleta() {
      return dataCompleta();
   }
   
   public static String hora(Date data, int estilo, Locale localizacao) {
      verificarData(data);
      verificarLocalizacao(localizacao);
      DateFormat formatoData = DateFormat.getTimeInstance(estilo, localizacao);
      return formatoData.format(data);
   }
   
   public static String hora(Date data, Locale localizacao) {
      return hora(data, DateFormat.DEFAULT, localizacao);
   }
   
   public static String hora(Date data, int estilo) {
      return hora(data, estilo);
   }
   
   public static String hora(int estilo, Locale localizacao) {
      return hora(estilo, localizacao);
   }
   
   public static String hora(Date data) {
      return hora(data, Locale.getDefault());
   }
   
   public static String hora(Locale localizacao) {
      return hora(new Date(), localizacao);
   }
   
   public static String hora() {
      return hora(new Date(), Locale.getDefault());
   }
   
   public static String horaCurta(Date data, Locale localizacao) {
      return hora(data, DateFormat.SHORT, localizacao);
   }
   
   public static String horacurta(Date data, Locale localizacao) {
      return horaCurta(data, localizacao);
   }
   
   public static String horaCurta(Date data) {
      return horaCurta(data, Locale.getDefault());
   }
   
   public static String horacurta(Date data) {
      return horaCurta(data, Locale.getDefault());
   }
   
   public static String horaCurta(Locale localizacao) {
      return horaCurta(new Date(), localizacao);
   }
   
   public static String horacurta(Locale localizacao) {
      return horaCurta(localizacao);
   }
   
   public static String horaCurta() {
      return horaCurta(new Date(), Locale.getDefault());
   }
   
   public static String horacurta() {
      return horaCurta();
   }
   
   public static String horaMedia(Date data, Locale localizacao) {
      return hora(data, DateFormat.MEDIUM, localizacao);
   }
   
   public static String horamedia(Date data, Locale localizacao) {
      return horamedia(data, localizacao);
   }
   
   public static String horaMedia(Date data) {
      return horaMedia(data, Locale.getDefault());
   }
   
   public static String horamedia(Date data) {
      return horaMedia(data);
   }
   
   public static String horaMedia(Locale localizacao) {
      return horaMedia(new Date(), localizacao);
   }
   
   public static String horamedia(Locale localizacao) {
      return horaMedia(localizacao);
   }
   
   public static String horaMedia() {
      return horaMedia(new Date(), Locale.getDefault());
   }
   
   public static String horamedia() {
      return horaMedia();
   }
   
   public static String horaLonga(Date data, Locale localizacao) {
      return hora(data, DateFormat.LONG, localizacao);
   }
   
   public static String horalonga(Date data, Locale localizacao) {
      return horaLonga(data, localizacao);
   }
   
   public static String horaLonga(Date data) {
      return horaLonga(data, Locale.getDefault());
   }
   
   public static String horalonga(Date data) {
      return horaLonga(data);
   }
   
   public static String horaLonga(Locale localizacao) {
      return horaLonga(new Date(), localizacao);
   }
   
   public static String horalonga(Locale localizacao) {
      return horaLonga(localizacao);
   }
   
   public static String horaLonga() {
      return horaLonga(new Date(), Locale.getDefault());
   }
   
   public static String horalonga() {
      return horaLonga();
   }
   
   public static String horaCompleta(Date data, Locale localizacao) {
      return hora(data, DateFormat.FULL, localizacao);
   }
   
   public static String horacompleta(Date data, Locale localizacao) {
      return hora(data, localizacao);
   }
   
   public static String horaCompleta(Date data) {
      return horaCompleta(data, Locale.getDefault());
   }
   
   public static String horacompleta(Date data) {
      return horaCompleta(data);
   }
   
   public static String horaCompleta(Locale localizacao) {
      return horaCompleta(new Date(), localizacao);
   }
   
   public static String horacompleta(Locale localizacao) {
      return horaCompleta(localizacao);
   }
   
   public static String horaCompleta() {
      return horaCompleta(new Date(), Locale.getDefault());
   }
   
   public static String horacompleta() {
      return horaCompleta();
   }
   
}
