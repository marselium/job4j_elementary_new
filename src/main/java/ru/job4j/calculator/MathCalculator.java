package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double a, double b) {
        return multiply(a, b) + sum(a, b);
    }

    public static double minusAndDivide(double a, double b) {
        return minus(a, b) + divide(a, b);
    }

    public static double totalSum(double a, double b) {
        return multiply(a, b) + sum(a, b)
                + minus(a, b) + divide(a, b);
    }

    public static void main(String[] args) {
        System.out.println(sumAndMultiply(10, 20));
        System.out.println(minusAndDivide(100, 10));
        System.out.println(totalSum(10, 1));
    }
}
