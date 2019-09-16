package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JomoPipiTest {

    @Test
    void basicTest1() {
        assertEquals("1112111121311", JomoPipi.numericals("Hello, World!"));
    }
    @Test
    void basicTest2() {
        assertEquals("11121111213112111131224132411122", JomoPipi.numericals("Hello, World! It's me, JomoPipi!"));
    }
    @Test
    void basicTest3() {
        assertEquals("11121122342", JomoPipi.numericals("hello hello"));
    }

}