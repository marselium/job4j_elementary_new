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

    @Test
    void whenEvenSum5to1Then0() {
        int start = 5;
        int fin = 1;
        int exp = 0;
        int rsl = Counter.sum(start, fin);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenEvenSum1to6Then10() {
        int start = 1;
        int fin = 6;
        int exp = 12;
        int rsl = Counter.sumByEven(start, fin);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenEvenSum1to7Then10() {
        int start = 1;
        int fin = 6;
        int exp = 12;
        int rsl = Counter.sumByEven(start, fin);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenEvenSumMinus5toMinus2Then10() {
        int start = -5;
        int fin = -2;
        int exp = -6;
        int rsl = Counter.sumByEven(start, fin);
        assertThat(rsl).isEqualTo(exp);
    }
}