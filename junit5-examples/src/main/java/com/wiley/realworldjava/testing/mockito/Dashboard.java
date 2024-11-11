package com.wiley.realworldjava.testing.mockito;

import java.util.List;
import java.util.stream.IntStream;

public class Dashboard {

    private ScoreService service;

    public Dashboard(ScoreService service) {
        this.service = service;
    }

    public List<Integer> getScores(int maxMatch) {
        return IntStream.range(1, maxMatch + 1)
                .mapToObj(n -> service.retrieveScore(n))
                .toList();
    }
}
