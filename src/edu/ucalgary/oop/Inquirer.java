package edu.ucalgary.oop;

public class Inquirer {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String INFORMATION;
    private String SERVICE_PHONE;

    public Inquirer(String FIRST_NAME, String LAST_NAME, String SERVICE_PHONE, String INFO) {
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.SERVICE_PHONE = SERVICE_PHONE;
        this.INFORMATION = INFO;
    }

    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public String getInformation() {
        return INFORMATION;
    }

    public String getServicePhoneNumber() {
        return SERVICE_PHONE;
    }
}
