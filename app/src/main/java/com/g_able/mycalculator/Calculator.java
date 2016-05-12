package com.g_able.mycalculator;

public interface Calculator{
    double add(double firstOperand, double secondOperand);
    double sub(double firstOperand, double secondOperand);
    double mul(double firstOperand, double secondOperand);
    double div(double firstOperand, double secondOperand);
}

class RealCalculator implements Calculator {
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }
}
