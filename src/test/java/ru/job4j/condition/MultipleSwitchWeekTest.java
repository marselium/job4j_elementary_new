package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MultipleSwitchWeekTest {

    @Test
    void whenWedThen3() {
        String in = "WED";
        int exp = 3;
        int rsl = MultipleSwitchWeek.nameOfDay(in);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenWednesdayThen3() {
        String in = "WEDNESDAY";
        int exp = 3;
        int rsl = MultipleSwitchWeek.nameOfDay(in);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenWedErrThenErr() {
        String in = "WEDNESSDAY";
        int exp = -1;
        int rsl = MultipleSwitchWeek.nameOfDay(in);
        assertThat(rsl).isEqualTo(exp);
    }
}