package edu.ucalgary.oop;

import java.sql.Connection;
import java.sql.SQLException;

// Interface defining methods for logging new inquiries and searching for inquirers
public interface InquirerQuerySearchInterface {
    
    // Method signature for logging a new inquiry
    boolean logNewInquiry(Connection connection, String firstName, String lastName, String phoneNumber, String details) throws SQLException;
    
    // Method signature for searching for an inquirer
    String searchForInquirer(Connection connection, String searchTerm) throws SQLException;
    
    // Method signature for starting the inquiry system
    void start();
}
