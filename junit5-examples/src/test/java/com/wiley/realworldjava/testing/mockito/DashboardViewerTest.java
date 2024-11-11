package com.wiley.realworldjava.testing.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DashboardViewerTest {

    private DashboardViewer viewer;

    @Mock
    private Dashboard dashboardMock;

    @BeforeEach
    void setUp() {
        viewer = new DashboardViewer(dashboardMock);
    }

    @Test
    void scores() {
        when(dashboardMock.getScores(3)).thenReturn(List.of(69, 23, 106));

        String expected = """
                -> 69
                -> 23
                -> 106""";
        String actual = viewer.getFormattedData(3);

        assertEquals(expected, actual, "data");
    }

    @Test
    void header() {
        LocalDate testDate = LocalDate.of(2024, Month.NOVEMBER, 15);
        try (MockedStatic<LocalDate> localDateMock  = Mockito.mockStatic(LocalDate.class)) {

            localDateMock .when(LocalDate::now).thenReturn(testDate);

            String expected = "2024-11-15 Competition";
            String actual = viewer.header();
            assertEquals(expected, actual, "header");
        }
    }
}
