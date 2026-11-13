# Polymorphism in Java

## 1. Introduction – What is Polymorphism?

Polymorphism is one of the main concepts of Object-Oriented Programming (OOP) in Java.

The word **Polymorphism** means **many forms**.

In Java, polymorphism allows one method name, object reference, or common parent type to represent different behaviours depending on the situation.

For example, different animals make different sounds:
- Dog makes a barking sound.
- Cat makes a meowing sound.
- Cow makes a mooing sound.

The same action, `makeSound()`, produces different results for different animals.

This is called polymorphism.

## 2. Why is Polymorphism Used?

Polymorphism is used to make Java applications more flexible, reusable, and easier to maintain.

Without polymorphism, we may need to write separate code for every object or class.

With polymorphism, we can use a common method name or parent reference to work with different objects.

**Main reasons:**
- To perform the same operation in different ways.
- To reduce repeated code.
- To improve code reusability.
- To make applications flexible.
- To support method overloading and method overriding.
- To make it easier to extend existing applications.

## 3. Uses of Polymorphism

Polymorphism is commonly used in:

1. **Payment Applications:** Different payment methods such as UPI, Credit Card, and Debit Card can have their own payment implementation.
2. **Banking Applications:** Different account types can implement common operations differently.
3. **Vehicle Applications:** Different vehicles can provide their own implementation of common operations.
4. **Employee Management:** Different employee roles can have different implementations of common operations.
5. **GUI Applications:** Different buttons or components can respond differently to the same action.
6. **Application Development:** Common parent references can be used to handle different child objects.

## 4. Types of Polymorphism in Java

Java supports two main types of polymorphism:

### 4.1 Compile-Time Polymorphism (Static Polymorphism)

Compile-time polymorphism is achieved through **Method Overloading**.

Method overloading means defining multiple methods with the same name but different parameter lists within a class.

The compiler identifies the correct method based on the arguments passed during compilation.

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
```

Here, the method name is the same (`add`), but the parameters are different.

The compiler selects the appropriate method based on the arguments.

**Flowchart – Method Overloading**

```text
       ┌──────────────────────┐
       │     Main Method      │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Call add() Method    │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Check Arguments and  │
       │ Parameter List       │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Compiler Selects the │
       │ Matching Method     │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Execute the Selected │
       │ Method               │
       └──────────────────────┘
```

### 4.2 Runtime Polymorphism (Dynamic Polymorphism)

Runtime polymorphism is achieved through **Method Overriding**.

Method overriding occurs when a child class provides its own implementation of a method already defined in its parent class.

The method that executes is determined at runtime based on the actual object.

**Example:**

```java
class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
```

Test class:

```java
class TestAnimal {

    public static void main(String[] args) {

        Animal animal;

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();
    }
}
```

Here, the parent class reference `animal` refers to different child class objects.

The actual object determines which overridden method executes.

**Flowchart – Method Overriding**

```text
       ┌──────────────────────┐
       │     Main Method      │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Create Parent Class  │
       │ Reference            │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Assign Child Class   │
       │ Object               │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Call Overridden      │
       │ Method               │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ JVM Checks Actual    │
       │ Object at Runtime    │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Execute the Child    │
       │ Class Method         │
       └──────────────────────┘
