package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int nameOfDay(String day) {
        return switch (day) {
            case "MON", "MONDAY" -> 1;
            case "TUE", "TUESDAY" -> 2;
            case "WED", "WEDNESDAY" -> 3;
            case "THU", "THURSDAY" -> 4;
            case "FRI", "FRIDAY" -> 5;
            case "SAT", "SATURDAY" -> 6;
            case "SUN", "SUNDAY" -> 7;
            default -> -1;
        };
    }
}
