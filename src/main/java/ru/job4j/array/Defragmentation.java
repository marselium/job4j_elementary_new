package ru.job4j.array;

public class Defragmentation {
    public static int[] compress(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] != 0) {
                        data[i] = data[j];
                        data[j] = 0;
                        break;
                    }
                }
            }
        }
        return data;
    }

    public static int[] compress2Point(int[] array) {
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (array[i] == 0 && array[j] != 0) {
                array[i] = array[j];
                array[j] = 0;
            }
            if (array[i] != 0) {
                i++;
            }
            j++;
        }
        return array;
    }
}
