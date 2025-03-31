package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    arr[i][j] = 0;
                }

            }
        }
        return arr;
    }
}
