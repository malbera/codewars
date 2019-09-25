package com.codewars.kata;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SnailTest {

    @Test
    void SnailTest1() {
        int[][] array
                = {{1, 2, 3, 9},
                  {4, 5, 6, 4},
                  {7, 8, 9, 1},
                {1, 2, 3, 4}};
        int[] r = {1, 2, 3, 9, 4, 1, 4, 3, 2, 1, 7, 4, 5, 6, 9, 8};
        test(array, r);
    }

    String int2dToString(int[][] a) {
        return Arrays.stream(a).map(Arrays::toString).collect(Collectors.joining("\n"));
    }

    public void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
        assertArrayEquals( result, Snail.snail(array));
    }

}
