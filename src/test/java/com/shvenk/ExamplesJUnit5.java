package com.shvenk;

import org.junit.jupiter.api.*;

public class ExamplesJUnit5 {

    @BeforeAll
    static void beforeALL() { System.out.println("###     @BeforeALL() !"); }
    @AfterAll
    static void afterALL() { System.out.println("###     @AfterALL() !"); }
    @BeforeEach
    void beforeEach() {
        // open("google.com")
        System.out.println("###          @beforeEach() !");
    }
    @AfterEach
    void afterEach() { System.out.println("###               @AfterEach() !"); }
    @Test
    void firstTest() { System.out.println("###                    @firstTest() !"); }
    @Test
    void secondTest() { System.out.println("###                         @secondTest() !"); }
}