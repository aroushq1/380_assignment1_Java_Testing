package edu.ucalgary.oop;

import java.util.List;
import java.util.Scanner;

public interface DisasterVictimInfoInterface {
    // Scanner object for user input
    Scanner SCANNER = new Scanner(System.in);

    // Method to start the Disaster Victim Information System
    void start();

    // Method to enter details for a new disaster victim
    default void enterNewDisasterVictim() {
        // Prompting user to enter details
        System.out.println("\nEnter details for the new Disaster Victim:");

        // Getting first name
        System.out.print("First Name: ");
        String firstName = SCANNER.nextLine();

        // Getting entry date
        System.out.print("Entry Date (YYYY-MM-DD): ");
        String entryDate = SCANNER.nextLine();

        DisasterVictim victim;

        // Asking user whether to enter date of birth
        System.out.print("Would you like to enter the Date of Birth (Y/N): ");
        String choice = SCANNER.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            // Getting date of birth if chosen
            System.out.print("Date of Birth (YYYY-MM-DD): ");
            String dateOfBirth = SCANNER.nextLine();
            victim = new DisasterVictim(firstName, entryDate, dateOfBirth);
        } else {
            // Creating victim without date of birth
            victim = new DisasterVictim(firstName, entryDate, "N/A");
        }

        // Getting last name
        System.out.print("Last Name: ");
        victim.setLastName(SCANNER.nextLine());

        // Getting gender
        System.out.print("Gender: ");
        victim.setGender(SCANNER.nextLine());

        // Getting comments
        System.out.print("Comments: ");
        victim.setComments(SCANNER.nextLine());

        // Adding victim
        addVictim(victim);
        System.out.println("Disaster Victim information has been entered successfully!");
    }

    // Method to view all entered disaster victims
    default void viewAllDisasterVictims() {
        // Checking if there are any victims entered
        if (getVictims().isEmpty()) {
            System.out.println("No Disaster Victims have been entered yet.");
            return;
        }

        // Displaying details of all victims
        System.out.println("\nAll Entered Disaster Victims:");
        for (int i = 0; i < getVictims().size(); i++) {
            System.out.println("Victim #" + (i + 1) + ":");
            displayVictimDetails(getVictims().get(i));
        }
    }

    // Method to display details of a disaster victim
    default void displayVictimDetails(DisasterVictim victim) {
        System.out.println("First Name: " + victim.getFirstName());
        System.out.println("Last Name: " + victim.getLastName());
        System.out.println("Date of Birth: " + victim.getDateOfBirth());
        System.out.println("Gender: " + victim.getGender());
        System.out.println("Entry Date: " + victim.getEntryDate());
        System.out.println("Comments: " + victim.getComments());
    }

    // Method to get a list of all disaster victims
    List<DisasterVictim> getVictims();

    // Method to add a disaster victim
    void addVictim(DisasterVictim victim);

    // Method to close the scanner
    void closeScanner();
}
