package edu.ucalgary.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisasterVictim extends Person implements DisasterVictimInfoInterface {
    // Instance variables
    private ArrayList<MedicalRecord> medicalRecords;
    private ArrayList<FamilyRelation> familyConnections;
    private String ENTRY_DATE;
    private ArrayList<Supply> personalBelongings;
    private String supply;
    private String gender;
    private ArrayList<DisasterVictim> victims;
    private String dateOfBirth;
    private int age;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;

    // Scanner object for user input
    private static final Scanner SCANNER = new Scanner(System.in);

    // Enum for diet types
    public enum Diet {
        AVML, DBML, GFML, KSML, LSML, MOML, PFML, VGML, VJML
    }

    // Constructors
    // Constructor with age parameter
    public DisasterVictim(String firstName, String ENTRY_DATE, int age) {
        super(firstName, "");
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be a negative value.");
        }
        this.age = age;
        this.ENTRY_DATE = ENTRY_DATE;
        this.medicalRecords = new ArrayList<>();
        this.familyConnections = new ArrayList<>();
        this.personalBelongings = new ArrayList<>();
        this.victims = new ArrayList<>();
    }

    // Constructor with date of birth parameter
    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) {
        super(firstName, "");
        this.dateOfBirth = dateOfBirth;
        this.ENTRY_DATE = ENTRY_DATE;
        this.medicalRecords = new ArrayList<>();
        this.familyConnections = new ArrayList<>();
        this.personalBelongings = new ArrayList<>();
        this.victims = new ArrayList<>();
    }

    // Getters and setters
    // Getter for date of birth
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    // Getter for comments
    public String getComments() {
        return comments;
    }

    // Getter for medical records
    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords.toArray(new MedicalRecord[0]);
    }

    // Getter for entry date
    public String getEntryDate() {
        return ENTRY_DATE;
    }

    // Getter for assigned social ID
    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }

    // Getter for personal belongings
    public ArrayList<Supply> getPersonalBelongings() {
        return personalBelongings;
    }

    // Getter for family connections
    public ArrayList<FamilyRelation> getFamilyConnections() {
        return familyConnections;
    }

    // Getter for supply
    public String getSupply() {
        return supply;
    }

    // Getter for age
    public String getAge() {
        return Integer.toString(age);
    }

    // Getter for gender
    public String getGender() {
        return gender;
    }

    // Setter for age
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    // Setter for entry date
    public void setEntryDate(String entryDate) {
        this.ENTRY_DATE = entryDate;
    }

    // Setter for date of birth
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Setter for comments
    public void setComments(String comments) {
        this.comments = comments;
    }

    // Setter for medical records
    public void setMedicalRecords(ArrayList<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    // Setter for personal belongings
    public void setPersonalBelongings(ArrayList<Supply> personalBelongings) {
        this.personalBelongings = personalBelongings;
    }

    // Setter for family connections
    public void setFamilyConnections(ArrayList<FamilyRelation> familyConnections) {
        this.familyConnections = familyConnections;
    }

    // Setter for supply
    public void setSupply(String supply) {
        this.supply = supply;
    }

    // Setter for gender
    public void setGender(String gender) {
        try {
            boolean valid = false;
            File genderFile = new File("GenderOptions.txt");
            Scanner genderVerifier = new Scanner(genderFile);
            while (genderVerifier.hasNextLine()) {
                if (gender.toLowerCase().equals(genderVerifier.nextLine().replaceAll("[\r\n]", ""))) {
                    valid = true;
                    break; // Exit loop once valid gender found
                }
            }
            genderVerifier.close();

            if (!valid) {
                throw new IllegalArgumentException("Invalid gender. Acceptable values are male, female, or other.");
            }
            this.gender = gender.toLowerCase();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Other methods
    // Method to remove personal belonging
    public void removePersonalBelonging(Supply supply) {
        personalBelongings.remove(supply);
    }

    // Method to add personal belonging
    public void addPersonalBelonging(Supply supply) {
        personalBelongings.add(supply);
    }

    // Method to add family connection
    public void addFamilyConnection(FamilyRelation familyConnection) {
        familyConnections.add(familyConnection);
    }

    // Method to remove family connection
    public void removeFamilyConnection(FamilyRelation familyConnection) {
        familyConnections.remove(familyConnection);
    }

    // Method to add medical record
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
    }

    // Method to decrease supply quantity
    public void decreaseSupplyQuantity(Supply supply) {
        for (Supply originalSupply : personalBelongings) {
            if (originalSupply.getType().equals(supply.getType())) {
                int remainingQuantity = originalSupply.getQuantity() - supply.getQuantity();
                originalSupply.setQuantity(Math.max(remainingQuantity, 0));
                break;
            }
        }
    }

    // Method to apply diet restriction
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
                // Handle unexpected diet restriction
                System.out.println("Unknown diet restriction");
                break;
        }
    }
    // Overridden methods from interfaces
    // Method to start the Disaster Victim Information System
    @Override
    public void start() {
        System.out.println("Welcome to the Disaster Victim Information System");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enter a new Disaster Victim");
            System.out.println("2. View all entered Disaster Victims");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();

            switch (choice) {
                case 1:
                    enterNewDisasterVictim();
                    break;
                case 2:
                    viewAllDisasterVictims();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    closeScanner();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    // Method to get victims
    @Override
    public List<DisasterVictim> getVictims() {
        List<DisasterVictim> victims = new ArrayList<>();
        for (Supply supply : personalBelongings) {
            DisasterVictim victim = new DisasterVictim(supply.getType(), "2024-01-01", 0); // Assuming entry date and age, adjust as needed
            // Set other properties of the victim as needed
            victims.add(victim);
        }
        return victims;
    }

    // Method to add a victim
    @Override
    public void addVictim(DisasterVictim victim) {
        victims.add(victim);
    }

    // Method to close the scanner
    @Override
    public void closeScanner() {
        SCANNER.close();
    }

    // Method to enter a new disaster victim
    @Override
    public void enterNewDisasterVictim() {
        System.out.println("\nEnter relevant details for the new Disaster Victim:");

        System.out.print("First Name: ");
        String firstName = SCANNER.nextLine();

        System.out.print("Entry Date (YYYY-MM-DD): ");
        String entryDate = SCANNER.nextLine();

        DisasterVictim victim;

        System.out.print("Would you like to enter Date of Birth (Y/N): ");
        String choice = SCANNER.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            System.out.print("Date of Birth (YYYY-MM-DD): ");
            String dateOfBirth = SCANNER.nextLine();
            victim = new DisasterVictim(firstName, entryDate, dateOfBirth);
        } else {
            victim = new DisasterVictim(firstName, entryDate, 0);
        }

        System.out.print("Last Name: ");
        victim.setLastName(SCANNER.nextLine());

        System.out.print("Gender: ");
        victim.setGender(SCANNER.nextLine());

        System.out.print("Comments: ");
        victim.setComments(SCANNER.nextLine());

        addVictim(victim);
        System.out.println("Disaster Victim information has been entered successfully!");
    }
}

   
