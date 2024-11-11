package com.wiley.realworldjava.testing.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AssertThatTest {

    @Test
    void spaces() {
        assertThat("cat").isEqualToIgnoringWhitespace("c a t");
    }

    @Test
    void chaining() {
        assertThat("cat")
                .startsWith("c")
                .endsWith("t");
    }

}
