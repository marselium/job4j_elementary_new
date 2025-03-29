package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CheckTest {

    @Test
    void whenCheckTripleTrueThenTrue() {
        boolean[] in = new boolean[]{true, true, true};
        boolean rsl = Check.mono(in);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenCheckTripleFalseThenTrue() {
        boolean[] in = new boolean[]{false, false, false};
        boolean rsl = Check.mono(in);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenCheckTripleFalseAndTrueThenFalse() {
        boolean[] in = new boolean[]{false, false, false, true};
        boolean rsl = Check.mono(in);
        assertThat(rsl).isFalse();
    }

    @Test
    void whenCheck2FalseTrueFalseThenFalse() {
        boolean[] in = new boolean[]{false, false, true, false};
        boolean rsl = Check.mono(in);
        assertThat(rsl).isFalse();
    }
    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[] {true, false, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[] {false, true, false};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }
}