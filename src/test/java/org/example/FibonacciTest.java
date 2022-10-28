package org.example;

import org.example.fibonacci.FibonacciSeries;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FibonacciTest {

    FibonacciSeries fs;

    @BeforeEach
    public void setUp(){
        fs = new FibonacciSeries();
    }

    @AfterEach
    public void tearDown(){
        fs = null;
    }

    @Test
    public void zeroInput(){
        assertEquals(0,fs.fibonacci(0));
    }

    @Test
    public void oneInput(){
        assertEquals(1,fs.fibonacci(1));
    }

    @Test
    public void negativeInput(){
        assertEquals(-1,fs.fibonacci(-5));
    }
}
