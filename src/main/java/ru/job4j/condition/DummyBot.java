package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String result = "I don't know. Please, ask another question.";
        if ("Hi".equals(question)) {
            result = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            result = "See you later, nerd";
        }
        return result;
    }

    public static void main(String[] args) {
        String answerBot = answer("Hi");
        System.out.println(answerBot);
        answerBot = answer("s");
        System.out.println(answerBot);
    }
}
