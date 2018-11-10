package br.org.jext;

import org.junit.Test;

/**
 * @author thiago-amm
 * @version v1.0.0 10/11/2018
 * @since v1.0.0
 */
public class EnumTest {
    
    enum WeekDays {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    };

    @Test
    public void test() {
        System.out.println(Enums.randomize(WeekDays.class));
    }

}
