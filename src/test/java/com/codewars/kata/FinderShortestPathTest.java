package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinderShortestPathTest {

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

        assertEquals(4, FinderShortestPath.pathFinder(a));
        assertEquals(-1, FinderShortestPath.pathFinder(b));
        assertEquals(10, FinderShortestPath.pathFinder(c));
        assertEquals(-1, FinderShortestPath.pathFinder(d));
    }

}
