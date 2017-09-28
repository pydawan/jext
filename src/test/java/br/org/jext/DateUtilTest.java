package br.org.jext;

import org.junit.Test;

public class DateUtilTest {
   
   @Test
   public void test() {
      System.out.println(DateUtil.datetime("19/11/1982 16:55:25"));
      System.out.println(DateUtil.date("19/11/1982"));
      System.out.println(DateUtil.time("16:55:25"));
      System.out.println(DateUtil.datetimeSql("1982-11-19 16:55:25"));
      System.out.println(DateUtil.dateSql("1982-11-19"));
      System.out.println(DateUtil.timeSql("16:55:25"));
   }
   
}
