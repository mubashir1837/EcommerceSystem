import com.ecommerce.Product;
import com.ecommerce.Customer;
import com.ecommerce.orders.Order;

/**
 * Main program demonstrating the e-commerce system.
 * Shows how to use Java packages and import statements.
 * @author Mubashir Ali
 */
public class Main {

    public static void main(String[] args) {

        // ============================================================
        // Step 1: Create and display available products
        // ============================================================
        System.out.println("========== AVAILABLE PRODUCTS ==========");
        Product p1 = new Product(101, "Laptop",      1200.00);
        Product p2 = new Product(102, "Smartphone",   800.00);
        Product p3 = new Product(103, "Headphones",   150.00);

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
        System.out.println("========================================");

        // ============================================================
        // Step 2: Create a customer
        // ============================================================
        Customer customer = new Customer(1001, "Mubashir Ali");

        // ============================================================
        // Step 3: Add products to the shopping cart
        // ============================================================
        System.out.println("\n--- Adding Items to Cart ---");
        customer.addToCart(p1);
        customer.addToCart(p3);

        // ============================================================
        // Step 4: Display the cart
        // ============================================================
        customer.displayCart();

        // ============================================================
        // Step 5: Remove an item from the cart
        // ============================================================
        System.out.println("\n--- Removing Headphones from Cart ---");
        customer.removeFromCart(p3);
        customer.displayCart();

        // ============================================================
        // Step 6: Place an order with exception handling
        // ============================================================
        try {
            Order order = new Order(5001, customer);
            order.displayOrder();
            order.updateStatus("Shipped");
        } catch (IllegalArgumentException e) {
            System.out.println("Order Error: " + e.getMessage());
        }
    }
}
