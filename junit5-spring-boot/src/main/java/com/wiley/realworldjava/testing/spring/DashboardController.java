package com.wiley.realworldjava.testing.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    private MatchTrackerService tracker;

    public DashboardController(MatchTrackerService tracker) {
        this.tracker = tracker;
    }

    @GetMapping("/match")
    public @ResponseBody String displayCurrentMatch() {
        return "In match %s".formatted(tracker.getCurrentMatchNumber());
    }
}
