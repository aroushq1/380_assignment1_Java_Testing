package edu.ucalgary.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InquirerTest {

    @Test
    void testConstructorWithValidArguments() {
        Inquirer inquirer = new Inquirer("John", "Doe", "1234567890", "Some information");
        assertEquals("John", inquirer.getFirstName());
        assertEquals("Doe", inquirer.getLastName());
        assertEquals("1234567890", inquirer.getServicePhoneNumber());
        assertEquals("Some information", inquirer.getInformation());
    }

    // Add more test cases for other methods if needed
}
