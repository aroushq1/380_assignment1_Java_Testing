package edu.ucalgary.oop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    private Person person;
    private String expectedFirstName = "Louis";
    private String expectedLastName = "Kane";

    @Before
    public void setUp() {
        person = new Person(expectedFirstName, expectedLastName);
    }

    @Test
    public void testSetAndGetFirstName() {
        String newFirstName = "John";
        person.setFirstName(newFirstName);
        assertEquals("After setting the new first name successfully, getFirstName should return the updated first name", newFirstName, person.getFirstName());
    }

    @Test
    public void testSetAndGetLastName() {
        String newLastName = "Cena";
        person.setLastName(newLastName);
        assertEquals("After setting the new last name successfully, getLastName should return the updated last name", newLastName, person.getLastName());
    }
}
