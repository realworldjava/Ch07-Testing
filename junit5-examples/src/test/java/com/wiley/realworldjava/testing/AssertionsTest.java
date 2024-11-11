package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsTest {

    @Test
    void assertingEquals() {
        int expected = 3;
        int actual = 1+2;
        assertEquals(expected, actual);
        assertEquals(expected, actual, "equals");
    }

    @Test
    void asserts() {
        assertEquals(3, 1+2, "numbers are not equal");
        assertNotEquals(4, 1+2, "not equals");
        assertTrue(true, "true");
        assertFalse(false, "false");
        assertNull(null, "not null");
        assertNotNull("cat", "not null");
    }

    @Test
    void same() {
        List<Integer> expected = List.of(5);
        List<Integer> actual = List.of(5);
        assertSame(actual, actual, "same");
        assertNotSame(expected, actual, "different");
        assertEquals(expected, actual, "equality");
    }

    @Test
    void arrays() {
        int[] expected = new int[] {5};
        int[] actual = new int[] {5};
        assertArrayEquals(expected, actual, "values");
        assertNotEquals(expected, actual, "reference");
    }

}
