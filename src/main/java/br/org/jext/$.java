package br.org.jext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import br.org.verify.Verify;

/**
 * Contém diversos atalhos para métodos utilitários.
 * 
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public abstract class $ {
   
   public static boolean isBlank(String string) {
      return StringUtil.isBlank(string);
   }
   
   public static boolean blank(String string) {
      return StringUtil.blank(string);
   }
   
   public static boolean isNotBlank(String string) {
      return StringUtil.isNotBlank(string);
   }
   
   public static boolean notBlank(String string) {
      return StringUtil.notBlank(string);
   }
   
   public static String capitalize(String string) {
      return StringUtil.capitalize(string);
   }
   
   public static String[] capitalize(String... strings) {
      return StringUtil.capitalize(strings);
   }
   
   public static void _capitalize(String... strings) {
      StringUtil._capitalize(strings);
   }
   
   public static String reverse(String string) {
      return StringUtil.reverse(string);
   }
   
   public static String upper(String string) {
      return StringUtil.upper(string);
   }
   
   public static String lower(String string) {
      return StringUtil.lower(string);
   }
   
   public static boolean isUpper(String string) {
      return StringUtil.isUpper(string);
   }
   
   public static boolean uppered(String string) {
      return StringUtil.uppered(string);
   }
   
   public static boolean isLower(String string) {
      return StringUtil.isLower(string);
   }
   
   public static boolean lowered(String string) {
      return StringUtil.lowered(string);
   }
   
   public static boolean isDigit(String string) {
      return StringUtil.isDigit(string);
   }
   
   public static boolean digit(String string) {
      return StringUtil.digit(string);
   }
   
   public static boolean isAlpha(String string) {
      return StringUtil.isAlpha(string);
   }
   
   public static boolean alpha(String string) {
      return StringUtil.alpha(string);
   }
   
   public static boolean isSpace(String string) {
      return StringUtil.isSpace(string);
   }
   
   public static boolean space(String string) {
      return StringUtil.space(string);
   }
   
   public static boolean isNotLower(String string) {
      return StringUtil.isNotLower(string);
   }
   
   public static boolean notLowered(String string) {
      return StringUtil.notLowered(string);
   }
   
   public static boolean isNotUpper(String string) {
      return StringUtil.isNotUpper(string);
   }
   
   public static boolean notUppered(String string) {
      return StringUtil.notUppered(string);
   }
   
   public static boolean isNotDigit(String string) {
      return StringUtil.isNotDigit(string);
   }
   
   public static boolean notDigit(String string) {
      return StringUtil.notDigit(string);
   }
   
   public static boolean isNotAlpha(String string) {
      return StringUtil.isNotAlpha(string);
   }
   
   public static boolean notAlpha(String string) {
      return StringUtil.notAlpha(string);
   }
   
   public static boolean isNotSpace(String string) {
      return StringUtil.isNotSpace(string);
   }
   
   public static boolean notSpace(String string) {
      return StringUtil.notSpace(string);
   }
   
   public static String swapcase(String string) {
      return StringUtil.swapcase(string);
   }
   
   public static String isPalindrome(String s1, String s2) {
      return StringUtil.isPalindrome(s1, s2);
   }
   
   public static String palindrome(String s1, String s2) {
      return StringUtil.palindrome(s1, s2);
   }
   
   public static String times(String string, int times) {
      return StringUtil.times(string, times);
   }
   
   public static String repeat(String string, int times) {
      return StringUtil.repeat(string, times);
   }
   
   public static String multiply(String string, int times) {
      return StringUtil.multiply(string, times);
   }
   
   public static String leftJustify(String string, int width, String fillchar) {
      return StringUtil.leftJustify(string, width, fillchar);
   }
   
   public static String rightJustify(String string, int width, String fillchar) {
      return StringUtil.rightJustify(string, width, fillchar);
   }
   
   public static String center(String string, int width, String fillchar) {
      return StringUtil.center(string, width, fillchar);
   }
   
   public static String center(String string, int width) {
      return StringUtil.center(string, width);
   }
   
   public static String leftStrip(String string) {
      return StringUtil.leftStrip(string);
   }
   
   public static String rightStrip(String string) {
      return StringUtil.rightStrip(string);
   }
   
   public static String strip(String string) {
      return StringUtil.strip(string);
   }
   
   public static String zeroFill(String string, int width) {
      return StringUtil.zeroFill(string, width);
   }
   
   public static String[] splitLines(String string) {
      return StringUtil.splitLines(string);
   }
   
   public static String asciiLowerCase() {
      return StringUtil.asciiLowerCase();
   }
   
   public static String asciiUpperCase() {
      return StringUtil.asciiUpperCase();
   }
   
   public static String asciiLetters() {
      return StringUtil.asciiLetters();
   }
   
   public static String digits() {
      return StringUtil.digits();
   }
   
   public static String hexadecimalDigits() {
      return StringUtil.hexadecimalDigits();
   }
   
   public static String octalDigits() {
      return StringUtil.octalDigits();
   }
   
   public static String punctuation() {
      return StringUtil.punctuation();
   }
   
   public static String printable() {
      return StringUtil.printable();
   }
   
   public static String whiteSpace() {
      return StringUtil.whiteSpace();
   }
   
   public static boolean isPunctuation(Character c) {
      return StringUtil.isPunctuation(c);
   }
   
   public static boolean punctuation(Character c) {
      return StringUtil.punctuation(c);
   }
   
   public static boolean isNotPunctuation(Character c) {
      return StringUtil.isNotPunctuation(c);
   }
   
   public static boolean notPunctuation(Character c) {
      return StringUtil.notPunctuation(c);
   }
   
   public static boolean isPrintable(Character c) {
      return StringUtil.isPrintable(c);
   }
   
   public static boolean printable(Character c) {
      return StringUtil.printable(c);
   }
   
   public static boolean isNotPrintable(Character c) {
      return StringUtil.isNotPrintable(c);
   }
   
   public static boolean notPrintable(Character c) {
      return StringUtil.notPrintable(c);
   }
   
   public static boolean isWhiteSpace(Character c) {
      return StringUtil.isWhiteSpace(c);
   }
   
   public static boolean whiteSpace(Character c) {
      return StringUtil.whiteSpace(c);
   }
   
   public static boolean isNotWhiteSpace(Character c) {
      return StringUtil.isNotWhiteSpace(c);
   }
   
   public static boolean notWhiteSpace(Character c) {
      return StringUtil.notWhiteSpace(c);
   }
   
   public static String randomize(String string) {
      return StringUtil.randomize(string);
   }
   
   public static String shuffle(String string) {
      return StringUtil.shuffle(string);
   }
   
   public static boolean containsSpace(String string) {
      return StringUtil.containsSpace(string);
   }
   
   public static boolean notContainsSpace(String string) {
      return StringUtil.notContainsSpace(string);
   }
   
   public static String format(String format, Object... o) {
      return StringUtil.format(format, o);
   }
   
   public static String arrayToString(Object array) {
      return StringUtil.arrayToString(array);
   }
   
   public static String listToString(java.util.List<Object> list) {
      return StringUtil.listToString(list);
   }
   
   public static String mapToString(java.util.Map<Object, Object> map) {
      return StringUtil.mapToString(map);
   }
   
   public static void println(Object o) {
      PrintUtil.println(o);
   }
   
   public static void print(Object o) {
      PrintUtil.print(o);
   }
   
   public static void printf(String format, Object... o) {
      PrintUtil.printf(format, o);
   }
   
   public static java.util.List<Integer> range(Integer start, Integer end, Integer increment) {
      return RangeUtil.range(start, end, increment);
   }
   
   public static java.util.List<Integer> range(Integer start, Integer end) {
      return RangeUtil.range(start, end);
   }
   
   public static void sleep(int value, TimeUnit unit) {
      TimeUtil.sleep(value, unit);
   }
   
   public static void sleep(int value) {
      TimeUtil.sleep(value);
   }
   
   public static long currentTime() {
      return TimeUtil.currentTime();
   }
   
   public static long currtime() {
      return TimeUtil.currtime();
   }
   
   public static long time() {
      return TimeUtil.time();
   }
   
   public static long difference(long start, long end) {
      return TimeUtil.difference(start, end);
   }
   
   public static long diff(long start, long end) {
      return TimeUtil.diff(start, end);
   }
   
   public static long difftime(long start, long end) {
      return TimeUtil.difftime(start, end);
   }
   
   public static String getDiaMesAno(Date data) {
      return DateUtil.getDiaMesAno(data);
   }
   
   public static String diaMesAno(Date data) {
      return DateUtil.diaMesAno(data);
   }
   
   public static String getYearMonthDay(Date date) {
      return DateUtil.getYearMonthDay(date);
   }
   
   public static String yearMonthDay(Date date) {
      return DateUtil.yearMonthDay(date);
   }
   
   public static String getHorasMinutosSegundos(Date data) {
      return DateUtil.getHorasMinutosSegundos(data);
   }
   
   public static String horasMinutosSegundos(Date data) {
      return DateUtil.horasMinutosSegundos(data);
   }
   
   public static String getHoursMinutesSeconds(Date date) {
      return DateUtil.getHoursMinutesSeconds(date);
   }
   
   public static String hoursMinutesSeconds(Date date) {
      return DateUtil.hoursMinutesSeconds(date);
   }
   
   public static String getSqlTimestamp(Date data) {
      return DateUtil.getSqlTimestamp(data);
   }
   
   public static String sqlTimestamp(Date date) {
      return DateUtil.sqlTimestamp(date);
   }
   
   public static String getDataPorExtenso(Date data) {
      return DateUtil.getDataPorExtenso(data);
   }
   
   public static String dataPorExtenso(Date data) {
      return DateUtil.dataPorExtenso(data);
   }
   
   public static String getFullDate(Date date) {
      return DateUtil.getFullDate(date);
   }
   
   public static String fullDate(Date date) {
      return DateUtil.fullDate(date);
   }
   
   public static String fulldate(Date date) {
      return DateUtil.fulldate(date);
   }
   
   public static String getDataAtualPorExtenso() {
      return DateUtil.getDataAtualPorExtenso();
   }
   
   public static String dataAtualPorExtenso() {
      return DateUtil.dataAtualPorExtenso();
   }
   
   public static String getFullCurrentDate() {
      return DateUtil.getFullCurrentDate();
   }
   
   public static String fullCurrentDate() {
      return DateUtil.fullCurrentDate();
   }
   
   public static String fulldate() {
      return DateUtil.fulldate();
   }
   
   public static String getDataFormatada(Date data, String formato) {
      return DateUtil.getDataFormatada(data, formato);
   }
   
   public static String dataFormatada(Date data, String formato) {
      return DateUtil.dataFormatada(data, formato);
   }
   
   public static String getFormattedDate(Date date, String format) {
      return DateUtil.getFormattedDate(date, format);
   }
   
   public static String formattedDate(Date date, String format) {
      return DateUtil.formattedDate(date, format);
   }
   
   public static String getDataAtualFormatada(String formato) {
      return DateUtil.getDataAtualFormatada(formato);
   }
   
   public static String dataAtualFormatada(String formato) {
      return DateUtil.dataAtualFormatada(formato);
   }
   
   public static String getCurrentDate(String format) {
      return DateUtil.getCurrentDate(format);
   }
   
   public static String currentDate(String format) {
      return DateUtil.currentDate(format);
   }
   
   public static String currdate(String format) {
      return DateUtil.currdate(format);
   }
   
   public static String currdate() {
      return DateUtil.currdate();
   }
   
   public static void verificarData(Date data) {
      DateUtil.verificarData(data);
   }
   
   public static void verifyDate(Date date) {
      DateUtil.verifyDate(date);
   }
   
   public static void verificarFormato(String formato) {
      DateUtil.verificarFormato(formato);
   }
   
   public static void verifyFormat(String format) {
      DateUtil.verifyFormat(format);
   }
   
   public static String getSqlDate(String data) {
      return DateUtil.getSqlDate(data);
   }
   
   public static String sqlDate(String data) {
      return DateUtil.sqlDate(data);
   }
   
   public static String sqlDate(Date data) {
      return sqlDate(diaMesAno(data));
   }
   
   public static String sqlTime(Date data) {
      return horasMinutosSegundos(data);
   }
   
   public static String formatarData(Date data, String formato) {
      return DateUtil.formatarData(data, formato);
   }
   
   public static String formatDate(Date date, String format) {
      return DateUtil.formatDate(date, format);
   }
   
   public static String getAno(Date data) {
      return DateUtil.getAno(data);
   }
   
   public static String getYear(Date date) {
      return DateUtil.getYear(date);
   }
   
   public static String getAnoAtual() {
      return DateUtil.getAnoAtual();
   }
   
   public static String getAno() {
      return DateUtil.getAno();
   }
   
   public static String getCurrentYear() {
      return DateUtil.getCurrentYear();
   }
   
   public static String getYear() {
      return DateUtil.getYear();
   }
   
   public static String ano(Date data) {
      return DateUtil.ano(data);
   }
   
   public static String ano() {
      return DateUtil.ano();
   }
   
   public static String year(Date date) {
      return DateUtil.year(date);
   }
   
   public static String anoAtual() {
      return DateUtil.anoAtual();
   }
   
   public static String currentYear() {
      return DateUtil.currentYear();
   }
   
   public static String year() {
      return DateUtil.year();
   }
   
   public static Date date(int year, int month, int day) {
      return DateUtil.date(year, month, day);
   }
   
   public static Date data(int dia, int mes, int ano) {
      return DateUtil.data(dia, mes, ano);
   }
   
   public static Date date() {
      return DateUtil.date();
   }
   
   public static Date data() {
      return DateUtil.data();
   }
   
   public static Date datetime(int year, int month, int day, int hours, int minutes, int seconds) {
      return DateUtil.datetime(year, month, day, hours, minutes, seconds);
   }
   
   public static Date datahora(int dia, int mes, int ano, int horas, int minutos, int segundos) {
      return DateUtil.datahora(dia, mes, ano, horas, minutos, segundos);
   }
   
   public static Date datetime() {
      return DateUtil.datetime();
   }
   
   public static Date datahora() {
      return DateUtil.datahora();
   }
   
   public static String getMonth(Date date) {
      return DateUtil.getMonth(date);
   }
   
   public static String month(Date date) {
      return DateUtil.month(date);
   }
   
   public static String getMes(Date data) {
      return DateUtil.getMes(data);
   }
   
   public static String mes(Date data) {
      return DateUtil.mes(data);
   }
   
   public static String getMonth() {
      return DateUtil.getMonth();
   }
   
   public static String month() {
      return DateUtil.month();
   }
   
   public static String getMes() {
      return DateUtil.getMes();
   }
   
   public static String mes() {
      return DateUtil.mes();
   }
   
   public static String getDay(Date date) {
      return DateUtil.getDay(date);
   }
   
   public static String day(Date date) {
      return DateUtil.day(date);
   }
   
   public static String getDia(Date data) {
      return DateUtil.getDia(data);
   }
   
   public static String dia(Date data) {
      return DateUtil.dia(data);
   }
   
   public static String getDay() {
      return DateUtil.getDay();
   }
   
   public static String day() {
      return DateUtil.day();
   }
   
   public static String getDia() {
      return DateUtil.getDia();
   }
   
   public static String dia() {
      return DateUtil.dia();
   }
   
   public static String format(Date date, String format) {
      return DateUtil.format(date, format);
   }
   
   public static String formatar(Date data, String formato) {
      return DateUtil.formatar(data, formato);
   }
   
   public static Date now() {
      return DateUtil.now();
   }
   
   public static String now(String format) {
      return DateUtil.now(format);
   }
   
   public static String currentTimestamp() {
      return DateUtil.currentTimestamp();
   }
   
   public static String currtimestamp() {
      return DateUtil.currtimestamp();
   }
   
   public static Date agora() {
      return DateUtil.agora();
   }
   
   public static String agora(String formato) {
      return DateUtil.agora(formato);
   }
   
   public static java.util.List<Object> list() {
      return new ArrayList<>();
   }
   
   public static java.util.List<Object> list(Object... objects) {
      java.util.List<Object> list = new ArrayList<>();
      list.addAll(Arrays.asList(objects));
      return list;
   }
   
   public static boolean isNull(Object object) {
      return Verify.isNull(object);
   }
   
   public static boolean isNotNull(Object object) {
      return Verify.isNotNull(object);
   }
   
   public static boolean Null(Object object) {
      return Verify.Null(object);
   }
   
   public static boolean notNull(Object object) {
      return Verify.notNull(object);
   }
   
   public static boolean containsNull(Object... objects) {
      return Verify.containsNull(objects);
   }
   
   public static boolean notContainsNull(Object... objects) {
      return Verify.notContainsNull(objects);
   }
   
   public static <E> boolean containsNull(Collection<E> collection) {
      return Verify.containsNull(collection);
   }
   
   public static <E> boolean notContainsNull(Collection<E> collection) {
      return Verify.notContainsNull(collection);
   }
   
   public static boolean containsNullOrEmpty(Object... objects) {
      return Verify.containsNullOrEmpty(objects);
   }
   
   public static boolean containsEmptyOrNull(Object... objects) {
      return Verify.containsEmptyOrNull(objects);
   }
   
   public static boolean notContainsNullOrEmpty(Object... objects) {
      return Verify.notContainsNull(objects);
   }
   
   public static boolean notContainsEmptyOrNull(Object... objects) {
      return Verify.notContainsEmptyOrNull(objects);
   }
   
   public static <E> boolean containsNullOrEmpty(Collection<E> collection) {
      return Verify.containsNullOrEmpty(collection);
   }
   
   public static <E> boolean containsEmptyOrNull(Collection<E> collection) {
      return Verify.containsEmptyOrNull(collection);
   }
   
   public static <E> boolean notContainsNullOrEmpty(Collection<E> collection) {
      return Verify.notContainsNullOrEmpty(collection);
   }
   
   public static <E> boolean notContainsEmptyOrNull(Collection<E> collection) {
      return Verify.notContainsEmptyOrNull(collection);
   }
   
   public static boolean isEmpty(Object object) {
      return Verify.isEmpty(object);
   }
   
   public static boolean empty(Object object) {
      return Verify.empty(object);
   }
   
   public static boolean isNotEmpty(Object object) {
      return Verify.isNotEmpty(object);
   }
   
   public static boolean notEmpty(Object object) {
      return Verify.notEmpty(object);
   }
   
   public static boolean isEmpty(String string) {
      return Verify.isEmpty(string);
   }
   
   public static boolean isNotEmpty(String string) {
      return Verify.isNotEmpty(string);
   }
   
   public static boolean empty(String string) {
      return Verify.empty(string);
   }
   
   public static boolean notEmpty(String string) {
      return Verify.notEmpty(string);
   }
   
   public static boolean containsEmpty(String... strings) {
      return Verify.containsEmpty(strings);
   }
   
   public static boolean notContainsEmpty(String... strings) {
      return Verify.notContainsEmpty(strings);
   }
   
   public static boolean containsEmptyOrNull(String... strings) {
      return Verify.containsEmptyOrNull(strings);
   }
   
   public static boolean notContainsEmptyOrNull(String... strings) {
      return Verify.notContainsEmptyOrNull(strings);
   }
   
   public static <E> boolean isEmpty(Collection<E> collection) {
      return Verify.isEmpty(collection);
   }
   
   public static <E> boolean isNotEmpty(Collection<E> collection) {
      return Verify.isNotEmpty(collection);
   }
   
   public static <E> boolean empty(Collection<E> collection) {
      return Verify.empty(collection);
   }
   
   public static <E> boolean notEmpty(Collection<E> collection) {
      return Verify.notEmpty(collection);
   }
   
   public static <K, V> boolean isNull(Map<K, V> map) {
      return Verify.isNull(map);
   }
   
   public static <K, V> boolean isNotNull(Map<K, V> map) {
      return Verify.isNotNull(map);
   }
   
   public static <K, V> boolean Null(Map<K, V> map) {
      return Verify.Null(map);
   }
   
   public static <K, V> boolean notNull(Map<K, V> map) {
      return Verify.notNull(map);
   }
   
   public static <K, V> boolean isNullOrEmpty(Map<K, V> map) {
      return Verify.isNullOrEmpty(map);
   }
   
   public static <K, V> boolean isNotNullOrEmpty(Map<K, V> map) {
      return Verify.isNotNullOrEmpty(map);
   }
   
   public static <K, V> boolean nullOrEmpty(Map<K, V> map) {
      return Verify.nullOrEmpty(map);
   }
   
   public static <K, V> boolean notNullOrEmpty(Map<K, V> map) {
      return Verify.notNullOrEmpty(map);
   }
   
   public static boolean isNullOrEmpty(Object object) {
      return Verify.isNullOrEmpty(object);
   }
   
   public static boolean isNotNullOrEmpty(Object object) {
      return Verify.isNotNullOrEmpty(object);
   }
   
   public static boolean nullOrEmpty(Object object) {
      return Verify.nullOrEmpty(object);
   }
   
   public static boolean notNullOrEmpty(Object object) {
      return Verify.notNullOrEmpty(object);
   }
   
   public static <K, V> boolean isEmpty(Map<K, V> map) {
      return Verify.isEmpty(map);
   }
   
   public static <K, V> boolean isNotEmpty(Map<K, V> map) {
      return Verify.isNotEmpty(map);
   }
   
   public static <K, V> boolean empty(Map<K, V> map) {
      return Verify.empty(map);
   }
   
   public static <K, V> boolean notEmpty(Map<K, V> map) {
      return Verify.notEmpty(map);
   }
   
   public static boolean isEmptyOrNull(Object object) {
      return Verify.isEmptyOrNull(object);
   }
   
   public static boolean isNotEmptyOrNull(Object object) {
      return Verify.isNotEmptyOrNull(object);
   }
   
   public static boolean emptyOrNull(Object object) {
      return Verify.emptyOrNull(object);
   }
   
   public static boolean notEmptyOrNull(Object object) {
      return Verify.notEmptyOrNull(object);
   }
   
   public static boolean exists(Object object) {
      return Verify.exists(object);
   }
   
   public static boolean notExists(Object object) {
      return Verify.notExists(object);
   }
   
   public static boolean isEmptyOrNull(Object... objects) {
      return Verify.isEmptyOrNull(objects);
   }
   
   public static boolean isNotEmptyOrNull(Object... objects) {
      return Verify.isNotEmptyOrNull(objects);
   }
   
   public static boolean emptyOrNull(Object... objects) {
      return Verify.emptyOrNull(objects);
   }
   
   public static boolean notEmptyOrNull(Object... objects) {
      return Verify.notEmptyOrNull(objects);
   }
   
   public static boolean empty(Object... objects) {
      return Verify.empty(objects);
   }
   
   public static boolean isArray(Object object) {
      return Verify.isArray(object);
   }
   
   public static boolean array(Object object) {
      return Verify.array(object);
   }
   
   public static boolean isNotArray(Object object) {
      return Verify.isNotArray(object);
   }
   
   public static boolean notArray(Object object) {
      return Verify.notArray(object);
   }
   
   public static boolean isList(Object object) {
      return Verify.isList(object);
   }
   
   public static boolean isNotLis(Object object) {
      return Verify.isNotList(object);
   }
   
   public static boolean list(Object object) {
      return Verify.list(object);
   }
   
   public static boolean notList(Object object) {
      return Verify.notList(object);
   }
   
   public static boolean isMap(Object object) {
      return Verify.isMap(object);
   }
   
   public static boolean isNotMap(Object object) {
      return Verify.isNotMap(object);
   }
   
   public static boolean map(Object object) {
      return Verify.map(object);
   }
   
   public static boolean notMap(Object object) {
      return Verify.notMap(object);
   }
   
   public static MapItem mapItem(Object key, Object value) {
      return new MapItem(key, value);
   }
   
   public static MapItem of(Object key, Object value) {
      return mapItem(key, value);
   }
   
   public static MapItem itemOf(Object key, Object value) {
      return mapItem(key, value);
   }
   
   public static MapItem item(Object key, Object value) {
      return mapItem(key, value);
   }
   
   public static MapItem entry(Object key, Object value) {
      return mapItem(key, value);
   }
   
   public static java.util.Map<Object, Object> map(MapItem... items) {
      java.util.Map<Object, Object> map = new java.util.HashMap<>();
      if (Verify.notContainsEmptyOrNull((Object[]) items)) {
         for (MapItem item : items) {
            map.put(item.getKey(), item.getValue());
         }
      }
      return map;
   }
   
   public static java.util.Map<Object, Object> of(MapItem... items) {
      java.util.Map<Object, Object> map = map(items);
      return map;
   }
   
   public static Tuple tuple(Object... objects) {
      return new Tuple(objects);
   }
   
   public static Tuple tuple(Object key, Object value) {
      return Tuple.pair(key, value);
   }
   
   public static Tuple t(Object... objects) {
      return tuple(objects);
   }
   
   public static Tuple t(Object key, Object value) {
      return tuple(key, value);
   }
   
   public static <K, V> Dict<K, V> dict() {
      return new Dict<>();
   }
   
   public static <K, V> Dict<K, V> d() {
      return new Dict<>();
   }
   
   public static Object keyValue(Object key, Object value) {
      if (Verify.isNotEmptyOrNull("key")) {
         Object[] keyValue = new Object[2];
         keyValue[0] = key;
         keyValue[1] = value;
         return keyValue;
      } else {
         throw new IllegalArgumentException("A chave (key) do item de dicionáiro deve ser informada!");
      }
   }
   
   public static Object kv(Object k, Object v) {
      return keyValue(k, v);
   }
   
   public static Object[] array(Object... objects) {
      return ArrayUtil.array(objects);
   }
   
   public static Object[] array(Object o, int length) {
      return ArrayUtil.array(o, length);
   }
   
   public static String[] array(String value, int length) {
      return StringUtil.array(value, length);
   }
   
}
