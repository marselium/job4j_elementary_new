package ru.job4j.condition;

public class ChessBoard {
    public static int rookWay(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1, y1, x2, y2)) {
            if (x1 == x2 || y1 == y2) {
                rsl = Math.abs(x1 - x2);
                rsl = rsl == 0 ? Math.abs(y1 - y2) : rsl;
            }
        }
        return rsl;
    }

    public static int bishopWay(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1, y1, x2, y2)) {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                rsl = Math.abs(x1 - x2);
            }
        }
        return rsl;
    }

    public static boolean isValidPoint(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static boolean isValid(int x1, int y1, int x2, int y2) {
        return isValidPoint(x1) && isValidPoint(y1) && isValidPoint(x2) && isValidPoint(y2);
    }
}
