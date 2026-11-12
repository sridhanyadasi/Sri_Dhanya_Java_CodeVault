# Inheritance - Package 1

## 1. Introduction

This package contains Java programs that demonstrate the basic implementation of inheritance.

It explains how a child class can reuse the properties and methods of a parent class using the `extends` keyword.

## 2. Concepts Covered

- Single Inheritance
- Parent Class and Child Class
- Code Reusability
- Method Inheritance
- Accessing Parent Class Methods
- Real-Time Inheritance Examples

## 3. Package Structure

```text
inheritance/
│
├── Car.java
├── Employee.java
├── Person.java
├── TaskQues.java
├── TestEmployee.java
├── TestVehicle.java
└── Vehicle.java
```

## 4. Class Relationship Diagrams

### 4.1 Vehicle and Car

A Car is a Vehicle. The `Car` class inherits the common properties and methods of the `Vehicle` class.

```text
       ┌──────────────────────┐
       │      Vehicle         │
       │                      │
       │   Common Features    │
       │   Vehicle Methods    │
       └──────────┬───────────┘
                  │
                  │ extends
                  ↓
       ┌──────────────────────┐
       │        Car           │
       │                      │
       │   Car Properties     │
       │   Car Methods        │
       └──────────────────────┘
```

### 4.2 Person and Employee

An Employee is a Person. The `Employee` class can inherit common person-related details from the `Person` class.

```text
       ┌──────────────────────┐
       │       Person         │
       │                      │
       │   Name               │
       │   Age                │
       │   Person Methods     │
       └──────────┬───────────┘
                  │
                  │ extends
                  ↓
       ┌──────────────────────┐
       │      Employee        │
       │                      │
       │   Employee Details  │
       │   Employee Methods  │
       └──────────────────────┘
```

## 5. Understanding the Test Classes

Test classes are used to create objects and execute the methods of the respective classes.

- `TestVehicle.java` - Used to test the Vehicle and Car inheritance example.
- `TestEmployee.java` - Used to test the Person and Employee inheritance example.
- `TaskQues.java` - Contains inheritance-related practice questions or programs.

## 6. Learning Outcomes

After completing this package, we can:

- Understand basic inheritance implementation.
- Identify parent and child classes.
- Use the `extends` keyword.
- Reuse parent class methods in child classes.
- Understand inheritance through Vehicle-Car and Person-Employee examples.
- Create objects and test inherited methods.
