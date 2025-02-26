package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double res = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return res;
    }

    public static void main(String[] args) {
        double res = distance(0,0,2,0);
        System.out.println(res);
    }
}
