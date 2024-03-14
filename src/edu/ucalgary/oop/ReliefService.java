package edu.ucalgary.oop;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String inquiryDate;
    private String informationProvided;
    private Location lastKnownLocation;

    // Constructor
    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        setInquiryDate(inquiryDate);
        this.informationProvided = informationProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    // Getter and setter for inquirer
    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    // Getter and setter for missingPerson
    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    // Getter and setter for dateOfInquiry
    public String getInquiryDate() {
        return inquiryDate;
    }

    public void setInquiryDate(String inquiryDate) {
        // Check if the dateOfInquiry string matches the expected date format
        if (!isValidDateFormat(inquiryDate)) {
            throw new IllegalArgumentException("Invalid date format for date of inquiry. Expected format: YYYY-MM-DD");
        }
        this.inquiryDate = inquiryDate;
    }

    // Getter and setter for infoProvided
    public String getInformationProvided() {
        return informationProvided;
    }

    public void setInformatiomProvided(String informationProvided) {
        this.informationProvided = informationProvided;
    }

    // Getter and setter for lastKnownLocation
    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    // Helper method to check if a string matches the YYYY-MM-DD date format
    private boolean isValidDateFormat(String date) {
        try {
            LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public String getLogDetails() {
       return "Inquirer: " + inquirer.getFirstName() + 
           ", Missing Person: " + missingPerson.getFirstName() + 
           ", Date of Inquiry: " + inquiryDate + 
           ", Info Provided: " + informationProvided + 
           ", Last Known Location: " + lastKnownLocation.getName();
    }
}
