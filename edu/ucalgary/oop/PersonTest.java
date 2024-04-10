package edu.ucalgary.oop;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    // Sample data for testing
    private String expectedFirstName = "Maus";
    private String expectedLastName = "Fischer";
    
    // Create a Person object for testing with the sample data
    private Person person = new Person(expectedFirstName, expectedLastName);

    // Test Constructor 
    @Test
    public void testObjectCreation() {
        // Ensure that the Person object is not null after creation
        assertNotNull(person);
    }

    // Test Getters 
    @Test
    public void testGetFirstName() {
        // Create a new Person object for testing
        Person testPerson = new Person(expectedFirstName, expectedLastName);
        // Assert that the retrieved first name matches the expected first name
        assertEquals(expectedFirstName, testPerson.getFirstName());
    }

    @Test
    public void testGetLastName() {
        // Create a new Person object for testing
        Person testPerson = new Person(expectedFirstName, expectedLastName);
        // Assert that the retrieved last name matches the expected last name
        assertEquals(expectedLastName, testPerson.getLastName());
    }

    // Test setters 
    @Test
    public void testSetFirstName() {
        // Create a new Person object for testing
        Person testPerson = new Person(expectedFirstName, expectedLastName);
        // Set a new first name
        testPerson.setFirstName("Adam");
        // Assert that the first name has been successfully updated
        assertEquals("Adam", testPerson.getFirstName());
    }

    @Test
    public void testSetLastName() {
        // Create a new Person object for testing
        Person testPerson = new Person(expectedFirstName, expectedLastName);
        // Set a new last name
        testPerson.setLastName("Klein");
        // Assert that the last name has been successfully updated
        assertEquals("Klein", testPerson.getLastName());
    }
}
