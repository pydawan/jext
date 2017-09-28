package br.org.jext;

import static br.org.verify.Verify.isEmptyOrNull;
import static br.org.verify.Verify.isNotEmpty;
import static br.org.verify.Verify.isNotNullOrEmpty;

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
   
   public static String fullDate(Date date) {
      return getFullDate(date);
   }
   
   public static String fulldate(Date date) {
      return fullDate(date);
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
      return date(value, "dd/MM/yyyy HH:mm:ss");
   }
   
   public static Date time(String value) {
      return date(value, "HH:mm:ss");
   }
   
   public static Date datetimeSql(String value) {
      return date(value, "yyyy-MM-dd HH:mm:ss");
   }
   
   public static Date dateSql(String value) {
      return date(value, "yyyy-MM-dd");
   }
   
   public static Date timeSql(String value) {
      return time(value);
   }
   
}
