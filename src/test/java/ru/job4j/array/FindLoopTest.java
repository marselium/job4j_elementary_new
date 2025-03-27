package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArr123Element3Then2() {
        int[] arr = new int[]{1, 2, 3};
        int el = 3;
        int exp = 2;
        int rsl = FindLoop.indexOf(arr, el);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenArr123Element4ThenMinus1() {
        int[] arr = new int[]{1, 2, 3};
        int el = 4;
        int exp = -1;
        int rsl = FindLoop.indexOf(arr, el);
        assertThat(rsl).isEqualTo(exp);
    }
}