package edu.ucalgary.oop;

import java.util.Scanner;

public class Main {
    // Scanner object for user input
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Display the main menu options
        displayMainMenu();
        // Get user's choice from the main menu
        int choice = getUserChoice();

        // Process user's choice
        switch (choice) {
            case 1:
                // Start Disaster Victim Information System
                startDisasterVictimSystem();
                break;
            case 2:
                // Start Inquiry Management System
                startInquiryManagementSystem();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
        }
    }

    // Display the main menu options
    private static void displayMainMenu() {
        System.out.println("Welcome to the Main Menu");
        System.out.println("Choose the system you want to access:");
        System.out.println("1. Disaster Victim Information System");
        System.out.println("2. Inquiry Management System");
    }

    // Get user's choice from the main menu
    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    // Start the Disaster Victim Information System
    private static void startDisasterVictimSystem() {
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter victim's first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter victim's date of birth (YYYY-MM-DD): ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Enter victim's age: ");
        int age = scanner.nextInt();

        // Create an instance of DisasterVictimInfoInterface and start the system
        DisasterVictimInfoInterface disasterVictimSystem = new DisasterVictim(firstName, dateOfBirth, age);
        disasterVictimSystem.start();
    }

    // Start the Inquiry Management System
    private static void startInquiryManagementSystem() {
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your services phone number: ");
        String servicesPhoneNum = scanner.nextLine();
        System.out.print("Enter additional info: ");
        String info = scanner.nextLine();

        // Create an instance of InquirerQuerySearchInterface and start the system
        InquirerQuerySearchInterface inquirerSystem = new Inquirer(firstName, lastName, servicesPhoneNum, info);
        inquirerSystem.start();
    }
}
