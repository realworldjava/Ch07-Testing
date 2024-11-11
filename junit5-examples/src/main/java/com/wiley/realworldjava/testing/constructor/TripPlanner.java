package com.wiley.realworldjava.testing.constructor;

import java.time.LocalDate;
import java.time.Month;

public class TripPlanner  {

    private Competition competition;

    public TripPlanner() {
        this(new Champs());
    }

    public TripPlanner(Competition competition) {
        this.competition = competition;
    }

}
