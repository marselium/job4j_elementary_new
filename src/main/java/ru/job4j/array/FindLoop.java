package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return result;
    }
}
