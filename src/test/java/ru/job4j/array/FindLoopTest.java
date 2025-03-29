package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArr123Element3Then2() {
        int[] arr = new int[]{1, 2, 3};
        int el = 3;
        int exp = 2;
        int rsl = FindLoop.indexOf(arr, el);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenArr123Element4ThenMinus1() {
        int[] arr = new int[]{1, 2, 3};
        int el = 4;
        int exp = -1;
        int rsl = FindLoop.indexOf(arr, el);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[]{1, 2, 3};
        int element = 8;
        int start = 0;
        int finish = 1;
        int exp = -1;
        int rsl = FindLoop.indexInRange(data, element, start, finish);
        assertThat(rsl).isEqualTo(exp);
        /* Дописать тест, когда элемент 8 в диапазоне не найден.
        Можно искать любой другой элемент, корректно отражая этот факт в названии теста. */
    }
}