package ru.learnUp.feb;

public class DivideProcessor {

    public String process(double arg1, int arg2) {
        double result = arg1 / arg2;
        String divide = String.format("%.2f",result);
        return divide;
    }
}
