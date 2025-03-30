package ru.job4j.array;

public class Min {
    public static int findMin(int[] arr) {
        int minNum = arr[0];
        for (int num : arr) {
            if(minNum > num) {
                minNum = num;
            }
        }
        return minNum;
    }
}
