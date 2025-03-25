package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isPrime = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = true;
            } else {
                break;
            }
        }
        return isPrime;
    }
}
