package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiLineFailureTest {
    @Test
    void diff() {
        String expected = """
                winter
                spring
                summer
                fall
                """;
        String actual = """
                winter
                spring
                summer
                autumn
                """;
       // assertEquals(expected, actual, "seasons");
    }

    @Test
    void same() {
        String expected = """
                winter
                spring
                summer
                fall
                """;
        String actual = """
                winter
                spring
                summer
                fall
                """;
        assertEquals(expected, actual, "seasons");
    }
}
