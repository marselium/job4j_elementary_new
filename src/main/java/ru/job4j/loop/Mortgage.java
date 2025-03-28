package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount + (amount * 0.01 * percent) - salary;
            year += 1;
        }
        return year;
    }
}
