

# Abstract Class – Package 1 (`abstractClass`)

## 1. Introduction

The `abstractClass` package contains Java programs that demonstrate the concept of abstraction using abstract classes.

This package includes two different real-world examples:

1. Shape Abstraction
2. Employee Abstraction

These examples help us understand how an abstract parent class can provide a common structure for multiple child classes.

## 2. Package Structure

```text
abstractClass/
│
├── Circle.java
├── Employee.java
├── HourlyEmployee.java
├── Rectangle.java
├── SalariedEmployee.java
├── Shape.java
├── TestEmployee.java
├── TestShape.java
└── Triangle.java
```

## 3. Examples in This Package

### 3.1 Shape Abstraction

The Shape example contains the following files:

- `Shape.java`
- `Circle.java`
- `Rectangle.java`
- `Triangle.java`
- `TestShape.java`

This example can demonstrate how different shapes share a common abstract parent class while providing their own implementations for shape-related operations.

#### Shape.java

This file contains a class named `Shape`.

An abstract class named `Shape` can provide a common structure for different geometric shapes.

For example:
- Circle
- Rectangle
- Triangle

**Purpose:**
- Define a common parent class for different shapes.
- Declare common abstract methods.
- Provide common concrete methods if required.
- Allow child classes to provide their own implementations.

#### Circle.java

This file contains a class named `Circle`.

A Circle class represents a circular geometric shape.

It can provide implementations for operations defined in the `Shape` class.

For example, a circle has its own formula for calculating area.

#### Rectangle.java

This file contains a class named `Rectangle`.

A Rectangle class represents a rectangular geometric shape.

It can provide its own implementation for shape-related operations.

For example, calculating the area of a rectangle requires its length and width.

#### Triangle.java

This file contains a class named `Triangle`.

A Triangle class represents a triangular geometric shape.

It can provide its own implementation for operations defined by the abstract parent class.

For example, calculating the area of a triangle requires its base and height.

#### TestShape.java

This file contains a class named `TestShape`.

A test class is generally used to create objects of child classes and execute their methods.

**Purpose:**
- Create Circle, Rectangle, and Triangle objects.
- Access the functionality of the shape classes.
- Execute the program and observe the results.

*The exact object creation, method names, and output depend on the source code.*

### 3.2 Shape Example – Conceptual Flow

```text
             ┌───────────────────┐
             │    Shape.java     │
             │  Abstract Class   │
             └─────────┬─────────┘
                       │
             ┌─────────┼─────────┐
             │         │         │
             ▼         ▼         ▼
       ┌──────────┐ ┌──────────┐ ┌──────────┐
       │ Circle   │ │Rectangle │ │ Triangle │
       │  .java   │ │  .java   │ │  .java   │
       └────┬─────┘ └────┬─────┘ └────┬─────┘
            │            │            │
            ▼            ▼            ▼
       ┌──────────┐ ┌──────────┐ ┌──────────┐
       │ Provide  │ │ Provide  │ │ Provide  │
       │ Own      │ │ Own      │ │ Own      │
       │ Methods  │ │ Methods  │ │ Methods  │
       └────┬─────┘ └────┬─────┘ └────┬─────┘
            │            │            │
            └────────────┼────────────┘
                         │
                         ▼
                ┌────────────────┐
                │  TestShape.java│
                │ Execute Example│
                └────────────────┘
```

This is a conceptual class relationship based on the filenames. The actual inheritance and method relationships should be confirmed from the source code.

## 4. Employee Abstraction

The Employee example contains the following files:

- `Employee.java`
- `HourlyEmployee.java`
- `SalariedEmployee.java`
- `TestEmployee.java`

This example can demonstrate how an abstract Employee class provides a common structure for different employee types.

#### Employee.java

This file contains a class named `Employee`.

An abstract Employee class can define common employee-related information and functionality.

For example:
- Employee name
- Employee ID
- Employee details
- Common employee operations

It can also declare abstract methods when different employee types need different implementations.

#### HourlyEmployee.java

This file contains a class named `HourlyEmployee`.

An hourly employee is generally paid based on the number of hours worked and an hourly payment rate.

This class can provide the implementation of employee-related operations according to hourly payment calculations.

#### SalariedEmployee.java

This file contains a class named `SalariedEmployee`.

A salaried employee generally receives a fixed salary for a specified payment period.

This class can provide its own implementation of employee-related operations.

#### TestEmployee.java

This file contains a class named `TestEmployee`.

A test class is generally used to create employee objects and execute their methods.

**Purpose:**
- Create employee-related objects.
- Access employee class functionality.
- Execute the employee example.
- Observe the program output.

*The exact fields, constructors, calculations, and method implementations depend on your source code.*

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
       │ Implementation  │ │ Implementation   │
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

This diagram represents the general idea of employee abstraction. The exact class relationships and payment calculations depend on your implementation.

## 6. Important Concepts Covered

### 6.1 Abstract Class

An abstract class is declared using the `abstract` keyword.

It provides a common structure for related classes.

### 6.2 Abstract Method

An abstract method is declared without a method body.

A concrete child class must implement the inherited abstract method.

### 6.3 Concrete Method

A concrete method contains its implementation inside the method body.

Child classes can inherit and use it.

### 6.4 Inheritance

Inheritance allows one class to acquire the properties and methods of another class.

Java uses the `extends` keyword to inherit an abstract class.

### 6.5 Method Overriding

Method overriding occurs when a child class provides its own implementation of an inherited instance method with a compatible method signature.

### 6.6 Runtime Polymorphism

Runtime polymorphism allows a parent class reference to refer to different child class objects.

When an overridden instance method is called, Java selects the implementation based on the actual object at runtime.

## 7. Real-Time Applications

| Example | Real-Time Application |
|---|---|
| Shape | Drawing and Geometry Applications |
| Circle | Area and Measurement Applications |
| Rectangle | Design and Layout Applications |
| Triangle | Geometry Applications |
| Employee | Employee Management Systems |
| HourlyEmployee | Payroll Management |
| SalariedEmployee | Salary Management |

## 8. Advantages

1. Provides a common structure for related classes.
2. Reduces duplicate code.
3. Supports inheritance.
4. Allows different child classes to provide their own implementations.
5. Supports runtime polymorphism.
6. Improves code organization and maintainability.

## 9. Disadvantages

1. Requires proper planning of the parent-child class structure.
2. An abstract class cannot be instantiated directly.
3. A concrete child class must implement inherited abstract methods.
4. Java does not support extending multiple classes.
5. Unnecessary abstraction can make simple programs more complicated.

## 10. Learning Outcomes

After completing this package, we can understand:

- How to create an abstract class.
- How multiple child classes can extend an abstract class.
- How abstract methods are implemented.
- How method overriding works.
- How abstraction is applied to shapes.
- How abstraction is applied to employee types.
- How abstract classes support runtime polymorphism.

## 11. Technologies Used

- Programming Language: Java
- Concept: Object-Oriented Programming
- OOP Topic: Abstraction
- Mechanism: Abstract Class
- IDE: Eclipse / Any Java-supported IDE

## 12. Conclusion

The `abstractClass` package demonstrates abstraction using Shape and Employee examples.

The Shape example helps us understand how different geometric shapes can share a common structure.

The Employee example helps us understand how different employee types can share common employee-related functionality while providing their own specific implementations.

These programs help build a practical understanding of abstract classes, inheritance, method overriding, and runtime polymorphism in Java.

## Author

**Sri Dhanya**

