package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        boolean result = strings
                .stream()
                .noneMatch("Шесть"::contains);
        System.out.println(result);
        result = strings.stream().anyMatch(el -> el.contains("ь"));
        System.out.println(result);
        result = strings.stream().allMatch(el -> el.startsWith("Три"));
        System.out.println(result);
    }
}