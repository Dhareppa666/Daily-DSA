package org.JUnit_By_ME;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestJunit1 {

    String message = "Robert";

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        assertNotNull(message);
    }
}