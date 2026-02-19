# HMS Project Analysis & OOP Concepts (Short)

## a) Object Oriented Programming Concepts

### i) Method Overloading
- Same method name in the same class with different parameter lists (type, number, or order).
- Compile-time polymorphism.

### ii) Interface
- A blueprint of a class containing abstract methods and static constants.
- Supports multiple inheritance and full abstraction.

### iii) Access Modifiers
- **Private**: Visible only within the class.
- **Default**: Visible only within the package.
- **Protected**: Visible within package and subclasses.
- **Public**: Visible everywhere.

### iv) Encapsulation
- Wrapping data (variables) and code (methods) into a single unit (class).
- Data hiding: Variables are `private` and accessed via `public` methods.

## b) HMS Project Identification

### i) Name of the parent class
[User](file:///Users/suganthan/.gemini/antigravity/playground/hidden-blazar/hms/src/User.java#1-10)

### ii) Common attributes shared by all subclasses
- `name`
- `NIC`
- `contactNumber`

### iii) Methods that can be created in each subclass
- **Doctor**: [viewAssignedPatients()](file:///Users/suganthan/.gemini/antigravity/playground/hidden-blazar/hms/src/Doctor.java#20-24)
- **Nurse**: `checkAssignedDepartment()`
- **Patient**: `viewAssignedDoctorDetails()`

## c) User Class Analysis

### i) Would making this class abstract be correct? Justify your answer. [05 Marks]
**Yes.**

**Justification:**
1.  **Generalization**: [User](file:///Users/suganthan/.gemini/antigravity/playground/hidden-blazar/hms/src/User.java#1-10) is a generic concept; specific roles (Doctor, Nurse) are the actual entities.
2.  **Prevention**: Prevents instantiation of a meaningless "general user".
3.  **Enforcement**: Ensures subclasses implement their specific behavior (e.g., specific [performRole](file:///Users/suganthan/.gemini/antigravity/playground/hidden-blazar/hms/src/User.java#6-9)).

## d) Java Expression Explanations

### I. `int a = -5 + 8 * 6;` -> **43**
1.  **Multiplication first**: `8 * 6 = 48`
2.  **Addition**: `-5 + 48 = 43`

### II. `int b = (55 - 9) % 9;` -> **1**
1.  **Parentheses**: `55 - 9 = 46`
2.  **Modulus**: `46 % 9`
    - 46 divided by 9 is 5 with a remainder of 1.
    - Result: `1`

### III. `int c = 5 + 15 / 3 * 2 + 8 % 3;` -> **17**
1.  **Division**: `15 / 3 = 5`
2.  **Multiplication**: `5 * 2 = 10`
3.  **Modulus**: `8 % 3 = 2`
4.  **Addition**: `5 + 10 + 2 = 17`

### IV. `int d = 5 + 11 / 3 * 2 - 5 % 5;` -> **11**
1.  **Integer Division**: `11 / 3 = 3` (Decimal part .66 is truncated)
2.  **Multiplication**: `3 * 2 = 6`
3.  **Modulus**: `5 % 5 = 0`
4.  **Addition/Subtraction**: `5 + 6 - 0 = 11`

### V. `int e = -1 + 1 - 1 + 1 - 1 + 0 + 1;` -> **0**
- Operations behave left-to-right:
    - `-1 + 1 = 0`
    - `0 - 1 = -1`
    - `-1 + 1 = 0`
    - `0 - 1 = -1`
    - `-1 + 0 = -1`

## e) Exception Handling

### a) What is an Exception?
An Exception is an unwanted or unexpected event, which occurs during the execution of a program (at runtime), that disrupts the normal flow of the program's instructions.

### b) Definitions
#### i) Syntax Error
Errors that occur when the code violates the grammatical rules of the programming language. These are detected by the compiler (compile-time errors).
*Example: Missing semicolon or misspelled keyword.*

#### i) Logical Error
Errors where the program runs without crashing but produces incorrect results due to flawed logic.
*Example: Using `+` instead of `*` in a multiplication formula.*

#### iii) Runtime Error
Errors that occur during program execution, causing the program to terminate abnormally.
*Example: Division by zero (integers) or accessing an array index out of bounds.*

### c) Code Analysis

#### i) Potential Runtime Exception
**Exception**: `InputMismatchException`
**Circumstance**: This exception occurs if the user enters a non-numeric value (e.g., "abc") or a value that does not match the expected type (e.g., entering a decimal number for `nextInt()`).

*Note: While division by zero is a common runtime error, in this specific code `div` is a `double`. Dividing a double `a` by integer `0` results in `Infinity`, which does NOT throw a runtime exception in Java. However, if the inputs were integers, it would throw `ArithmeticException`.*

#### ii) Rewritten Code with Exception Handling
```java
try {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    int b = sc.nextInt();
    if (b == 0) {
        System.out.println("Cannot divide by zero");
    } else {
        double div = a / b;
        System.out.println(div);
    }
} catch (java.util.InputMismatchException e) {
    System.out.println("Invalid input. Please enter numbers.");
}
```

## f) Banking System (Fill in the blanks)
(i) **BankAccount**
(ii) **balance**
(iii) **BankAccount**
(iv) **balance**
(v) **getBalance()**
(vi) **balance**
(vii) **balance**
(viii) **balance**
(ix) **withdraw**
(x) **amount**

## g) OOP Concepts (Additional)

### a) Difference between Class and Object
| Feature | Class | Object |
| :--- | :--- | :--- |
| **Definition** | A blueprint or template for creating objects. | An instance of a class. |
| **Existence** | Logical entity (does not exist physically in memory until instantiated). | Physical entity (occupies memory). |
| **Example** | `Car` (the concept of a car). | `myTesla` (a specific car). |

### b) Categorization (Attribute vs Method)
| Word | Category |
| :--- | :--- |
| **Speed** | Attribute |
| **Fly** | Method |
| **Height** | Attribute |
| **CalculateArea** | Method |
| **Color** | Attribute |
| **Run** | Method |

### c) Method Overloading Example
```java
// Method 1: Product of two doubles
public double getProduct(double a, double b) {
    return a * b;
}

// Method 2: Product of three doubles
public double getProduct(double a, double b, double c) {
    return a * b * c;
}

// How to call these methods:
// double result1 = getProduct(5.5, 2.0);       // Calls Method 1
// double result2 = getProduct(1.5, 2.0, 3.0);  // Calls Method 2
```

## h) Advanced OOP Concepts (Extra Learning)

### 1. Inheritance (`extends`)
- **Concept**: A mechanism where one class acquires the properties (fields) and behaviors (methods) of another class.
- **Key Terms**:
    - **Superclass (Parent)**: The class being inherited from (e.g., [User](file:///Users/suganthan/.gemini/antigravity/playground/hidden-blazar/hms/src/User.java#1-10)).
    - **Subclass (Child)**: The class that inherits (e.g., [Doctor](file:///Users/suganthan/.gemini/antigravity/playground/hidden-blazar/hms/src/Doctor.java#1-25)).
- **Syntax**: `class Doctor extends User { ... }`
- **Benefit**: Code reusability.

### 2. Polymorphism ("Many Forms")
- **Compile-time Polymorphism**: Achieved via **Method Overloading** (same method name, different parameters).
- **Runtime Polymorphism**: Achieved via **Method Overriding** (subclass provides specific implementation of a parent method).
    - **Example**: `User u = new Doctor(); u.performRole();` calls the *Doctor's* version.

### 3. Abstraction (Abstract Class vs Interface)
| Feature | Abstract Class | Interface |
| :--- | :--- | :--- |
| **Methods** | Can have both abstract (no body) and concrete methods. | Mostly abstract methods (can have default/static since Java 8). |
| **Inheritance** | A class can extend only **one** abstract class. | A class can implement **multiple** interfaces. |
| **Variables** | Can have non-final, non-static variables. | All variables are implicitly `public static final` (constants). |
| **Constructor** | Can have constructors. | Cannot have constructors. |

### 4. Important Keywords
- **`super`**: Refers to the immediate parent class object. Used to call parent constructors (`super()`) or methods.
- **`this`**: Refers to the *current* object instance. Used to differentiating instance variables from parameters (e.g., `this.name = name`).
- **`static`**: Belongs to the *class* rather than an instance. Shared by all objects (e.g., `Math.PI` or [main](file:///Users/suganthan/.gemini/antigravity/playground/hidden-blazar/hms/src/ExceptionTest.java#4-17) method).




