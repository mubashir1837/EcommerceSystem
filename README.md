# CS 1103 - Unit 2 Programming Assignment
## Simple E-Commerce System using Java Packages

**Author:** Mubashir Ali  
**Course:** CS 1103-01 Programming 2 — AY2026-T4  
**Instructor:** Gideon Mazambani  

---

## Project Structure

```
EcommerceSystem/
├── com/
│   └── ecommerce/
│       ├── Product.java         (com.ecommerce package)
│       ├── Customer.java        (com.ecommerce package)
│       └── orders/
│           └── Order.java       (com.ecommerce.orders package)
└── Main.java                    (default package — entry point)
```

---

## How to Compile and Run

### Option A: Command Line (Terminal)

1. Open a terminal and navigate to the `EcommerceSystem` folder:
   ```
   cd EcommerceSystem
   ```

2. Compile all files:
   ```
   javac com/ecommerce/Product.java
   javac com/ecommerce/Customer.java
   javac -cp . com/ecommerce/orders/Order.java
   javac -cp . Main.java
   ```

   Or compile everything at once:
   ```
   javac -cp . com/ecommerce/Product.java com/ecommerce/Customer.java com/ecommerce/orders/Order.java Main.java
   ```

3. Run the program:
   ```
   java -cp . Main
   ```

---

### Option B: Eclipse IDE

1. Open Eclipse and create a new Java Project named `EcommerceSystem`.
2. In the `src` folder, create the packages:
   - `com.ecommerce`
   - `com.ecommerce.orders`
3. Create the following classes in their respective packages:
   - `Product` in `com.ecommerce`
   - `Customer` in `com.ecommerce`
   - `Order` in `com.ecommerce.orders`
   - `Main` in the default package (src root)
4. Copy the source code from each `.java` file into the corresponding class.
5. Right-click `Main.java` → Run As → Java Application.

---

## Expected Output

```
========== AVAILABLE PRODUCTS ==========
[101] Laptop - $1200.0
[102] Smartphone - $800.0
[103] Headphones - $150.0
========================================

--- Adding Items to Cart ---
Laptop added to cart.
Headphones added to cart.

--- Cart for Mubashir Ali ---
[101] Laptop - $1200.0
[103] Headphones - $150.0
Total: $1350.00

--- Removing Headphones from Cart ---
Headphones removed from cart.

--- Cart for Mubashir Ali ---
[101] Laptop - $1200.0
Total: $1200.00

========== ORDER SUMMARY ==========
Order ID  : 5001
Customer  : Mubashir Ali
Status    : Pending
Products Ordered:
[101] Laptop - $1200.0
Order Total: $1200.00
===================================
Order 5001 status updated to: Shipped
```
