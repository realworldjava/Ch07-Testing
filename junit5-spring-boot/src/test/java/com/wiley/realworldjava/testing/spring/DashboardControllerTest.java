package com.wiley.realworldjava.testing.spring;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
@SpringBootTest
@AutoConfigureMockMvc
class DashboardControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    MatchTrackerService trackerMock;

    @Test
    void matchNumber() throws Exception {
        when(trackerMock.getCurrentMatchNumber()).thenReturn(35);

        mockMvc.perform(get("/match"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("In match 35")));

        verify(trackerMock, times(1)).getCurrentMatchNumber();
    }
}