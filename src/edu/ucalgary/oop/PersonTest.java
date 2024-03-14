package edu.ucalgary.oop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    private Person person;
    private String expectedFirstName = "John";
    private String expectedLastName = "Doe";

    @Before
    public void setUp() {
        person = new Person(expectedFirstName, expectedLastName);
    }

    @Test
    public void testSetAndGetFirstName() {
        String newFirstName = "Michael";
        person.setFirstName(newFirstName);
        assertEquals("After setting a new first name, getFirstName should return the updated first name", newFirstName, person.getFirstName());
    }

    @Test
    public void testSetAndGetLastName() {
        String newLastName = "Smith";
        person.setLastName(newLastName);
        assertEquals("After setting a new last name, getLastName should return the updated last name", newLastName, person.getLastName());
    }
}
