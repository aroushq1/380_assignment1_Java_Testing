package edu.ucalgary.oop;

public class Supply {
    private int quantity;
    private String type;

    public Supply(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    // Method to increase quantity
    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    // Method to decrease quantity
    public void decreaseQuantity(int amount) {
        if (this.quantity >= amount) {
            this.quantity -= amount;
        } else {
            System.out.println("Error: Not enough quantity available.");
        }
    }
}
