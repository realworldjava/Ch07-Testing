package com.wiley.realworldjava.testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedTests {

    @ParameterizedTest
    @ValueSource(strings = { "cat", "dog" })
    void values(String value) {
        assertEquals(3, value.length(), "# chars");
    }

    static List<Object[]> fetchTestData() {
        return List.of(new Object[] { "cat", 3},
                new Object[] {"doggy", 5});
    }

    @ParameterizedTest
    //@MethodSource("fetchTestData")
    @MethodSource("com.wiley.realworldjava.testing.ParameterizedTests#fetchTestData")
    void values(String value, int expected) {
        assertEquals(expected, value.length(), "# chars");
    }

}
