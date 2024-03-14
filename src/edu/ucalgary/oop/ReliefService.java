package edu.ucalgary.oop;

public class ReliefService {
    private Location lastKnownLocation;
    private String informationProvided;
    private String inquiryDate;
    private DisasterVictim missingPerson;
    private Inquirer inquirer;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String inquiryDate,
            String informationProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.inquiryDate = inquiryDate;
        this.informationProvided = informationProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    // Getters and setters
    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public DisasterVictim getMissingIndividual() {
        return missingPerson;
    }

    public void setMissingIndividual(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public String getInquiryDate() {
        return inquiryDate;
    }

    public void setInquiryDate(String inquiryDate) {
        this.inquiryDate = inquiryDate;
    }

    public String getInformationProvided() {
        return informationProvided;
    }

    public void setInformationProvided(String informationProvided) {
        this.informationProvided = informationProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    // Method to get information log details
    public String getInformationLogDetails() {
        // You need to define how the information log is retrieved or formatted
        return "Information log details"; // Placeholder
    }
}
