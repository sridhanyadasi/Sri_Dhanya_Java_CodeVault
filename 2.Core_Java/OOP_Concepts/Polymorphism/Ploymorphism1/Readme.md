# Polymorphism – Package 1

## 1. Introduction

The `polymorphism` package contains Java programs that demonstrate the concept of polymorphism using method overloading and method overriding.

It includes examples based on mathematical operations and animal behaviours.

Through these examples, we can understand how the same method name can perform different operations and how different classes can provide their own method implementations.

## 2. Purpose of This Package

The main purpose of this package is to understand how polymorphism works in Java through practical examples.

This package helps learners understand:

- How methods can have the same name with different parameters.
- How child classes can provide their own implementation of parent class methods.
- How different objects can behave differently when calling a common method.
- How to test method overloading and overriding using separate test classes.

## 3. Concepts Covered

1. Compile-Time Polymorphism
2. Runtime Polymorphism
3. Method Overloading
4. Method Overriding
5. Inheritance
6. Parent Class and Child Class
7. Method Execution
8. Object Creation and Method Calling

## 4. Package Structure

```text
polymorphism/
│
├── Animal.java
├── Cat.java
├── Cow.java
├── Dog.java
├── MainMethodOverLoading.java
├── MathOperations.java
├── TestAnimal.java
└── TestMath.java
```

## 5. Examples Available in This Package

### 5.1 Animal-Based Example

Files:
- `Animal.java`
- `Cat.java`
- `Cow.java`
- `Dog.java`
- `TestAnimal.java`

These files represent an animal-based example of polymorphism.

The animal classes can demonstrate how different animals provide different behaviours for a common operation.

For example, if the classes define and override a common method such as `makeSound()`, each animal can provide its own implementation.

**Concept:** Runtime Polymorphism – Method Overriding.

**Conceptual Flowchart:**

```text
       ┌──────────────────────┐
       │     TestAnimal      │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Create Animal Object │
       │ or Reference         │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Call Common Method   │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Execute the          │
       │ Corresponding        │
       │ Implementation       │
       └──────────────────────┘
```

*Note: The exact inheritance and method relationships should be confirmed from the Java source files.*

### 5.2 Mathematical Operations Example

Files:
- `MathOperations.java`
- `MainMethodOverLoading.java`
- `TestMath.java`

These files represent mathematical operations and method overloading.

A class can contain multiple methods with the same name but different parameter lists.

For example, an addition operation can accept two integers, three integers, or two decimal values.

**Concept:** Compile-Time Polymorphism – Method Overloading.

**Conceptual Flowchart:**

```text
       ┌──────────────────────┐
       │      TestMath        │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Call Mathematical    │
       │ Operation            │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Check Method         │
       │ Parameters           │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Select Matching      │
       │ Method               │
       └──────────┬───────────┘
                  ↓
       ┌──────────────────────┐
       │ Execute Method       │
       └──────────────────────┘
```

## 6. Important Concepts Explained

### 6.1 Method Overloading

Method overloading means defining multiple methods with the same name but different parameter lists.

The parameter lists can differ by:
- Number of parameters.
- Data types of parameters.
- Order of parameter types.

### 6.2 Method Overriding

Method overriding occurs when a child class provides its own implementation of a method inherited from its parent class.

It supports runtime polymorphism.

### 6.3 Compile-Time Polymorphism

The compiler identifies the appropriate overloaded method based on the arguments supplied.

### 6.4 Runtime Polymorphism

The JVM determines which overridden instance method to execute based on the actual object.

## 7. Uses of These Concepts

- Mathematical applications can use method overloading for different input combinations.
- Animal-based applications can represent different behaviours using a common method.
- Common method names make programs easier to understand.
- Overriding allows child classes to customize inherited behaviour.
- These concepts help developers write flexible and reusable Java applications.

## 8. Advantages

1. **Code Reusability:** Common method names and inherited behaviour help reduce repeated code.
2. **Flexibility:** Different classes can provide different implementations.
3. **Readability:** Related operations can use the same method name.
4. **Maintainability:** Individual implementations can be updated when requirements change.
5. **Extensibility:** New classes or overloaded methods can be added when required.

## 9. Disadvantages

1. **Complexity:** Understanding method execution can become difficult when many methods are overloaded or overridden.
2. **Debugging:** Runtime method selection may require additional debugging.
3. **Method Confusion:** Too many overloaded methods can make method selection harder to understand.
4. **Inheritance Dependency:** Runtime polymorphism through overriding requires a suitable inheritance relationship.
5. **Maintenance Challenges:** Poorly designed inheritance structures can make applications difficult to maintain.

## 10. Learning Outcomes

After completing this package, learners will understand:

- How method overloading works.
- How method overriding works.
- The difference between compile-time and runtime polymorphism.
- How different classes can implement common behaviour.
- How to create objects and call methods.
- How to organize and test Java programs using separate classes.

## 11. Technologies Used

- **Programming Language:** Java
- **Concept:** Object-Oriented Programming
- **IDE:** Eclipse / VS Code
- **Execution:** Java Compiler and JVM

## 12. Conclusion

The `polymorphism` package provides practical examples to understand method overloading and method overriding in Java.

The mathematical operations example helps explain compile-time polymorphism, while the animal-based example helps understand runtime polymorphism.

These examples build a foundation for using polymorphism in real-world Java applications.

## Author

**Sri Dhanya**

Java Learning Repository – Polymorphism
