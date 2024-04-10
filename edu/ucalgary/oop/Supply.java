package edu.ucalgary.oop;

public class Supply {
    // Fields
    private String type;
    private int quantity;

    // Constructor
    public Supply(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    // Getter and Setter for type
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    // Getter and Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    // Method to increase quantity by 1
    public void increaseQuantity() {
        this.quantity++;
    }

    // Method to decrease quantity by 1, if quantity > 0
    public void decreaseQuantity() {
        if (this.quantity > 0) {
            this.quantity--;
        }
    }
}
