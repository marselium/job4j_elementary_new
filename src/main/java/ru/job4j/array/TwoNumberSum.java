package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 0;
        int[] arr = new int[2];
        while (i < array.length) {
            if ((array[i] + array[j] == target) && (i != j)) {
                arr[0] = i;
                arr[1] = j;
                return arr;
            }
            if (j == array.length - 1) {
                i++;
                j = i;
            }
            if (i + 1 != array.length) {
                j++;
            }
        }
        return new int[0];
    }
}
