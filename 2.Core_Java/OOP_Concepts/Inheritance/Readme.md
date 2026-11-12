# Inheritance in Java

## 1. Introduction

Inheritance is one of the four main principles of Object-Oriented Programming (OOP) in Java.

Inheritance allows one class to acquire the properties and methods of another class.

The class whose properties are inherited is called the **Parent Class (Super Class)**.

The class that inherits those properties is called the **Child Class (Sub Class)**.

Inheritance helps us reuse existing code and establish relationships between classes.

### Why Do We Use Inheritance?

- To achieve code reusability.
- To reduce code duplication.
- To extend existing class functionality.
- To support method overriding.
- To achieve runtime polymorphism.
- To create parent-child relationships between classes.

## 2. Basic Inheritance Structure

```text
       ┌──────────────────────┐
       │     Parent Class     │
       │                      │
       │   Properties         │
       │   Methods            │
       └──────────┬───────────┘
                  │
                  │ extends
                  ↓
       ┌──────────────────────┐
       │     Child Class      │
       │                      │
       │ Inherited Properties │
       │ Inherited Methods    │
       │ Own Properties       │
       │ Own Methods          │
       └──────────────────────┘
```

## 3. Syntax of Inheritance

The `extends` keyword is used to inherit one class from another class.

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

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.display();
        obj.show();
    }
}
```

**Output:**
```text
Parent class method
Child class method
```

**Explanation:**

- `Parent` is the parent class.
- `Child` extends the `Parent` class.
- The `Child` class can access the inherited `display()` method.
- The child class can also define its own methods.

## 4. Types of Inheritance in Java

Java supports the following types of inheritance through classes:

1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance

Multiple and Hybrid inheritance are not directly supported through classes in Java. However, similar structures can be achieved using interfaces.

### 4.1 Single Inheritance

In single inheritance, one child class inherits from one parent class.

**Flowchart:**

```text
       ┌──────────────────┐
       │   Parent Class   │
       └────────┬─────────┘
                │
                ↓
       ┌──────────────────┐
       │   Child Class    │
       └──────────────────┘
```

**Example:**

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}
```

**Output:**
```text
Animal is eating
Dog is barking
```

### 4.2 Multilevel Inheritance

In multilevel inheritance, one class inherits from another class, and a third class inherits from the second class.

**Flowchart:**

```text
       ┌──────────────────┐
       │   Grandparent    │
       │      Class       │
       └────────┬─────────┘
                │
                ↓
       ┌──────────────────┐
       │   Parent Class   │
       └────────┬─────────┘
                │
                ↓
       ┌──────────────────┐
       │   Child Class    │
       └──────────────────┘
```

**Example:**

```java
class Grandparent {
    void house() {
        System.out.println("Grandparent has a house");
    }
}

class Parent extends Grandparent {
    void car() {
        System.out.println("Parent has a car");
    }
}

class Child extends Parent {
    void bike() {
        System.out.println("Child has a bike");
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.house();
        obj.car();
        obj.bike();
    }
}
```

**Output:**
```text
Grandparent has a house
Parent has a car
Child has a bike
```

### 4.3 Hierarchical Inheritance

In hierarchical inheritance, multiple child classes inherit from the same parent class.

**Flowchart:**

```text
                ┌──────────────────┐
                │   Parent Class   │
                └────────┬─────────┘
                         │
              ┌──────────┴──────────┐
              │                     │
              ↓                     ↓
     ┌────────────────┐    ┌────────────────┐
     │  Child Class 1 │    │  Child Class 2 │
     └────────────────┘    └────────────────┘
```

**Example:**

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
```

**Output:**
```text
Animal is eating
Dog is barking
Animal is eating
Cat is meowing
```

### 4.4 Multiple Inheritance

In multiple inheritance, one child class inherits from more than one parent class.

**Flowchart:**

```text
       ┌──────────────────┐
       │   Parent Class A │
       └────────┬─────────┘
                │
                │
                ├──────────────┐
                               │
                               ↓
                      ┌────────────────┐
                      │  Child Class   │
                      └────────────────┘
                               ↑
                ┌──────────────┘
                │
       ┌────────┴─────────┐
       │   Parent Class B │
       └──────────────────┘
