package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinderTest {

    @Test
    void sampleTests() {

        String a = ".W.\n" +
                ".W.\n" +
                "...";

        String b = ".W.\n" +
                ".W.\n" +
                "W..";

        String c = "......\n" +
                "......\n" +
                "......\n" +
                "......\n" +
                "......\n" +
                "......";

        String d = "......\n" +
                "......\n" +
                "......\n" +
                "......\n" +
                ".....W\n" +
                "....W.";

        assertEquals(true, Finder.pathFinder(a));
        assertEquals(false, Finder.pathFinder(b));
        assertEquals(true, Finder.pathFinder(c));
        assertEquals(false, Finder.pathFinder(d));
    }

}
