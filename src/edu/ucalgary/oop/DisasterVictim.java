package edu.ucalgary.oop;

import java.util.ArrayList;

public class DisasterVictim extends Person {
    private String dateOfBirth;
    private int age;
    private String comments;
    private int assignedSocialID;
    private ArrayList<MedicalRecord> medicalRecords;
    private ArrayList<FamilyRelation> familyConnections;
    private String entryDate;
    private ArrayList<Supply> personalBelongings;
    private int counter;
    private String supply;

    public enum Diet {
        AVML, DBML, GFML, KSML, LSML, MOML, PFML, VGML, VJML
    }

    public DisasterVictim(String firstName, String entryDate, int age) {
        super(firstName, "");
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
        this.entryDate = entryDate;
        this.medicalRecords = new ArrayList<>();
        this.familyConnections = new ArrayList<>();
        this.personalBelongings = new ArrayList<>();
    }

    public DisasterVictim(String firstName, String entryDate, String dateOfBirth) {
        super(firstName, "");
        this.dateOfBirth = dateOfBirth;
        this.entryDate = entryDate;
        this.medicalRecords = new ArrayList<>();
        this.familyConnections = new ArrayList<>();
        this.personalBelongings = new ArrayList<>();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getAssignedSocialID() {
        return assignedSocialID;
    }

    public void setAssignedSocialID(int assignedSocialID) {
        this.assignedSocialID = assignedSocialID;
    }

    public ArrayList<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(ArrayList<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public ArrayList<FamilyRelation> getFamilyConnections() {
        return familyConnections;
    }

    public void setFamilyConnections(ArrayList<FamilyRelation> familyConnections) {
        this.familyConnections = familyConnections;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public ArrayList<Supply> getPersonalBelongings() {
        return personalBelongings;
    }

    public void setPersonalBelongings(ArrayList<Supply> personalBelongings) {
        this.personalBelongings = personalBelongings;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }


    
    public void dietRestriction(Diet victimDiet) {
        switch (victimDiet) {
            case AVML:
                System.out.println("Applying Asian vegetarian meal restriction");
                break;
            case DBML:
                System.out.println("Applying diabetic meal restriction");
                break;
            case GFML:
                System.out.println("Applying gluten intolerant meal restriction");
                break;
            case KSML:
                System.out.println("Applying kosher meal restriction");
                break;
            case LSML:
                System.out.println("Applying low salt meal restriction");
                break;
            case MOML:
                System.out.println("Applying Muslim meal restriction");
                break;
            case PFML:
                System.out.println("Applying peanut-free meal restriction");
                break;
            case VGML:
                System.out.println("Applying vegan meal restriction");
                break;
            case VJML:
                System.out.println("Applying vegetarian Jain meal restriction");
                break;
            default:
                System.out.println("Unknown diet restriction");
                break;
        }
    }
}