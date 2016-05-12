package com.g_able.mycalculator;

import org.junit.Test;

/**
 * Created by parinyar on 5/12/2016 AD.
 */
public class DemoTestDoubleTest {

    @Test(expected = AddException.class)
    public void handle_exception(){

        CalculatorListener listener = new DummyCalculatorListener();

        Calculator stubCalculatorWithException = new StubCalculatorWithException();


        MainController mainController = new MainController();
        mainController.setListener(listener);
        mainController.setCalculator(stubCalculatorWithException);
        mainController.add(2, 2);


    }
}
class StubCalculatorWithException extends RealCalculator{
    @Override
    public double add(double firstOperand, double secondOperand) {
        throw new AddException();
    }

    @Override
    public double sub(double firstOperand, double secondOperand) {
        return 0;
    }

    @Override
    public double mul(double firstOperand, double secondOperand) {
        return 0;
    }

    @Override
    public double div(double firstOperand, double secondOperand) {
        return 0;
    }
}
class DummyCalculatorListener implements CalculatorListener{
    @Override
    public void onSuccess(String result) {

    }
}
