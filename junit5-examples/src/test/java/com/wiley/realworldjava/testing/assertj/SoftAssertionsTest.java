package com.wiley.realworldjava.testing.assertj;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class SoftAssertionsTest {

    @Test
    void callingAssertAll() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat("robot").isEqualTo("izzy");
        softly.assertThat(126).isLessThanOrEqualTo(125);
        //softly.assertAll();;
    }


}
