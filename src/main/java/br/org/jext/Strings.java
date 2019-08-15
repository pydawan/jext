package br.org.jext;

import static br.org.verify.Verify.isArray;
import static br.org.verify.Verify.isList;
import static br.org.verify.Verify.isMap;
import static br.org.verify.Verify.isNotEmptyOrNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import br.org.verify.Verify;

/**
 * <p>
 * Classe de métodos utilitários para manipulação strings.
 * </p>
 * 
 * @author thiago-amm
 * @version v1.0.0 01/09/2017
 * @version v1.0.1 01/02/2018
 * @version v1.0.2 07/04/2018
 * @version v1.0.3 04/06/2019
 * @version v1.0.4 14/08/2019
 * @since v1.0.0
 */
public class Strings {
   
   private static final List<String> EMPTY_STRINGS_LIST = Collections.unmodifiableList(new ArrayList<>(0));
   
   public static final String EMPTY_STRING = "";
   
   public static boolean isBlank(String string) {
      return isNotEmptyOrNull(string) && string.matches("\\s+");
   }
   
   public static boolean blank(String string) {
      return isBlank(string);
   }
   
   public static boolean isNotBlank(String string) {
      return !isBlank(string);
   }
   
   public static boolean notBlank(String string) {
      return isNotBlank(string);
   }
   
