package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    private Match match;

    @BeforeEach
    void setUp() {
        match = new Match(4);
    }

    @Test
    void win() {
        match.setWin();

        assertEquals("Match 4, Score: 2", match.getFormatted());
    }
}