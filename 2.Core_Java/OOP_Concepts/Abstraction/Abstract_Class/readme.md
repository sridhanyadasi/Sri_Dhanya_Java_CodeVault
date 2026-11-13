


# Abstract Class in Java

## 1. Introduction

An abstract class is a class declared using the `abstract` keyword.

It is used when we want to provide a common structure for multiple related classes while allowing each child class to provide its own implementation for certain methods.

An abstract class can contain both:
- Abstract methods (methods without a body).
- Concrete methods (methods with a body).

An abstract class cannot be instantiated directly.

### Real-Time Example

Consider a vehicle.

Different vehicles such as Car, Bike, and Truck have some common features:
- Every vehicle can start.
- Every vehicle can stop.
- Every vehicle has its own way of operating.

We can create a common abstract class called `Vehicle` and define common functionality inside it.

Each child class can provide its own implementation for the abstract methods.

## 2. Why Do We Need an Abstract Class?

Suppose we have multiple classes such as:

- Car
- Bike
- Truck

All these classes represent vehicles and share some common behaviour.

Instead of writing the same common structure separately in every class, we can define it in one abstract parent class.

An abstract class helps us:

1. Define common properties and methods.
2. Avoid unnecessary code duplication.
3. Provide a common structure for child classes.
4. Force child classes to implement required abstract methods.
5. Support runtime polymorphism.
6. Improve code reusability and maintainability.

## 3. Syntax of an Abstract Class

```java
abstract class ClassName {

    // Abstract method
    abstract void methodName();

    // Concrete method
    void display() {
        System.out.println("Concrete method");
    }
}
```

Explanation:

- `abstract` – Keyword used to declare an abstract class.
- `class` – Keyword used to create a class.
- `ClassName` – Name of the abstract class.
- `abstract void methodName()` – Abstract method without a body.
- `display()` – Concrete method with a body.

## 4. Important Characteristics of an Abstract Class

1. An abstract class must be declared using the `abstract` keyword.
2. We cannot create an object directly for an abstract class.
3. An abstract class can contain abstract methods.
4. An abstract class can contain concrete methods.
5. It can contain constructors.
6. It can contain instance variables and static variables.
7. It can contain static methods.
8. It can contain final methods.
9. An abstract class can extend another class.
10. A normal class can extend an abstract class.
11. An abstract class can extend another abstract class.
12. An abstract class can implement interfaces.
13. An abstract class can have zero or more abstract methods.
14. A child class must implement all inherited abstract methods unless the child class is also declared abstract.

## 5. Types of Methods in an Abstract Class

An abstract class mainly supports two types of methods.

### 5.1 Abstract Method

An abstract method is a method that is declared without a method body.

It contains the method declaration but does not provide the implementation.

Syntax:

```java
abstract void calculate();
```

Important points:

- It must be declared using the `abstract` keyword.
- It does not contain a method body.
- A concrete child class must provide its implementation.
- An abstract method cannot be declared as `private`, `static`, or `final`.

### 5.2 Concrete Method

A concrete method is a normal method that contains a method body.

Syntax:

```java
void display() {
    System.out.println("Welcome");
}
```

Important points:

- It contains implementation.
- It can be directly used by child classes through inheritance.
- It does not require overriding.
- A child class can override it if required.

## 6. Complete Example of an Abstract Class

Let's understand abstraction using a Vehicle example.

### Vehicle.java

```java
abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}
```

### Car.java

```java
class Car extends Vehicle {

    // Implementing the abstract method
    void start() {
        System.out.println("Car starts using a key");
    }
}
```

### TestVehicle.java

```java
class TestVehicle {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        car.stop();
    }
}
```

### Output

```text
Car starts using a key
Vehicle stopped
```

### Explanation

1. `Vehicle` is declared as an abstract class.
2. It contains an abstract method named `start()`.
3. It also contains a concrete method named `stop()`.
4. `Car` extends the `Vehicle` class.
5. The `Car` class provides the implementation for `start()`.
6. The `TestVehicle` class creates an object of `Car`.
7. The object calls both `start()` and `stop()` methods.

Here, the child class provides its own implementation of the abstract method, while it inherits the concrete method from the parent class.

## 7. Abstract Class Flowchart

```text
       ┌──────────────────────────┐
       │          START           │
       └────────────┬─────────────┘
                    │
                    ▼
       ┌──────────────────────────┐
       │ Declare Abstract Class   │
       └────────────┬─────────────┘
                    │
                    ▼
       ┌──────────────────────────┐
       │ Declare Abstract Method  │
       │ and Concrete Method      │
       └────────────┬─────────────┘
                    │
                    ▼
       ┌──────────────────────────┐
       │ Create Child Class       │
       └────────────┬─────────────┘
                    │
                    ▼
       ┌──────────────────────────┐
       │ Extend Abstract Class    │
       └────────────┬─────────────┘
                    │
                    ▼
       ┌──────────────────────────┐
       │ Implement Abstract      │
       │ Methods                  │
       └────────────┬─────────────┘
                    │
                    ▼
       ┌──────────────────────────┐
       │ Create Child Class Object│
       └────────────┬─────────────┘
                    │
                    ▼
       ┌──────────────────────────┐
       │ Call Required Methods    │
       └────────────┬─────────────┘
                    │
                    ▼
       ┌──────────────────────────┐
       │           END            │
       └──────────────────────────┘
```

## 8. Can We Create an Object for an Abstract Class?

No. We cannot instantiate an abstract class directly.

Example:

```java
abstract class Animal {

    abstract void sound();
}
```

Invalid:

