package edu.ucalgary.oop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReliefServiceTest {
    // Instance variables for test setup
    private ReliefService reliefService;
    private Inquirer inquirer;
    private DisasterVictim missingIndividual;
    private Location lastKnownLocation;
    private String validDate = "2024-06-23";
    private String invalidDate = "2024/06/23";
    private String expectedInformationProvided = "Looking for family member";
    private String expectedLogDetails = "Inquirer: Angelina, Missing Person: Katy Krauss, Date of Inquiry: 2024-06-23, Info Provided: Looking for family member, Last Known Location: University of Calgary";

    // Method to set up test data before each test method
    @Before
    public void setUp() {
        // Creating necessary objects for testing
        inquirer = new Inquirer("Angelina", "Kraus", "4028749678", "Looking for family member");
        missingIndividual = new DisasterVictim("Katy Krauss", "2024-07-25", "28");
        lastKnownLocation = new Location("University of Calgary", "2500 University Dr NW");
        // Creating ReliefService object for testing
        reliefService = new ReliefService(inquirer, missingIndividual, validDate, expectedInformationProvided, lastKnownLocation);
    }

    // Test method to check if ReliefService object is created successfully
    @Test
    public void testObjectCreation() {
        assertNotNull("ReliefService object should not be null", reliefService);
    }

    // Test method to check if getInquirer() returns correct Inquirer object
    @Test
    public void testGetInquirer() {
        assertEquals("Inquirer should match the one set in setup", inquirer, reliefService.getInquirer());
    }

    // Test method to check if getMissingIndividual() returns correct DisasterVictim object
    @Test
    public void testGetMissingPerson() {
        assertEquals("Missing person should match the one set in setup", missingIndividual, reliefService.getMissingIndividual());
    }

    // Test method to check if getInquiryDate() returns correct date string
    @Test
    public void testGetDateOfInquiry() {
        assertEquals("Date of inquiry should match the one set in setup", validDate, reliefService.getInquiryDate());
    }

    // Test method to check if getInformationProvided() returns correct information string
    @Test
    public void testGetInfoProvided() {
        assertEquals("Info provided should match the one set in setup", expectedInformationProvided, reliefService.getInformationProvided());
    }

    // Test method to check if getLastKnownLocation() returns correct Location object
    @Test
    public void testGetLastKnownLocation() {
        assertEquals("Last known location should match the one set in setup", lastKnownLocation, reliefService.getLastKnownLocation());
    }

    // Test method to check if setDateOfInquiry() sets the date correctly with a valid date
    @Test
    public void testSetDateOfInquiryWithValidDate() {
        reliefService.setInquiryDate(validDate);
        assertEquals("Setting a valid date should update the date of inquiry", validDate, reliefService.getInquiryDate());
    }

    // Test method to check if setDateOfInquiry() throws IllegalArgumentException with an invalid date
    @Test(expected = IllegalArgumentException.class)
    public void testSetDateOfInquiryWithInvalidDate() {
        reliefService.setInquiryDate(invalidDate); // This should throw IllegalArgumentException due to invalid format
    }

    // Test method to check if getLogDetails() returns the expected log details string
    @Test
    public void testGetLogDetails() {
        assertEquals("Log details should match the expected format", expectedLogDetails, reliefService.getLogDetails());
    }
}
