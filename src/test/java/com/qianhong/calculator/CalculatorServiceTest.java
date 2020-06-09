package com.qianhong.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

public class CalculatorServiceTest {

    @Test
    public void testPing() {
        assertThat(new CalculatorService().ping(), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

    @Test
    public void testAdd() {
        assertEquals(37, new CalculatorService().Add(8, 29).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(2, new CalculatorService().Sub(12, 10).getResult());
    }
    
    @Test
    public void testSub1() {
        assertEquals(3, new CalculatorService().Sub(12, 9).getResult());
    }

    @Test
    public void testMul() {
        assertEquals(88, new CalculatorService().Mul(11, 8).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(1, new CalculatorService().Div(12, 12).getResult());
    }
}
