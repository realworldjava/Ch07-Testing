package com.wiley.realworldjava.testing.mockito;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DashboardViewer {

    private Dashboard dashboard;

    public DashboardViewer(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public String getFormattedData(int maxMatch) {
        List<Integer> scores = dashboard.getScores(maxMatch);
        return scores.stream()
                .map(s -> "-> " + s)
                .collect(Collectors.joining("\n"));
    }

    public String header() {
        return "%s Competition".formatted(LocalDate.now().toString());
    }
}
