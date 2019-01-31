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
      System.out.println("18/10/2017 11:11:36".matches(Regex.DATETIME_FORMAT.value()));
      System.out.println("18/10/2017".matches(Regex.DATE_FORMAT.value()));
      System.out.println("11:11:36".matches(Regex.TIME_FORMAT.value()));
      System.out.println(DateUtil.toSqlFormat("18/10/2017 11:11:36.123456"));
      System.out.println(DateUtil.toSqlFormat("18/10/2017 11:11:36"));
      System.out.println(DateUtil.toSqlFormat("18/10/2017"));
      System.out.println(DateUtil.toSqlFormat("11:11:36"));
      System.out.println(DateUtil.toDateFormat("2017-10-18"));
      System.out.println(DateUtil.toDateFormat("2017-10-18 12:57:30"));
      System.out.println(DateUtil.dateSql("2017-10-18 12:57:30"));
      System.out.println(DateUtil.firstDay());
      System.out.println(DateUtil.lastDay());
      System.out.println(DateUtil.firstDateOfMonth());
      System.out.println(DateUtil.lastDateOfMonth());
      DateUtil.datesOfInterval(DateUtil.parse("10/03/2018", "dd/MM/yyyy"), DateUtil.parse("20/01/2019", "dd/MM/yyyy")).forEach(dates -> {
          System.out.println("Data de início: " + dates[0]);
          System.out.println("Data de término: " + dates[1]);
      });
      DateUtil.firstAndLastDateOfToday().forEach(date -> {
          System.out.println(date[0]);
          System.out.println(date[1]);
      });
   }
   
}