```

Java does not support multiple inheritance using classes.

**Reason:** It can create ambiguity when two parent classes contain methods with the same name and the child class inherits both.

However, Java supports multiple inheritance through interfaces.

### 4.5 Hybrid Inheritance

Hybrid inheritance is a combination of two or more types of inheritance.

Java does not support hybrid inheritance directly through classes. It can be implemented using interfaces.

## 5. Diamond Problem in Java

The Diamond Problem is an ambiguity problem that can occur in multiple inheritance.

Consider a class `D` inheriting from two classes `B` and `C`, which both inherit from class `A`.

**Flowchart:**

```text
                ┌──────────────┐
                │   Class A    │
                └──────┬───────┘
                       │
              ┌────────┴────────┐
              │                 │
              ↓                 ↓
       ┌──────────────┐  ┌──────────────┐
       │   Class B    │  │   Class C    │
       └──────┬───────┘  └──────┬───────┘
              │                 │
              └────────┬────────┘
                       │
                       ↓
                ┌──────────────┐
                │   Class D    │
                └──────────────┘
```

If classes `B` and `C` both provide the same method, class `D` may face ambiguity about which method to inherit.

Java avoids this problem by not supporting multiple inheritance through classes.

### Diamond Problem Using Interfaces

Java allows a class to implement multiple interfaces. If two interfaces provide the same default method, the implementing class must override that method.

**Flowchart:**

```text
       ┌────────────────────┐
       │    Interface A    │
       │                    │
       │ default display()  │
       └─────────┬──────────┘
                 │
                 │
        ┌────────┴────────┐
        │                 │
        ↓                 ↓
┌────────────────┐ ┌────────────────┐
│  Interface B   │ │  Interface C   │
│                │ │                │
│ Same Method    │ │ Same Method    │
└────────┬───────┘ └───────┬────────┘
         │                 │
         └────────┬────────┘
                  │
                  ↓
       ┌────────────────────┐
       │      Class D       │
       │                    │
       │ Overrides Method   │
       │ Resolves Ambiguity │
       └────────────────────┘
```

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

**Output:**
```text
Interface A
Interface B
```

**Explanation:**

- Interface `A` contains a default method named `display()`.
- Interface `B` also contains a default method named `display()`.
- Class `C` implements both interfaces.
- Class `C` overrides the `display()` method to resolve the conflict.
- `A.super.display()` and `B.super.display()` call the respective interface default methods.

## 6. Important Keywords Used in Inheritance

### 6.1 extends

The `extends` keyword is used when one class inherits another class.

```java
class Parent {
}

class Child extends Parent {
}
```

### 6.2 super

The `super` keyword refers to the immediate parent class object.

It is used to:

- Access parent class variables.
- Call parent class methods.
- Call parent class constructors.

**Example:**

```java
class Parent {
    int number = 10;

    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    int number = 20;

