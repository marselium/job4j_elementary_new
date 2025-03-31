package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }
}
