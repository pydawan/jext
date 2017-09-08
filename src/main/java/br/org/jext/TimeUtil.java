package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 08/09/2017
 * @since v1.0.0
 */
public class TimeUtil {
   
   public static void sleep(int value, TimeUnit unit) {
      if (value >= 1 && unit != null) {
         try {
            switch (unit) {
               case MILISECOND:
                  value *= 1;
                  break;
               case SECOND:
                  value *= 1000;
                  break;
               case MINUTE:
                  value *= 1000 * 60;
                  break;
               case HOUR:
                  value *= 1000 * 60 * 60;
                  break;
            }
            Thread.sleep(value);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
   
   public static void sleep(int value) {
      sleep(value, TimeUnit.SECOND);
   }
   
   public static long currentTime() {
      return System.currentTimeMillis();
   }
   
   public static long currtime() {
      return currentTime();
   }
   
   public static long time() {
      return currtime();
   }
   
   public static long difference(long start, long end) {
      return end - start;
   }
   
   public static long diff(long start, long end) {
      return difference(start, end);
   }
   
   public static long difftime(long start, long end) {
      return end - start;
   }
   
}
