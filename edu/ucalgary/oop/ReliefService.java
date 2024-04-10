package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReliefService {
    // Fields
    private Location lastKnownLocation;
    private Inquirer inquirer;
    private DisasterVictim missingIndividual;
    private String inquiryDate;
    private String informationProvided;

    // Constructor
    public ReliefService(Inquirer inquirer, DisasterVictim missingIndividual, String inquiryDate, String informationProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingIndividual = missingIndividual;
        setInquiryDate(inquiryDate);
        this.informationProvided = informationProvided;
        this.lastKnownLocation = lastKnownLocation;
    } 

    // Getters and Setters for Inquirer
    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    // Getters and Setters for Missing Individual
    public DisasterVictim getMissingIndividual() {
        return missingIndividual;
    }

    public void setMissingIndividual(DisasterVictim missingIndividual) {
        this.missingIndividual = missingIndividual;
    }

    // Getter and Setter for Inquiry Date
    public String getInquiryDate() {
        return inquiryDate;
    }

    public void setInquiryDate(String inquiryDate) {
        // Validate date format
        if (!isValidDateFormat(inquiryDate)) {
            throw new IllegalArgumentException("Invalid date format for inquiry date. Expected format: YYYY-MM-DD");
        }
        this.inquiryDate = inquiryDate;
    }

    // Getter and Setter for Information Provided
    public String getInformationProvided() {
        return informationProvided;
    }

    public void setInformationProvided(String informationProvided) {
        this.informationProvided = informationProvided;
    }

    // Getter and Setter for Last Known Location
    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    // Method to check if the date has a valid format
    private boolean isValidDateFormat(String date) {
        try {
            LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Method to get log details
    public String getLogDetails() {
        return "Inquirer: " + inquirer.getFirstName() + 
           ", Missing Person: " + missingIndividual.getFirstName() + 
           ", Date of Inquiry: " + inquiryDate + 
           ", Info Provided: " + informationProvided + 
           ", Last Known Location: " + lastKnownLocation.getName();
    }
}
