package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenQuestionHiThenAnswerHi() {
        String in = "Hi";
        String exp = "Hi, SmartAss.";
        String rsl = DummyBot.answer(in);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenQuestionByeThenAnswerBy() {
        String in = "Bye.";
        String exp = "See you later, nerd";
        String rsl = DummyBot.answer(in);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenQuestionWtfThenAnswerWtf() {
        String in = "wasd";
        String exp = "I don't know. Please, ask another question.";
        String rsl = DummyBot.answer(in);
        assertThat(rsl).isEqualTo(exp);
    }
}