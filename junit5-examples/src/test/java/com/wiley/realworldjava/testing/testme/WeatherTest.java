package com.wiley.realworldjava.testing.testme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WeatherTest {
    Weather weather = new Weather();

    @Test
    void testNext() {
        Weather.Season result = weather.next(Weather.Season.WINTER);
        //Assertions.assertEquals(Weather.Season.WINTER, result);
    }
}

//Generated with love by TestMe :) Please raise issues & feature requests at: https://weirddev.com/forum#!/testme