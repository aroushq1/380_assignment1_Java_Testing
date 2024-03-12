package edu.ucalgary.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedicalRecordTest {

    @Test
    void testConstructorWithValidArguments() {
        Location location = new Location("Hospital", "456 Elm St");
        MedicalRecord record = new MedicalRecord(location, "Treatment details", "2024-03-11");
        assertEquals(location, record.getLocation());
        assertEquals("Treatment details", record.getTreatmentDetails());
        assertEquals("2024-03-11", record.getDateOfTreatment());
    }

    // Add more test cases for other methods if needed
}
