package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("tanks".equals(name)) {
            System.out.println("Start - tanks");
        } else if ("super mario".equals(name)) {
            System.out.println("Start - mario");
        } else if ("snake".equals(name)) {
            System.out.println("Start - snake");
        } else {
            System.out.println("There is no game called: " + name);
        }
    }

    public static void main(String[] args) {
        menu("tanks");
        menu("s");
    }
}
