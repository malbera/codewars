package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SudokuValidatorTest {

    @Test
    void exampleTest() {
        int[][] sudoku = {
                {1,9,8,3,7,2,4,5,6},
                {2,1,9,4,8,3,5,6,7},
                {6,5,4,8,3,7,9,1,2},
                {7,6,5,9,4,8,1,2,3},
                {5,4,3,7,2,6,8,9,1},
                {3,2,1,5,9,4,6,7,8},
                {8,7,6,1,5,9,2,3,4},
                {4,3,2,6,1,5,7,8,9},
                {9,8,7,2,6,1,3,4,5}
        };
        assertEquals(true, SudokuValidator.check(sudoku));

        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;

        assertEquals(false, SudokuValidator.check(sudoku));

        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;

        sudoku[4][4] = 0;

        assertEquals(false, SudokuValidator.check(sudoku));
    }
}