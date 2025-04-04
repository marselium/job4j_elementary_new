package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
       Point first = new Point(0, 0);
       Point second = new Point(0, 2);
       double rsl = first.distance(second);
       double exp = 2.0;
        assertThat(rsl).isEqualTo(exp, withPrecision(0.01));
    }

    @Test
    void whenMinus101to13then11Dot18() {
        Point first = new Point(-10, 1);
        Point second = new Point(1, 3);
        double rsl = first.distance(second);
        double exp = 11.18;
        assertThat(rsl).isEqualTo(exp, withPrecision(0.01));
    }
    @Test
    void when100000001to13then2() {
        Point first = new Point(10000000, 1);
        Point second = new Point(1, 3);
        double rsl = first.distance(second);
        double exp = 9999999;
        assertThat(rsl).isEqualTo(exp, withPrecision(0.01));
    }

}