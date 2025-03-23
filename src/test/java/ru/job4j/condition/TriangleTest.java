package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TriangleTest {

    @Test
    void when234ThenTrue() {
        double ab = 2;
        double bc = 3;
        double ac = 4;
        boolean rsl = Triangle.exist(ab, ac, bc);
        assertThat(rsl).isTrue();
    }

    @Test
    void when226ThenFalse() {
        double ab = 2;
        double bc = 2;
        double ac = 6;
        boolean rsl = Triangle.exist(ab, ac, bc);
        assertThat(rsl).isFalse();
    }
}