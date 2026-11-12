# Inheritance – Basic Examples in Java

## 1. Introduction

This package contains basic Java inheritance examples using real-world relationships such as Person, Employee, Vehicle and Car.

Inheritance is one of the four main principles of Object-Oriented Programming (OOP).

It allows a child class to acquire the properties and methods of a parent class using the `extends` keyword.

## 2. Why Inheritance?

- To reuse existing class properties and methods.
- To reduce code duplication.
- To extend the functionality of existing classes.
- To establish parent-child relationships.
- To achieve method overriding and runtime polymorphism.

## 3. Inheritance Flow

```text
       ┌──────────────────────┐
       │     Parent Class     │
       │                      │
       │     Variables        │
       │     Methods          │
       └──────────┬───────────┘
                  │
                  │ extends
                  ↓
       ┌──────────────────────┐
       │     Child Class      │
       │                      │
       │ Inherited Members    │
       │ Own Variables        │
       │ Own Methods          │
       └──────────────────────┘
```

## 4. Topics Covered

### 4.1 Person and Employee

This example demonstrates how an Employee class can inherit common details from a Person class.

- `Person` – Parent class.
- `Employee` – Child class.
- `TestEmployee` – Executes and tests the inheritance example.

### 4.2 Vehicle and Car

This example demonstrates inheritance using a vehicle-related relationship.

- `Vehicle` – Parent class.
- `Car` – Child class.
- `TestVehicle` – Executes and tests the vehicle inheritance example.

**Flowchart:**

```text
       ┌──────────────────────┐
       │      Vehicle         │
       │                      │
       │   Common Details     │
       │   Common Methods     │
       └──────────┬───────────┘
                  │
                  ↓
       ┌──────────────────────┐
       │        Car           │
       │                      │
       │   Inherited Details  │
       │   Car-specific Data  │
       └──────────────────────┘
```

### 4.3 Inheritance Practice Question

`TaskQues.java` contains an inheritance-based practice question to understand and apply inheritance concepts.

## 5. Important Concepts

| Concept | Description |
|---|---|
| Parent Class | Class whose properties are inherited |
| Child Class | Class that inherits another class |
| extends | Keyword used for class inheritance |
| Code Reusability | Reusing existing class functionality |
| Method Overriding | Providing a new implementation of an inherited method |

## 6. Learning Outcomes

After completing this package, we can:

- Understand basic inheritance in Java.
- Identify parent and child classes.
- Use the `extends` keyword.
- Reuse parent class variables and methods.
- Understand inheritance through Person–Employee and Vehicle–Car examples.
- Execute and test inheritance programs.

## 7. Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Eclipse IDE

## 8. Conclusion

This package provides practical examples of basic inheritance in Java. It helps understand how one class can reuse and extend the functionality of another class.
