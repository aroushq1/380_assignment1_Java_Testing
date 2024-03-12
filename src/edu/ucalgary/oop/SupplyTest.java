package edu.ucalgary.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SupplyTest {

    @Test
    void testConstructorWithValidArguments() {
        Supply supply = new Supply("Water", 100);
        assertEquals("Water", supply.getType());
        assertEquals(100, supply.getQuantity());
    }

    // Add more test cases for other methods if needed
}
