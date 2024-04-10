package edu.ucalgary.oop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class LocationTest {
    private Location location;
    private DisasterVictim victim;
    private Supply supply;

    // Set up test data before each test
    @Before
    public void setup() {
        location = new Location("University of Calgary", "1752 University Ave");
        victim = new DisasterVictim("Angelina Krauss", "2024-06-23", 32);
        supply = new Supply("Water Bottle", 12);
    }

    // Helper method to check if a supply exists in a list of supplies
    private boolean hasSupply(ArrayList<Supply> supplies, Supply supplyToCheck) {
        return supplies.contains(supplyToCheck);
    }

    // Test the constructor
    @Test
    public void testConstructor() {
        assertNotNull("The constructor should create a non-null Location object", location);
        assertEquals("The constructor should set the name correctly", "University of Calgary", location.getName());
        assertEquals("The constructor should set the address correctly", "1752 University Ave", location.getAddress());
    }

    // Test setName method
    @Test
    public void testSetName() {
        String newName = "Mount Royal University";
        location.setName(newName);
        assertEquals("The setName method should update the name of the location", newName, location.getName());
    }

    // Test setAddress method
    @Test
    public void testSetAddress() {
        String newAddress = "4321 Royal Blvd";
        location.setAddress(newAddress);
        assertEquals("The setAddress method should update the address of the location", newAddress, location.getAddress());
    }

    // Test addOccupant method
    @Test
    public void testAddOccupant() {
        location.addOccupant(victim);
        assertTrue("The addOccupant method should add a disaster victim to the occupants list", location.getOccupants().contains(victim));
    }

    // Test removeOccupant method
    @Test
    public void testRemoveOccupant() {
        location.addOccupant(victim); // Ensure the victim is added first
        location.removeOccupant(victim);
        assertFalse("The removeOccupant method should remove the disaster victim from the occupants list", location.getOccupants().contains(victim));
    }

    // Test setOccupants method
    @Test
    public void testSetAndGetOccupants() {
        ArrayList<DisasterVictim> newOccupants = new ArrayList<>();
        newOccupants.add(victim);
        location.setOccupants(newOccupants);
        assertTrue("The setOccupants method should replace the occupants list with the new list", location.getOccupants().containsAll(newOccupants));
    }

    // Test addSupply method
    @Test
    public void testAddSupply() {
        location.addSupply(supply);
        assertTrue("The addSupply method should add a supply to the supplies list", hasSupply(location.getSupplies(), supply));
    }

    // Test removeSupply method
    @Test
    public void testRemoveSupply() {
        location.addSupply(supply); // Ensure the supply is added first
        location.removeSupply(supply);
        assertFalse("The removeSupply method should remove the supply from the supplies list", hasSupply(location.getSupplies(), supply));
    }

    // Test setSupplies method
    @Test
    public void testSetAndGetSupplies() {
        ArrayList<Supply> newSupplies = new ArrayList<>();
        newSupplies.add(supply);
        location.setSupplies(newSupplies);
        assertTrue("The setSupplies method should replace the supplies list with the new list", hasSupply(location.getSupplies(), supply));
    }
}
