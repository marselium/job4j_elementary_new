package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap23Arr1To6(){
        int[] inpArr = new int[]{1, 2, 4, 3, 5, 6};
        int[] exp = new int[]{1, 2, 3, 4, 5, 6};
        int a = 2;
        int b = 3;
        int[] rsl = SwitchArray.swap(inpArr, a, b);
        assertThat(rsl).containsExactly(exp);
    }

    @Test
    void whenSwap05Arr1To6(){
        int[] inpArr = new int[]{1, 2, 4, 3, 5, 6};
        int[] exp = new int[]{6, 2, 4, 3, 5, 1};
        int a = 0;
        int b = 5;
        int[] rsl = SwitchArray.swap(inpArr, a, b);
        assertThat(rsl).containsExactly(exp);
    }
}