package edu.ucalgary.oop;

import org.junit.Test;
import static org.junit.Assert.*;

public class MedicalRecordTest {

    // Create a test MedicalRecord object
    Location expectedLocation = new Location("University of Calgary", "142 3 Ave NW ");
    private String expectedTreatmentDetails = "Fractured wrist treated";
    private String expectedDateOfTreatment = "2024-01-26";
    private String validDateOfTreatment = "2024-03-15";
    private String inValidDateOfTreatment = "2024/03/14";
    MedicalRecord medicalRecord = new MedicalRecord(expectedLocation, expectedTreatmentDetails, expectedDateOfTreatment);

    // Test for object creation
    @Test
    public void testObjectCreation() {
        assertNotNull("Constructor should create a non-null MedicalRecord object", medicalRecord);
    }

    // Test for getLocation method
    @Test
    public void testGetLocation() {
        assertEquals("getLocation should return the correct Location", expectedLocation, medicalRecord.getLocation());
    }

    // Test for setLocation method
    @Test
    public void testSetLocation() {
        Location newExpectedLocation = new Location("Mount Royal", "198 17 Ave SW ");
        medicalRecord.setLocation(newExpectedLocation);
        assertEquals("setLocation should update the Location", newExpectedLocation.getName(), medicalRecord.getLocation().getName());
    }

    // Test for getTreatmentDetails method
    @Test
    public void testGetTreatmentDetails() {
        assertEquals("getTreatmentDetails should return the correct treatment details", expectedTreatmentDetails, medicalRecord.getTreatmentDetails());
    }
    
    // Test for setTreatmentDetails method
    @Test
    public void testSetTreatmentDetails() {
        String newExpectedTreatment = "Surgical treatment not required";
        medicalRecord.setTreatmentDetails(newExpectedTreatment);
        assertEquals("setTreatmentDetails should update the treatment details", newExpectedTreatment, medicalRecord.getTreatmentDetails());
    }

    // Test for getDateOfTreatment method
    @Test
    public void testGetDateOfTreatment() {
        assertEquals("getDateOfTreatment should return the correct date of treatment", expectedDateOfTreatment, medicalRecord.getDateOfTreatment());
    }
	
	// Test for setDateOfTreatment method
	@Test
    public void testSetDateOfTreatment() {
		String newExpectedDateOfTreatment = "2024-03-06";
		medicalRecord.setDateOfTreatment(newExpectedDateOfTreatment);
        assertEquals("setDateOfTreatment should update date of treatment", newExpectedDateOfTreatment, medicalRecord.getDateOfTreatment());
    }
	
    // Test for setDateOfTreatment method with valid date format
    @Test
    public void testSetDateOfTreatmentWithValidFormat() {
        medicalRecord.setDateOfTreatment(validDateOfTreatment); // Should not throw an exception
    }

    // Test for setDateOfTreatment method with invalid date format
    @Test
    public void testSetDateOfBirthWithInvalidFormat() {
        boolean correctValue = false;
        String failureReason = "no exception was thrown";

        try {
           medicalRecord.setDateOfTreatment(inValidDateOfTreatment); // Should throw IllegalArgumentException
        }
        catch (IllegalArgumentException e) {
           correctValue = true;
        }
        catch (Exception e) {
           failureReason = "the wrong type of exception was thrown";
        }

        String message = "setDateOfTreatment() should throw an IllegalArgumentException with invalid date format '" + inValidDateOfTreatment + "' but " + failureReason + ".";
        assertTrue(message, correctValue);
    }

    // Test for setDateOfTreatment method with non-date input
    @Test
    public void testSetDateOfBirthWithNotADate() {
        boolean correctValue = false;
        String failureReason = "no exception was thrown";

        try {
           medicalRecord.setDateOfTreatment(expectedTreatmentDetails); // Should throw IllegalArgumentException
        }
        catch (IllegalArgumentException e) {
           correctValue = true;
        }
        catch (Exception e) {
           failureReason = "the wrong type of exception was thrown";
        }

        String message = "setDateOfTreatment() should throw an IllegalArgumentException with invalid non-date input '" + inValidDateOfTreatment + "' but " + failureReason + ".";
        assertTrue(message, correctValue);
    }
}
