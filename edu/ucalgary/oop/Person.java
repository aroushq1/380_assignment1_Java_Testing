package edu.ucalgary.oop;

public class Person {
    // Private fields to store first name and last name
    private String firstName;
    private String lastName;

    // Constructor to initialize a Person object with first name and last name
    Person(String firstName, String lastName) {
        this.firstName = firstName; // Initialize first name
        this.lastName = lastName;   // Initialize last name
    }

    // Getter method to retrieve the first name
    String getFirstName() {
        return this.firstName; // Return the first name
    }

    // Getter method to retrieve the last name
    String getLastName() {
        return this.lastName; // Return the last name
    }

    // Setter method to set the first name
    void setFirstName(String firstName) {
        this.firstName = firstName; // Set the first name
    }

    // Setter method to set the last name
    void setLastName(String lastName) {
        this.lastName = lastName; // Set the last name
    }
}
