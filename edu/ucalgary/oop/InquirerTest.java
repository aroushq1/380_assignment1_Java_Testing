package edu.ucalgary.oop;

import org.junit.*;
import static org.junit.Assert.*;

public class InquirerTest {

    // Test data
    private String expectedFirstName = "Maus";
    private String expectedLastName = "Fischer";
    private String expectedPhoneNumber = "+1-321-789-5444";
    private String expectedMessage = "looking for my family members";

    // Creating an Inquirer object for testing
    private Inquirer inquirer = new Inquirer(expectedFirstName, expectedLastName, expectedPhoneNumber, expectedMessage);

    // Test object creation
    @Test
    public void testObjectCreation() {
        assertNotNull(inquirer);
    }

    // Test getFirstName method
    @Test
    public void testGetFirstName() {
        assertEquals(expectedFirstName, inquirer.getFirstName());
    }

    // Test getLastName method
    @Test
    public void testGetLastName() {
        assertEquals(expectedLastName, inquirer.getLastName());
    }

    // Test setFirstName method
    @Test
    public void testSetFirstName() {
        inquirer.setFirstName("Adam");
        assertEquals("Adam", inquirer.getFirstName());
    }

    // Test setLastName method
    @Test
    public void testSetLastName() {
        inquirer.setLastName("Klein");
        assertEquals("Klein", inquirer.getLastName());
    }

    // Test getServicesPhoneNum method
    @Test
    public void testGetServicesPhoneNum() {
        assertEquals(expectedPhoneNumber, inquirer.getServicesPhoneNum());
    }

    // Test getInfo method
    @Test
    public void testGetInfo() {
        assertEquals(expectedMessage, inquirer.getInfo());
    }
}
