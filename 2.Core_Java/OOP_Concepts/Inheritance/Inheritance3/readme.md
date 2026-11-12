# Inheritance – Multilevel Inheritance Examples in Java

## 1. Introduction

This package contains practical Java inheritance examples using Vehicle and Person-related classes.

It demonstrates how a child class can inherit properties and methods from a parent class and how inheritance can be extended across multiple levels.

## 2. Topics Covered

### 2.1 Vehicle Inheritance

This example demonstrates inheritance using Vehicle, Car and ElectricCar classes.

- `Vehicle` – Base class containing common vehicle details and methods.
- `Car` – Child class that inherits from Vehicle.
- `ElectricCar` – Child class that inherits from Car.
- `TestCar` – Executes and tests the vehicle inheritance example.

**Flowchart:**

```text id="v3k9az"
       ┌──────────────────────┐
       │       Vehicle        │
       │                      │
       │   Common Details     │
       │   Common Methods     │
       └──────────┬───────────┘
                  │
                  ↓
       ┌──────────────────────┐
       │         Car          │
       │                      │
       │   Inherited Details  │
       │   Car-specific Data  │
       └──────────┬───────────┘
                  │
                  ↓
       ┌──────────────────────┐
       │     ElectricCar      │
       │                      │
       │  Inherited Details   │
       │  Electric Features   │
       └──────────────────────┘
```

This demonstrates **multilevel inheritance**.

### 2.2 Person and Employee Inheritance

This example demonstrates inheritance using Person, Employee and Manager classes.

- `Person` – Base class containing common personal details.
- `Employee` – Child class that inherits from Person.
- `Manager` – Child class that inherits from Employee.
- `TestPerson` – Executes and tests the person-related inheritance example.

**Flowchart:**

```text id="p8q4md"
       ┌──────────────────────┐
       │       Person         │
       │                      │
       │   Personal Details   │
       └──────────┬───────────┘
                  │
                  ↓
       ┌──────────────────────┐
       │      Employee        │
       │                      │
       │   Employee Details   │
       └──────────┬───────────┘
                  │
                  ↓
       ┌──────────────────────┐
       │       Manager        │
       │                      │
       │   Manager Details    │
       └──────────────────────┘
```

This also demonstrates **multilevel inheritance**.

## 3. Important Concepts

| Concept | Description |
|---|---|
| Multilevel Inheritance | A class inherits from another child class |
| Base Class | The original parent class in an inheritance chain |
| Intermediate Class | A class that acts as both child and parent |
| Derived Class | A class that inherits from another class |
| Code Reusability | Reusing properties and methods across inheritance levels |

## 4. Learning Outcomes

After completing this package, we can:

- Understand multilevel inheritance.
- Create inheritance chains using multiple classes.
- Reuse parent class functionality at different levels.
- Understand Vehicle–Car–ElectricCar relationships.
- Understand Person–Employee–Manager relationships.
- Execute and test multilevel inheritance programs.

## 5. Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Eclipse IDE

## 6. Conclusion

This package demonstrates multilevel inheritance through practical Vehicle and Person examples. It explains how inheritance can be extended across multiple levels to improve code reusability and maintain logical relationships between classes.
