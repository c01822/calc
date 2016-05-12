package com.g_able.mycalculator;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class CalculatorTest {
    RealCalculator realCalculator = new RealCalculator();

    @Test
    public void บวก() {
        assertEquals(2.0, realCalculator.add(1, 1));
    }

    @Test
    public void ลบ(){
        assertEquals(0.0, realCalculator.sub(2, 2));
    }

    @Test
    public void คูณ(){
        assertEquals(9.0, realCalculator.mul(3, 3));
    }

    @Test
    public void หาร(){
        assertEquals(1.0, realCalculator.div(4, 4));
    }
}
