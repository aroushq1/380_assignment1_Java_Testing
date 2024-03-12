package edu.ucalgary.oop;

public class DisasterVictimTest {

    @Test
    void testConstructorValidArguments() {
        DisasterVictim victim = new DisasterVictim("John", "Doe", "2022-01-01", 30);
        assertEquals("John", victim.getFirstName());
        assertEquals("Doe", victim.getLastName());
        assertEquals("2022-01-01", victim.getDateOfBirth());
        assertEquals(30, victim.getAge());
    }

    @Test
    void testConstructorInvalidArguments() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DisasterVictim("John", "Doe", "Invalid Date", 30);
        });
    }

    @Test
    void testSetAge() {
        DisasterVictim victim = new DisasterVictim("John", "Doe", "2022-01-01", 30);
        victim.setAge(35);
        assertEquals(35, victim.getAge());
    }

    @Test
    void testSetDateOfBirthValidDate() {
        DisasterVictim victim = new DisasterVictim("John", "Doe", "2022-01-01", 30);
        victim.setDateOfBirth("1990-01-01");
        assertEquals("1990-01-01", victim.getDateOfBirth());
    }

    @Test
    void testSetDateOfBirthInvalidDate() {
        DisasterVictim victim = new DisasterVictim("John", "Doe", "2022-01-01", 30);
        assertThrows(IllegalArgumentException.class, () -> {
            victim.setDateOfBirth("Invalid Date");
        });
    }

    @Test
    void testAddAndRemovePersonalBelongings() {
        DisasterVictim victim = new DisasterVictim("John", "Doe", "2022-01-01", 30);
        Supply supply = new Supply("Water", 100);
        victim.addPersonalBelonging(supply);
        assertTrue(victim.getPersonalBelongings().contains(supply));
        victim.removePersonalBelonging(supply);
        assertFalse(victim.getPersonalBelongings().contains(supply));
    }

    @Test
    void testAddAndRemoveFamilyConnection() {
        DisasterVictim victim1 = new DisasterVictim("John", "Doe", "2022-01-01", 30);
        DisasterVictim victim2 = new DisasterVictim("Jane", "Doe", "2023-01-01", 25);
        FamilyRelation relation = new FamilyRelation(victim1, "Spouse", victim2);
        victim1.addFamilyConnection(relation);
        assertTrue(victim1.getFamilyConnections().contains(relation));
        victim1.removeFamilyConnection(relation);
        assertFalse(victim1.getFamilyConnections().contains(relation));
    }

    @Test
    void testAddAndRemoveMedicalRecord() {
        DisasterVictim victim = new DisasterVictim("John", "Doe", "2022-01-01", 30);
        Location location = new Location("Hospital", "123 Elm St");
        MedicalRecord record = new MedicalRecord(location, "Treatment details", "2024-03-11");
        victim.addMedicalRecord(record);
        assertTrue(victim.getMedicalRecords().contains(record));
        victim.removeMedicalRecord(record);
        assertFalse(victim.getMedicalRecords().contains(record));
    }

}