package edu.ucalgary.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReliefServiceTest {

    @Test
    void testConstructorWithValidArguments() {
        Inquirer inquirer = new Inquirer("John", "Doe", "1234567890", "Some information");
        DisasterVictim victim = new DisasterVictim("Jane", "Doe", "2022-01-01", 30);
        Location location = new Location("Home", "123 Main St");
        ReliefService service = new ReliefService(inquirer, victim, "2024-03-11", "Information provided", location);
        assertEquals(inquirer, service.getInquirer());
        assertEquals(victim, service.getMissingIndividual());
        assertEquals("2024-03-11", service.getInquiryDate());
        assertEquals("Information provided", service.getInformationProvided());
        assertEquals(location, service.getLastKnownLocation());
    }

    // Add more test cases for other methods if needed
}
