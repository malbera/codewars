package com.codewars.kata;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BoggleWordCheckerTest {

    final private static char[][] board = {
            {'E','A','R','A'},
            {'N','L','E','C'},
            {'I','A','I','S'},
            {'B','Y','O','R'}
    };




    final private static char[][] board2 = {
            {'I','Z','F','C','Q','P','L','D','V','O','X','R','W','Z','Z','R'},
            {'J','W','N','O','G','K','K','T','A','Z','H','X','G','C','S','J'},
            {'I','T','A','J','J','N','O','G','Z','O','O','K','T','P','B','X'},
            {'P','D','K','N','G','O','G','G','X','N','O','M','P','A','B','J'},
            {'K','H','K','N','C','O','P','G','S','E','V','Z','T','A','O','M'},
            {'S','I','D','F','R','T','N','R','E','B','V','G','F','K','V','I'},
            {'T','H','Q','V','K','B','I','Z','Y','A','V','F','Q','B','X','O'},
            {'N','K','A','J','T','O','A','C','B','T','W','R','O','R','P','R'},
            {'F','D','R','V','T','U','G','T','T','S','T','V','E','B','T','M'},
            {'L','P','D','K','K','E','J','T','C','M','T','B','L','Z','J','I'},
    };



    private static String[]  toCheck   = {"YCZESGGKP"};
    private static boolean[] expecteds = {true};

    @Test
    void sampleTests() {
        for (int i=0 ; i < toCheck.length ; i++) {
            assertEquals( expecteds[i], new BoggleWordChecker(deepCopy(board2), toCheck[i]).check() );
        }
    }

    private char[][] deepCopy(char[][] arr) {
        return Arrays.stream(arr)
                .map( a -> Arrays.copyOf(a, a.length) )
                .toArray(char[][]::new);
    }

}
