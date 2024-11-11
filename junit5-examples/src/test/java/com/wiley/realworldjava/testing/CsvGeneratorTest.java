package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CsvGeneratorTest {

    @Test
    void testWithAssertions() {
        String actual = CsvGenerator.create("izzy", "sienna", "gabriel");
        String[] lines = actual.split("\n");
        assertEquals("izzy,4", lines[0], "first line");
        assertEquals("sienna,6", lines[1], "second line");
        assertEquals("gabriel,7", lines[2], "third line");
    }

    @Test
    void testWithGoldenMaster() {
        String expected = """
                izzy,4
                sienna,6
                gabriel,7""";
        String actual = CsvGenerator.create("izzy", "sienna", "gabriel");
        assertEquals(expected, actual, "data");
    }

}