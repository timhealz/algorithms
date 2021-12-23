package com.timhealz.algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test public void testGetHelloWorldMsg() {
        HelloWorld classUnderTest = new HelloWorld("Bert");
        assertEquals(
            classUnderTest.getHelloWorldMsg(),
            "Hello Bert!"
        );
    }

    @Test public void testNegativeGetHelloWorldMsg() {
        HelloWorld classUnderTest = new HelloWorld("Ernie");
        assertNotEquals(
            classUnderTest.getHelloWorldMsg(),
            "Hello Bert!"
        );
    }
}
