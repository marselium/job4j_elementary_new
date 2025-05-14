package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        System.out.println("---SKIP---");
        strings.stream().skip(2).forEach(System.out::println);

        System.out.println("---LIMIT---");
        strings.stream().limit(2).forEach(System.out::println);

        System.out.println("---SKIP & LIMIT---");
        strings.stream().skip(2).limit(2).forEach(System.out::println);

        System.out.println("---Find FIRST---");
        System.out.println(strings.stream().findFirst().orElse("Nah.."));

        System.out.println("---FIND LAST---");
        System.out.println(strings.stream().skip(strings.size() - 1).findFirst().orElse("null"));

    }
}
