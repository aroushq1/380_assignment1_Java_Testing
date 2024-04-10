package edu.ucalgary.oop;

import org.junit.Test;
import static org.junit.Assert.*;

public class SupplyTest {
    // Test data
    String expectedType = "Pillow";
    int expectedQuantity = 10;
    private Supply supply = new Supply(expectedType, expectedQuantity);

    // Test method to check object creation
    @Test
    public void testObjectCreation() {
        // Verify that the Supply object is not null after creation
        assertNotNull("Supply object should not be null", supply);
    }
    
    // Test method to check getType()
    @Test
    public void testGetType() {
        // Verify that getType() returns the correct type
        assertEquals("getType should return the correct type", expectedType, supply.getType());
    }

    // Test method to check setType()
    @Test
    public void testSetType() {
        // Set a new type and verify if setType() updates the type correctly
        supply.setType("Food");
        assertEquals("setType should update the type", "Food", supply.getType());
    }

    // Test method to check getQuantity()
    @Test
    public void testGetQuantity() {
        // Verify that getQuantity() returns the correct quantity
        assertEquals("getQuantity should return the correct quantity", expectedQuantity, supply.getQuantity());
    }

    // Test method to check setQuantity()
    @Test
    public void testSetQuantity() {
        // Set a new quantity and verify if setQuantity() updates the quantity correctly
        supply.setQuantity(20);
        assertEquals("setQuantity should update the quantity", 20, supply.getQuantity());
    }

    // Test method to check increaseQuantity()
    @Test
    public void testIncreaseQuantity() {
        // Increase the quantity by 1 and verify if increaseQuantity() updates the quantity correctly
        supply.increaseQuantity();
        assertEquals("increaseQuantity should increase quantity by 1", 11, supply.getQuantity()); 
    }

    // Test method to check decreaseQuantity()
    @Test
    public void testDecreaseQuantity() {
        // Decrease the quantity by 1 and verify if decreaseQuantity() updates the quantity correctly
        supply.decreaseQuantity();
        assertEquals("decreaseQuantity should decrease quantity by 1", 9, supply.getQuantity());
    }
}
