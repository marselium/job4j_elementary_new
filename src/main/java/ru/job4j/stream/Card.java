package ru.job4j.stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card {"
                + "suit = " + suit
                + ", value = " + value
                + '}';
    }

}