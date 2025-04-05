package ru.job4j.condition;

import static java.lang.Math.*;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    public static  boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(this.second);
        double bc = second.distance(this.third);
        double ca = third.distance(this.first);
        if (exist(ab, bc, ca)) {
            double p = semiPerimeter(ab, bc, ca);
            rsl = sqrt(p * (p - ab) * (p - bc) * (p - ca));
        }
        return rsl;
    }
}
