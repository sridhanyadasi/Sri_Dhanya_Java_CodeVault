# Inheritance in Java

## 1. Introduction

Inheritance is one of the four main principles of Object-Oriented Programming (OOP) in Java.

Inheritance is a mechanism in which one class acquires the properties and methods of another class.

The class whose properties and methods are inherited is called the **Parent Class (Superclass)**.

The class that inherits those properties and methods is called the **Child Class (Subclass)**.

Java uses the `extends` keyword to implement inheritance between classes.

### Example

Consider a Vehicle and Car.

- Vehicle is a parent class.
- Car is a child class.
- A Car can use common properties and methods defined in Vehicle.
- Car can also have its own additional properties and methods.

## 2. Why Do We Use Inheritance?

- To achieve code reusability.
- To reduce code duplication.
- To establish relationships between classes.
- To extend the functionality of existing classes.
- To make applications easier to maintain.
- To support runtime polymorphism through method overriding.

## 3. Basic Inheritance Structure

### Diagram

```text
          Parent Class
               |
          extends
               |
          Child Class
               |
       Inherited Members
```

### Syntax

```java
class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class method");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.display();
        obj.show();
    }
}
```

### Output

```text
Parent class method
Child class method
```

### Explanation

1. `Parent` is the superclass.
2. `Child` is the subclass.
3. The `extends` keyword establishes inheritance.
4. The child class can access inherited accessible members of the parent class.
5. The child class can also define its own methods and variables.

## 4. Types of Inheritance in Java

Java supports three main types of class inheritance.

### 4.1 Single Inheritance

One child class inherits from one parent class.

**Diagram:**

```text
       Vehicle
          |
        Car
```

**Example:**

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}
```

### 4.2 Multilevel Inheritance

A class inherits from another child class, forming a chain of inheritance.

**Diagram:**

```text
        Vehicle
           |
          Car
           |
      ElectricCar
```

**Example:**

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging");
    }
}
```

ElectricCar can access the inherited accessible methods from both Car and Vehicle.

### 4.3 Hierarchical Inheritance

Multiple child classes inherit from the same parent class.

**Diagram:**

```text
            Animal
           /  |   \
          /   |    \
        Dog  Cat   Bird
```

**Example:**

```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird flies");
    }
}
```

All three child classes can use the accessible `eat()` method from Animal.

## 5. Multiple Inheritance in Java

Multiple inheritance means one child class inherits from two or more parent classes.

**Diagram:**

```text
       Parent A       Parent B
            \         /
             \       /
              \     /
              Child
```

Java does not support multiple inheritance through classes.

### Why Does Java Not Support Multiple Inheritance Through Classes?

One important reason is the **Diamond Problem**.

## 6. What Is the Diamond Problem?

The Diamond Problem is an ambiguity that can occur when a child class inherits the same method from two different parent classes.

The compiler cannot automatically decide which parent's implementation should be used.

### Diamond Problem Diagram

```text
             A
           /   \
          /     \
         B       C
          \     /
           \   /
             D
```

### How Does This Problem Occur?

Consider the following example:

- Class A contains a method called `display()`.
- Class B inherits from A.
- Class C also inherits from A.
- Class D inherits from both B and C.

Now D may receive two inheritance paths to the same method.

### Example of the Ambiguity

```java
class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
}

class C extends A {
}

// Not allowed in Java
class D extends B, C {
}
```

The declaration `class D extends B, C` is invalid Java syntax.

Java avoids this ambiguity by not allowing a class to extend multiple classes.

### How Does Java Handle Multiple Inheritance?

Java supports multiple inheritance through interfaces.

If two interfaces contain the same abstract method, the implementing class can provide one implementation.

If two interfaces provide the same default method, the implementing class must resolve the conflict by overriding that method.

**Example:**

```java
interface A {
    default void display() {
        System.out.println("Interface A");
    }
}

interface B {
    default void display() {
        System.out.println("Interface B");
    }
}

class C implements A, B {

    @Override
    public void display() {
        A.super.display();
        B.super.display();
    }
}

public class Test {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
```

### Output

```text
Interface A
Interface B
```

**Important:** Java allows a class to implement multiple interfaces, but conflicting default methods must be resolved explicitly.

## 7. Important Keywords Used in Inheritance

| Keyword | Purpose |
|---|---|
| `extends` | Used to inherit a class. |
| `implements` | Used to implement one or more interfaces. |
| `super` | Used to access parent class constructors and members. |
| `this` | Refers to the current object. |

### 7.1 super Keyword

The `super` keyword refers to the immediate parent class object context.

It is commonly used for:

- Accessing parent class variables.
- Calling parent class methods.
- Calling parent class constructors using `super()`.

### Example

```java
class Parent {
    int value = 100;

    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    int value = 200;

    void show() {
        System.out.println(super.value);
        super.display();
    }
}
```

## 8. Constructor Execution in Inheritance

When a child class object is created, the parent class constructor executes before the child class constructor.

**Flow Diagram:**

```text
Create Child Object
        |
        v
Parent Constructor
        |
        v
Child Constructor
        |
        v
Object Creation Complete
```

### Example

```java
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
```

### Output

```text
Parent Constructor
Child Constructor
```

**Note:** If no explicit constructor invocation is written, Java inserts an implicit `super()` call when the parent has an accessible no-argument constructor.

## 9. Method Overriding in Inheritance

Method overriding occurs when a child class provides its own implementation of an inherited method with the same method signature.

### Diagram

```text
        Parent Class
        display()
             |
             |
        Child Class
        display()
        (Overridden)
```

### Example

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

Method overriding is an important part of runtime polymorphism.

## 10. Advantages of Inheritance

- Code reusability.
- Reduced code duplication.
- Easy extension of existing classes.
- Better organization of related classes.
- Supports runtime polymorphism.
- Improves maintainability when used appropriately.

## 11. Limitations of Inheritance

- Creates dependency between parent and child classes.
- Changes in the parent class may affect child classes.
- Deep inheritance hierarchies can become difficult to understand.
- Inheritance should be used only when a proper parent-child relationship exists.
- Poorly designed inheritance can make applications difficult to maintain.

## 12. Real-World Applications

Inheritance is commonly used in:

- Banking applications.
- E-commerce applications.
- Employee management systems.
- Vehicle management systems.
- Animal classification systems.
- Shape and drawing applications.
- Enterprise applications.

### Real-World Example: Employee Management

```text
              Person
                |
             Employee
                |
              Manager
```

Person contains common details such as name and age.

Employee inherits Person details and adds employee ID and salary.

Manager inherits Employee details and adds manager-specific responsibilities.

This avoids repeating common properties in every class.

## 13. Project Structure

This project contains multiple packages with practical inheritance examples.

```text
Inheritance/
│
└── src/
    └── com/
        └── te/
            ├── inheritance/
            ├── inheritance1/
            ├── inheritance2/
            ├── inheritance3/
            └── inheritance4/
```

Each package contains Java programs demonstrating inheritance using different examples such as vehicles, employees, animals, shapes, banking accounts, and workers.

Refer to the Java source files in each package for implementation examples.

## 14. Learning Outcomes

After completing this project, you will be able to:

- Understand inheritance in Java.
- Identify parent and child classes.
- Implement inheritance using the `extends` keyword.
- Understand single, multilevel, and hierarchical inheritance.
- Explain why Java does not support multiple class inheritance.
- Understand the Diamond Problem.
- Implement multiple interfaces.
- Use the `super` keyword.
- Understand constructor execution order.
- Implement method overriding.
- Apply inheritance to real-world applications.

## Author

Sri Dhanya
