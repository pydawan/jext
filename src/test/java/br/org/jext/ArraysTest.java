package br.org.jext;

import org.junit.Test;

public class ArraysTest {
    
    @Test
    public void test() {
        Object[] array = Arrays.of(1, 2, 3, 4, 5, "thiago");
        Prints.print(array);
    }
    
}
