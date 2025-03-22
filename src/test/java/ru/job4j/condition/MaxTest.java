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
}