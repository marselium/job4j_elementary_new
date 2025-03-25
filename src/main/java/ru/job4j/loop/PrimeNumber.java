package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int cnt = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                cnt += 1;
            }
        }
        return cnt;
    }
}
