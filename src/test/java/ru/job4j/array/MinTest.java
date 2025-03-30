package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MinTest {

    @Test
    void whenMinFirst() {
        int[] data = new int[] {1, 2, 5, 19};
        int exp = 1;
        int rsl = Min.findMin(data);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenMinSec() {
        int[] data = new int[]{3, 2, 5, 19};
        int exp = 2;
        int rsl = Min.findMin(data);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenMinLast() {
        int[] data = new int[]{1, 2, 5, 19, 0};
        int exp = 0;
        int rsl = Min.findMin(data);
        assertThat(rsl).isEqualTo(exp);
    }
}