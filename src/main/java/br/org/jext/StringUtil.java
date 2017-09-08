package br.org.jext;

import static br.org.verify.Verify.isArray;
import static br.org.verify.Verify.isList;
import static br.org.verify.Verify.isMap;
import static br.org.verify.Verify.isNotEmptyOrNull;
import static br.org.verify.Verify.isNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * <p>Classe de métodos utilitários para manipulação strings.</p>
 * 
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public final class StringUtil {
   
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
   
   public static boolean isUpper(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.matches("^\\p{Lu}+$");
      }
      return false;
   }
   
   public static boolean uppered(String string) {
      return isUpper(string);
   }
   
   public static boolean isLower(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.matches("^\\p{Ll}+$");
      }
      return false;
   }
   
   public static boolean lowered(String string) {
      return isLower(string);
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
   
   public static String swapcase(String string) {
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
   
   public static String repeat(String string, int times) {
      return times(string, times);
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
   
   public static String rightJustify(String string, int width, String fillchar) {
      if (isNotEmptyOrNull(string) && width > string.length() && isNotEmptyOrNull(fillchar)) {
         return times(fillchar, width - string.length()) + string;
      }
      return "";
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
   
   public static String rightStrip(String string) {
      if (isNotEmptyOrNull(string)) {
         return string.replace("\\s+$", "");
      }
      return "";
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
   
   public static String[] splitLines(String string) {
      String[] lines = {};
      if (isNotEmptyOrNull(string)) {
         lines = string.split("\n");
      }
      return lines;
   }
   
   public static String asciiLowerCase() {
      return "abcdefghijklmnopqrstuvwxyz";
   }
   
   public static String asciiUpperCase() {
      return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   }
   
   public static String asciiLetters() {
      return asciiLowerCase() + asciiUpperCase();
   }
   
   public static String digits() {
      return "0123456789";
   }
   
   public static String hexadecimalDigits() {
      return "0123456789abcdefABCDEF";
   }
   
   public static String octalDigits() {
      return "01234567";
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
            strings[i] = ((Object[]) array)[i].toString();
         }
         arrayString = String.format("{%s}", String.join(", ", strings));
      }
      return arrayString;
   }
   
   @SuppressWarnings("unchecked")
   public static String listToString(Object object) {
      List<Object> list = null;
      String listString = "[]";
      if (isNotEmptyOrNull(list) && isList(object)) {
         list = (List<Object>) object;
         String string = arrayToString(list.toArray());
         string = string.replace("{", "[");
         string = string.replace("}", "]");
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
   
}
