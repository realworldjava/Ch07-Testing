package com.wiley.realworldjava.testing.spring;

import org.springframework.stereotype.Service;

@Service
public class MatchTrackerService {

    private int matchNumber = 0;

    public void startMatch() {
        matchNumber++;
    }

    public int getCurrentMatchNumber() {
        return matchNumber;
    }
}
