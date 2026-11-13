# Polymorphism – Practice Package 3

## 1. Introduction

The `Practice Package 3` contains Java programs based on vehicles to understand polymorphism and object-oriented programming concepts.

It uses `Vehicle`, `Car`, and `Bicycle` classes to demonstrate how different types of vehicles can share common properties and behaviours while having their own implementations.

## 2. Purpose of This Package

The main purpose of this package is to understand how polymorphism can be applied using vehicle-related classes.

This package helps learners understand:

- How a parent class can represent common vehicle behaviour.
- How child classes can provide their own implementations.
- How different objects can be handled using a common parent reference.
- How method overriding supports runtime polymorphism.
- How to test vehicle objects using a separate test class.

## 3. Concepts Covered

1. Polymorphism
2. Inheritance
3. Method Overriding
4. Runtime Polymorphism
5. Parent Class and Child Classes
6. Object Creation
7. Parent Class Reference
8. Dynamic Method Dispatch

## 4. Package Structure

```text
Practice Package 3/
│
├── Bicycle.java
├── Car.java
├── TestVehicle.java
└── Vehicle.java
```

## 5. Examples Available in This Package

### 5.1 Vehicle – Parent Class

**File:** `Vehicle.java`

The `Vehicle` class represents the common vehicle-related properties and behaviours.

It can act as a parent class for different vehicle types.

Common vehicle operations can be defined in this class so that child classes can inherit or override them.

### 5.2 Car – Child Class

**File:** `Car.java`

The `Car` class represents a car.

It can inherit common vehicle-related behaviour from the `Vehicle` class and provide its own implementation of methods.

### 5.3 Bicycle – Child Class

**File:** `Bicycle.java`

The `Bicycle` class represents a bicycle.

It can share common vehicle behaviour while providing its own implementation based on bicycle-related functionality.

### 5.4 TestVehicle – Testing Class

**File:** `TestVehicle.java`

The `TestVehicle` class is used to execute and test the vehicle-related program.

It can create vehicle objects, call methods, and demonstrate how different vehicle implementations behave.

## 6. Program Flowchart

The following flowchart represents the conceptual execution flow when `Vehicle` is the parent class and `Car` and `Bicycle` are its child classes.

```text
       ┌──────────────────────┐
       │     TestVehicle      │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Create Vehicle       │
       │ Reference            │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Assign Car or        │
       │ Bicycle Object       │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Call Common Method   │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ JVM Checks Actual    │
       │ Object at Runtime    │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Execute the          │
       │ Corresponding        │
       │ Overridden Method    │
       └──────────────────────┘
```

*Note: This flow assumes that `Car` and `Bicycle` extend `Vehicle` and override a common method. Confirm the exact relationships from the source code.*

## 7. Important Concepts Explained

### 7.1 Inheritance

Inheritance allows a child class to acquire the properties and methods of a parent class.

For example, if `Car` and `Bicycle` extend `Vehicle`, they can reuse the common functionality defined in `Vehicle`.

### 7.2 Method Overriding

Method overriding occurs when a child class provides its own implementation of a method defined in its parent class.

For example, a car and bicycle can provide different implementations of a common vehicle method.

### 7.3 Runtime Polymorphism

Runtime polymorphism allows Java to execute the overridden method based on the actual object assigned to a parent class reference.

### 7.4 Parent Class Reference

A parent class reference can hold an object of its child class.

Example:

```java
Vehicle vehicle;

vehicle = new Car();
vehicle = new Bicycle();
```

This example assumes both classes extend `Vehicle`.

### 7.5 Dynamic Method Dispatch

Dynamic method dispatch is the process through which Java identifies and executes the appropriate overridden method at runtime.

## 8. Uses of Polymorphism in This Example

- Representing different vehicle types using a common parent class.
- Reusing common vehicle functionality.
- Providing different implementations for different vehicles.
- Managing multiple vehicle objects through a common reference.
- Making vehicle applications easier to extend.

## 9. Advantages

1. **Code Reusability:** Common vehicle functionality can be defined in one parent class.
2. **Flexibility:** Different vehicle classes can implement common methods differently.
3. **Easy Extension:** New vehicle types can be added with their own implementations.
4. **Maintainability:** Common and specific behaviours can be organized separately.
5. **Reduced Code Duplication:** Shared functionality does not need to be repeated in every child class.

## 10. Disadvantages

1. **Complexity:** Multiple classes and overridden methods can make execution flow harder to understand.
2. **Debugging Difficulty:** It may take additional effort to identify which overridden method executes.
3. **Inheritance Dependency:** Poor class design can make the application difficult to maintain.
4. **Runtime Overhead:** Dynamic method dispatch may introduce a small amount of overhead.
5. **Limited Parent Reference Access:** A parent reference directly accesses members available through its declared parent type.

## 11. Learning Outcomes

After completing this practice package, learners will understand:

- How to create parent and child classes.
- How inheritance works in Java.
- How method overriding is implemented.
- How runtime polymorphism works.
- How parent class references can hold child class objects.
- How different objects can provide different behaviours.
- How to test Java programs using a separate test class.

## 12. Technologies Used

- **Programming Language:** Java
- **Concept:** Object-Oriented Programming
- **IDE:** Eclipse / VS Code
- **Execution:** Java Compiler and JVM

## 13. Conclusion

This practice package demonstrates vehicle-based examples to understand inheritance and polymorphism in Java.

By working with `Vehicle`, `Car`, and `Bicycle`, learners can understand how common behaviour can be shared and how different vehicle classes can provide their own implementations.

## Author

**Sri Dhanya**

Java Learning Repository – Polymorphism
