package ru.job4j.calculator;

public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }
    public static void main(String[] args) {
        plus(100, 500);
        plus(4, 2);
        plus(4, 5);
        minus(6,2);
        minus(1,5);
    }
}
