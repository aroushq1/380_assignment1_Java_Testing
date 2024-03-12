/*
Copyright Ann Barcomb and Khawla Shnaikat, 2024
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import org.junit.*;
import static org.junit.Assert.*;


public class InquirerTest {
    
/* 
Define the values which will be used for tests
*/
private String expectedFirstName = "Joseph";
private String expectedLastName = "Bouillon";
private String expectedPhoneNumber = "+1-123-456-7890";
private String expectedMessage = "looking for my family members";
private Inquirer inquirer = new Inquirer(expectedFirstName, expectedLastName, expectedPhoneNumber, expectedMessage);

/*
testObjectCreation -> means testing Inquirer constructor: 
   - What we need: To verify that an "Inquirer" object is successfully created.
   - Actual result: The name "Joseph Bouillon", the services phone number "+1-123-456-7890", and the provided info is "looking for my family members".
   - Expected Result: The test checks that the Inquirer object is not null, confirming successful object creation.
*/
    @Test
    public void testObjectCreation() {
        assertNotNull(inquirer);
    }

/*
testGetFirstName**: 
   - What we need: To ensure the "getFirstName()" method correctly returns the actual inquirer's first name.
   - Actual result: "Joseph".
   - Expected result: "inquirer.getFirstName()" should return "Joseph".
   */
    @Test
    public void testGetFirstName() {
        assertEquals("getFirstName() should return inquirer's first name", expectedFirstName, inquirer.getFirstName());
    }
	
/*
testGetLastName: 
   - What we need: To confirm that the "getLastName()" method accurately returns inquirer's last name.
   - Actual result:"Bouillon".
   - Expected result: "inquirer.getLastName()" should return "Bouillon".
*/
    @Test
    public void testGetLastName() {
        assertEquals("getLastName() should return inquirer's last name", expectedLastName, inquirer.getLastName());
    }
	
/*
testGetServicesPhoneNum**: 
   - What we need: To confirm that "getServicesPhoneNum()" method correctly returns the services phone number.
   - Actual result: "+1-123-456-7890".
   - Expected result: "inquirer.getServicesPhoneNum()" should return "+1-123-456-7890".
*/
    @Test
    public void testGetServicesPhoneNum() {

        assertEquals("getServicesPhoneNum() should return the correct Services Number",expectedPhoneNumber, inquirer.getServicesPhoneNum());
    }
	
/*
testGetInfo:
   - What we need: To confirm that "getInfo()" method retrieves the correct information string. 
   - Actual result: "looking for my family members".
   - Expected result: "inquirer.getInfo()" should return the string "looking for my family members".
*/
    @Test
    public void testGetInfo() {
        assertEquals("getInfo() should return the inquirer message", expectedMessage,inquirer.getInfo());
    }

}