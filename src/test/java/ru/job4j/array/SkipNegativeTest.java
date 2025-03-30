package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SkipNegativeTest {
    @Test
    public void whenSingle() {
        int[][] data = new int[][]{{-1}};
        int[][] result = SkipNegative.skip(data);
        int[][] expected = new int[][]{{0}};
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void whenDouble() {
        int[][] data = new int[][]{{-1, 2}, {1, -2}};
        int[][] result = SkipNegative.skip(data);
        int[][] expected = new int[][]{{0, 2}, {1, 0}};
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void whenTripple() {
        int[][] data = new int[][]{{-1, 2, 4}, {1, -2, 0}, {3, 3, -5}};
        int[][] result = SkipNegative.skip(data);
        int[][] expected = new int[][]{{0, 2, 4}, {1, 0, 0}, {3, 3, 0}};
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {
                {1, -2},
                {1, 2}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void whenArrayRow4AndColumnNotEquals() {
        int[][] array = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2, 0},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5}
        };
        assertThat(result).isDeepEqualTo(expected);
    }
}