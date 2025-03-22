package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert220RubThen2Euro() {
        float input = 220;
        float expected = 2;
        float output = Converter.rubToEur(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert200RblThen2Dol() {
        float input = 200;
        float exp = 2;
        float out = Converter.rubToDol(input);
        assertThat(out).isEqualTo(exp);
    }
}