package ru.job4j.loop;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass;
        do {
            System.out.println("Enter pass: ");
            pass = scanner.nextInt();
        } while (pass != 111);
        System.out.println("Right pass");
    }
}
