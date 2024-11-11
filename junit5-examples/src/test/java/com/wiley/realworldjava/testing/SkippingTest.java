package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SkippingTest {


    @Test @Disabled("need to finish implementation")
    void notReadyYet() {
        assertEquals("dog", "cat");
    }
}
