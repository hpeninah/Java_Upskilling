package com.company.day6.unitTest.test;

import com.company.day6.unitTest.beans.Calc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class calcTest {

    private int a;
    private int b;

    @BeforeEach
    public void setup() {
        a = 2;
        b = 4;
    }

    @Test
    public void addTest() {
        int result = Calc.add(a, b);
        assertEquals(6, result);
    }

    @Test
    public void subTest() {
        int result = Calc.sub(a, b);
        assertEquals(-2, result);
    }

    @Test
    public void mulTest() {
        int result = Calc.mul(a, b);
        assertEquals(8, result);
    }

    @Test
    public void divTest() {
        double result = Calc.div(a, b);
        assertEquals(.5, result, 0.1);
    }
}
