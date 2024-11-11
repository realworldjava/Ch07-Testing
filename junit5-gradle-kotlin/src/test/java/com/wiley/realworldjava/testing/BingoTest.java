package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BingoTest {

    private Bingo bingo;

    @BeforeEach
    void setUp() {
        bingo = new Bingo();
    }

    @Test
    void math() {
        assertEquals(5, bingo.winningChain(), "# in a row");
    }
}
