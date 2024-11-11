package com.wiley.realworldjava.testing.assertj;

import org.junitpioneer.jupiter.cartesian.CartesianTest;

class SomeCartesianTest {

    @CartesianTest
    void cartesianTest(
            @CartesianTest.Values(ints = {1, 2}) int time,
            @CartesianTest.Values(ints = {3, 4}) int tide) {
        // Your test implementation
    }
}
