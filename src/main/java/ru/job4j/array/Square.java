package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] square = new int[bound];
        for (int i = 0; i < bound; i++) {
            square[i] = i * i;
        }
        return square;
    }
}
