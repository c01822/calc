package com.g_able.mycalculator;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class DemoControllerWithViewTest {


    @Test
    public void result_of_add_two_number_should_show_on_view(){

        class MockCalculatorListener implements CalculatorListener {
            boolean called = false;
            @Override
            public void onSuccess(String result) {
                called = true;
            }

            public boolean verify() {
                return called;
            }
        }

        MockCalculatorListener mockCalculator = new MockCalculatorListener();

        MainController mainController = new MainController();
        mainController.setListener(mockCalculator);
        //mainController.setCalculator(calcucaltor);
        mainController.add(2, 1);
        assertTrue(mockCalculator.verify());
    }

}
