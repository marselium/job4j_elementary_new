package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSum1to5Then15() {
        int start = 1;
        int fin = 5;
        int exp = 15;
        int rsl = Counter.sum(start, fin);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenSum5to1Then0() {
        int start = 5;
        int fin = 1;
        int exp = 0;
        int rsl = Counter.sum(start, fin);
        assertThat(rsl).isEqualTo(exp);
    }
}