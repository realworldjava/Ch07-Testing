package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;

class AssumesTest {

    @Test
    void assuming() {
        boolean actual = true;
        assumeTrue(actual);
        assumeFalse(actual);
    }

}
