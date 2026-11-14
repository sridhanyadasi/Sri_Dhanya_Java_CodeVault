

# Interface – Package 3 (`interface3`)

## 1. Introduction

The `interface3` package contains Java examples related to interfaces and vehicle-based implementations.

It includes `Vehicle`, `Car`, `Bike`, `Auto`, and `TestVehicle` files.

This package can be used to understand how different vehicle types can follow a common contract and provide their own implementations.

## 2. Package Structure

```text id="4nb9j1"
interface3/
│
├── Auto.java
├── Bike.java
├── Car.java
├── TestVehicle.java
└── Vehicle.java
```

## 3. File-by-File Explanation

### 3.1 Vehicle.java

**Purpose:**

`Vehicle.java` represents the general vehicle-related type.

If declared as an interface, it can define common operations that different vehicle classes must implement.

For example, it may declare operations such as starting, stopping, or displaying vehicle details.

**Concepts to understand:**

- Interface declaration
- Abstract methods
- Common behaviour
- Abstraction

### 3.2 Car.java

**Purpose:**

`Car.java` represents a car-related implementation.

It can be used to understand how a specific vehicle class provides implementations for common vehicle operations.

**Concepts to understand:**

- Interface implementation
- `implements` keyword
- Method overriding
- Class-specific behaviour

### 3.3 Bike.java

**Purpose:**

`Bike.java` represents a bike-related implementation.

It can demonstrate how another vehicle type can follow the same common contract while providing its own behaviour.

**Concepts to understand:**

- Interface implementation
- Method overriding
- Code reusability
- Abstraction

### 3.4 Auto.java

**Purpose:**

`Auto.java` represents an auto-rickshaw-related implementation.

It can be studied along with `Car.java` and `Bike.java` to understand how different vehicle types can share a common structure.

**Concepts to understand:**

- Common interface behaviour
- Specific implementation
- Method overriding
- Polymorphism

### 3.5 TestVehicle.java

**Purpose:**

`TestVehicle.java` appears to be the testing or execution class.

It can be used to create vehicle objects, call methods, and observe the behaviour of different vehicle types.

**Concepts to understand:**

- Main method
- Object creation
- Method calling
- Interface references, if used
- Runtime polymorphism, if implemented

## 4. Important Concepts Covered

### 4.1 Interface Declaration

An interface defines a contract that implementing classes must follow.

Example:

```java id="7jv3w5"
interface Vehicle {

    void start();

    void stop();
}
```

### 4.2 Interface Implementation

A class uses the `implements` keyword to implement an interface.

Example:

```java id="3m5x7k"
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
```

### 4.3 Different Implementations

Different vehicle classes can implement the same interface.

For example:

- `Car` can provide car-specific behaviour.
- `Bike` can provide bike-specific behaviour.
- `Auto` can provide auto-specific behaviour.

Each class can provide its own implementation of the common methods.

### 4.4 Runtime Polymorphism

An interface reference can refer to an object of any class that implements that interface.

Example:

```java id="w4n8rx"
interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car started");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike started");
    }
}

public class TestVehicle {

    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}
```

**Output:**

```text id="x1z7mf"
Car started
Bike started
```

Here, the same interface reference is used for different implementing-class objects.

The overridden method is selected according to the actual object at runtime.

## 5. Conceptual Flowchart

```text id="3u4m6x"
            START
              |
              v
       Vehicle Interface
              |
              v
      Declare Common Methods
              |
              v
       Implementing Classes
              |
       +------+------+ 
       |      |      |
       v      v      v
      Car    Bike   Auto
       |      |      |
       v      v      v
   Specific Specific Specific
  Behaviour Behaviour Behaviour
       |      |      |
       +------+------+ 
              |
              v
        TestVehicle
              |
              v
       Call Vehicle Methods
              |
              v
       Observe Output
              |
              v
             END
```

*This diagram represents the conceptual design suggested by the filenames. Confirm the actual inheritance and implementation relationships using the source code.*

## 6. Real-Time Applications

1. **Vehicle Rental Applications:** Represent different vehicle types using a common contract.
2. **Transportation Management:** Manage cars, bikes, and auto-rickshaws through common operations.
3. **Vehicle Booking Applications:** Handle different vehicle categories using a common structure.
4. **Fleet Management Systems:** Perform common operations on different vehicle objects.
5. **Polymorphic Applications:** Process different implementing objects through a common interface reference.

## 7. Advantages

- Defines common behaviour for different classes.
- Supports abstraction.
- Supports runtime polymorphism.
- Reduces dependency on specific implementations.
- Improves code reusability.
- Makes it easier to add new vehicle types.
- Improves application flexibility.

## 8. Disadvantages

- Implementing classes must provide required abstract methods.
- Poorly designed interfaces can become difficult to maintain.
- Interface changes may affect implementing classes.
- Interfaces cannot be instantiated directly.
- Too many unnecessary methods can make implementations complicated.

## 9. Learning Outcomes

After completing this package, learners should be able to:

- Understand how interfaces define common contracts.
- Implement an interface in different classes.
- Understand the `implements` keyword.
- Identify common and specific behaviours.
- Understand interface references.
- Explain runtime polymorphism.
- Understand how test classes execute interface-based examples.
- Apply interfaces in real-time vehicle-related applications.

## 10. Technologies Used

- Programming Language: Java
- Concept: Object-Oriented Programming
- Main Topic: Interface
- Related Topics: Abstraction, Method Overriding, Polymorphism

## 11. Conclusion

The `interface3` package provides a vehicle-based example for understanding interfaces.

By studying `Vehicle`, `Car`, `Bike`, `Auto`, and `TestVehicle`, learners can explore how different classes can follow a common contract while providing their own implementations.

This package helps build a practical understanding of interface implementation and runtime polymorphism.

## Author

**Sri Dhanya**

