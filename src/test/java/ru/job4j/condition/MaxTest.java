package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int l = 1;
        int r = 2;
        int exp = 2;
        int rsl = Max.max(l, r);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenMax3To2Then3() {
        int l = 3;
        int r = 2;
        int exp = 3;
        int rsl = Max.max(l, r);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenMax3To3Then3() {
        int l = 3;
        int r = 3;
        int exp = 3;
        int rsl = Max.max(l, r);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenMax5And2And3Then5() {
        int first = 5;
        int sec = 2;
        int third = 3;
        int exp = 5;
        int rsl = Max.max(first, sec, third);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenMaxMinus2AndMinus1AndMinus5ThenMinus1() {
        int first = -2;
        int sec = -1;
        int third = -3;
        int exp = -1;
        int rsl = Max.max(first, sec, third);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenMax1And1And1Then1() {
        int first = 1;
        int sec = 1;
        int third = 1;
        int exp = 1;
        int rsl = Max.max(first, sec, third);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenMax5And2And3And9Then9() {
        int first = 5;
        int sec = 2;
        int third = 3;
        int fourth = 9;
        int exp = 9;
        int rsl = Max.max(first, sec, third, fourth);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenMaxMinus2AndMinus1AndMinus5And0Then0() {
        int first = -2;
        int sec = -1;
        int third = -3;
        int fourth = 0;
        int exp = 0;
        int rsl = Max.max(first, sec, third, fourth);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenMax1And1And1And4Then1() {
        int first = 1;
        int sec = 1;
        int third = 1;
        int fourth = 1;
        int exp = 1;
        int rsl = Max.max(first, sec, third);
        assertThat(rsl).isEqualTo(exp);
    }
}