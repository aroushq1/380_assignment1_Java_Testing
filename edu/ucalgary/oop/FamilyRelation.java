package edu.ucalgary.oop;

public class FamilyRelation {

    private DisasterVictim personOne; // First person in the relationship
    private DisasterVictim personTwo; // Second person in the relationship
    private String relationshipTo; // Relationship between the two persons

    /**
     * Constructs a FamilyRelation object with the specified persons and relationship.
     * @param personOne The first person in the relationship.
     * @param relationshipTo The relationship between the two persons.
     * @param personTwo The second person in the relationship.
     */
    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) {
        this.personOne = personOne;
        this.relationshipTo = relationshipTo;
        this.personTwo = personTwo;
    }

    /**
     * Gets the first person in the relationship.
     * @return The first person in the relationship.
     */
    public DisasterVictim getPersonOne() {
        return personOne;
    }

    /**
     * Sets the first person in the relationship.
     * @param personOne The first person in the relationship.
     */
    public void setPersonOne(DisasterVictim personOne) {
        this.personOne = personOne;
    }

    /**
     * Gets the second person in the relationship.
     * @return The second person in the relationship.
     */
    public DisasterVictim getPersonTwo() {
        return personTwo;
    }

    /**
     * Sets the second person in the relationship.
     * @param personTwo The second person in the relationship.
     */
    public void setPersonTwo(DisasterVictim personTwo) {
        this.personTwo = personTwo;
    }

    /**
     * Gets the relationship between the two persons.
     * @return The relationship between the two persons.
     */
    public String getRelationshipTo() {
        return relationshipTo;
    }

    /**
     * Sets the relationship between the two persons.
     * @param relationshipTo The relationship between the two persons.
     */
    public void setRelationshipTo(String relationshipTo) {
        this.relationshipTo = relationshipTo;
    }

    /**
     * Checks if the specified persons already have an existing relationship.
     * @param personOne The first person.
     * @param personTwo The second person.
     * @return True if the relationship already exists, otherwise false.
     */
    public boolean duplicationCheck(DisasterVictim personOne, DisasterVictim personTwo) {
        return this.personOne.equals(personOne) && this.personTwo.equals(personTwo);
    }

    /**
     * Deletes the relationship by setting both persons and the relationship to null.
     */
    public void deleteRelationship() {
        this.personOne = null;
        this.personTwo = null;
        this.relationshipTo = null;
    }

    /**
     * Checks if there is an existing relationship between two persons.
     * @return True if there is an existing relationship, otherwise false.
     */
    public boolean checkExistingRelationship() {
        return personOne != null && personTwo != null && relationshipTo != null;
    }
    
}
