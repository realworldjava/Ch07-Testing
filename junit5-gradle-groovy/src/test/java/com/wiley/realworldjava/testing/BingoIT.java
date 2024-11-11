package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class BingoIT {

    private Bingo bingo;

    @BeforeEach
    void setUp() {
        bingo = new Bingo();
    }

    @Test
    void fromDatabase() {
        imagineLookingUpValueFromDatabase();
        assertEquals(5, bingo.winningChain(), "# in a row");
    }

    @Test
    void connectivityTest() {
        fail("database not available");
    }

    private static void imagineLookingUpValueFromDatabase() {
        // delay to simulate network call
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            // ignore
        }
    }
}
