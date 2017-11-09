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
public final class Dates {
   
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
   
   public static String fulldate() {
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
   
   public static String time(Date date, int style, Locale locale) {
      verifyDate(date);
      verifyLocale(locale);
      DateFormat dateFormat = DateFormat.getTimeInstance(style, locale);
      return dateFormat.format(date);
   }
   
   public static String time(Date date, Locale locale) {
      return time(date, DateFormat.DEFAULT, locale);
   }
   
   public static String time(Date date) {
      return time(date, Locale.getDefault());
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
   
   public static String data(Date data, int estilo, Locale localizacao) {
      verificarData(data);
      verificarLocalizacao(localizacao);
      DateFormat formatadoData = DateFormat.getDateInstance(estilo, localizacao);
      return formatadoData.format(data);
   }
   
   public static String data(Date data, Locale localizacao) {
      return data(data, DateFormat.DEFAULT, localizacao);
   }
   
   public static String data(Date data) {
      return data(data, Locale.getDefault());
   }
   
   public static String dataCurta(Date data, Locale localizacao) {
      return data(data, DateFormat.SHORT, localizacao);
   }
   
   public static String datacurta(Date data, Locale localalizacao) {
      return dataCurta(data, localalizacao);
   }
   
   public static String dataCurta(Date data) {
      return dataCurta(data, Locale.getDefault());
   }
   
   public static String datacurta(Date data) {
      return dataCurta(data);
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
   
   public static String dataLonga(Date data, Locale localizacao) {
      return data(data, DateFormat.LONG, localizacao);
   }
   
   public static String datalonga(Date data, Locale locale) {
      return dataLonga(data, locale);
   }
   
   public static String dataLonga(Date data) {
      return dataLonga(data, Locale.getDefault());
   }
   
   public static String datalonga(Date data) {
      return dataLonga(data);
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
   
   public static String hora(Date data, int estilo, Locale localizacao) {
      verificarData(data);
      verificarLocalizacao(localizacao);
      DateFormat formatoData = DateFormat.getTimeInstance(estilo, localizacao);
      return formatoData.format(data);
   }
   
   public static String hora(Date data, Locale localizacao) {
      return hora(data, DateFormat.DEFAULT, localizacao);
   }
   
   public static String hora(Date data) {
      return hora(data, Locale.getDefault());
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
      return horacurta(data, Locale.getDefault());
   }
   
   public static String horaMedia(Date data, Locale localizacao) {
      return hora(data, DateFormat.MEDIUM, localizacao);
   }
   
   public static String horamedia(Date data, Locale localizacao) {
      return horaMedia(data, localizacao);
   }
   
   public static String horaMedia(Date data) {
      return horaMedia(data, Locale.getDefault());
   }
   
   public static String horamedia(Date data) {
      return horaMedia(data);
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
   
   public static String horaCompleta(Date data, Locale localizacao) {
      return hora(data, DateFormat.FULL, localizacao);
   }
   
   public static String horacompleta(Date data, Locale localizacao) {
      return horaCompleta(data, localizacao);
   }
   
   public static String horaCompleta(Date data) {
      return hora(data, Locale.getDefault());
   }
   
   public static String horacompleta(Date data) {
      return horaCompleta(data);
   }
   
}
