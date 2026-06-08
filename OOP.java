class User {
    private int id;
    private String name;
    private String email;

    // Constructor
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    // Display user info
    public void displayUserInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Customer extends User {
    private int starPoints;

    // Constructor
    public Customer(int id, String name, String email, int starPoints) {
        super(id, name, email); // Call parent class constructor
        this.starPoints = starPoints;
    }

    // Getter and Setter for starPoints
    public int getStarPoints() { return starPoints; }
    public void setStarPoints(int starPoints) { this.starPoints = starPoints; }

    // Overriding the display method to include star points
    @Override
    public void displayUserInfo() {
        super.displayUserInfo(); // Call parent class method
        System.out.println("Star Points: " + starPoints);
    }
}

class Order {
    private String itemName;
    private int quantity;
    private double price;

    // Constructor
    public Order(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Calculate total cost
    public double calculateTotalCost() {
        return quantity * price;
    }

    // Overloaded method to calculate total cost with a discount
    public double calculateTotalCost(double discountPercentage) {
        double total = calculateTotalCost();
        return total - (total * (discountPercentage / 100));
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Create a Customer (which is a User)
        Customer customer = new Customer(101, "John Doe", "johndoe@example.com", 500);
        
        // Create an Order
        Order order = new Order("Shirt", 3, 25.0);

        // Print user's information
        System.out.println("--- User Information ---");
        customer.displayUserInfo();

        // Calculate and print total cost
        System.out.println("\n--- Order Cost ---");
        System.out.println("Total Cost (No Discount): $" + order.calculateTotalCost());
        System.out.println("Total Cost (10% Discount): $" + order.calculateTotalCost(10.0));
    }
}
