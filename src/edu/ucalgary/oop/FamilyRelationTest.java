package edu.ucalgary.oop;

import org.junit.Test;
import static org.junit.Assert.*;

public class FamilyRelationTest {

    private DisasterVictim personOne;
    private DisasterVictim personTwo;
    private String relationshipTo;
    private FamilyRelation testFamilyRelationObject;
    

    @Before
    public void setup() {
        personOne = new DisasterVictim("John Dalan", "2024-01-19");
        personTwo = new DisasterVictim("Jane Dalan", "2024-02-20");
        relationshipTo = "sibling";
        testFamilyRelationObject = new FamilyRelation(personOne, relationshipTo, personTwo);
    }


    @Test
    public void testObjectCreation() {
        assertNotNull(testFamilyRelationObject);
    }
	
    @Test
    public void testSetAndGetPersonOne() {
        DisasterVictim newPersonOne = new DisasterVictim("New Person", "2024-03-21"); //arrange
        testFamilyRelationObject.setPersonOne(newPersonOne); //act
        assertEquals("setPersonOne should update personOne", newPersonOne, testFamilyRelationObject.getPersonOne());//assert
    }

    @Test
    public void testSetAndGetPersonTwo() {
        DisasterVictim newPersonTwo = new DisasterVictim("Another Person", "2024-04-22"); //arrange
        testFamilyRelationObject.setPersonTwo(newPersonTwo); //act
        assertEquals("setPersonTwo should update personTwo", newPersonTwo, testFamilyRelationObject.getPersonTwo()); //assert
    }

    @Test
    public void testSetAndGetRelationshipTo() { 
        String newRelationship = "parent"; //arrange
        testFamilyRelationObject.setRelationshipTo(newRelationship); //act
        assertEquals("setRelationshipTo should update the relationship", newRelationship, testFamilyRelationObject.getRelationshipTo()); //assert
    }

    @Test
    public void testDuplicationCheck() {
        DisasterVictim personThree = new DisasterVictim("Jane Dalan", "2024-02-20"); // Same as personTwo , arrange
        
        //act and assert:
        assertTrue(" expected to return true if both persons are the same", 
                    testFamilyRelationObject.duplicationCheck(personOne, personTwo));
        assertFalse("expected to return false if persons are different", 
                    testFamilyRelationObject.duplicationCheck(personOne, personThree));
    }
}


