package ru.job4j.calculator;

public class Fit {
    public static double menWeight(int height) {
        double res = (height - 100) * 1.15;
        return res;
    }

    public static double womenWeight(int height) {
        double res = (height - 110) * 1.15;
        return res;
    }

    public static void main(String[] args) {
        short height = 180;
        double men = menWeight(height);
        double women = womenWeight(height);
        System.out.println(men);
        System.out.println(women);
    }
}
