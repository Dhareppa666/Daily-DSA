package java.JUnit_By_ME;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestJunit2 {

    String message = "Robert";

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertNotNull(message);
    }
}