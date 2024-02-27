package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calc;
    @Before
    public void setUp() throws Exception {
        calc = new Calculadora();
    }

    @Test
    public void somar() {
        double result = calc.somar(4, 7);
        assertEquals(result,11, 0);
    }

    @Test
    public void subtrair() {
        double result = calc.subtrair(9, 5);
        assertEquals(result,4, 0);
    }
}