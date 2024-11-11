package com.wiley.realworldjava.testing.constructor;

import java.time.LocalDate;
import java.time.Month;

public class Champs implements Competition {

    @Override
    public LocalDate getDate() {
        return LocalDate.of(2024, Month.APRIL, 17);
    }
}