```

## 5. Method Overloading vs Method Overriding

| Method Overloading | Method Overriding |
|---|---|
| Achieves compile-time polymorphism. | Achieves runtime polymorphism. |
| Methods have the same name with different parameter lists. | Child class provides a new implementation of a parent class method. |
| Usually happens within the same class. | Requires inheritance between classes. |
| Compiler selects the matching method. | Runtime object determines the overridden method. |
| Return type alone cannot distinguish overloaded methods. | The overriding method must have a compatible return type. |
| Inheritance is not required. | Inheritance is required. |

## 6. Important Concepts Related to Polymorphism

### 6.1 Parent Class Reference

A parent class reference can hold the object of its child class.

Example:

```java
Animal animal = new Dog();
```

Here:
- `Animal` is the parent class.
- `animal` is the reference variable.
- `new Dog()` creates the child class object.

### 6.2 Dynamic Method Dispatch

Dynamic method dispatch is the process in which Java determines at runtime which overridden method should execute based on the actual object.

Example:

```java
Animal animal = new Dog();
animal.makeSound();
```

The `Dog` class implementation executes.

### 6.3 Upcasting

Upcasting means converting a child class reference into a parent class reference.

Example:

```java
Animal animal = new Dog();
```

Java supports this conversion automatically.

### 6.4 Static Binding

Static binding means the method call is resolved at compile time.

Method overloading is an example of compile-time method selection.

### 6.5 Dynamic Binding

Dynamic binding means the overridden method call is resolved at runtime based on the actual object.

Method overriding is an example of dynamic binding.

## 7. Advantages of Polymorphism

1. **Code Reusability:** Common methods can be defined once and reused by different classes.
2. **Flexibility:** Different objects can provide different implementations of the same method.
3. **Easy Maintenance:** Changes to individual implementations can be made without changing every part of the application.
4. **Extensibility:** New child classes can be added with their own method implementations.
5. **Reduced Code Duplication:** Common references and method names help avoid repeated code.
6. **Loose Coupling:** Code can work with parent types instead of depending directly on specific child classes.
7. **Better Application Design:** Helps create flexible and organized object-oriented applications.

## 8. Disadvantages of Polymorphism

1. **Code Complexity:** Understanding the execution flow can become difficult when many classes override the same method.
2. **Debugging Difficulty:** It may take extra effort to identify which implementation executes at runtime.
3. **Performance Overhead:** Runtime method dispatch can introduce a small amount of overhead compared with direct method calls.
4. **Design Complexity:** Incorrect use of inheritance and overriding can make an application difficult to maintain.
5. **Limited Parent Reference Access:** A parent reference can directly access only the members available through its declared parent type, even when it refers to a child object.
6. **Overloading Confusion:** Too many overloaded methods can make method selection difficult to understand.

## 9. Overall Polymorphism Flowchart

```text
       ┌──────────────────────────┐
       │       Polymorphism       │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │     Types of Java        │
       │     Polymorphism         │
       └────────────┬─────────────┘
                    ↓
          ┌─────────┴─────────┐
          ↓                   ↓
┌──────────────────┐  ┌──────────────────┐
│ Compile-Time     │  │ Runtime          │
│ Polymorphism     │  │ Polymorphism     │
└────────┬─────────┘  └────────┬─────────┘
         ↓                     ↓
┌──────────────────┐  ┌──────────────────┐
│ Method           │  │ Method           │
│ Overloading      │  │ Overriding       │
└────────┬─────────┘  └────────┬─────────┘
         ↓                     ↓
┌──────────────────┐  ┌──────────────────┐
│ Method Selected  │  │ Method Selected  │
│ at Compile Time  │  │ at Runtime       │
└──────────────────┘  └──────────────────┘
```

## 10. Examples Available in This Project

This project contains two packages:

### Package 1: `polymorphism`

Files:
- `Animal.java`
- `Cat.java`
- `Cow.java`
- `Dog.java`
- `MainMethodOverLoading.java`
- `MathOperations.java`
- `TestAnimal.java`
- `TestMath.java`

This package contains examples related to animal classes, method overloading, and testing the corresponding implementations.

### Package 2: `PolyMorphismEx`

Files:
- `Car.java`
- `SumOperation.java`
- `TestOP.java`
- `TestVehicle.java`
- `Vehicle.java`

This package contains examples related to vehicle classes and operation-based implementations.

## 11. Learning Outcomes

After completing this project, learners will understand:

- The meaning and purpose of polymorphism.
- Why polymorphism is used in Java.
- Compile-time and runtime polymorphism.
- Method overloading and method overriding.
- The difference between overloading and overriding.
- Parent class references and child class objects.
- Upcasting and dynamic method dispatch.
- Static binding and dynamic binding.
- Advantages and disadvantages of polymorphism.
- How polymorphism is used in real-world applications.

## 12. Technologies Used

- **Programming Language:** Java
- **Concept:** Object-Oriented Programming
- **IDE:** Eclipse / VS Code
- **Execution:** Java Compiler and JVM

## 13. Conclusion

Polymorphism is an important Object-Oriented Programming concept in Java. It allows the same method name or parent reference to represent different behaviours.

Java supports two main types of polymorphism: compile-time polymorphism through method overloading and runtime polymorphism through method overriding.

By using polymorphism, developers can create reusable, flexible, extensible, and maintainable applications.
