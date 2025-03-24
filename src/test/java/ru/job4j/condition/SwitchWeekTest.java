package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void when2ThenTue() {
        int in = 2;
        String exp = "TUE";
        String rsl = SwitchWeek.nameOfDay(in);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void when9ThenErr() {
        int in = 9;
        String exp = "ERROR";
        String rsl = SwitchWeek.nameOfDay(in);
        assertThat(rsl).isEqualTo(exp);
    }
}