package edu.ucalgary.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FamilyRelationTest {

    @Test
    void testConstructorWithValidArguments() {
        DisasterVictim victim1 = new DisasterVictim("John", "Doe", "2022-01-01", 30);
        DisasterVictim victim2 = new DisasterVictim("Jane", "Doe", "2023-01-01", 25);
        FamilyRelation relation = new FamilyRelation(victim1, "Spouse", victim2);
        assertEquals(victim1, relation.getPersonOne());
        assertEquals("Spouse", relation.getRelationshipTo());
        assertEquals(victim2, relation.getPersonTwo());
    }

    // Add more test cases for other methods if needed
}
