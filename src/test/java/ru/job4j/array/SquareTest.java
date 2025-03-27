package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SquareTest {

    @Test
    void calculateBound3then014() {
        int[] exp = {0, 1, 4};
        int bound = 3;
        int[] rsl = Square.calculate(bound);
        assertThat(rsl).containsExactly(exp);
    }
}