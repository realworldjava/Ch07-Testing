package com.wiley.realworldjava.testing.easymock;

import org.easymock.EasyMockExtension;
import com.wiley.realworldjava.testing.mockito.Dashboard;
import com.wiley.realworldjava.testing.mockito.ScoreService;
import org.easymock.Mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(EasyMockExtension.class)
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
        expect(scoreServiceMock.retrieveScore(1)).andReturn(76);
        expect(scoreServiceMock.retrieveScore(2)).andReturn(91);

        replay(scoreServiceMock);

        List<Integer> expected = List.of(76, 91);
        List<Integer> actual = dashboard.getScores(2);
        assertEquals(expected, actual, "scores");

        verify(scoreServiceMock);
    }
}
