package ru.job4j.converter;

public class Converter {
    public static float rubToEur(float val){
        float res = val / 110;
        return res;
    }

    public static float rubToDol(float val){
        float res = val / 100;
        return res;
    }

    public static void main(String[] args) {
        float eur = rubToEur(10000);
        float dol = rubToDol(110000);
        System.out.println(eur);
        System.out.println(dol);
    }
}
