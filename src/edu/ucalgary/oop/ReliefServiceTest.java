package edu.ucalgary.oop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import edu.ucalgary.oop.ReliefService;
import edu.ucalgary.oop.Inquirer;
import edu.ucalgary.oop.DisasterVictim;
import edu.ucalgary.oop.Location;

public class ReliefServiceTest {
    private ReliefService reliefService;
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private Location lastKnownLocation;
    private String validDate = "2024-02-10";
    private String invalidDate = "2024/02/10";
    private String expectedInfoProvided = "Looking for family member";
    private String expectedLogDetails = "Inquirer: Louis, Missing Person: Angelina Kane, Date of Inquiry: 2024-02-10, Info Provided: Looking for family member, Last Known Location: University of Calgary"; 

    @Before
    public void setUp() {
        // Assuming Inquirer, DisasterVictim, and Location have constructors as implied
        inquirer = new Inquirer("Louis", "Kane", "1234567890", "Looking for family member");
        missingPerson = new DisasterVictim("Angelina Kane", "2024-02-18");
        lastKnownLocation = new Location("University of Calgary", "2500 University Dr NW");
        reliefService = new ReliefService(inquirer, missingPerson, validDate, expectedInfoProvided, lastKnownLocation);
    }

    @Test
    public void testObjectCreation() {
        assertNotNull("ReliefService object should not be null", reliefService);
    }

    @Test
    public void testGetInquirer() {
        assertEquals("Inquirer should match the one set in setup", inquirer, reliefService.getInquirer());
    }

    @Test
    public void testGetMissingIndividual() {
        assertEquals("Missing person should match the one set in setup", missingPerson, reliefService.getMissingIndividual());
    }

    @Test
    public void testGetInquiryDate() {
        assertEquals("Date of inquiry should match the one set in setup", validDate, reliefService.getInquiryDate());
    }

    @Test
    public void testGetInformationProvided() {
        assertEquals("Information provided should match the one set in setup", expectedInfoProvided, reliefService.getInformationProvided());
    }

    @Test
    public void testGetLastKnownLocation() {
        assertEquals("Last known location should match the one set in setup", lastKnownLocation, reliefService.getLastKnownLocation());
    }

    @Test
    public void testSetInquiryDateWithValidDate() {
        reliefService.setInquiryDate(validDate);
        assertEquals("Setting a valid date should update the date of inquiry", validDate, reliefService.getInquiryDate());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDateOfInquiryWithInvalidDate() {
        reliefService.setInquiryDate(invalidDate); // This should throw IllegalArgumentException due to invalid format
    }

    @Test
    public void testGetInformationLogDetails() {
        assertEquals("Log details should match the expected format", expectedLogDetails, reliefService.getInformationLogDetails());
    }
}