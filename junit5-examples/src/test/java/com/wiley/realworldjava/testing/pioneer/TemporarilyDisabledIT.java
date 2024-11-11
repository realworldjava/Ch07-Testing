package com.wiley.realworldjava.testing.pioneer;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.DisabledUntil;

public class TemporarilyDisabledIT {

    @Test
    @DisabledUntil(date="2024-01-01", reason = "Need our partner service to be ready")
    void waitingForServiceAvailability() {
        // intentionally left blank
    }
}
