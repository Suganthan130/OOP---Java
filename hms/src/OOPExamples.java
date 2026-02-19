// 1. INTERFACE: Defines a contract (what to do, not how)
interface Printer {
    void print(String message); // Abstract method
}

// 2. INHERITANCE via Interface
class LaserPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Laser Printer printing: " + message);
    }
}

// 3. ABSTRACTION: Abstract Class
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    // Abstract method (must be implemented by subclass)
    abstract double getArea();

    // Concrete method
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

// 4. INHERITANCE: Class extending Class
class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color); // Calls parent constructor
        this.radius = radius;
    }

    // 5. POLYMORPHISM: Method Overriding
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Calculator {
    // 6. POLYMORPHISM: Method Overloading
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class SecureData {
    // 7. ENCAPSULATION
    private String password;

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 5) {
            this.password = newPassword;
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Error: Password too short.");
        }
    }
}

public class OOPExamples {
    public static void main(String[] args) {
        // Interface
        Printer myPrinter = new LaserPrinter();
        myPrinter.print("Hello OOP!");

        // Abstraction & Polymorphism (Overriding)
        Shape s = new Circle("Red", 5.0);
        s.displayColor();
        System.out.println("Area of Circle: " + s.getArea());

        // Method Overloading
        Calculator calc = new Calculator();
        System.out.println("Add 2 ints: " + calc.add(10, 20));

        // Encapsulation
        SecureData data = new SecureData();
        data.setPassword("SecureObs");
    }
}
