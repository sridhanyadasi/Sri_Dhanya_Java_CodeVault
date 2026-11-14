

# Interface in Java

## 1. Introduction

An interface in Java is a blueprint that defines a contract for classes.

It specifies what a class must do, but generally does not specify how the class must perform those operations.

A class uses the `implements` keyword to implement an interface and provide implementations for its abstract methods.

Interfaces are an important part of Java Object-Oriented Programming (OOP).

## 2. Why Do We Use Interfaces?

Interfaces are used to achieve abstraction and define common behaviour for different classes.

Consider a real-time example:

A payment application supports different payment methods:

- UPI
- Credit Card
- Debit Card
- Net Banking

Every payment method performs a payment, but the implementation is different.

We can define a common `Payment` interface and implement it in different classes.

This helps us maintain a common structure while allowing different implementations.

## 3. Syntax of an Interface

```java
interface InterfaceName {

    // Abstract method
    void display();
}
```

### Implementing an Interface

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class MainTest {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}
```

**Output:**

```text
Dog barks
```

### Explanation

1. `Animal` is an interface.
2. `sound()` is an abstract method.
3. `Dog` implements the `Animal` interface.
4. The `Dog` class provides the implementation of `sound()`.
5. The main method creates a `Dog` object and calls the method.

## 4. Important Features of Interfaces

### 4.1 Abstraction

Interfaces provide abstraction by defining a contract without requiring the interface to provide the implementation of every operation.

### 4.2 Multiple Inheritance

Java does not support multiple inheritance through classes.

However, a class can implement multiple interfaces.

```java
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Mobile implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Taking photo");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }
}
```

Here, `Mobile` implements two interfaces.

### 4.3 Interface Variables

Variables declared inside an interface are implicitly:

- `public`
- `static`
- `final`

Example:

```java
interface Constants {

    int MAX_VALUE = 100;
}
```

The variable `MAX_VALUE` is a constant. It cannot be reassigned.

### 4.4 Abstract Methods

Traditional interface methods without a body are implicitly public and abstract.

```java
interface Vehicle {

    void start();

    void stop();
}
```

The implementing class must provide implementations for these methods unless it is declared abstract.

### 4.5 Default Methods

Default methods were introduced in Java 8.

They contain a method body and use the `default` keyword.

```java
interface Vehicle {

    default void display() {
        System.out.println("Vehicle information");
    }
}
```

An implementing class inherits this method and can override it.

### 4.6 Static Methods

Static methods in interfaces were introduced in Java 8.

They belong to the interface and are called using the interface name.

```java
interface Calculator {

    static void display() {
        System.out.println("Calculator");
    }
}

public class MainTest {

    public static void main(String[] args) {

        Calculator.display();
    }
}
```

### 4.7 Private Methods

Private methods in interfaces were introduced in Java 9.

They help reuse common logic inside default and static methods.

```java
interface Vehicle {

    private void message() {
        System.out.println("Vehicle operation");
    }

    default void start() {
        message();
    }
}
```

A private interface method cannot be directly called by an implementing class.

## 5. Types of Interfaces

Interfaces are commonly classified into the following categories.

### 5.1 Normal Interface

A normal interface can contain multiple abstract methods.

```java
interface Vehicle {

    void start();

    void stop();
}
```

### 5.2 Functional Interface

A functional interface contains exactly one abstract method.

It can contain default and static methods as well.

It is commonly used with lambda expressions.

```java
@FunctionalInterface
interface Calculator {

    int add(int a, int b);
}
```

Implementation using a lambda expression:

```java
public class MainTest {

    public static void main(String[] args) {

        Calculator c = (a, b) -> a + b;

        System.out.println(c.add(10, 20));
    }
}
```

**Output:**

```text
30
```

### 5.3 Marker Interface

A marker interface does not declare any methods or fields.

It is used to indicate that a class has a particular characteristic or capability.

Examples from Java:

- `Serializable`
- `Cloneable`

```java
interface MyMarker {
}

class Student implements MyMarker {
}
```

## 6. Multiple Inheritance Through Interfaces

Java allows a class to implement multiple interfaces.

Example:

```java
interface Printable {

    void print();
}

interface Showable {

    void show();
}

class Demo implements Printable, Showable {

    public void print() {
        System.out.println("Printing");
    }

    public void show() {
        System.out.println("Showing");
    }
}
```

### Flowchart

```text
       Printable Interface
               |
               |
               v
          +---------+
          |         |
          |  Demo   |
          |         |
          +---------+
               ^
               |
               |
        Showable Interface
