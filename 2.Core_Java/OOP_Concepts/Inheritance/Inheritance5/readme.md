v# Inheritance – Person, Manager and Worker Examples in Java

## 1. Introduction

This package contains practical Java inheritance examples using Person, Manager and Worker classes.

It demonstrates how different types of employees can inherit common personal details from a parent class and maintain their own specific properties and methods.

## 2. Topics Covered

### 2.1 Person and Manager Inheritance

This example demonstrates inheritance using Person and Manager classes.

- `Person` – Parent class containing common personal details.
- `Manager` – Child class that inherits properties and methods from Person.
- `TestPerson` – Executes and tests the person-related inheritance example.

**Flowchart:**

```text id="m7q3va"
       ┌──────────────────────┐
       │       Person         │
       │                      │
       │   Personal Details   │
       │   Common Methods     │
       └──────────┬───────────┘
                  │
                  ↓
       ┌──────────────────────┐
       │       Manager        │
       │                      │
       │   Manager Details    │
       │   Manager Methods    │
       └──────────────────────┘
```

### 2.2 Worker Inheritance

The `Worker` class is also included in this package to demonstrate worker-related functionality.

It can be used to understand how a worker class can represent specific worker details and behaviour.

**Conceptual Relationship:**

```text id="r2p8kd"
       ┌──────────────────────┐
       │       Person         │
       │                      │
       │   Common Details     │
       └──────────┬───────────┘
                  │
                  ↓
       ┌──────────────────────┐
       │        Worker        │
       │                      │
       │   Worker Details     │
       │   Worker Methods     │
       └──────────────────────┘
```

*Note: This diagram represents a possible Person–Worker inheritance relationship. Confirm the actual `Worker.java` class declaration to verify whether it extends `Person`.*

## 3. Important Concepts

| Concept | Description |
|---|---|
| Parent Class | Provides common properties and methods |
| Child Class | Inherits functionality from a parent class |
| Inheritance | Reusing existing class functionality |
| Code Reusability | Avoiding duplicate code |
| Real-World Modeling | Representing people and job roles using classes |

## 4. Learning Outcomes

After completing this package, we can:

- Understand inheritance using Person and Manager classes.
- Identify common properties and methods.
- Understand how child classes can extend parent class functionality.
- Practice inheritance using person and worker-related examples.
- Execute and test inheritance programs.

## 5. Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Eclipse IDE

## 6. Conclusion

This package provides practical inheritance examples using Person, Manager and Worker classes. It helps understand how common functionality can be reused and extended in Java applications.
