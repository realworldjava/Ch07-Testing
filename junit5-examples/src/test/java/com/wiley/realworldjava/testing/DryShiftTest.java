package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.Test;

import static com.wiley.realworldjava.testing.Shift.Coords;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DryShiftTest {

    private static final int X = 4;

    private void assertCoords(Coords actual, int expectedX, int expectedY) {
        assertEquals(expectedX, actual.x(), "x");
        assertEquals(expectedY, actual.y(), "y");
    }
    @Test
    void moveUp() {
        Coords original = new Coords(X, 7);
        Coords actual = Shift.moveUp(original);
        assertCoords(actual, X, 8);
    }

    @Test
    void moveDown() {
        Coords original = new Coords(X, 7);
        Coords actual = Shift.moveDown(original);
        assertCoords(actual, X, 6);
    }
}
