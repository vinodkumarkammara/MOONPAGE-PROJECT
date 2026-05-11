package com.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test
    void testAddition() {
        int result = 10 + 20;
        assertEquals(30, result);
    }

    @Test
    void testString() {
        String name = "Vinod";
        assertEquals("Vinod", name);
    }

    @Test
    void testBoolean() {
        assertTrue(5 > 2);
    }

    @Test
    void testNotNull() {
        String value = "AI Agent";
        assertNotNull(value);
    }

    @Test
    void testArray() {
        int[] numbers = {1,2,3};
        assertEquals(3, numbers.length);
    }
}
