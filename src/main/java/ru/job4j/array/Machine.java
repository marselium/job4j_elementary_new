package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int change = money - price;
        int size = 0;
        for (int coin : coins) {
            while (change - coin >= 0) {
                result[size] = coin;
                change -= coin;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }

    public static int[] changeBeta(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int change = money - price;
        int size = 0;
        while (change != 0) {
            for (int coin : coins) {
                if (change - coin >= 0) {
                    change = change - coin;
                    result[size] = coin;
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, size);
    }
}
