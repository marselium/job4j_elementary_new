package ru.job4j.condition;

public class AlertDivByZero {
    public static void checkNumber(int num) {
        if (num == 0) {
            System.out.println("Could not div by 0.");
        } else if (num < 0) {
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        checkNumber(1);
        checkNumber(0);
        checkNumber(-1);
    }
}
