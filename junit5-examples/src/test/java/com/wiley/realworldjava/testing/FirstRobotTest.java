package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FirstRobotTest {

    private FirstRobot robot;

    @BeforeEach
    void setUp() {
        robot = new FirstRobot();
    }

    @Test
    void name() {
        robot.setName("Izzy");
        assertEquals("Izzy", robot.toString());
    }

    @Test
    void singleComponent() {
        robot.addComponent(100);
        assertEquals(100, robot.getWeight());
    }

    @Test
    void twoComponents() {
        robot.addComponent(100);
        robot.addComponent(20);
        assertEquals(120, robot.getWeight());
    }

    @Test
    void overweight() {
        robot.addComponent(100);
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> robot.addComponent(50));
        assertEquals("Cannot add component. Robot would be too heavy", ex.getMessage());
    }
}
