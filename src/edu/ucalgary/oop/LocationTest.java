package edu.ucalgary.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LocationTest {

    @Test
    void testConstructorWithValidArguments() {
        Location location = new Location("Home", "123 Main St");
        assertEquals("Home", location.getName());
        assertEquals("123 Main St", location.getAddress());
    }

    // Add more test cases for other methods if needed
}
