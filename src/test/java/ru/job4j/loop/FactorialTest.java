package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculate5Then120() {
        int in = 5;
        int exp = 120;
        int rsl = Factorial.calculate(in);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenCalculateMinus5Then1() {
        int in = -5;
        int exp = 1;
        int rsl = Factorial.calculate(in);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenCalculate0Then1() {
        int in = 0;
        int exp = 1;
        int rsl = Factorial.calculate(in);
        assertThat(rsl).isEqualTo(exp);
    }
}