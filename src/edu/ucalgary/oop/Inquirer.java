package edu.ucalgary.oop;

public class Inquirer extends Person{
    private String info;
    private String servicePhoneNumber;

    // Constructor
    public Inquirer(String firstName, String lastName, String servicesPhoneNum, String info) {
        super(firstName, lastName);
        this.servicePhoneNumber = servicePhoneNumber;
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public String getServicePhoneNumbeString() {
        return servicePhoneNumber;
    }

}
