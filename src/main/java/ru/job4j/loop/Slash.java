package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == i) {
                    System.out.print("0");
                } else if (j == size - i + 1) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        draw(3);
        draw(5);
    }
}
