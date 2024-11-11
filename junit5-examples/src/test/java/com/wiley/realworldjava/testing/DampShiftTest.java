package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.Test;

import static com.wiley.realworldjava.testing.Shift.Coords;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DampShiftTest {
    @Test
    void moveUp() {
        Coords original = new Coords(4, 7);
        Coords actual = Shift.moveUp(original);

        assertEquals(4, actual.x(), "x");
        assertEquals(8, actual.y(), "y");
    }

    @Test
    void moveDown() {
        Coords original = new Coords(4, 7);
        Coords actual = Shift.moveDown(original);

        assertEquals(4, actual.x(), "x");
        assertEquals(6, actual.y(), "y");
    }
}
