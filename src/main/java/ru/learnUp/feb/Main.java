package ru.learnUp.feb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        int arg1 = 20;
        int arg2 = 7;

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        Calculator calculator = context.getBean(Calculator.class);

        int resultSum = calculator.sum(arg1, arg2);
        System.out.println("Сумма чисел : " + resultSum);

        int resultSubtract = calculator.subtract(arg1, arg2);
        System.out.println("Разность чисел : " + resultSubtract);

        String resultDivide = calculator.divide(arg1, arg2);
        System.out.println("Частное чисел : " + resultDivide);

        int resultMultiply = calculator.multiply(arg1, arg2);
        System.out.println("Произведение чисел : " + resultMultiply);

    }
}
