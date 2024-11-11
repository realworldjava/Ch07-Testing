package com.wiley.realworldjava.testing;

public final class Validator {

    public static void validatePositive(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Must be positive");
        }
    }
}
