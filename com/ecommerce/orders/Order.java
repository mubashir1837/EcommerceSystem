package com.ecommerce.orders;

import com.ecommerce.Product;
import com.ecommerce.Customer;
import java.util.ArrayList;

/**
 * Represents an order placed by a customer in the e-commerce system.
 * @author Mubashir Ali
 */
public class Order {

    private int orderID;
    private Customer customer;
    private ArrayList<Product> products;
    private double total;
    private String status;

    /**
     * Constructor to create an order from a customer's current cart.
     * @param orderID  Unique order identifier
     * @param customer The customer placing the order
     * @throws IllegalArgumentException if customer is null or cart is empty
     */
    public Order(int orderID, Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null.");
        }
        if (customer.getCart().isEmpty()) {
            throw new IllegalArgumentException("Cannot place an order with an empty cart.");
        }
        this.orderID  = orderID;
        this.customer = customer;
        this.products = new ArrayList<>(customer.getCart()); // snapshot of cart
        this.total    = customer.calculateTotal();
        this.status   = "Pending";
    }

    // Getters
    public int    getOrderID() { return orderID; }
    public String getStatus()  { return status; }

    /**
     * Updates the current status of the order.
     * @param newStatus New status string (e.g., "Shipped", "Delivered")
     */
    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Order " + orderID + " status updated to: " + newStatus);
    }

    /**
     * Displays a complete summary of the order to the console.
     */
    public void displayOrder() {
        System.out.println("\n========== ORDER SUMMARY ==========");
        System.out.println("Order ID  : " + orderID);
        System.out.println("Customer  : " + customer.getName());
        System.out.println("Status    : " + status);
        System.out.println("Products Ordered:");
        for (Product p : products) {
            p.displayProduct();
        }
        System.out.printf("Order Total: $%.2f%n", total);
        System.out.println("===================================");
    }
}
