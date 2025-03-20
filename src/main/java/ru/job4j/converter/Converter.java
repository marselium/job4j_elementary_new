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
        float inpEur = 220;
        float expEur = 2;
        float outEur = rubToEur(inpEur);
        boolean eurPassed = expEur == outEur;
        System.out.println("rub to eur converter test : " + eurPassed);
        float inpDol = 300;
        float expDol = 3;
        float outDol = rubToDol(inpDol);
        boolean dolPassed = outDol == expDol;
        System.out.println("rub to dollar converter test : " + dolPassed);
    }
}
