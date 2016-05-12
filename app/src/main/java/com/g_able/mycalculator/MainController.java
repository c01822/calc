package com.g_able.mycalculator;

public class MainController {

    Calculator calculator;
    CalculatorListener listener;

    public MainController() {
        this.calculator = new RealCalculator();
    }

    public void add(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.add(firstOperand, secondOperand)));
    }
    public void sub(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.sub(firstOperand, secondOperand)));
    }
    public void mul(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.mul(firstOperand, secondOperand)));
    }
    public void div(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.div(firstOperand, secondOperand)));
    }

    public void setListener(CalculatorListener listener) {
        this.listener = listener;
    }

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }
}
