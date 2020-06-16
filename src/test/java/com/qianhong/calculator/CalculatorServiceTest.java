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
        assertEquals(38, new CalculatorService().Add(8, 30).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(2, new CalculatorService().Sub(12, 10).getResult());
    }
    
    @Test
    public void testSub1() {
        assertEquals(9, new CalculatorService().Sub(20, 10).getResult());
    }

    @Test
    public void testMul() {
        assertEquals(88, new CalculatorService().Mul(11, 8).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(1, new CalculatorService().Div(13, 13).getResult());
    }
}
