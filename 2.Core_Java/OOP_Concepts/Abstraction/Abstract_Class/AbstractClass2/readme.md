

# Abstract Class – Package 2 (`abstractClass1`)

## 1. Introduction

The `abstractClass1` package contains Java programs that demonstrate abstraction using abstract classes.

This package includes Vehicle and Employee examples.

These examples help us understand how an abstract parent class can define common functionality while child classes provide their own implementations.

## 2. Package Structure

```text
abstractClass1/
│
├── Car.java
├── Employee.java
├── HourlyEmployee.java
├── MotorCycle.java
├── SalariedEmployee.java
├── TestEmployee.java
├── TestVehicle.java
├── Truck.java
└── Vehicle.java
```

## 3. Examples in This Package

### 3.1 Vehicle Abstraction

The Vehicle example contains:

- `Vehicle.java`
- `Car.java`
- `MotorCycle.java`
- `Truck.java`
- `TestVehicle.java`

This example represents different types of vehicles using a common Vehicle concept.

#### Vehicle.java

This file contains a class named `Vehicle`.

An abstract Vehicle class can provide a common structure for different types of vehicles.

Common vehicle-related functionality may include starting, stopping, and displaying vehicle details.

**Purpose:**
- Define a common parent class for vehicles.
- Declare common abstract methods.
- Provide common concrete methods when required.
- Allow child classes to provide specific implementations.

#### Car.java

This file contains a class named `Car`.

It represents a car as a type of vehicle.

It can provide its own implementation of the methods declared in the Vehicle class.

#### MotorCycle.java

This file contains a class named `MotorCycle`.

It represents a motorcycle as a type of vehicle.

It can provide specific vehicle-related method implementations.

#### Truck.java

This file contains a class named `Truck`.

It represents a truck as a type of vehicle.

It can provide its own implementation of the functionality defined by the Vehicle class.

#### TestVehicle.java

This file contains a class named `TestVehicle`.

A test class is generally used to create objects of the vehicle classes and execute their methods.

**Purpose:**
- Create vehicle objects.
- Access vehicle functionality.
- Execute the vehicle example.
- Observe the program output.

### 3.2 Vehicle Example – Conceptual Flow

```text
             ┌────────────────────┐
             │    Vehicle.java    │
             │   Abstract Class   │
             └──────────┬─────────┘
                        │
             ┌──────────┼──────────┐
             │          │          │
             ▼          ▼          ▼
       ┌──────────┐ ┌──────────┐ ┌──────────┐
       │   Car    │ │MotorCycle│ │  Truck   │
       │  .java   │ │  .java   │ │  .java   │
       └────┬─────┘ └────┬─────┘ └────┬─────┘
            │            │            │
            ▼            ▼            ▼
       ┌──────────┐ ┌──────────┐ ┌──────────┐
       │ Provide  │ │ Provide  │ │ Provide  │
       │ Specific │ │ Specific │ │ Specific │
       │ Methods  │ │ Methods  │ │ Methods  │
       └────┬─────┘ └────┬─────┘ └────┬─────┘
            │            │            │
            └────────────┼────────────┘
                         │
                         ▼
                ┌────────────────┐
                │ TestVehicle.java│
                │ Execute Example │
                └────────────────┘
```

This diagram represents the conceptual vehicle abstraction structure. Confirm the actual inheritance and method relationships from the Java source code.

## 4. Employee Abstraction

The Employee example contains:

- `Employee.java`
- `HourlyEmployee.java`
- `SalariedEmployee.java`
- `TestEmployee.java`

This example can demonstrate how different employee types share a common employee structure.

#### Employee.java

This file contains a class named `Employee`.

An abstract Employee class can define common employee-related information and functionality.

For example:
- Employee name.
- Employee ID.
- Common employee operations.

It can also declare abstract methods for functionality that differs between employee types.

#### HourlyEmployee.java

This file contains a class named `HourlyEmployee`.

An hourly employee is generally paid based on the number of hours worked and an hourly rate.

This class can provide employee-specific functionality related to hourly payment.

