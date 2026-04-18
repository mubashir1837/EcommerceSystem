package com.ecommerce;

/**
 * Represents a product available for purchase in the e-commerce system.
 * @author Mubashir Ali
 */
public class Product {

    private int productID;
    private String name;
    private double price;

    /**
     * Constructor to initialize a product.
     * @param productID Unique product identifier
     * @param name      Name of the product
     * @param price     Price of the product (must not be negative)
     * @throws IllegalArgumentException if price is negative
     */
    public Product(int productID, String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.productID = productID;
        this.name      = name;
        this.price     = price;
    }

    // Getters
    public int    getProductID() { return productID; }
    public String getName()      { return name; }
    public double getPrice()     { return price; }

    /**
     * Displays formatted product information to the console.
     */
    public void displayProduct() {
        System.out.println("[" + productID + "] " + name + " - $" + price);
    }
}
