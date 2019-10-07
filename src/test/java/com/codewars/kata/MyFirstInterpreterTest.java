package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFirstInterpreterTest {

    private static void test(String input, String expectedOutput) {
        test(input, expectedOutput, "");
    }
    private static void test(String input, String expectedOutput, String message) {
        MyFirstInterpreter interpreter = new MyFirstInterpreter(input);
        assertEquals(message, expectedOutput, interpreter.interpret());
    }

    @Test
    void shouldWorkForExampleProgramsProvidedInDescription() {
        test("",
                "");

    }

}
