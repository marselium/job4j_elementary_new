package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] board, int col) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean rsl = false;
        for (int i = 0; i < 5; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                return true;
            }
        }
        return rsl;
    }
}
