package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String dayOfWeek;
        switch (day){
        case 1:
            dayOfWeek = "MON";
            break;
        case 2:
            dayOfWeek = "TUE";
            break;
        case 3:
            dayOfWeek = "WED";
            break;
        case 4:
            dayOfWeek = "THU";
            break;
        case 5:
            dayOfWeek = "FRI";
            break;
        case 6:
            dayOfWeek = "SAT";
            break;
        case 7:
            dayOfWeek = "SUN";
            break;
        default:
            dayOfWeek = "ERROR";
        }
        return dayOfWeek;
    }
}
