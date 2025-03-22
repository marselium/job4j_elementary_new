package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    void whenMenHeight190ThenWeight103Dot5() {
        int h = 190;
        double exp = 103.5;
        double rsl = Fit.menWeight(h);
        assertThat(exp).isEqualTo(rsl, withPrecision(0.01));
    }

    @Test
    void whenWomenHeight160ThenWeight57Dot5() {
        int h = 160;
        double exp = 57.5;
        double rsl = Fit.womenWeight(h);
        assertThat(exp).isEqualTo(rsl, withPrecision(0.01));
    }
}