package ru.job4j.condition;

public class Games {
    public static void permission(boolean allowByParents, boolean hasMoney) {
        if (allowByParents && hasMoney) {
            System.out.println("I can go to the computer club");
        } else {
            System.out.println("Not today :( ");
        }
    }

    public static void main(String[] args) {
        boolean parent = true;
        boolean hasMoney = false;
        permission(parent, hasMoney);
    }
}
