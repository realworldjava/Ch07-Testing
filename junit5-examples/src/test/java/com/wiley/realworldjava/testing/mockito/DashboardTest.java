package com.wiley.realworldjava.testing.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DashboardTest {

    private Dashboard dashboard;

    @Mock
    private ScoreService scoreServiceMock;

    @BeforeEach
    void setUp() {
        dashboard = new Dashboard(scoreServiceMock);
    }

    @Test
    void getScores() {
        when(scoreServiceMock.retrieveScore(1)).thenReturn(76);
        when(scoreServiceMock.retrieveScore(2)).thenReturn(91);

        List<Integer> expected = List.of(76, 91);
        List<Integer> actual = dashboard.getScores(2);
        assertEquals(expected, actual, "scores");

        verify(scoreServiceMock, times(2)).retrieveScore(anyInt());
    }
}
