package ru.job4j.ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        int result = one + two;
        System.out.println(result);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        one = 10;
        two = 11;
        result = one + two;
        System.out.println(result);
        int age = 18;
        age = age + one;
        System.out.println(age);
        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println(size);
    }
}
