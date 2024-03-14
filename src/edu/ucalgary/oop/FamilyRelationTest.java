package edu.ucalgary.oop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FamilyRelationTest {

    private DisasterVictim personOne;
    private DisasterVictim personTwo;
    private String relationshipTo;
    private FamilyRelation testFamilyRelationObject;
    

    @Before
    public void setup() {
        personOne = new DisasterVictim("Louis Kane", "2024-01-20", 25);
        personTwo = new DisasterVictim("Angelina Kane", "2024-02-18", 30);
        relationshipTo = "sibling";
        testFamilyRelationObject = new FamilyRelation(personOne, relationshipTo, personTwo);
    }


    @Test
    public void testObjectCreation() {
        assertNotNull(testFamilyRelationObject);
    }
	
    @Test
    public void testSetAndGetPersonOne() {
        DisasterVictim newPersonOne = new DisasterVictim("New Person", "2024-05-23", 30); //arrange
        testFamilyRelationObject.setPersonOne(newPersonOne); //act
        assertEquals("expected to update personOne", newPersonOne, testFamilyRelationObject.getPersonOne());//assert
    }

    @Test
    public void testSetAndGetPersonTwo() {
        DisasterVictim newPersonTwo = new DisasterVictim("Another Person", "2024-05-23", 28); //arrange
        testFamilyRelationObject.setPersonTwo(newPersonTwo); //act
        assertEquals("expected to update personTwo", newPersonTwo, testFamilyRelationObject.getPersonTwo()); //assert
    }

    @Test
    public void testSetAndGetRelationshipTo() { 
        String newRelationship = "parent"; //arrange
        testFamilyRelationObject.setRelationshipTo(newRelationship); //act
        assertEquals("expected to update the relationship", newRelationship, testFamilyRelationObject.getRelationshipTo()); //assert
    }

    @Test
    public void testDuplicationCheck() {
        DisasterVictim personThree = new DisasterVictim("Angelina Kane", "202-02-18", 23); // Same as personTwo , arrange
        
        //act and assert:
        assertTrue("should return true if both persons are the same", 
                    testFamilyRelationObject.duplicationCheck(personOne, personTwo));
        assertFalse("should return false if persons are different", 
                    testFamilyRelationObject.duplicationCheck(personOne, personThree));
    }
}


