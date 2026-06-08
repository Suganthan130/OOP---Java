# Object-Oriented Programming (OOP) Concepts Guide

This guide explains the fundamental concepts of Object-Oriented Programming: **Encapsulation**, **Inheritance**, and **Polymorphism (Overriding & Overloading)**. 

Examples are provided in both **Java** (which strongly enforces these rules) and **JavaScript/HTML** (to show how it works on the web).

---

## 1. Encapsulation with Getters & Setters

> [!NOTE]
> **Encapsulation** is the practice of hiding the internal state (data/variables) of an object and requiring all interaction to be performed through an object's methods.

This is achieved by keeping class variables private and providing public **getters** (to read the data) and **setters** (to modify the data). This allows you to add validation logic before changing a variable.

### Java Example
```java
class BankAccount {
    // 1. Private variables (Hidden data)
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        setBalance(initialBalance); // Uses validation during creation
    }

    // 2. Getter 
    public double getBalance() {
        return balance;
    }

    // 3. Setter with VALIDATION LOGIC
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative!");
        }
    }
}
```

### JavaScript Example
```javascript
class BankAccount {
    // Private field (indicated by # in modern JavaScript)
    #balance; 

    constructor(accountHolder, initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance; // Calls the setter
    }

    // Getter
    get balance() {
        return this.#balance;
    }

    // Setter with validation
    set balance(amount) {
        if (amount >= 0) {
            this.#balance = amount;
        } else {
            console.error("Error: Balance cannot be negative!");
        }
    }
}
```

---

## 2. Inheritance

> [!TIP]
> **Inheritance** promotes code reusability. It allows a new class (Subclass/Child) to acquire the properties and methods of an existing class (Superclass/Parent).

### Java Example
```java
// Parent Class
class Animal {
    String name;
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child Class inheriting from Animal
class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking: Woof!");
    }
}
```

### JavaScript Example
```javascript
// Parent Class
class Animal {
    constructor(name) {
        this.name = name;
    }
    eat() {
        console.log(`${this.name} is eating.`);
    }
}

// Child Class inheriting from Animal
class Dog extends Animal {
    constructor(name, breed) {
        super(name); // Must call the parent's constructor
        this.breed = breed;
    }
    bark() {
        console.log(`${this.name} the ${this.breed} barks: Woof!`);
    }
}
```

---

## 3. Method Overriding & Method Overloading

These fall under **Polymorphism**—the ability of a method to take on many forms.

### A. Method Overloading
Overloading occurs when you have multiple methods with the **exact same name** in the same class, but they take **different parameters**.

#### Java Example
```java
class Calculator {
    // Method 1: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers (Different number of parameters)
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

#### JavaScript Equivalent
JavaScript does not natively support having multiple methods with the same name. We achieve this by checking the arguments passed.
```javascript
class Calculator {
    add(a, b, c) {
        if (c !== undefined) {
            return a + b + c; // 3 parameters passed
        } else {
            return a + b;     // 2 parameters passed
        }
    }
}
```

### B. Method Overriding
Overriding occurs when a Child class provides a specific implementation for a method that is already defined in its Parent class. The method name and parameters must be exactly the same.

#### Java Example
```java
class Vehicle {
    public void startEngine() {
        System.out.println("Generic engine is starting...");
    }
}

class Car extends Vehicle {
    // Overriding the parent method
    @Override
    public void startEngine() {
        System.out.println("Car engine starts with a button press: Vroom!");
    }
}
```

#### JavaScript Example
```javascript
class Vehicle {
    startEngine() {
        console.log("Generic engine is starting...");
    }
}

class Car extends Vehicle {
    // Overriding the parent method simply by redefining it
    startEngine() {
        console.log("Car engine starts with a button press: Vroom!");
    }
}
```

---

### Quick Summary

| Feature | Method Overloading | Method Overriding |
| :--- | :--- | :--- |
| **Location** | Happens within the **same** class. | Happens between **Parent** and **Child** classes. |
| **Parameters** | Must be **different**. | Must be **exactly the same**. |
| **Return Type** | Can be different. | Must be the same. |
| **Purpose** | To allow one method name to handle different inputs gracefully. | To allow a child class to change the behavior of a parent's method. |
