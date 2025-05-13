package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Deck {

    public static void generateDeck() {
        Stream.of(Suit.values())
            .flatMap(suit -> Stream.of(Value.values())
                .map(val -> new Card(suit, val)))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        generateDeck();
    }
}
