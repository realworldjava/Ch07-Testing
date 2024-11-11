package com.wiley.realworldjava.testing.pioneer;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.ClearSystemProperty;
import org.junitpioneer.jupiter.RetryingTest;
import org.junitpioneer.jupiter.SetSystemProperty;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class SystemPropertiesTest {

    @Test
    @ClearSystemProperty(key = "JAVA_HOME")
    void clearProperty() {
        assertNull(System.getProperty("JAVA_HOME"), "path");
    }

    @Test
    @SetSystemProperty(key = "JAVA_HOME", value = "c:/java/java21")
    void maskProperty() {
        assertEquals("c:/java/java21", System.getProperty("JAVA_HOME"));
    }
}
