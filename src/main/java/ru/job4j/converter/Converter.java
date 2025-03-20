package ru.job4j.converter;

public class Converter {
    public static float rubToEur(float val) {
        return val / 110;
    }

    public static float rubToDol(float val) {
        return val / 100;
    }

    public static void main(String[] args) {
        float eur = rubToEur(11000);
        float dol = rubToDol(10000);
        System.out.println(eur);
        System.out.println(dol);
    }
}
