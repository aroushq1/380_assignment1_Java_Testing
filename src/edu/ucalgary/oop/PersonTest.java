package edu.ucalgary.oop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    private Person testPerson;
    private String testFirstName = "Alice";
    private String testLastName = "Johnson";

    @Before
    public void setUp() {
        // Initialize a Person object w/ test data
        testPerson = new Person(testFirstName, testLastName);
    }

    @Test
    public void testSetAndGetFirstName() {
        // Define a new first name
        String newFirstName = "Bob";
        // Set the new first name
        testPerson.setFirstName(newFirstName);
        // Check if setFirstName updates and getFirstName returns the new first name
        assertEquals("Failed to update and retrieve the new first name", newFirstName, testPerson.getFirstName());
    }

    @Test
    public void testSetAndGetLastName() {
        // Define a new last name
        String newLastName = "Smith";
        // Set the new last name
        testPerson.setLastName(newLastName);
        // Check if setLastName updates and getLastName returns the new last name
        assertEquals("Failed to update and retrieve the new last name", newLastName, testPerson.getLastName());
    }
}