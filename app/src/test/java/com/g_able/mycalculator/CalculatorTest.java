package com.g_able.mycalculator;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void บวก() {
        assertEquals(2.0, calculator.add(1, 1));
    }

    @Test
    public void ลบ(){
        assertEquals(0.0, calculator.sub(2, 2));
    }

    @Test
    public void คูณ(){
        assertEquals(9.0, calculator.mul(3, 3));
    }

    @Test
    public void หาร(){
        assertEquals(1.0, calculator.div(4, 4));
    }

    @Test
    public void หารศูนย์() throws Exception {
        calculator.div(2, 1);
    }
}
