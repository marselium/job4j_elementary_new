package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitnessTest {

    @Test
    void calcWhenIvan90Nik100Then1() {
        int iv = 90;
        int nik = 100;
        int exp = 1;
        int rsl = Fitness.calc(iv, nik);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}