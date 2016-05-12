package com.g_able.mycalculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class CalculatorSubTest {
    Calculator calculator = new Calculator();
    private final double firstOperand, secondOperand, expectedResult;

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, 1, 0.0},
                {2, 3, 1.0},
                {3, 4, 2.0}
        });
    }

    public CalculatorSubTest(double firstOperand, double secondOperand, double expectedResult) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.expectedResult = expectedResult;
    }

    @Test
    public void runAdd(){
        assertEquals(this.expectedResult, calculator.add(this.firstOperand, this.secondOperand), 0);
    }
}
