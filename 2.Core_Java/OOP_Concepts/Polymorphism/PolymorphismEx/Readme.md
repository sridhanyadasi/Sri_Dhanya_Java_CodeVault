# Polymorphism – Package 2 (PolyMorphismEx)

## 1. Introduction

The `PolyMorphismEx` package contains Java programs related to polymorphism using vehicle-based classes and mathematical operations.

It helps learners understand how common operations can be represented through methods and how different classes can provide different behaviours.

## 2. Purpose of This Package

The purpose of this package is to understand the practical use of polymorphism through vehicle-related examples and operation-based programs.

This package helps learners understand:

- How parent and child classes can be used.
- How methods can be implemented in different classes.
- How objects are created and methods are called.
- How common operations can be represented using Java methods.
- How polymorphism supports reusable and flexible code.

## 3. Concepts Covered

1. Polymorphism
2. Method Overloading
3. Method Overriding
4. Inheritance
5. Parent Class and Child Class
6. Object Creation
7. Method Calling
8. Compile-Time and Runtime Method Selection

## 4. Package Structure

```text
PolyMorphismEx/
│
├── Car.java
├── SumOperation.java
├── TestOP.java
├── TestVehicle.java
└── Vehicle.java
```

## 5. Examples Available in This Package

### 5.1 Vehicle-Based Example

Files:
- `Vehicle.java`
- `Car.java`
- `TestVehicle.java`

These files represent a vehicle-based example.

The `Vehicle.java` and `Car.java` files can be used to understand the relationship between vehicle-related classes.

The test class helps execute the example by creating objects and calling methods.

**Concepts:** Inheritance and polymorphism, depending on the method implementations in the source files.

**Conceptual Flowchart:**

```text
       ┌──────────────────────┐
       │    TestVehicle       │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Create Vehicle or    │
       │ Car Object           │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Call Vehicle-Related │
       │ Method               │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Execute the          │
       │ Appropriate Method   │
       └──────────────────────┘
```

### 5.2 Sum Operation Example

Files:
- `SumOperation.java`
- `TestOP.java`

These files represent a mathematical operation-based example.

The `SumOperation.java` file contains the operation-related implementation, while `TestOP.java` is used to test the program.

This example can help learners understand how methods are defined, called, and executed.

**Concept:** Method-based operation handling. The exact polymorphism type depends on the method definitions in the source code.

**Conceptual Flowchart:**

```text
       ┌──────────────────────┐
       │       TestOP         │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Create Object        │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Call Sum Operation   │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Execute Operation    │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Display Result       │
       └──────────────────────┘
```

## 6. Important Concepts Explained

### 6.1 Inheritance

Inheritance allows one class to acquire the properties and methods of another class.

It helps establish relationships between related classes and supports code reusability.

### 6.2 Polymorphism

Polymorphism means many forms. It allows a common method or reference to represent different behaviours.

### 6.3 Method Overloading

Method overloading means defining multiple methods with the same name but different parameter lists.

It supports compile-time polymorphism.

### 6.4 Method Overriding

Method overriding occurs when a child class provides its own implementation of a method inherited from its parent class.

It supports runtime polymorphism.

### 6.5 Test Classes

Test classes are used to create objects, call methods, and verify program execution.

In this package:
- `TestVehicle.java` is used for the vehicle example.
- `TestOP.java` is used for the sum operation example.

## 7. Uses of These Concepts

- Vehicle applications can represent common vehicle behaviour through related classes.
- Mathematical applications can perform operations using reusable methods.
- Inheritance helps avoid repeated code.
- Polymorphism allows different implementations of common operations.
- Test classes help verify the program behaviour.

## 8. Advantages

1. **Code Reusability:** Common properties and methods can be reused through inheritance.
2. **Flexibility:** Different classes can provide their own implementations.
3. **Easy Maintenance:** Related functionality can be organized into separate classes.
4. **Extensibility:** New classes and operations can be added when required.
5. **Better Organization:** Separate implementation and test classes make programs easier to understand.

## 9. Disadvantages

1. **Complexity:** Multiple related classes can make program flow difficult to understand.
2. **Debugging Difficulty:** Identifying the exact method being executed may require additional debugging.
3. **Inheritance Dependency:** Poorly designed class relationships can create maintenance problems.
4. **Method Confusion:** Similar method names can be confusing when there are many overloads or overrides.
5. **Runtime Overhead:** Dynamic method dispatch may introduce a small amount of runtime overhead.

## 10. Learning Outcomes

After completing this package, learners will understand:

- How to organize Java programs using multiple classes.
- How to create objects and call methods.
- How inheritance supports code reusability.
- How polymorphism can be applied to related classes.
- How mathematical operations can be implemented using methods.
- How test classes are used to execute Java programs.

## 11. Technologies Used

- **Programming Language:** Java
- **Concept:** Object-Oriented Programming
- **IDE:** Eclipse / VS Code
- **Execution:** Java Compiler and JVM

## 12. Conclusion

The `PolyMorphismEx` package provides practical examples using vehicle-related classes and mathematical operations.

It helps learners understand class relationships, method implementation, object creation, and method execution.

These examples provide a foundation for applying object-oriented programming concepts in Java applications.

## Author

**Sri Dhanya**

Java Learning Repository – Polymorphism
