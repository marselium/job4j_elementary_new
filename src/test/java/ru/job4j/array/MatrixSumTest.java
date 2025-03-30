package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixSumTest {

    @Test
    void whenSingle() {
        int[][] arr = {{10}};
        int rsl = MatrixSum.sum(arr);
        int exp = 10;
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenTwo() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int rsl = MatrixSum.sum(arr);
        int exp = 10;
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum.sum(array);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}