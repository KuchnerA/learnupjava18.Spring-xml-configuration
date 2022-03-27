package ru.learnUp.feb;

public class Calculator {

    private final SumProcessor sumProcessor;
    private final SubtractProcessor subtractProcessor;
    private final DivideProcessor divideProcessor;
    private final MultiplyProcessor multiplyProcessor;

    public Calculator(SumProcessor sumProcessor, SubtractProcessor subtractProcessor, DivideProcessor divideProcessor, MultiplyProcessor multiplyProcessor) {
        this.sumProcessor = sumProcessor;
        this.subtractProcessor = subtractProcessor;
        this.divideProcessor = divideProcessor;
        this.multiplyProcessor = multiplyProcessor;
    }

    public int sum(int arg1, int arg2) {
        return sumProcessor.process(arg1, arg2);
    }

    public int subtract(int arg1, int arg2) {
        return subtractProcessor.process(arg1, arg2);
    }

    public String divide(double arg1, int arg2) {
        return divideProcessor.process(arg1, arg2);
    }

    public int multiply(int arg1, int arg2) {
        return multiplyProcessor.process(arg1, arg2);
    }

}