   public static String capitalize(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
      }
      return "";
   }
   
   public static String[] capitalize(String... strings) {
      String capitalized[] = null;
      if (isNotEmptyOrNull((Object[]) strings)) {
         capitalized = new String[strings.length];
         for (int i = 0; i < strings.length; i++) {
            capitalized[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase();
         }
      }
      return capitalized;
   }
   
   public static void _capitalize(String... strings) {
      if (isNotEmptyOrNull((Object[]) strings)) {
         for (String string : strings) {
            string = string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
         }
      }
   }
   
   public static boolean isCapitalized(String text) {
      boolean capitalized = false;
      text = text == null ? "" : text;
      if (text.isEmpty()) {
         capitalized = false;
      } else {
         capitalized = text.equals(capitalize(text));
      }
      return capitalized;
   }
   
   public static boolean isNotCapitalized(String text) {
      return !isCapitalized(text);
   }
   
   public static boolean capitalized(String text) {
      return isCapitalized(text);
   }
   
   public static boolean notCapitalized(String text) {
      return capitalized(text);
   }
   
   public static String unCapitalize(String word) {
      String result = "";
      if (Strings.isCapitalized(word)) {
         result = word.substring(0, 1).toLowerCase() + word.substring(1);
      }
      return result;
   }
   
   public static String[] unCapitalize(String... strings) {
      String result[] = null;
      if (isNotEmptyOrNull((Object[]) strings)) {
         result = new String[strings.length];
         for (int i = 0; i < strings.length; i++) {
            result[i] = strings[i].substring(0, 1).toLowerCase() + strings[i].substring(1);
         }
      }
      return result;
   }
   
   public static String reverse(String string) {
      if (isNotEmptyOrNull(string)) {
         return new StringBuilder(string).reverse().toString();
      }
      return "";
   }
   
   public static String upper(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.toUpperCase();
      }
      return "";
   }
   
   public static String lower(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.toLowerCase();
      }
      return "";
   }
   
   public static boolean isUpperCase(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.matches("^\\p{Lu}+$");
      }
      return false;
   }
   
   public static boolean isUpper(String string) {
      return isUpperCase(string);
   }
   
   public static boolean uppered(String string) {
      return isUpperCase(string);
   }
   
   public static boolean isLowerCase(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.matches("^\\p{Ll}+$");
      }
      return false;
   }
   
   public static boolean isLower(String string) {
      return isLowerCase(string);
   }
   
   public static boolean lowered(String string) {
      return isLowerCase(string);
   }
   
   public static boolean isDigit(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.matches("^\\d+$");
      }
      return false;
   }
   
   public static boolean digit(String string) {
      return isDigit(string);
   }
   
   public static boolean isAlpha(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.matches("^\\p{L}+$");
      }
      return false;
   }
   
   public static boolean alpha(String string) {
      return isAlpha(string);
   }
   
   public static boolean isSpace(String string) {
      if (isNotNull(string)) {
         return string.matches("^\\s+$");
      }
      return false;
   }
   
   public static boolean space(String string) {
      return isSpace(string);
   }
   
   public static boolean isNotLower(String string) {
      return !isLower(string);
   }
   
   public static boolean notLowered(String string) {
      return isNotLower(string);
   }
   
   public static boolean isNotUpper(String string) {
      return !isUpper(string);
   }
   
   public static boolean notUppered(String string) {
      return isNotUpper(string);
   }
   
   public static boolean isNotDigit(String string) {
      return !isDigit(string);
   }
   
   public static boolean notDigit(String string) {
      return isNotDigit(string);
   }
   
   public static boolean isNotAlpha(String string) {
      return !isAlpha(string);
   }
   
   public static boolean notAlpha(String string) {
      return isNotAlpha(string);
   }
   
   public static boolean isNotSpace(String string) {
      return !isSpace(string);
   }
   
   public static boolean notSpace(String string) {
      return isNotSpace(string);
   }
   
   public static String swapCase(String string) {
      if (isNotEmptyOrNull(string)) {
         char[] chars = string.toCharArray();
         String swap = "";
         for (Character c : chars) {
            if (Character.isLowerCase(c)) {
               swap += Character.toUpperCase(c);
            } else {
               swap += Character.toLowerCase(c);
            }
         }
         return swap;
      }
      return "";
   }
   
   public static String swapcase(String string) {
      return swapCase(string);
   }
   
   public static String isPalindrome(String s1, String s2) {
      if (isNotEmptyOrNull(s1) && isNotEmptyOrNull(s2)) {
         s1.equals(reverse(s2));
      }
      return "";
   }
   
   public static String palindrome(String s1, String s2) {
      return isPalindrome(s1, s2);
   }
   
   public static String times(String string, int times) {
      if (isNotEmptyOrNull(string) && times >= 1) {
         String _string = "";
         for (int i = 0; i < times; i++) {
            _string += string;
         }
         return _string;
      }
      return "";
   }
   
   public static String repeat(Object object, int amount) {
       String s = "";
       s = repeat(object, amount, false);
       return s;
   }

   public static String repeat(Object object, int amount, boolean vertical) {
       String s = "";
       s = repeat("", object, amount, vertical);
       return s;
   }

   public static String repeat(String format, Object object, int amount, boolean vertical) {
       String s = "";
       if (object != null && !object.toString().isEmpty() && amount > 0) {
           for (int i = 0; i < amount; i++) {
               if (vertical) {
                   if (format == null || format.isEmpty()) {
                       s += object + "\n";
                   } else {
                       s += String.format(format, object) + "\n";
                   }
               } else {
                   if (format == null || format.isEmpty()) {
                       s += object;
                   } else {
                       s += String.format(format, object);
                   }
               }
           }
           if (vertical) {
               s = s.substring(0, s.lastIndexOf("\n"));
           }
       }
       return s;
   }
   
   public static String multiply(String string, int times) {
      return times(string, times);
   }
   
   public static String leftJustify(String string, int width, String fillchar) {
      if (isNotEmptyOrNull(string) && width > string.length() && isNotEmptyOrNull(fillchar)) {
         return string + times(fillchar, width - string.length());
      }
      return "";
   }
   
   public static String leftJustify(String string, int width) {
      return leftJustify(string, width, " ");
   }
   
   public static String ljust(String string, int width, String fillchar) {
      return leftJustify(string, width, fillchar);
   }
   
   public static String ljust(String string, int width) {
      return leftJustify(string, width);
   }
   
   public static String padLeft(String string, int width, String fillchar) {
      return leftJustify(string, width, fillchar);
   }
   
   public static String padLeft(String string, int width) {
      return leftJustify(string, width, " ");
   }
   
   public static String rightJustify(String string, int width, String fillchar) {
      if (isNotEmptyOrNull(string) && width > string.length() && isNotEmptyOrNull(fillchar)) {
         return times(fillchar, width - string.length()) + string;
      }
      return "";
   }
   
   public static String rightJustify(String string, int width) {
      return rightJustify(string, width, " ");
   }
   
   public static String rjustify(String string, int width, String fillchar) {
      return rightJustify(string, width, fillchar);
   }
   
   public static String rjustify(String string, int width) {
      return rightJustify(string, width);
   }
   
   public static String padRight(String string, int width, String fillchar) {
      return rightJustify(string, width, fillchar);
   }
   
   public static String padRight(String string, int width) {
      return rightJustify(string, width);
   }
   
   public static String center(String string, int width, String fillchar) {
      if (isNotEmptyOrNull(string) && width > string.length() && isNotEmptyOrNull(fillchar)) {
         int _times = width - string.length();
         _times = Math.round(_times / 2);
         return times(fillchar, _times) + string + times(fillchar, _times);
      }
      return "";
   }
   
   public static String center(String string, int width) {
      return center(string, width, " ");
   }
   
   public static String leftStrip(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.replace("^\\s+", "");
      }
      return "";
   }
   
   public static String lstrip(String string) {
      return leftStrip(string);
   }
   
   public static String rightStrip(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.replace("\\s+$", "");
      }
      return "";
   }
   
   public static String rstrip(String string) {
      return rightStrip(string);
   }
   
   public static String strip(String string) {
      if (isNotEmptyOrNull(string)) {
         String _string = leftStrip(string);
         _string = rightStrip(_string);
         return _string;
      }
      return "";
   }
   
   public static String zeroFill(String string, int width) {
      if (isNotEmptyOrNull(string) && width >= string.length()) {
         int _times = width - string.length();
         return times("0", _times) + string;
      }
      return "";
   }
   
   public static String zerofill(String string, int width) {
      return zeroFill(string, width);
   }
   
   public static String zfill(String string, int width) {
      return zeroFill(string, width);
   }
   
   public static String[] splitLines(String string) {
      String[] lines = {};
      if (isNotEmptyOrNull(string)) {
         lines = string.split("\n");
      }
      return lines;
   }
   
   public static String[] splitlines(String string) {
      return splitLines(string);
   }
   
   public static String asciiLowerCase() {
      return "abcdefghijklmnopqrstuvwxyz";
   }
   
   public static String asciilower() {
      return asciiLowerCase();
   }
   
   public static String asciiUpperCase() {
      return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   }
   
   public static String asciiupper() {
      return asciiUpperCase();
   }
   
   public static String asciiLetters() {
      return asciiLowerCase() + asciiUpperCase();
   }
   
   public static String asciiletters() {
      return asciiLetters();
   }
   
   public static String digits() {
      return "0123456789";
   }
   
   public static String hexadecimalDigits() {
      return "0123456789abcdefABCDEF";
   }
   
   public static String hexadecimal() {
      return hexadecimalDigits();
   }
   
   public static String octalDigits() {
      return "01234567";
   }
   
   public static String octaldigits() {
      return octalDigits();
   }
   
   public static String punctuation() {
      return "!\"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~";
   }
   
   public static String printable() {
      return "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!\"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~ \\t\\n\\r\\x0b\\x0c";
   }
   
   public static String whiteSpace() {
      return "\\t\\n\\x0b\\x0c\\r ";
   }
   
   public static String whitespace() {
      return whiteSpace();
   }
   
   public static boolean isPunctuation(Character c) {
      return c != null && punctuation().contains(c.toString());
   }
   
   public static boolean punctuation(Character c) {
      return isPunctuation(c);
   }
   
   public static boolean isNotPunctuation(Character c) {
      return !isPunctuation(c);
   }
   
   public static boolean notPunctuation(Character c) {
      return isNotPunctuation(c);
   }
   
   public static boolean isPrintable(Character c) {
      return c != null && printable().contains(c.toString());
   }
   
   public static boolean printable(Character c) {
      return isPrintable(c);
   }
   
   public static boolean isNotPrintable(Character c) {
      return !isPrintable(c);
   }
   
   public static boolean notPrintable(Character c) {
      return isNotPrintable(c);
   }
   
   public static boolean isWhiteSpace(Character c) {
      return c != null && whiteSpace().contains(c.toString());
   }
   
   public static boolean whiteSpace(Character c) {
      return isWhiteSpace(c);
   }
   
   public static boolean whitespace(Character c) {
      return isWhiteSpace(c);
   }
   
   public static boolean isNotWhiteSpace(Character c) {
      return !isWhiteSpace(c);
   }
   
   public static boolean notWhiteSpace(Character c) {
      return isNotWhiteSpace(c);
   }
   
   public static String randomize(String string) {
      String randomizedString = "";
      if (isNotEmptyOrNull(string)) {
         double randomNumber = 0;
         int i = 0;
         while (i < string.length()) {
            randomNumber = Math.floor(Math.random() * string.length());
            randomizedString += string.charAt((int) randomNumber);
            i++;
         }
      }
      return randomizedString;
   }
   
   public static String shuffle(String string) {
      String shuffledString = "";
      if (isNotEmptyOrNull(string)) {
         double randomNumber = 0;
         List<Double> usedRandomNumbers = new ArrayList<>();
         int i = 0;
         while (i < string.length()) {
            randomNumber = Math.floor(Math.random() * string.length());
            if (!usedRandomNumbers.contains(randomNumber)) {
               shuffledString += string.charAt((int) randomNumber);
               usedRandomNumbers.add(randomNumber);
               i++;
            }
         }
      }
      return shuffledString;
   }
   
   public static boolean containsSpace(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.matches(".*\\s+.*");
      }
      return false;
   }
   
   public static boolean notContainsSpace(String string) {
      return !containsSpace(string);
   }
   
   public static String format(String format, Object... objects) {
      return String.format(format, objects);
   }
   
   public static String arrayToString(Object array) {
      String arrayString = "{}";
      if (isNotEmptyOrNull(array) && isArray(array)) {
         int length = ((Object[]) array).length;
         String[] strings = new String[length];
         for (int i = 0; i < length; i++) {
            strings[i] = Strings.toString(((Object[]) array)[i]);
         }
         arrayString = String.format("{%s}", String.join(", ", strings));
      }
      return arrayString;
   }
   
   @SuppressWarnings("unchecked")
   public static String listToString(Object object) {
      List<Object> list = null;
      String listString = "[]";
      if (isNotEmptyOrNull(object) && isList(object)) {
         list = (List<Object>) object;
         String string = arrayToString(list.toArray());
         string = "[" + string + "]";
         listString = string;
      }
      return listString;
   }
   
   @SuppressWarnings("unchecked")
   public static String mapToString(Object object) {
      Map<Object, Object> map = null;
      String mapString = "{}";
      if (isNotEmptyOrNull(object) && isMap(object)) {
         map = (Map<Object, Object>) object;
         mapString = "{%s}";
         String items = "";
         for (Entry<Object, Object> entry : map.entrySet()) {
            items += String.format("%s: %s, ", entry.getKey(), entry.getValue());
         }
         items = items.endsWith(", ") ? items.substring(0, items.lastIndexOf(", ")) : items;
         mapString = String.format(mapString, items);
      }
      return mapString;
   }
   
   public static String toString(Object object) {
      String string = "";
      if (isNotEmptyOrNull(object) && isArray(object)) {
         string = arrayToString(object);
      } else if (isNotEmptyOrNull(object) && isList(object)) {
         string = listToString(object);
      } else if (isNotEmptyOrNull(object) && isMap(object)) {
         string = mapToString(object);
      } else {
         string = object == null ? null : object.toString();
      }
      return string;
   }
   
   public static String string(Object object) {
      return toString(object);
   }
   
   public static String nullToEmpty(String value) {
      return value == null ? "" : value;
   }
   
   public static String emptyToNull(String value) {
      return value != null && value.isEmpty() ? null : value;
   }
   
   public static boolean notEmpty(String value) {
      return value != null && !value.isEmpty() ? true : false;
   }
   
   public static String[] array(String value, int length) {
      String[] array = null;
      value = value == null ? "" : value;
      length = length < 0 ? 0 : length;
      if (value.isEmpty() == false && length > 0) {
         array = new String[length];
         for (int i = 0; i < length; i++) {
            array[i] = value;
         }
         
      }
      return array;
   }
   
   public static boolean ignoreCase(boolean value) {
      return value;
   }
   
   public static String removeDiacritics(String text) {
      text = text == null ? "" : text;
      if (text.isEmpty() == false) {
         text = Normalizer.normalize(text, Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
      }
      return text;
   }
   
   /**
    * Traduz o texto informado substituindo cada caractere do alfabeto de entrada
    * por seu caractere equivalente em posição no alfabeto de saída.
    * 
    * @param text
    *           texto a ser informado
    * @param source
    *           alfabeto de entrada
    * @param target
    *           alfabeto de saída
    * @param ignoreCase
    *           ignora ou não o fato do caractere ser minúsculo ou maiúsculo
    * @return texto traduzido
    */
   public static String translate(String text, String source, String target) {
      String translation = EMPTY_STRING;
      text = text == null ? "" : text;
      source = source == null ? "" : source;
      target = target == null ? "" : target;
      if (!text.isEmpty() && !source.isEmpty() && !target.isEmpty()) {
         if (source.length() == target.length()) {
            translation = text;
            for (int i = 0; i < source.length(); i++) {
               translation = translation.replaceAll(
                     String.valueOf(source.charAt(i)).toLowerCase(),
                     String.valueOf(target.charAt(i)).toLowerCase());
               translation = translation.replaceAll(
                     String.valueOf(source.charAt(i)).toUpperCase(),
                     String.valueOf(target.charAt(i)).toUpperCase());
            }
         }
      }
      return translation;
   }
   
   public static String translate(String text, List<String> source, List<String> target) {
      String translation = EMPTY_STRING;
      if (Verify.notContainsNullOrEmpty(text, source, target)) {
         if (source.size() == target.size()) {
            translation = text;
            String sourceWord = null;
            String targetWord = null;
            for (int i = 0; i < source.size(); i++) {
               sourceWord = source.get(i);
               targetWord = target.get(i);
               translation = translation.replace(sourceWord.toLowerCase(), targetWord.toLowerCase());
               translation = translation.replace(sourceWord.toUpperCase(), targetWord.toUpperCase());
               translation = translation.replace(Strings.capitalize(sourceWord), Strings.capitalize(targetWord));
               translation = translation.replace(sourceWord, targetWord);
            }
         }
      }
      return translation;
   }
   
   public static List<String> getLines(String text, String delimiter) {
      List<String> lines = EMPTY_STRINGS_LIST;
      text = text == null ? "" : text;
      if (!text.isEmpty()) {
         lines = java.util.Arrays.asList(text.split(delimiter));
      }
      return lines;
   }
   
   public static List<String> getLines(String text) {
      return getLines(text, "\n");
   }
   
   public static List<String> lines(String text, String delimiter) {
      return getLines(text, delimiter);
   }
   
   public static List<String> lines(String text) {
      return getLines(text);
   }
   
   public static int count(String word, String text, String delimiter, boolean ignoreCase) {
      int amount = 0;
      List<String> lines = getLines(text, delimiter);
      for (String line : lines) {
         if (ignoreCase == true) {
            if (line.equalsIgnoreCase(word)) {
               amount++;
            }
         } else {
            if (line.equals(word)) {
               amount++;
            }
         }
      }
      return amount;
   }
   
   public static int count(String word, String text, String delimiter) {
      return count(text, word, delimiter, false);
   }
   
   public static int count(String word, String text, boolean ignoreCase) {
      return count(text, word, " ", ignoreCase);
   }
   
   public static int count(String word, String text) {
      return count(text, word, false);
   }
   
   public static String expandTabs(String text, int amount, String replace) {
      String result = text == null ? "" : text;
      replace = replace == null ? " " : replace;
      if (amount > 0) {
         result = result.replace("\t", Strings.repeat(replace, amount));
      }
      return result;
   }
   
   public static String expandTabs(String text, int amount) {
      return expandTabs(text, amount, " ");
   }
   
   public static String join(List<String> lines, String delimiter) {
      String result = "";
      delimiter = delimiter == null ? " " : delimiter;
      if (lines.isEmpty() == false) {
         StringBuilder sb = new StringBuilder();
         for (int i = 0; i < lines.size() - 1; i++) {
            sb.append(lines.get(i) + delimiter + lines.get(i + 1));
         }
         result = sb.toString();
      }
      return result;
   }
   
   public static String join(String delimiter, String... lines) {
      String result = "";
      delimiter = delimiter == null ? " " : delimiter;
      if (lines.length > 0) {
         StringBuilder sb = new StringBuilder();
         for (int i = 0; i < lines.length - 1; i++) {
            sb.append(lines[i] + delimiter + lines[i + 1]);
         }
         result = sb.toString();
      }
      return result;
   }
   
   public static String join(String delimiter, Object... values) {
       String result = "";
       delimiter = delimiter == null ? "," : delimiter;
       if (ArrayUtil.isNotEmpty(values)) {
           for (int i = 0; i < values.length; i++) {
               result += values[i] + delimiter;
           }
           result = result.endsWith(delimiter) ? result.substring(0, result.lastIndexOf(delimiter)) : result;
       }
       return result;
   }
   
   public static String join(Object... values) {
       return Strings.join(null, values);
   }
   
   public static String join(String delimiter, List<?>... lists) {
       String result = "";
       if (lists != null) {
           for (List<?> list : lists) {
               if (list != null) {
                   result += Strings.join(delimiter, list.toArray());
               }
           }
       }
       return result;
   }
   
   /**
    * Retorna uma cópia do texto onde cada primeiro caractere de cada palavra é
    * tornado maiúsculo.
    * 
    * @param text
    *           texto informado
    * @return texto contendo cada palavra com letra maiúscula
    */
   public static String title(String text) {
      String title = "";
      if (Verify.notNullOrEmpty(text)) {
         String[] words = text.split(" ");
         for (String word : words) {
            title += Strings.capitalize(word) + " ";
         }
         title = title.trim();
      }
      return title;
   }
   
   public static boolean isTitle(String text) {
      boolean isTitle = false;
      if (Verify.notNullOrEmpty(text)) {
         isTitle = Strings.title(text).equals(text);
      }
      return isTitle;
   }
   
   public static int find(String value, String text, int begin, int end) throws IllegalArgumentException {
      int index = -1;
      String _value = value == null ? "" : value;
      String _text = text == null ? "" : text;
      if (!_value.isEmpty() && !_text.isEmpty()) {
         if (begin < 0) {
            throw new IllegalArgumentException("begin não pode ser menor que zero!");
         } else if (end < 0) {
            throw new IllegalArgumentException("end não pode ser menor que zero!");
         } else if (begin > text.length()) {
            throw new IllegalArgumentException("begin não pode ser maior que o comprimento de text!");
         } else if (end > text.length()) {
            throw new IllegalArgumentException("end não pode ser maior que o comprimento de text!");
         } else {
            index = text.substring(begin, end).indexOf(value);
         }
      }
      return index;
   }
   
   public static int rfind(String value, String text, int begin, int end) throws IllegalArgumentException {
      int index = -1;
      String _value = value == null ? "" : value;
      String _text = text == null ? "" : text;
      if (!_value.isEmpty() && !_text.isEmpty()) {
         if (begin < 0) {
            throw new IllegalArgumentException("begin não pode ser menor que zero!");
         } else if (end < 0) {
            throw new IllegalArgumentException("end não pode ser menor que zero!");
         } else if (begin > text.length()) {
            throw new IllegalArgumentException("begin não pode ser maior que o comprimento de text!");
         } else if (end > text.length()) {
            throw new IllegalArgumentException("end não pode ser maior que o comprimento de text!");
         } else {
            index = text.substring(begin, end).lastIndexOf(value);
         }
      }
      return index;
   }
   
   public static int index(String value, String text, int begin, int end) throws Exception {
      int index = -1;
      String _value = value == null ? "" : value;
      String _text = text == null ? "" : text;
      if (!_value.isEmpty() && !_text.isEmpty()) {
         if (begin < 0) {
            throw new IllegalArgumentException("begin não pode ser menor que zero!");
         } else if (end < 0) {
            throw new IllegalArgumentException("end não pode ser menor que zero!");
         } else if (begin > text.length()) {
            throw new IllegalArgumentException("begin não pode ser maior que o comprimento de text!");
         } else if (end > text.length()) {
            throw new IllegalArgumentException("end não pode ser maior que o comprimento de text!");
         } else {
            index = text.substring(begin, end).indexOf(value);
         }
      }
      if (index < 0) {
         throw new Exception("texto não encontrado!");
      }
      return index;
   }
   
   public static int rindex(String value, String text, int begin, int end) throws Exception {
      int index = -1;
      String _value = value == null ? "" : value;
      String _text = text == null ? "" : text;
      if (!_value.isEmpty() && !_text.isEmpty()) {
         if (begin < 0) {
            throw new IllegalArgumentException("begin não pode ser menor que zero!");
         } else if (end < 0) {
            throw new IllegalArgumentException("end não pode ser menor que zero!");
         } else if (begin > text.length()) {
            throw new IllegalArgumentException("begin não pode ser maior que o comprimento de text!");
         } else if (end > text.length()) {
            throw new IllegalArgumentException("end não pode ser maior que o comprimento de text!");
         } else {
            index = text.substring(begin, end).lastIndexOf(value);
         }
      }
      if (index < 0) {
         throw new Exception("texto não encontrado!");
      }
      return index;
   }
   
   public static int len(String text) {
      return text.length();
   }
   
   public static String min(String text) {
      String result = "";
      if (Verify.notNullOrEmpty(text)) {
         char min = text.charAt(0);
         for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) < min) {
               min = text.charAt(i);
            }
         }
         result = String.valueOf(min);
      }
      return result;
   }
   
   public static String max(String text) {
      String result = "";
      if (Verify.notNullOrEmpty(text)) {
         char max = text.charAt(0);
         for (int i = 1; i < text.length(); i++) {
            if (max < text.charAt(i)) {
               max = text.charAt(i);
            }
         }
         result = String.valueOf(max);
      }
      return result;
   }
   
   public static boolean isNull(String string) {
      return string == null;
   }
   
   public static boolean isNotNull(String string) {
      return !isNull(string);
   }
   
   public static boolean isNullOrEmpty(String string) {
      return isNull(string) || string.isEmpty();
   }
   
   public static boolean isNotNullOrEmpty(String string) {
      return !isNullOrEmpty(string);
   }
   
   public static boolean containsNull(String... strings) {
      boolean isNull = false;
      if (strings != null && strings.length > 0) {
         for (String string : strings) {
            if (isNull(string)) {
               isNull = true;
               break;
            }
         }
      }
      return isNull;
   }
   
   public static boolean notContainsNull(String... strings) {
      return !containsNull(strings);
   }
   
   public static boolean containsNullOrEmpty(String... strings) {
      boolean isNullOrEmpty = false;
      if (strings != null && strings.length > 0) {
         for (String string : strings) {
            if (isNullOrEmpty(string)) {
               isNullOrEmpty = true;
               break;
            }
         }
      }
      return isNullOrEmpty;
   }
   
   public static boolean notContainsNullOrEmpty(String... strings) {
      return !containsNullOrEmpty(strings);
   }
   
   public static Boolean[] parseBoolean(String... strings) {
       Boolean[] booleans = null;
       if (notContainsNullOrEmpty(strings)) {
           booleans = ArrayUtil.parseBoolean(strings);
       }
       return booleans;
   }
   
   public static Boolean[] parseBooleanArray(String string, String delimiter) {
       Boolean[] booleans = null;
       String regex = Regex.BOOLEAN_LIST_REGEX_PATTERN.replaceAll(",", delimiter);
       if (isNotNullOrEmpty(string) && string.matches(regex)) {
           String[] strings = string.split(delimiter);
           booleans = ArrayUtil.parseBoolean(strings);
       }
       return booleans;
   }
   
   public static Boolean[] parseBoolean(String string) {
       Boolean[] booleans = parseBoolean(string, ",");
       return booleans;
   }
   
   public static Character[] parseCharacter(String... strings) {
       Character[] characters = null;
       if (notContainsNullOrEmpty(strings)) {
           characters = ArrayUtil.parseCharacter(strings);
       }
       return characters;
   }
   
   public static Character[] parseCharacterArray(String string, String delimiter) {
       Character[] characters = null;
       String regex = Regex.CHARACTER_LIST_REGEX_PATTERN.replaceAll(",", delimiter);
       if (isNotNullOrEmpty(string) && string.matches(regex)) {
           String[] strings = string.split(delimiter);
           characters = ArrayUtil.parseCharacter(strings);
       }
       return characters;
   }
   
   public static Character[] parseCharacter(String string) {
       Character[] characters = parseCharacter(string, ",");
       return characters;
   }
   
   public static Byte[] parseByte(String... strings) {
       Byte[] bytes = null;
       if (notContainsNullOrEmpty(strings)) {
           bytes = ArrayUtil.parseByte(strings);
       }
       return bytes;
   }
   
   public static Byte[] parseByteArray(String string, String delimiter) {
       Byte[] bytes = null;
       String regex = Regex.INTEGER_LIST_REGEX_PATTERN.replaceAll(",", delimiter);
       if (isNotNullOrEmpty(string) && string.matches(regex)) {
           String[] strings = string.split(delimiter);
           bytes = ArrayUtil.parseByte(strings);
       }
       return bytes;
   }
   
   public static Byte[] parseByte(String string) {
       Byte[] bytes = parseByte(string, ",");
       return bytes;
   }
   
   public static Short[] parseShort(String... strings) {
       Short[] shorts = null;
       if (notContainsNullOrEmpty(strings)) {
           shorts = ArrayUtil.parseShort(strings);
       }
       return shorts;
   }
   
   public static Short[] parseShortArray(String string, String delimiter) {
       Short[] shorts = null;
       String regex = Regex.INTEGER_LIST_REGEX_PATTERN.replaceAll(",", delimiter);
       if (isNotNullOrEmpty(string) && string.matches(regex)) {
           String[] strings = string.split(delimiter);
           shorts = ArrayUtil.parseShort(strings);
       }
       return shorts;
   }
   
   public static Short[] parseShort(String string) {
       Short[] shorts = parseShort(string, ",");
       return shorts;
   }
   
   public static Integer[] parseInt(String... strings) {
       Integer[] integers = null;
       if (notContainsNullOrEmpty(strings)) {
           integers = ArrayUtil.parseInt(strings);
       }
       return integers;
   }
   
   public static Integer[] parseIntArray(String string, String delimiter) {
       Integer[] integers = null;
       String regex = Regex.INTEGER_LIST_REGEX_PATTERN.replaceAll(",", delimiter);
       if (isNotNullOrEmpty(string) && string.matches(regex)) {
           String[] strings = string.split(delimiter);
           integers = ArrayUtil.parseInt(strings);
       }
       return integers;
   }
   
   public static Integer[] parseInt(String string) {
       Integer[] integers = parseIntArray(string, ","); 
       return integers;
   }
   
   public static Long[] parseLong(String... strings) {
       Long[] longs = null;
       if (notContainsNullOrEmpty(strings)) {
           longs = ArrayUtil.parseLong(strings);
       }
       return longs;
   }
   
   public static Long[] parseLongArray(String string, String delimiter) {
       Long[] longs = null;
       String regex = Regex.LONG_LIST_REGEX_PATTERN.replaceAll(",", delimiter);
       if (isNotNullOrEmpty(string) && string.matches(regex)) {
           String[] strings = string.split(delimiter);
           longs = ArrayUtil.parseLong(strings);
       }
       return longs;
   }
   
   public static Long[] parseLong(String string) {
       Long[] longs = parseLongArray(string, ",");
       return longs;
   }
   
   public static Float[] parseFloat(String... strings) {
       Float[] floats = null;
       if (notContainsNullOrEmpty(strings)) {
           floats = ArrayUtil.parseFloat(strings);
       }
       return floats;
   }
   
   public static Float[] parseFloatArray(String string, String delimiter) {
       Float[] floats = null;
       String regex = Regex.FLOAT_LIST_REGEX_PATTERN.replaceAll(",", delimiter);
       if (isNotNullOrEmpty(string) && string.matches(regex)) {
           String[] strings = string.split(delimiter);
           floats = ArrayUtil.parseFloat(strings);
       }
       return floats;
   }
   
   public static Float[] parseFloat(String string) {
       Float[] floats = parseFloatArray(string, ",");
       return floats;
   }
   
   public static Double[] parseDouble(String... strings) {
       Double[] doubles = null;
       if (notContainsNullOrEmpty(strings)) {
           doubles = ArrayUtil.parseDouble(strings);
       }
       return doubles;
   }
   
   public static Double[] parseDoubleArray(String string, String delimiter) {
       Double[] doubles = null;
       String regex = Regex.DOUBLE_LIST_REGEX_PATTERN.replaceAll(",", delimiter);
       if (isNotNullOrEmpty(string) && string.matches(regex)) {
           String[] strings = string.split(delimiter);
           doubles = ArrayUtil.parseDouble(strings);
       }
       return doubles;
   }
   
   public static Double[] parseDouble(String string) {
       Double[] doubles = parseDoubleArray(string, ",");
       return doubles;
   }
   
   public static BigInteger[] parseBigInt(String... strings) {
       BigInteger[] bigIntegers = null;
       if (notContainsNullOrEmpty(strings)) {
           bigIntegers = ArrayUtil.parseBigInt(strings);
       }
       return bigIntegers;
   }
   
   public static BigInteger[] parseBigIntArray(String string, String delimiter) {
       BigInteger[] bigIntegers = null;
       String regex = Regex.LONG_LIST_REGEX_PATTERN.replaceAll(",", delimiter);
       if (isNotNullOrEmpty(string) && string.matches(regex)) {
           String[] strings = string.split(delimiter);
           bigIntegers = ArrayUtil.parseBigInt(strings);
       }
       return bigIntegers;
   }
   
   public static BigInteger[] parseBigInt(String string) {
       BigInteger[] bigIntegers = parseBigIntArray(string, ","); 
       return bigIntegers;
   }
   
   public static BigDecimal[] parseBigDecimal(String... strings) {
       BigDecimal[] bigDecimals = null;
       if (notContainsNullOrEmpty(strings)) {
           bigDecimals = ArrayUtil.parseBigDecimal(strings);
       }
       return bigDecimals;
   }
   
   public static BigDecimal[] parseBigDecimalArray(String string, String delimiter) {
       BigDecimal[] bigDecimals = null;
       String regex = Regex.LONG_LIST_REGEX_PATTERN.replaceAll(",", delimiter);
       if (isNotNullOrEmpty(string) && string.matches(regex)) {
           String[] strings = string.split(delimiter);
           bigDecimals = ArrayUtil.parseBigDecimal(strings);
       }
       return bigDecimals;
   }
   
   public static BigDecimal[] parseBigDecimal(String string) {
       BigDecimal[] bigDecimals = parseBigDecimalArray(string, ","); 
       return bigDecimals;
   }
   
   public static String getOrDefault(final String string, final String defaultString) {
       String _defaultString = defaultString == null ? "" : defaultString;
       if (string == null) {
           return _defaultString;
       }
       return string;
   }
   
   public static String getOrDefault(final String string) {
       return getOrDefault(string, null);
   }
   
   public static String getOrEmpty(final String string) {
       return getOrDefault(string);
   }
   
   public static String getOrDefault(final Object object, Object defaultObject) {
       return getOrDefault(object == null ? null : object.toString(), defaultObject == null ? (String) defaultObject : defaultObject.toString());
   }
   
   public static String getOrDefault(final Object object) {
       return getOrDefault(object, null );
   }
   
   public static String getOrEmpty(final Object object) {
       return getOrDefault(object);
   }
    
    public static <T extends Throwable> String getOrThrow(final String string, final Class<? extends T> throwableClass, final String message) throws T {
        if (string == null) {
            try {
                if (message == null) {
                    throw throwableClass.newInstance();
                } else {
                    throw throwableClass.getConstructor(String.class).newInstance(message);
                }
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                e.printStackTrace();
            }
        }
        return string;
    }
    
    public static <T extends Throwable> String getOrThrow(final String string, final Class<? extends T> throwableClass) throws T {
        if (string == null) {
            try {
                throw throwableClass.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return string;
    }
    
    public static <T extends Throwable> void throwIf(final Class<? extends T> throwableClass, final String message, boolean condition) throws T {
        if (condition == true) {
            try {
                if (message != null) {
                    throw throwableClass.getConstructor(String.class).newInstance(message);
                } else {
                    throw throwableClass.newInstance();
                }
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static <T extends Throwable> void throwIf(final Class<? extends T> throwableClass, boolean condition) throws T {
        Strings.throwIf(throwableClass, null, condition);
    }
    
    public static <T> T getIfOrElse(boolean test, T t1, T t2) {
        if (test == true) {
            return t1;
        }
        return t2;
    }
   
    public static String compile(String template, HashMap<String, Object> context) throws IllegalArgumentException {
        return Template.of().compile(template, context);
    }
   
    public static String compile(String template) throws IllegalArgumentException {
        return Template.of().compile(template);
    }
   
    public static String compile() throws IllegalArgumentException {
        return Template.of().compile();
    }
    
    public static String compile(Template template) throws IllegalArgumentException {
        return template.compile();
    }
    
    public static String decode(String string, String sourceCharset, String targetCharset) {
        String decodedString = "";
        string = string == null ? "" : string;
        sourceCharset = sourceCharset == null ? "" : sourceCharset;
        targetCharset = targetCharset == null ? "" : targetCharset;
        if ( !string.isEmpty() && !sourceCharset.isEmpty() && !targetCharset.isEmpty() ) {
            try {
                decodedString = new String(string.getBytes(sourceCharset), targetCharset);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return decodedString;
    }
    
    public static String toHtml(String str) {
        str = str.replace("Á", "&Aacute;");
        str = str.replace("á", "&aacute;");
        str = str.replace("Â", "&Acirc;");
        str = str.replace("â", "&acirc;");
        str = str.replace("À", "&Agrave;");
        str = str.replace("à", "&agrave;");
        str = str.replace("Ã", "&Atilde;");
        str = str.replace("ã", "&atilde;");
        str = str.replace("É", "&Eacute;");
        str = str.replace("é", "&eacute;");
        str = str.replace("Ê", "&Ecirc;");
        str = str.replace("ê", "&ecirc;");
        str = str.replace("Í", "&Iacute;");
        str = str.replace("í", "&iacute;");
        str = str.replace("Î", "&Icirc;");
        str = str.replace("î", "&icirc;");
        str = str.replace("Ó", "&Oacute;");
        str = str.replace("ó", "&oacute;");
        str = str.replace("Ô", "&Ocirc;");
        str = str.replace("ô", "&ocirc;");
        str = str.replace("Õ", "&Otilde;");
        str = str.replace("õ", "&otilde;");
        str = str.replace("Ú", "&Uacute;");
        str = str.replace("ú", "&uacute;");
        str = str.replace("Û", "&Ucirc;");
        str = str.replace("û", "&ucirc;");
        str = str.replace("Ç", "&Ccedil;");
        str = str.replace("ç", "&ccedil;");
        str = str.replace("Ñ", "&Ntilde;");
        str = str.replace("ñ", "&ntilde;");
        return str;
    }

    public static String fromHtml(String str) {
        str = str.replace(";Aacute;" , "Á" );
        str = str.replace(";aacute;" , "á" );
        str = str.replace(";Acirc;"  , "Â" );
        str = str.replace(";acirc;"  , "â" );
        str = str.replace(";Agrave;" , "À" );
        str = str.replace(";agrave;" , "à" );
        str = str.replace(";Atilde;" , "Ã" );
        str = str.replace(";atilde;" , "ã" );
        str = str.replace(";Eacute;" , "É" );
        str = str.replace(";eacute;" , "é" );
        str = str.replace(";Ecirc;"  , "Ê" );
        str = str.replace(";ecirc;"  , "ê" );
        str = str.replace(";Iacute;" , "Í" );
        str = str.replace(";iacute;" , "í" );
        str = str.replace(";Icirc;"  , "Î" );
        str = str.replace(";icirc;"  , "î" );
        str = str.replace(";Oacute;" , "Ó" );
        str = str.replace(";oacute;" , "ó" );
        str = str.replace(";Ocirc;"  , "Ô" );
        str = str.replace(";ocirc;"  , "ô" );
        str = str.replace(";Otilde;" , "Õ" );
        str = str.replace(";otilde;" , "õ" );
        str = str.replace(";Uacute;" , "Ú" );
        str = str.replace(";uacute;" , "ú" );
        str = str.replace(";Ucirc;"  , "Û" );
        str = str.replace(";ucirc;"  , "û" );
        str = str.replace(";Ccedil;" , "Ç" );
        str = str.replace(";ccedil;" , "ç" );
        str = str.replace(";Ntilde;" , "Ñ" );
        str = str.replace(";ntilde;" , "ñ" );
        return str;
    }

    public static String removeAccents(String str) {
        str = str.replace("Á", "A");
        str = str.replace("á", "a");
        str = str.replace("Â", "A");
        str = str.replace("â", "a");
        str = str.replace("À", "A");
        str = str.replace("à", "a");
        str = str.replace("Ã", "A");
        str = str.replace("ã", "a");
        str = str.replace("É", "E");
        str = str.replace("é", "e");
        str = str.replace("Ê", "E");
        str = str.replace("ê", "e");
        str = str.replace("Í", "I");
        str = str.replace("í", "i");
        str = str.replace("Î", "I");
        str = str.replace("î", "i");
        str = str.replace("Ó", "O");
        str = str.replace("ó", "o");
        str = str.replace("Ô", "O");
        str = str.replace("ô", "o");
        str = str.replace("Õ", "O");
        str = str.replace("õ", "o");
        str = str.replace("Ú", "U");
        str = str.replace("ú", "u");
        str = str.replace("Û", "U");
        str = str.replace("û", "u");
        str = str.replace("Ç", "C");
        str = str.replace("ç", "c");
        str = str.replace("Ñ", "N");
        str = str.replace("ñ", "n");
        return str;
    }
    
    public static double convertToDouble(String valor) {
        if (valor.matches("(?i).*.,.*")) {
            return (Double.valueOf(valor.replaceAll("\\.", "").replaceAll(",", "")) / 100);
        }
        return Double.valueOf(valor);
    }
    
    public static double toDouble(String valor) {
        return convertToDouble(valor);
    }
    
    public static BigDecimal toBigDecimal(String valor) {
        valor = valor == null ? "0.00" : valor.trim();
        return new BigDecimal( toDouble(valor) );
    }
    
    public static String getHash(String str, String algoritmo) {
        try {
            MessageDigest md = MessageDigest.getInstance(algoritmo);
            BigInteger hash = new BigInteger(1, md.digest(str.getBytes()));
            String crypto = hash.toString(Character.MAX_RADIX);
            if (crypto.length() % 2 != 0) {
                crypto = "0" + crypto;
            }
            return crypto;
        } catch (Exception e) {
            return null;
        }
    }
    
    public static String toAscii(String str) {
        if (str == null) {
            return "";
        }
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        return str;
    }
    
    public static String toInputStream(InputStream is) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
    
    public static String encodeBase64(String str) {
        Encoder base64 = Base64.getEncoder();
        String encodedString = new String(base64.encode(str.getBytes()));
        return encodedString;
    }
    
    public static String decodeBase64(String str) {
        Decoder base64 = Base64.getDecoder();
        String decodedString = new String(base64.decode(str.getBytes()));
        return decodedString;
    }
    
    public static String encodeBase64Url(String str) {
        String encodedUrl = Base64.getUrlEncoder().encodeToString(str.getBytes());
        return encodedUrl;
    }
    
    public static String decodeBase64Url(String str) {
        String decodedUrl = new String(Base64.getDecoder().decode(str.getBytes()));
        return decodedUrl;
    }
    
    public static String encodeMime(String str) {
        String mimeEncoded = Base64.getMimeEncoder().encodeToString(str.getBytes());
        return mimeEncoded;
    }
    
    public static String decodeMime(String str) {
        String mimeDecoded = new String(Base64.getMimeDecoder().decode(str.getBytes()));
        return mimeDecoded;
    }
    
    public static String formatNumber(BigDecimal valor, Locale locale) throws Exception {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return numberFormat.format(valor);
    }
    
    public static String formatNumber(BigDecimal valor) throws Exception {
        return formatNumber(valor, Locale.getDefault());
    }
    
    public static String formatNumber(Number valor, Locale locale) throws Exception {
        return formatNumber(new BigDecimal(valor.doubleValue()), locale); 
    }
    
    public static String formatNumber(Number valor) throws Exception {
        return formatNumber(new BigDecimal(valor.doubleValue())); 
    }
    
    public static String singleQuote(String string) {
        return string != null ? String.format("'%s'", string) : "";
    }
    
    public static String singleQuote(String... strings) {
        String result = "";
        if (strings != null && strings.length > 0) {
            String[] aux = new String[strings.length];
            for (int i = 0; i < strings.length; i++) {
                aux[i] = Strings.singleQuote( (String) strings[i]);
            }
            result = ArrayUtil.join(", ", aux);
        }
        return result;
    }
   
}
