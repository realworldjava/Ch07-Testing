package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EquivalentAssertionsTest {

    @Test
    void equivalent() {
        String actual = "cat";
       // assertEquals( "dog", actual, "animal");
        //assertTrue(actual.equals("dog"), "animal");

       // assertNull(actual, "not null");
       // assertTrue(actual == null, " not null");
    }

}
