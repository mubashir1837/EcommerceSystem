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