    void show() {
        System.out.println(super.number);
        super.display();
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
```

**Output:**
```text
10
Parent method
```

### 6.3 super() Constructor

The `super()` statement is used to call the parent class constructor.

**Example:**

```java
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child Constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
```

**Output:**
```text
Parent Constructor
Child Constructor
```

## 7. Constructor Execution in Inheritance

When we create a child class object, the parent class constructor executes first, followed by the child class constructor.

**Flowchart:**

```text
       ┌────────────────────────────┐
       │    Create Child Object     │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │ Parent Constructor Executes│
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │ Child Constructor Executes │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │ Object Initialization      │
       │        Completes           │
       └────────────────────────────┘
```

**Important Points:**

- Constructors are not inherited.
- Parent constructors execute before child constructors.
- If we do not explicitly write `super()`, Java inserts an implicit no-argument `super()` call when applicable.
- A parent class constructor must be accessible to the child constructor.

## 8. Method Overriding in Inheritance

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

**Flowchart:**

```text
       ┌────────────────────────────┐
       │       Parent Class         │
       │                            │
       │       display()            │
       │       "Parent Method"      │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │       Child Class          │
       │                            │
       │ Overrides display()        │
       │ "Child Method"             │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │   Child Object Calls       │
       │       display()            │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │   Child Method Executes    │
       └────────────────────────────┘
```

**Example:**

```java
class Parent {
    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child method");
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
```

**Output:**
```text
Child method
```

**Important Points:**

- Method name must be the same.
- Parameters must be the same.
- The return type must be the same or compatible through a covariant return type.
- The child class provides a new implementation.
- The `@Override` annotation helps the compiler check overriding.

## 9. Access Modifiers in Inheritance

Access modifiers control the visibility of class members.

| Modifier | Same Class | Same Package | Subclass in Other Package | Other Package |
|---|---|---|---|---|
| private | Yes | No | No | No |
| default | Yes | Yes | No | No |
| protected | Yes | Yes | Yes, subject to access rules | No |
| public | Yes | Yes | Yes | Yes |

**Important:**

- Private members are not directly accessible in child classes.
- Default members are accessible within the same package.
- Protected members are accessible in subclasses, including subclasses in other packages, subject to Java's protected-access rules.
- Public members are accessible wherever the class itself is accessible.

## 10. Real-Time Example of Inheritance

Consider an employee management system.

A `Person` class contains common details such as name and age. The `Employee` class inherits these details and adds employee-specific information.

**Flowchart:**

```text
       ┌────────────────────────────┐
       │        Person              │
       │                            │
       │       name                 │
       │       age                  │
       │       displayDetails()     │
       └─────────────┬──────────────┘
                     │
                     │ extends
                     ↓
       ┌────────────────────────────┐
       │        Employee            │
       │                            │
       │       employeeId           │
       │       salary               │
       │       displaySalary()      │
       └────────────────────────────┘
```

This approach avoids writing common person details again in the employee class.

## 11. Advantages of Inheritance

- Code reusability.
- Less code duplication.
- Easy maintenance.
- Supports method overriding.
- Supports runtime polymorphism.
- Helps create a logical class hierarchy.

## 12. Limitations of Inheritance

- Creates tight coupling between parent and child classes.
- Changes in the parent class may affect child classes.
- Deep inheritance hierarchies can become difficult to maintain.
- Incorrect inheritance relationships can make code confusing.
- Java does not support multiple inheritance through classes.

## 13. Inheritance vs Composition

| Inheritance | Composition |
|---|---|
| Represents an IS-A relationship | Represents a HAS-A relationship |
| Uses `extends` | Uses object references |
| Child inherits parent functionality | One class uses another class object |
| Creates a parent-child relationship | Creates a whole-part or usage relationship |

**Example:**

- Dog IS-A Animal — Inheritance.
- Car HAS-A Engine — Composition.

## 14. Learning Outcomes

After completing this topic, we should be able to:

- Understand inheritance in Java.
- Identify parent and child classes.
- Use the `extends` keyword.
- Understand different types of inheritance.
- Explain why Java does not support multiple inheritance through classes.
- Understand the Diamond Problem.
- Use interfaces to implement multiple inheritance-like structures.
- Understand `super` and `super()`.
- Explain constructor execution order.
- Implement method overriding.
- Identify suitable inheritance relationships in real-world applications.

## 15. Practice Questions

1. What is inheritance in Java?
2. What is the difference between a parent class and a child class?
3. Which keyword is used to achieve inheritance?
4. What are the types of inheritance supported through classes in Java?
5. Does Java support multiple inheritance through classes? Why?
6. What is the Diamond Problem?
7. How can Java achieve multiple inheritance using interfaces?
8. What is the purpose of the `super` keyword?
9. What is the difference between `super` and `super()`?
10. Are constructors inherited in Java?
11. Which constructor executes first when a child object is created?
12. What is method overriding?
13. What is the purpose of the `@Override` annotation?
14. Can private methods be directly accessed in a child class?
15. What is the difference between inheritance and composition?

---

**Conclusion**

Inheritance is an important OOP concept in Java that promotes code reusability and supports method overriding. It helps developers create relationships between classes and build maintainable applications.
