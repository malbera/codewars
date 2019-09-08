package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractsTest {

    @Test
    void test_fractions() {
        long[][] lst;
        lst = new long[][] { {1, 2}, {1, 3}, {10, 40} };
        assertEquals("(6,12)(4,12)(3,12)", Fracts.convertFrac(lst));
    }

}
