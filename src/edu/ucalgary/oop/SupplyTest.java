package edu.ucalgary.oop;

import org.junit.Test;
import static org.junit.Assert.*;

public class SupplyTest {
    String expectedType = "Blanket";
	int expectedQuantity = 5;
    private Supply supply = new Supply(expectedType, expectedQuantity);

/*
testObjectCreation -> means testing Supply constructor: 
   - What we need: To verify that an "Supply" object is successfully created.
   - Actual result: Supply type is "Blanket", The quantity is 5.
   - Expected Result: The test checks that the Supply object is not null, confirming successful object creation.
*/
    @Test
    public void testObjectCreation() {
        assertNotNull(supply);
    }
	
/*testGetFirstName: 
   - What we need: To ensure the "getType()" method correctly returns the actual Supply type.
   - Actual result: "Blanket".
   - Expected result: "supply.getType()" should return "Blanket".
*/
    @Test
    public void testGetType() {
        assertEquals("getType should return the correct type", expectedType, supply.getType());
    }
/*testSetType(): 
   - What we need: To ensure the "setType()" method correctly updates the Supply type.
   - Actual/current result: "Blanket".
   - Expected result: "Food".
*/
    @Test
    public void testSetType() {
        supply.setType("Food");
        assertEquals("setType should update the type", "Food", supply.getType());
    }

/*testGetQuantity(): 
   - What we need: To ensure the "getQuantity()" method correctly returns the actual Supply quantity.
   - Actual result: 5.
   - Expected result: "supply.getType()" should return "Blanket".
*/
    @Test
    public void testGetQuantity() {
        assertEquals("getQuantity should return the correct quantity", expectedQuantity, supply.getQuantity());
    }

/*testSetQuantity(): 
   - What we need: To ensure the "setQuantity" method correctly updates the Supply quantity.
   - Actual/current result: 5.
   - Expected result: 20.
*/
    @Test
    public void testSetQuantity() {
        supply.setQuantity(20);
        assertEquals("setQuantity should update the quantity", 20, supply.getQuantity());
    }
}
