package net.piperpark;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach:setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach:tearDown");
    }

    @Test
    void getName() {
        System.out.println("Test:getName");
        HelloWorld john = new HelloWorld("John");
        assertEquals("John", john.getName());
    }
}