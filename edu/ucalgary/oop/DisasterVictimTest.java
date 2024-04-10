package edu.ucalgary.oop;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DisasterVictimTest {

    private DisasterVictim victim;

    // Setting up a victim object before each test
    @Before
    public void setUp() {
        victim = new DisasterVictim("Angelina", "2024-06-23", 32);
    }

    // Testing constructor with age parameter
    @Test
    public void testConstructorWithAge() {
        assertEquals("Angelina", victim.getFirstName());
        assertEquals("2024-06-23", victim.getEntryDate());
        assertEquals("32", victim.getAge());
    }

    // Testing constructor with date of birth parameter
    @Test
    public void testConstructorWithDateOfBirth() {
        DisasterVictim victimWithDOB = new DisasterVictim("Katy", "2024-03-12", "1996-02-01");
        assertEquals("Katy", victimWithDOB.getFirstName());
        assertEquals("2024-03-12", victimWithDOB.getEntryDate());
        assertEquals("1996-02-01", victimWithDOB.getDateOfBirth());
    }

    // Testing set and get comments
    @Test
    public void testSetAndGetComments() {
        victim.setComments("Some comments");
        assertEquals("Some comments", victim.getComments());
    }

    // Testing set and get medical records
    @Test
    public void testSetAndGetMedicalRecords() {
        // Create a Location object
        Location location = new Location("Angelina", "Canada");
        MedicalRecord record = new MedicalRecord(location, "Some condition", "2024-03-12");
        ArrayList<MedicalRecord> medicalRecords = new ArrayList<>();
        medicalRecords.add(record);
        victim.setMedicalRecords(medicalRecords);
        assertEquals(1, victim.getMedicalRecords().length);
        assertEquals("Some condition", victim.getMedicalRecords()[0].getTreatmentDetails());
    }    

    // Testing set and get personal belongings
    @Test
    public void testSetAndGetPersonalBelongings() {
        ArrayList<Supply> personalBelongings = new ArrayList<>();
        Supply supply = new Supply("Water", 10);
        personalBelongings.add(supply);
        victim.setPersonalBelongings(personalBelongings);
        assertEquals(1, victim.getPersonalBelongings().size());
        assertEquals("Water", victim.getPersonalBelongings().get(0).getType());
        assertEquals(10, victim.getPersonalBelongings().get(0).getQuantity());
    }

    // Testing set and get family connections
    @Test
    public void testSetAndGetFamilyConnections() {
        DisasterVictim personOne = new DisasterVictim("Angelina", "2024-06-23", 32);
        DisasterVictim personTwo = new DisasterVictim("Ryder", "2024-06-23", 23);
        FamilyRelation relation = new FamilyRelation(personOne, "Sibling", personTwo);
        ArrayList<FamilyRelation> familyConnections = new ArrayList<>();
        familyConnections.add(relation);
        victim.setFamilyConnections(familyConnections);
        assertEquals(1, victim.getFamilyConnections().size());
        assertEquals("Sibling", victim.getFamilyConnections().get(0).getRelationshipTo());
        assertEquals("Angelina", victim.getFamilyConnections().get(0).getPersonOne().getFirstName());
        assertEquals("Ryder", victim.getFamilyConnections().get(0).getPersonTwo().getFirstName());
    }
    
    // Testing removing personal belongings
    @Test
    public void testRemovePersonalBelonging() {
        ArrayList<Supply> personalBelongings = new ArrayList<>();
        Supply supply = new Supply("Water", 10);
        personalBelongings.add(supply);
        victim.setPersonalBelongings(personalBelongings);
        victim.removePersonalBelonging(supply);
        assertEquals(0, victim.getPersonalBelongings().size());
    }

    // Testing adding personal belongings
    @Test
    public void testAddPersonalBelonging() {
        Supply supply = new Supply("Food", 5);
        victim.addPersonalBelonging(supply);
        assertEquals(1, victim.getPersonalBelongings().size());
        assertEquals("Food", victim.getPersonalBelongings().get(0).getType());
        assertEquals(5, victim.getPersonalBelongings().get(0).getQuantity());
    }

    // Testing adding family connections
    @Test
    public void testAddFamilyConnection() {
        DisasterVictim person = new DisasterVictim("Ryder", "2024-06-23", 23);
        FamilyRelation relation = new FamilyRelation(person, "Sibling", victim);
        victim.addFamilyConnection(relation);

        assertEquals(1, victim.getFamilyConnections().size());
        assertEquals("Sibling", victim.getFamilyConnections().get(0).getRelationshipTo());
        assertEquals("Ryder", victim.getFamilyConnections().get(0).getPersonOne().getFirstName());
        assertEquals("Angelina", victim.getFamilyConnections().get(0).getPersonTwo().getFirstName());
    }
    
    // Testing removing family connections
    @Test
    public void testRemoveFamilyConnection() {
        FamilyRelation relation = new FamilyRelation(victim, "Sibling", new DisasterVictim("Alice", "2024-03-12", 25));
        victim.addFamilyConnection(relation);
        victim.removeFamilyConnection(relation);
        assertEquals(0, victim.getFamilyConnections().size());
    }


    // Testing adding medical records
    @Test
    public void testAddMedicalRecord() {
        Location location = new Location("Angelina", "Canada");
        MedicalRecord record = new MedicalRecord(location, "Broken arm", "2024-06-23");
        victim.addMedicalRecord(record);
        assertEquals(1, victim.getMedicalRecords().length);
        assertEquals("Broken arm", victim.getMedicalRecords()[0].getTreatmentDetails());
        assertEquals("2024-06-23", victim.getMedicalRecords()[0].getDateOfTreatment());
    }


    // Testing set and get supply
    @Test
    public void testSetAndGetSupply() {
        victim.setSupply("Water");
        assertEquals("Water", victim.getSupply());
    }

    // Testing set and get age
    @Test
    public void testSetAndGetAge() {
        victim.setAge(32);
        assertEquals("32", victim.getAge());
    }

    // Testing set and get date of birth
    @Test
    public void testSetAndGetDateOfBirth() {
        victim.setDateOfBirth("1996-02-01");
        assertEquals("1996-02-01", victim.getDateOfBirth());
    }

    // Testing set and get first name
    @Test
    public void testSetAndGetFirstName() {
        victim.setFirstName("Jack");
        assertEquals("Jack", victim.getFirstName());
    }

    // Testing set and get last name
    @Test
    public void testSetAndGetLastName() {
        victim.setLastName("Krauss");
        assertEquals("Krauss", victim.getLastName());
    }

    // Testing diet restriction
    @Test
    public void testDietRestriction() {
        victim.dietRestriction(DisasterVictim.Diet.AVML);
    }

    // Testing decreasing supply quantity
    @Test
    public void testDecreaseSupplyQuantity() {
        ArrayList<Supply> supplies = new ArrayList<>();
        supplies.add(new Supply("Water", 10));
        victim.setPersonalBelongings(supplies);

        Supply waterSupply = new Supply("Water", 5);
        victim.decreaseSupplyQuantity(waterSupply);

        assertEquals(5, victim.getPersonalBelongings().get(0).getQuantity());
    }

    // Testing setting entry date
    @Test
    public void testSetEntryDate() {
        String newEntryDate = "2024-06-28";
        victim.setEntryDate(newEntryDate);
        assertEquals(newEntryDate, victim.getEntryDate());
    }
}
