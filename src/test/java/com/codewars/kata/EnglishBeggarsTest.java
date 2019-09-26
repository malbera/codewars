package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnglishBeggarsTest {


    @Test
    void tester() {
        int[] test = {1, 2, 3, 4, 5};
        int[] a1 = {15}, a2 = {9, 6}, a3 = {5, 7, 3}, a4 = {1, 2, 3, 4, 5, 0}, a5 = {};
        assertArrayEquals(a4, EnglishBeggars.beggars(test, 6));
        assertArrayEquals(a5, EnglishBeggars.beggars(test, 0));
    }

}
