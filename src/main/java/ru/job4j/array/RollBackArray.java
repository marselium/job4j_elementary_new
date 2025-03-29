package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] rsl = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rsl[i] = array[array.length - i - 1];
        }
        return rsl;
    }
}
