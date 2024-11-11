package com.wiley.realworldjava.testing.testme;

public class Weather {

   public static enum Season { WINTER, SPRING, SUMMER, FALL }

    public Season next(Season current) {
        return switch (current) {
            case WINTER ->  Season.SPRING;
            case SPRING ->  Season.SUMMER;
            case SUMMER ->  Season.FALL;
            case FALL ->  Season.WINTER;
        };
    }
}
