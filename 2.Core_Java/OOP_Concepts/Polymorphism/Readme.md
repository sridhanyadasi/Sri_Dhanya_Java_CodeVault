# Polymorphism in Java

## 1. Introduction

Polymorphism is one of the four main principles of Object-Oriented Programming (OOP) in Java.

The word Polymorphism means **one name, many forms**.

In Java, polymorphism allows the same method name or reference to perform different operations depending on the arguments passed or the actual object involved.

Polymorphism improves code flexibility, reusability and maintainability.

## 2. Why Do We Use Polymorphism?

- To perform different operations using the same method name.
- To achieve method overloading and method overriding.
- To improve code flexibility.
- To support runtime method execution.
- To reduce code duplication.
- To make applications easier to extend and maintain.

## 3. Types of Polymorphism in Java

Java supports two main types of polymorphism:

1. Compile-Time Polymorphism (Static Polymorphism)
2. Runtime Polymorphism (Dynamic Polymorphism)

### 3.1 Compile-Time Polymorphism

Compile-time polymorphism is achieved through **Method Overloading**.

Method overloading means defining multiple methods with the same name but different parameter lists within a class.

The compiler determines which method to execute based on the arguments passed during the method call.

**Flowchart:**

```text id="p7c4vx"
       ┌────────────────────────────┐
       │       Method Call          │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │   Check Method Arguments   │
       │                            │
       │   Number / Type / Order     │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │  Compiler Selects Matching │
       │          Method            │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │    Selected Method         │
       │       Executes             │
       └────────────────────────────┘
```

**Example:**

```java
class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class TestMath {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10.5, 20.5));
    }
}
```

**Output:**

```text
30
60
31.0
```

### 3.2 Runtime Polymorphism

Runtime polymorphism is achieved through **Method Overriding**.

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

The method that executes is determined at runtime based on the actual object.

**Flowchart:**

```text id="w4m9ka"
       ┌────────────────────────────┐
       │       Parent Class         │
       │                            │
       │       display()            │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │       Child Class          │
       │                            │
       │   Overrides display()      │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │   Parent Reference Holds   │
       │       Child Object         │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │    Method Called           │
       └─────────────┬──────────────┘
                     │
                     ↓
       ┌────────────────────────────┐
       │   Child Method Executes    │
       └────────────────────────────┘
```

**Example:**

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

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
```

**Output:**

```text
Dog barks
Cat meows
```

## 4. Method Overloading vs Method Overriding

| Method Overloading | Method Overriding |
|---|---|
| Same method name with different parameter lists | Same method signature in parent and child classes |
| Usually occurs within the same class | Requires inheritance |
| Compile-time polymorphism | Runtime polymorphism |
| Compiler selects the matching overload | Actual object determines the overridden method |
| Return type alone cannot distinguish overloaded methods | Return type must be compatible |

## 5. Important Concepts

### 5.1 Static Binding

Static binding means the method call is resolved at compile time.

Method overloading is an example of static binding.

### 5.2 Dynamic Binding

Dynamic binding means the method implementation is selected at runtime based on the actual object.

Method overriding is an example of dynamic binding.

### 5.3 Parent Reference and Child Object

Java allows a parent class reference to hold a child class object.

```java
Animal obj = new Dog();
```

This is commonly used to achieve runtime polymorphism.

### 5.4 Upcasting

Upcasting means converting a child class reference into a parent class reference.

```java
Dog d = new Dog();
Animal a = d;
```

Upcasting is performed automatically in Java.

## 6. Advantages of Polymorphism

- Improves code flexibility.
- Supports method overloading and overriding.
- Promotes code reusability.
- Supports runtime method selection.
- Makes applications easier to extend.
- Helps implement loosely coupled and maintainable designs.

## 7. Real-Time Applications

Polymorphism is commonly used in:

- Payment processing systems.
- Banking applications.
- Employee management systems.
- E-commerce applications.
- Notification systems.
- Vehicle management systems.

For example, a payment application can use a common `pay()` method with different implementations for UPI, Credit Card and Net Banking payments.

## 8. Learning Outcomes

After completing this topic, we can:

- Understand polymorphism in Java.
- Explain compile-time and runtime polymorphism.
- Implement method overloading.
- Implement method overriding.
- Understand static and dynamic binding.
- Understand parent references and child objects.
- Understand upcasting.
- Identify real-world applications of polymorphism.

## 9. Practice Questions

1. What is polymorphism in Java?
2. What are the two types of polymorphism?
3. What is method overloading?
4. What is method overriding?
5. What is the difference between overloading and overriding?
6. Which type of polymorphism is achieved through method overloading?
7. Which type of polymorphism is achieved through method overriding?
8. What is static binding?
9. What is dynamic binding?
10. Can a parent reference hold a child class object?
11. What is upcasting?
12. Can we overload a method by changing only its return type?
13. Is method overriding possible without inheritance?
14. When is an overridden method selected for execution?
15. Give real-world examples of polymorphism.

---

## 10. Conclusion

Polymorphism is an important OOP concept that allows one method name or reference to represent different behaviours.

Method overloading provides compile-time polymorphism, while method overriding provides runtime polymorphism. Both help develop flexible, reusable and maintainable Java applications.
