package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = true;
        boolean tmp;
        for (int i = 1; i < data.length; i++) {
            tmp = data[i - 1];
            if (data[i] != tmp) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
