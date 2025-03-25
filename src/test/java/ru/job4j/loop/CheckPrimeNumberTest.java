package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CheckPrimeNumberTest {

    @Test
    void when2ThenTrue() {
        int in = 2;
        boolean rsl = CheckPrimeNumber.check(in);
        assertThat(rsl).isTrue();
    }

    @Test
    void when5ThenTrue() {
        int in = 5;
        boolean rsl = CheckPrimeNumber.check(in);
        assertThat(rsl).isTrue();
    }

    @Test
    void when4ThenFalse() {
        int in = 4;
        boolean rsl = CheckPrimeNumber.check(in);
        assertThat(rsl).isFalse();
    }

    @Test
    void when1ThenFalse() {
        int in = 1;
        boolean rsl = CheckPrimeNumber.check(in);
        assertThat(rsl).isFalse();
    }

    @Test
    void when11ThenTrue() {
        int number = 11;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    void when25ThenFalse() {
        int number = 25;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when9ThenFalse() {
        int number = 9;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when49ThenFalse() {
        int number = 49;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }
}