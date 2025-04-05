package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TriangleTest {

    @Test
    void whenA00B40C04henTrue() {
       Point a = new Point(0, 0);
       Point b = new Point(4, 0);
       Point c = new Point(0, 4);
       Triangle triangle = new Triangle(a, b, c);
       double rsl = triangle.area();
       double exp = 8;
       assertThat(rsl).isEqualTo(exp, withPrecision(0.001));
    }

    @Test
    void whenTriangleNotExists() {
         Point a = new Point(2, 4);
         Point b = new Point(4, 10);
         Point c = new Point(1, 1);
         Triangle triangle = new Triangle(a, b, c);
         double rsl = triangle.area();
         assertThat(rsl).isEqualTo(-1);
    }
}