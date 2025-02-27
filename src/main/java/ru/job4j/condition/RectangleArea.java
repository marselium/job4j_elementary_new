package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double res =Math.pow (p / (2 * (k + 1)), 2) * 2;
        return res;
    }

    public static void main(String[] args) {
        double rsl = square(4, 1);
        System.out.println(rsl);
        rsl = square(4, 1);
        System.out.println(rsl);
    }
}
