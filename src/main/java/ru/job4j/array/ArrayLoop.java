package ru.job4j.array;

public class ArrayLoop {
    public static void fillArray(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i * 2 + 3;
        }
        for (int arrElement : arr) {
            System.out.println(arrElement);
        }
    }
    public static void main(String[] args) {
        fillArray(5);
    }
}
