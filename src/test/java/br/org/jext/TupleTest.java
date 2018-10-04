package br.org.jext;

import static br.org.jext.Tupla.tupla;
import static br.org.jext.Tuple.tuple;

import org.junit.Test;

public class TupleTest {

    /**
     * 
     */
    @Test
    public void test() {
        System.out.println(tuple(1, 2, 3, "Thiago"));
        System.out.println(tupla(1, 2, 3, "Thiago"));
        System.out.println(tuple());
        System.out.println(tupla());
    }

}