#### SalariedEmployee.java

This file contains a class named `SalariedEmployee`.

A salaried employee generally receives a fixed salary for a specified payment period.

This class can provide employee-specific functionality related to fixed salary.

#### TestEmployee.java

This file contains a class named `TestEmployee`.

It is generally used to create employee objects and execute their methods.

**Purpose:**
- Create employee objects.
- Access employee-related methods.
- Execute the employee example.
- Observe the output.

*The exact salary calculations, constructors, fields, and method names depend on the source code.*

## 5. Employee Example – Conceptual Flow

```text
             ┌────────────────────┐
             │   Employee.java    │
             │   Abstract Class   │
             └──────────┬─────────┘
                        │
                ┌───────┴────────┐
                │                │
                ▼                ▼
       ┌─────────────────┐ ┌──────────────────┐
       │ HourlyEmployee  │ │ SalariedEmployee │
       │    .java        │ │     .java        │
       └────────┬────────┘ └────────┬─────────┘
                │                  │
                ▼                  ▼
       ┌─────────────────┐ ┌──────────────────┐
       │ Hourly Payment  │ │ Fixed Salary     │
       │ Functionality   │ │ Functionality    │
       └────────┬────────┘ └────────┬─────────┘
                │                  │
                └─────────┬────────┘
                          │
                          ▼
                ┌──────────────────┐
                │ TestEmployee.java│
                │ Execute Example  │
                └──────────────────┘
```

This is a conceptual flow based on the filenames, not a verified representation of the exact implementation.

## 6. Important Concepts Covered

### 6.1 Abstract Class

An abstract class is declared using the `abstract` keyword.

It provides a common structure for related classes.

### 6.2 Abstract Method

An abstract method is declared without a method body.

Concrete child classes must implement inherited abstract methods.

### 6.3 Concrete Method

A concrete method contains its implementation.

Child classes can inherit and use it.

### 6.4 Inheritance

Inheritance allows a child class to acquire the properties and methods of a parent class.

Java uses the `extends` keyword.

### 6.5 Method Overriding

Method overriding allows a child class to provide its own implementation of an inherited instance method.

### 6.6 Runtime Polymorphism

A parent class reference can refer to different child class objects.

When an overridden method is called, Java executes the implementation based on the actual object at runtime.

## 7. Real-Time Applications

| Example | Real-Time Application |
|---|---|
| Vehicle | Vehicle Management Systems |
| Car | Car Rental Applications |
| MotorCycle | Two-Wheeler Management |
| Truck | Logistics and Transport Systems |
| Employee | Employee Management |
| HourlyEmployee | Hourly Payroll Management |
| SalariedEmployee | Monthly Salary Management |

## 8. Advantages

1. Provides a common structure for related classes.
2. Reduces duplicate code.
3. Supports inheritance.
4. Allows child classes to provide their own implementations.
5. Supports runtime polymorphism.
6. Improves code organization and maintainability.

## 9. Disadvantages

1. Requires proper class design.
2. Abstract classes cannot be instantiated directly.
3. Concrete child classes must implement inherited abstract methods.
4. Java supports only single class inheritance.
5. Unnecessary abstraction can increase application complexity.

## 10. Learning Outcomes

After completing this package, we can understand:

- How to create an abstract parent class.
- How multiple child classes extend an abstract class.
- How Vehicle abstraction works.
- How Employee abstraction works.
- How abstract methods are implemented.
- How method overriding works.
- How runtime polymorphism can be achieved using abstract classes.

## 11. Technologies Used

- Programming Language: Java
- Concept: Object-Oriented Programming
- OOP Topic: Abstraction
- Mechanism: Abstract Class
- IDE: Eclipse / Any Java-supported IDE

## 12. Conclusion

The `abstractClass1` package demonstrates abstraction using Vehicle and Employee examples.

The Vehicle example represents different vehicle types through a common structure.

The Employee example represents different employee categories through a common employee structure.

These examples help us understand abstract classes, inheritance, method overriding, and runtime polymorphism in Java.

## Author

**Sri Dhanya**