```

The `Demo` class implements both interfaces and provides implementations for their abstract methods.

## 7. How an Interface Works

```text
          START
            |
            v
      Create Interface
            |
            v
   Declare Required Methods
            |
            v
   Create Implementing Class
            |
            v
  Use implements Keyword
            |
            v
 Implement Required Methods
            |
            v
      Create Object
            |
            v
       Call Methods
            |
            v
           END
```

## 8. Interface Reference and Object

An interface cannot be instantiated directly.

However, an interface reference can refer to an object of a class that implements it.

Example:

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

public class MainTest {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}
```

**Output:**

```text
Dog barks
```

Here:

- `Animal` is the interface.
- `Dog` is the implementing class.
- `a` is an interface reference.
- `new Dog()` creates the actual object.

This approach supports runtime polymorphism.

## 9. Interface vs Abstract Class

| Interface | Abstract Class |
|---|---|
| Declared using `interface` | Declared using `abstract class` |
| Implemented using `implements` | Extended using `extends` |
| A class can implement multiple interfaces | A class can extend only one class |
| Fields are implicitly public, static and final | Can have instance and static variables |
| Cannot have constructors | Can have constructors |
| Supports abstract, default, static and private methods | Supports abstract and concrete methods |
| Does not maintain ordinary instance state | Can maintain instance state |

## 10. Interface vs Abstract Class – When to Use?

### Use an Interface When:

- Different classes need to follow the same contract.
- Multiple unrelated classes need common behaviour.
- A class needs to implement multiple contracts.
- You want to define capabilities such as `Runnable`, `Serializable`, or `Comparable`.

### Use an Abstract Class When:

- Related classes share common state.
- You want to provide common instance variables and constructors.
- You want to share implemented methods among subclasses.
- You need a common base class with partial implementation.

## 11. Real-Time Applications of Interfaces

### 11.1 Payment Application

A payment interface can define a common payment operation.

Different payment classes can implement their own payment processing logic.

### 11.2 Banking Application

An account-related interface can define common operations such as deposit and withdrawal.

Different account implementations can provide their own behaviour.

### 11.3 Vehicle Management System

Different vehicle classes can implement common capabilities such as starting, stopping, or moving.

### 11.4 Online Shopping Application

Different payment methods can implement a common payment contract.

### 11.5 File Handling

Java uses interfaces such as `Serializable` to identify objects that support serialization.

## 12. Advantages of Interfaces

1. Supports abstraction.
2. Supports multiple inheritance of type.
3. Promotes loose coupling.
4. Improves code reusability and flexibility.
5. Defines common contracts for different classes.
6. Makes applications easier to extend and maintain.
7. Supports runtime polymorphism.

## 13. Disadvantages of Interfaces

1. An interface cannot be instantiated directly.
2. Traditional interface fields cannot store separate instance state.
3. Implementing classes must provide required abstract method implementations.
4. A large interface with too many unrelated methods can become difficult to maintain.
5. Interface design changes can affect implementing classes.

## 14. Interface Package Structure

This project contains four packages for learning interfaces.

```text
Interface/
│
└── src/
    └── com/
        └── te/
            │
            ├── interface1/
            │
            ├── interface2/
            │
            ├── interface3/
            │
            └── interface4/
```

Each package contains different Java examples related to interfaces.

The package-specific README files explain each Java file and the concepts demonstrated by the examples.

## 15. Learning Outcomes

After completing this topic, learners should be able to:

- Understand what an interface is.
- Create and implement interfaces.
- Understand the `implements` keyword.
- Implement multiple interfaces in a single class.
- Understand interface variables and abstract methods.
- Use default and static methods.
- Understand private interface methods.
- Identify functional and marker interfaces.
- Understand interface references and runtime polymorphism.
- Differentiate interfaces from abstract classes.
- Apply interfaces in real-time Java applications.

## 16. Technologies Used

- Programming Language: Java
- Concept: Object-Oriented Programming
- Main Topic: Interface
- Related Concepts: Abstraction, Inheritance, Polymorphism, Method Overriding

## 17. Conclusion

Interfaces are an important feature of Java that help define common contracts for classes.

They provide abstraction, support multiple inheritance of type, and improve application flexibility.

By learning interfaces, developers can create loosely coupled applications that are easier to extend, test, and maintain.

## Author

**Sri Dhanya**


