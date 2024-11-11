package com.wiley.realworldjava.testing;

import org.junit.jupiter.api.*;

class FlowTest {

   @BeforeAll
   static void first() {
       System.out.println("BeforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
    }

    @AfterAll
    static void last() {
        System.out.println("AfterAll");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @Test
    void test1() {
        System.out.println("Test");
    }

    @Test
    void test2() {
        System.out.println("Test");
    }
}
