/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.uni.app.helloworld;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shieldj
 */
public class HelloWorldTest {
    
    public HelloWorldTest() {
    }
 
    
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }
    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }
    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }
    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
        
    /*
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    */
    
        
    // https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
private final PrintStream originalOut = System.out;
private final PrintStream originalErr = System.err;

@BeforeEach
public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
}

@AfterEach
public  void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
}
    
    
    /**
     * Test of main method, of class HelloWorld.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        
       
        System.out.println("main");
        String[] args = null;
        HelloWorld.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals("main\r\nHello World!\r\n", outContent.toString());
        
    }
    
}
