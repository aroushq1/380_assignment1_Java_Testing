package edu.ucalgary.oop;

import org.junit.*;
import static org.junit.Assert.*;

public class InquirerTest {
    private String testFirstName = "Angelina";
    private String testLastName = "Kane";
    private String testServicePhoneNumber = "+1-987-654-3210";
    private String testMessage = "Seeking information her family.";
    private Inquirer inquirer = new Inquirer(testFirstName, testLastName, testPhoneNumber, testMessage);

    @Test
    public void testObjectCreation() {
        assertNotNull("Failed to create Inquirer object", inquirer);
    }

    @Test
    public void testGetFirstName() {
        assertEquals("Failed to retrieve correct first name", testFirstName, inquirer.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("Failed to retrieve correct last name", testLastName, inquirer.getLastName());
    }

    @Test
    public void testSetFirstName() {
        inquirer.setFirstName("Bob");
        assertEquals("Failed to set first name correctly", "Bob", inquirer.getFirstName());
    }

    @Test
    public void testSetLastName() {
        inquirer.setLastName("Smith");
        assertEquals("Failed to set last name correctly", "Smith", inquirer.getLastName());
    }

    @Test
    public void testGetServicePhoneNumber() {
        assertEquals("Failed to retrieve correct phone number", testServicePhoneNumber, inquirer.getServicesPhoneNum());
    }

    @Test
    public void testGetInformation() {
        assertEquals("Failed to retrieve correct information message", testMessage, inquirer.getInformation());
    }
}