package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to13then2() {
        double exp = 2;
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 3;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenMinus101to13then11Dot18() {
        double exp = 11.18;
        int x1 = -10;
        int y1 = 1;
        int x2 = 1;
        int y2 = 3;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertThat(rsl).isEqualTo(exp, withPrecision(0.01));
    }

    @Test
    void when100000001to13then2() {
        double exp = 9999999;
        int x1 = 10000000;
        int y1 = 1;
        int x2 = 1;
        int y2 = 3;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertThat(rsl).isEqualTo(exp, withPrecision(0.01));
    }
}