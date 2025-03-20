package ru.job4j.calculator;

public class ArgumentsMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void helloAge(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Marsel";
        ArgumentsMethod.hello(name);
        int age = 24;
        ArgumentsMethod.helloAge(name, age);
    }
}
