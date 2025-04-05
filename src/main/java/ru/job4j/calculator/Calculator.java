package ru.job4j.calculator;

public class Calculator {
    public double plus(double first, double second) {
       return first + second;
    }

    public double plus(double first, double second, double third) {
        return plus(plus(first, second), third);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }
}
