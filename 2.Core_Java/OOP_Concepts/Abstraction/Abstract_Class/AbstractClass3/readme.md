

# Abstract Class – Package 3 (`abstractClass2`)

## 1. Introduction

This package contains Java examples related to abstract classes and vehicle-based implementations.

The package includes a `Vehicle` class, vehicle-related classes such as `Car` and `MotorCycle`, and a `TestVehicle` class.

Through these files, we can understand how abstract classes can provide a common structure for related classes.

## 2. Package Structure

```text
abstractClass2/
│
├── Car.java
├── MotorCycle.java
├── TestVehicle.java
└── Vehicle.java
```

## 3. What Is This Package About?

This package focuses on understanding abstraction through vehicle-related examples.

A vehicle can represent a general concept. Different types of vehicles, such as cars and motorcycles, can have their own specific implementations.

An abstract class can define common methods and properties that related classes can use or implement.

**Note:** The exact inheritance relationships and method implementations depend on the source code. The explanations below describe the concepts suggested by the filenames.

## 4. File-by-File Explanation

### 4.1 Vehicle.java

**Purpose:**

`Vehicle.java` represents the general vehicle concept.

It can be used to demonstrate how an abstract class provides a common structure for different vehicle types.

**Concepts to understand:**

- Abstract class
- Abstract methods
- Concrete methods
- Common properties and behaviours
- Inheritance

**Example concept:**

A general vehicle may have common behaviours such as starting, stopping, or displaying vehicle information.

### 4.2 Car.java

**Purpose:**

`Car.java` represents a car-related implementation.

It can demonstrate how a specific vehicle type provides its own implementation of behaviours declared in a parent abstract class.

**Concepts to understand:**

- Class implementation
- Inheritance
- Method overriding
- Reusability

### 4.3 MotorCycle.java

**Purpose:**

`MotorCycle.java` represents a motorcycle-related implementation.

It can be used to understand how another vehicle type can provide its own specific behaviour while sharing a common vehicle structure.

**Concepts to understand:**

- Class implementation
- Inheritance
- Method overriding
- Abstraction

### 4.4 TestVehicle.java

**Purpose:**

`TestVehicle.java` is the testing or execution class suggested by its filename.

It can be used to create objects, call methods, and observe the behaviour of the vehicle-related classes.

**Concepts to understand:**

- Main method
- Object creation
- Method calling
- Runtime execution
- Parent-class references, if used in the source code

## 5. How the Concept Works

The following diagram shows the conceptual flow of an abstract-class-based vehicle example.

```text
          START
            |
            v
    Vehicle (Abstract Class)
            |
            v
  Defines Common Structure
            |
            v
   Specific Vehicle Classes
            |
       +----+----+
       |         |
       v         v
      Car    MotorCycle
       |         |
       v         v
 Specific    Specific
 Behaviour   Behaviour
       |         |
       +----+----+
            |
            v
      TestVehicle
            |
            v
   Execute and Observe
            |
            v
           END
```

*This diagram illustrates the intended learning concept. Confirm the exact class relationships from the Java source files.*

## 6. Important Concepts Covered

### 6.1 Abstract Class

An abstract class is a class declared using the `abstract` keyword.

It can contain both abstract methods and concrete methods.

```java
abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}
```

### 6.2 Abstract Method

An abstract method is declared without a method body.

```java
abstract void start();
```

A concrete subclass must implement inherited abstract methods unless that subclass is also abstract.

### 6.3 Concrete Method

A concrete method contains a method body.

```java
void stop() {
    System.out.println("Vehicle stopped");
}
```

### 6.4 Inheritance

Inheritance allows one class to acquire the accessible properties and methods of another class.

It is commonly used to establish relationships between general and specific types.

### 6.5 Method Overriding

Method overriding allows a subclass to provide its own implementation of an inherited instance method.

It is commonly used when different vehicle types need different implementations of a common behaviour.

### 6.6 Runtime Polymorphism

Runtime polymorphism occurs when an overridden instance method is called through a parent-class reference that refers to a child-class object.

The actual object determines which overridden method implementation executes.

## 7. Real-Time Applications

The concepts demonstrated by this package can be applied in:

1. **Vehicle Management Systems:** Represent different vehicle types using a common structure.
2. **Transportation Applications:** Manage cars, motorcycles, buses, and trucks.
3. **Banking Applications:** Define common account operations and provide specific implementations for account types.
4. **Employee Management Systems:** Define common employee operations and implement them for different employee categories.
5. **Payment Applications:** Define common payment operations and implement different payment methods.

## 8. Advantages

- Provides a common structure for related classes.
- Encourages code reusability.
- Supports method overriding.
- Helps implement runtime polymorphism.
- Reduces repeated code when common behaviour is shared.
- Makes applications easier to maintain.

## 9. Disadvantages

- An abstract class cannot be instantiated directly.
- Java does not support multiple inheritance through classes.
- A class can extend only one class.
- Incorrect abstraction design can make the class hierarchy difficult to maintain.
- Changes to a parent class may affect its subclasses.

## 10. Learning Outcomes

After understanding this package, learners should be able to:

- Understand the purpose of an abstract class.
- Identify abstract and concrete methods.
- Understand how inheritance can connect related classes.
- Explain method overriding.
- Understand runtime polymorphism.
- Create and test objects using a test class.
- Identify how abstraction is useful in real-time applications.

## 11. Technologies Used

- Programming Language: Java
- Concept: Object-Oriented Programming
- Main Topic: Abstraction
- Subtopic: Abstract Classes

## 12. Conclusion

The `abstractClass2` package helps learners understand abstraction through a vehicle-related example.

By studying `Vehicle`, `Car`, `MotorCycle`, and `TestVehicle`, learners can explore how a general structure can be used to represent specific types of objects.

This package provides a practical foundation for understanding abstract classes, inheritance, method overriding, and runtime polymorphism.

## Author

**Sri Dhanya**


