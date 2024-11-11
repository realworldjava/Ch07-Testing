package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void validate() {
        assertThrows(IllegalArgumentException.class,() -> Validator.validatePositive(-1), "exception");

        IllegalArgumentException actual = assertThrows(IllegalArgumentException.class,() -> Validator.validatePositive(-1), "exception");
        assertEquals("Must be positive", actual.getMessage(), "Message");
    }

}