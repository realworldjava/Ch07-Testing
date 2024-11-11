package com.wiley.realworldjava.testing.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.never;

@ExtendWith(MockitoExtension.class)
public class VerifyingTest {

    private Dashboard dashboard;

    @Mock(strictness =  Mock.Strictness.LENIENT)
    private ScoreService scoreServiceMock;

    @BeforeEach
    void setUp() {
        dashboard = new Dashboard(scoreServiceMock);
    }


    @Test
    void scores() {
        when(scoreServiceMock.retrieveScore(1)).thenReturn(76);

        dashboard.getScores(1);

        verify(scoreServiceMock).retrieveScore(1);
        verify(scoreServiceMock, times(1)).retrieveScore(1);
        verify(scoreServiceMock, atLeast(1)).retrieveScore(1);
        verify(scoreServiceMock, atMost(1)).retrieveScore(1);
        verify(scoreServiceMock, atMostOnce()).retrieveScore(1);
        verify(scoreServiceMock, never()).retrieveScore(9);
        verify(scoreServiceMock, times(1)).retrieveScore(anyInt());
    }

}