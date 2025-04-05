package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {

    private int x;
    private int y;

    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point sec) {
        return sqrt(pow(sec.x - this.x, 2) + pow(sec.y - this.y, 2));
    }

    public double distance3d(Point sec) {
        return  sqrt(pow(sec.x - this.x, 2) + pow(sec.y - this.y, 2) + pow(sec.z - this.z, 2));
    }

    public static void main(String[] args) {
        Point first = new Point(0, 2);
        Point sec = new Point(0, 4);
        double dist = first.distance(sec);
        System.out.println(dist);
    }
}
