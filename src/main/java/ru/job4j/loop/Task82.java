package ru.job4j.loop;

public class Task82 {
    public static void loop() {
        int freeTicks = 0;
        int total = 0;
        int[] promo1 = {21, 10, 2, 2};
        int[] concert1 = {1, 2, 5, 22};
        for (int i = 0; i < promo1.length; i++) {
            total += promo1[i];
            if (promo1[i] >= 10) {
                freeTicks += promo1[i] / 10;
            }
        }

        for (int j : concert1) {
            total += j;
        }
        System.out.println("total: " + total + "; free: " + freeTicks);
    }

    public static void main(String[] args) {
        loop();
    }
}
