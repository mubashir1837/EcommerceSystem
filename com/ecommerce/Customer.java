package com.ecommerce;

import java.util.ArrayList;

/**
 * Represents a customer with a shopping cart in the e-commerce system.
 * @author Mubashir Ali
 */
public class Customer {

    private int customerID;
    private String name;
    private ArrayList<Product> cart;

    /**
     * Constructor to initialize a customer.
     * @param customerID Unique customer identifier
     * @param name       Full name of the customer
     */
    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name       = name;
        this.cart       = new ArrayList<>();
    }

    // Getters
    public int               getCustomerID() { return customerID; }
    public String            getName()        { return name; }
    public ArrayList<Product> getCart()       { return cart; }

    /**
     * Adds a product to the shopping cart.
     * @param product The product to add
     * @throws IllegalArgumentException if product is null
     */
    public void addToCart(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null.");
        }
        cart.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    /**
     * Removes a product from the shopping cart.
     * @param product The product to remove
     */
    public void removeFromCart(Product product) {
        if (cart.remove(product)) {
            System.out.println(product.getName() + " removed from cart.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    /**
     * Calculates the total cost of all items in the cart.
     * @return Total price as a double
     */
    public double calculateTotal() {
        double total = 0;
        for (Product p : cart) {
            total += p.getPrice();
        }
        return total;
    }

    /**
     * Displays all items in the shopping cart with the total cost.
     */
    public void displayCart() {
        System.out.println("\n--- Cart for " + name + " ---");
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (Product p : cart) {
                p.displayProduct();
            }
            System.out.printf("Total: $%.2f%n", calculateTotal());
        }
    }
}
