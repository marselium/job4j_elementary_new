package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double res = Math.sqrt(p * (p - a)  * (p - b) * (p - c));
        return res;
    }

    public static void main(String[] args) {
        double res = area(2 , 2, 2);
        System.out.println(res);
    }
}
