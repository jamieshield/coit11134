package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        assertEquals("Hello, World!", getGreeting());
    }

    private String getGreeting() {
        return "Hello, World!";
    }
}
