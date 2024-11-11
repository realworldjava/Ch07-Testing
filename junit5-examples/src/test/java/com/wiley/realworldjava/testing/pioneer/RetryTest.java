package com.wiley.realworldjava.testing.pioneer;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.DisabledUntil;
import org.junitpioneer.jupiter.RetryingTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.fail;

public class RetryTest {

    @RetryingTest(10)
    void flakeyTest() {
        Random random = new Random();
        if (random.nextInt(1, 100) < 75) {
          //  fail("too high");
        }
    }
}
