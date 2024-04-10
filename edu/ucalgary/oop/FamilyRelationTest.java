package edu.ucalgary.oop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FamilyRelationTest {

    private DisasterVictim personOne;
    private DisasterVictim personTwo;
    private String relationshipTo;
    private FamilyRelation testFamilyRelationObject;
 
    @Before
    public void setup() {
        // Arrange
        personOne = new DisasterVictim("Angelina", "2024-06-23", 33);
        personTwo = new DisasterVictim("Katy", "2024-03-12", 28);
        relationshipTo = "Sibling";
        testFamilyRelationObject = new FamilyRelation(personOne, relationshipTo, personTwo);
    }
 
    @Test
    public void testObjectCreation() {
        // Act & Assert
        assertNotNull("FamilyRelation object should not be null", testFamilyRelationObject);
    }
   
    @Test
    public void testSetAndGetPersonOne() {
        // Arrange
        DisasterVictim newPersonOne = new DisasterVictim("New Person", "2024-03-21", 35);
        
        // Act
        testFamilyRelationObject.setPersonOne(newPersonOne);
        
        // Assert
        assertEquals("setPersonOne is expected to update personOne", newPersonOne, testFamilyRelationObject.getPersonOne());
    }
 
    @Test
    public void testSetAndGetPersonTwo() {
        // Arrange
        DisasterVictim newPersonTwo = new DisasterVictim("Another Person", "2024-04-22", 42);
        
        // Act
        testFamilyRelationObject.setPersonTwo(newPersonTwo);
        
        // Assert
        assertEquals("setPersonTwo is expected to update personTwo", newPersonTwo, testFamilyRelationObject.getPersonTwo());
    }
 
    @Test
    public void testSetAndGetRelationshipTo() {
        // Arrange
        String newRelationship = "Parent";
        
        // Act
        testFamilyRelationObject.setRelationshipTo(newRelationship);
        
        // Assert
        assertEquals("setRelationshipTo is expected to update relationship", newRelationship, testFamilyRelationObject.getRelationshipTo());
    }
 
    @Test
    public void testDuplicationCheck() {
        // Arrange
        DisasterVictim personThree = new DisasterVictim("Katy", "2024-03-12", 28); // Same as personTwo
        
        // Act & Assert
        assertTrue("testDuplicationCheck should return true if both persons are the same", testFamilyRelationObject.duplicationCheck(personOne, personTwo));
        assertFalse("testDuplicationCheck should return false if both persons are different", testFamilyRelationObject.duplicationCheck(personOne, personThree));
    }

    @Test
    public void testDeleteRelationship() {
        // Act
        testFamilyRelationObject.deleteRelationship();
        
        // Assert
        assertNull("PersonOne should be null", testFamilyRelationObject.getPersonOne());
        assertNull("PersonTwo should be null", testFamilyRelationObject.getPersonTwo());
        assertNull("RelationshipTo should be null", testFamilyRelationObject.getRelationshipTo());
    }

    @Test
    public void testCheckExistingRelationship() {
        // Act & Assert
        assertTrue("checkExistingRelationship should return true", testFamilyRelationObject.checkExistingRelationship());
    }

    @Test
    public void testTransitiveRelation() {
        // Arrange
        DisasterVictim personThree = new DisasterVictim("Jack", "2024-03-21", 35);
        String relationshipAB = "Parent";
        String relationshipBC = "Child";
        FamilyRelation relationAB = new FamilyRelation(personOne, relationshipAB, personTwo);
        FamilyRelation relationBC = new FamilyRelation(personTwo, relationshipBC, personThree);
        
        // Act
        boolean isRelatedAC = relationAB.checkExistingRelationship() && relationBC.checkExistingRelationship();
        
        // Assert
        assertTrue("A and B are related, and B and C are related, hence A and C should also be related", isRelatedAC);
    }
}

