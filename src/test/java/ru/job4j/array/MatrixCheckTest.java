package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixCheckTest {

    @Test
    void monoHorizontalTrue() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean rsl = MatrixCheck.monoHorizontal(input, row);
        assertThat(rsl).isTrue();
    }

    @Test
    void monoHorizontalFalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', ' '},
        };
        int row = 0;
        boolean rsl = MatrixCheck.monoHorizontal(input, row);
        assertThat(rsl).isFalse();
    }
}