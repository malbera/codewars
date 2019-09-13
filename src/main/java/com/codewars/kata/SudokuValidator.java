package com.codewars.kata;

public class SudokuValidator {

    public static boolean check(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {

            int[] row = new int[9];
            int[] square = new int[9];
            int[] column = sudoku[i].clone();

            for (int j = 0; j < 9; j ++) {
                row[j] = sudoku[j][i];
                square[j] = sudoku[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
            }
            if (!(validate(column) && validate(row) && validate(square)))
                return false;
        }
        return true;
    }

    static boolean validate(int[] check) {
        int result = 0;
        for (int i = 0; i < check.length; i++){
            result ^= check[i] ^ (i + 1);
        }
        return result == 0;
    }




}
