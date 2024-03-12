xpackage edu.ucalgary.oop;

import org.junit.*;
import static org.junit.Assert.*;

public class InquirerTest {
    private String testFirstName = "Alice";
    private String testLastName = "Johnson";
    private String testPhoneNumber = "+1-987-654-3210";
    private String testMessage = "Seeking information her family.";
    private Inquirer inquirer = new Inquirer(testFirstName, testLastName, testPhoneNumber, testMessage);

    // Test object creation
    @Test
    public void testObjectCreation() {
        assertNotNull("Failed to create Inquirer object", inquirer);
    }

    // Test getting first name
    @Test
    public void testGetFirstName() {
        assertEquals("Failed to retrieve correct first name", testFirstName, inquirer.getFirstName());
    }

    // Test getting last name
    @Test
    public void testGetLastName() {
        assertEquals("Failed to retrieve correct last name", testLastName, inquirer.getLastName());
    }

    // Test setting first name
    @Test
    public void testSetFirstName() {
        inquirer.setFirstName("Bob");
        assertEquals("Failed to set first name correctly", "Bob", inquirer.getFirstName());
    }

    // Test setting last name
    @Test
    public void testSetLastName() {
        inquirer.setLastName("Smith");
        assertEquals("Failed to set last name correctly", "Smith", inquirer.getLastName());
    }

    // Test getting services phone number
    @Test
    public void testGetServicesPhoneNum() {
        assertEquals("Failed to retrieve correct phone number", testPhoneNumber, inquirer.getServicesPhoneNum());
    }

    // Test getting information message
    @Test
    public void testGetInfo() {
        assertEquals("Failed to retrieve correct information message", testMessage, inquirer.getInfo());
    }
}
