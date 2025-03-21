package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class X2Test {

    @Test
    void whenA10B0C0X2then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int exp = 40;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(exp);
    }
}