```java
Animal animal = new Animal();
```

This produces a compilation error because an abstract class cannot be instantiated.

### Can We Create a Reference Variable?

Yes.

```java
Animal animal;
```

We can also assign a child class object to an abstract parent class reference.

```java
Animal animal = new Dog();
```

This is allowed if `Dog` is a concrete child class that implements all inherited abstract methods.

This is also an example of runtime polymorphism when an overridden instance method is called through the parent reference.

## 9. Constructor in an Abstract Class

An abstract class can have a constructor.

Even though we cannot create an abstract class object directly, its constructor is called when a child class object is created.

Example:

```java
abstract class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }

    abstract void sound();
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog constructor");
    }

    void sound() {
        System.out.println("Dog barks");
    }
}

class TestAnimal {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
    }
}
```

Output:

```text
Animal constructor
Dog constructor
Dog barks
```

Explanation:

1. We create a `Dog` object.
2. The parent class constructor executes first.
3. The child class constructor executes next.
4. The `sound()` method executes when called.

## 10. Abstract Class with No Abstract Methods

An abstract class can have zero abstract methods.

Example:

```java
abstract class Employee {

    void display() {
        System.out.println("Employee details");
    }
}
```

Here, `Employee` is an abstract class even though it does not contain any abstract methods.

We still cannot instantiate it directly.

Why is this allowed?

Sometimes we want to prevent direct object creation while providing common functionality to child classes.

## 11. Can an Abstract Class Have a Main Method?

Yes. An abstract class can contain a `main()` method.

Example:

```java
abstract class Demo {

    abstract void display();

    public static void main(String[] args) {

        System.out.println("Main method executed");
    }
}
```

The main method is static, so it can be executed without creating an object of the abstract class.

## 12. Extending an Abstract Class

A class uses the `extends` keyword to inherit an abstract class.

There are two possibilities.

**Case 1: Concrete child class**

A concrete child class must implement all inherited abstract methods.

**Case 2: Abstract child class**

An abstract child class does not have to implement all inherited abstract methods immediately. It can leave them for a further concrete subclass.

Example:

```java
abstract class Animal {

    abstract void sound();
}

abstract class Mammal extends Animal {

    // sound() is not implemented here
}

class Dog extends Mammal {

    void sound() {
        System.out.println("Dog barks");
    }
}
```

Here:
- `Animal` is an abstract class.
- `Mammal` extends `Animal` and is also abstract.
- `Dog` extends `Mammal` and implements `sound()`.

## 13. Abstract Class and Runtime Polymorphism

An abstract class can be used as a parent reference to hold different child class objects.

Example:

```java
abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class TestShape {

    public static void main(String[] args) {

        Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();
    }
}
```

Output:

```text
Drawing Circle
Drawing Rectangle
```

Flow:

```text
       ┌────────────────────────┐
       │ Shape Parent Reference │
       └───────────┬────────────┘
                   │
           ┌───────┴────────┐
           │                │
           ▼                ▼
    ┌────────────┐   ┌────────────┐
    │ Circle     │   │ Rectangle  │
    │ Object     │   │ Object     │
    └─────┬──────┘   └─────┬──────┘
          │                │
          ▼                ▼
    ┌────────────┐   ┌────────────┐
    │ Circle's   │   │ Rectangle's│
    │ draw()     │   │ draw()     │
    └────────────┘   └────────────┘
```

The method implementation is selected according to the actual object at runtime.

## 14. Abstract Class vs Normal Class

| Feature | Abstract Class | Normal Class |
|---|---|---|
| Declaration | Uses `abstract` keyword | Uses `class` keyword |
| Object creation | Cannot instantiate directly | Can instantiate |
| Abstract methods | Can contain them | Cannot contain abstract methods |
| Concrete methods | Can contain them | Can contain them |
| Constructors | Supported | Supported |
| Variables | Supported | Supported |
| Inheritance | Can be extended | Can be extended |

## 15. Advantages of Abstract Classes

1. Provide a common structure for related classes.
2. Reduce duplicate code.
3. Support abstraction.
4. Support inheritance.
5. Allow both abstract and concrete methods.
6. Support runtime polymorphism.
7. Improve code maintainability.

## 16. Disadvantages of Abstract Classes

1. A class can extend only one class in Java.
2. Abstract classes cannot be instantiated directly.
3. Poorly designed abstract classes can create unnecessary dependencies.
4. Child classes must implement inherited abstract methods unless they are also abstract.
5. They may be less suitable when unrelated classes need to share a common contract.

## 17. Real-Time Applications

Abstract classes are useful in:

- **Shape Applications:** Common structure for Circle, Rectangle, and Triangle.
- **Employee Management:** Common structure for SalariedEmployee and HourlyEmployee.
- **Vehicle Management:** Common structure for Car, Motorcycle, and Truck.
- **Payment Applications:** Common payment structure with different payment implementations.
- **Banking Applications:** Common account structure for different account types.

## 18. Learning Outcomes

After completing this topic, we can understand:

- What an abstract class is.
- Why abstract classes are required.
- How to declare an abstract class.
- Difference between abstract and concrete methods.
- Why abstract classes cannot be instantiated.
- How constructors work in abstract classes.
- How child classes extend abstract classes.
- How runtime polymorphism works with abstract classes.
- How abstract classes are used in real-time applications.

## 19. Conclusion

An abstract class is an important feature of Java abstraction.

It allows us to define common functionality and leave specific implementations to child classes.

By using abstract classes, we can create reusable and maintainable applications while providing a common structure for related classes.

## Author

**Sri Dhanya**

