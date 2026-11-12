# Inheritance – Animal and Shape Examples in Java

## 1. Introduction

This package contains practical examples of inheritance using Animal and Shape classes.

It demonstrates how multiple child classes can inherit common properties and methods from a parent class.

It covers inheritance through real-world examples such as animals and geometric shapes.

## 2. Topics Covered

### 2.1 Animal Inheritance

This example demonstrates inheritance using different types of animals.

- `Animal` – Parent class containing common animal properties and methods.
- `Dog` – Child class representing a dog.
- `Cat` – Child class representing a cat.
- `Bird` – Child class representing a bird.
- `TestAnimal` – Executes and tests the animal inheritance example.

**Flowchart:**

```text id="k5p9va"
                  ┌──────────────────┐
                  │      Animal      │
                  │                  │
                  │  Common Methods  │
                  │  Common Details  │
                  └────────┬─────────┘
                           │
             ┌─────────────┼─────────────┐
             │             │             │
             ↓             ↓             ↓
       ┌──────────┐  ┌──────────┐  ┌──────────┐
       │   Dog    │  │   Cat    │  │   Bird   │
       │          │  │          │  │          │
       │ Own      │  │ Own      │  │ Own      │
       │ Methods  │  │ Methods  │  │ Methods  │
       └──────────┘  └──────────┘  └──────────┘
```

### 2.2 Shape Inheritance

This example demonstrates inheritance using different geometric shapes.

- `Shape` – Parent class containing common shape-related properties or methods.
- `Circle` – Child class representing a circle.
- `Rectangle` – Child class representing a rectangle.
- `Triangle` – Child class representing a triangle.
- `TestShape` – Executes and tests the shape inheritance example.

**Flowchart:**

```text id="v9h4sk"
                  ┌──────────────────┐
                  │      Shape       │
                  │                  │
                  │  Common Methods  │
                  │  Common Details  │
                  └────────┬─────────┘
                           │
             ┌─────────────┼─────────────┐
             │             │             │
             ↓             ↓             ↓
       ┌──────────┐  ┌──────────┐  ┌──────────┐
       │  Circle  │  │Rectangle │  │ Triangle │
       │          │  │          │  │          │
       │ Own      │  │ Own      │  │ Own      │
       │ Methods  │  │ Methods  │  │ Methods  │
       └──────────┘  └──────────┘  └──────────┘
```

## 3. Important Concepts

| Concept | Description |
|---|---|
| Parent Class | Provides common properties and methods |
| Child Class | Inherits properties and methods from the parent |
| Hierarchical Inheritance | Multiple child classes inherit from one parent class |
| Code Reusability | Reusing common functionality |
| Method Overriding | Child class provides its own implementation of an inherited method |

## 4. Learning Outcomes

After completing this package, we can:

- Understand inheritance through real-world examples.
- Implement hierarchical inheritance.
- Identify common properties and methods in a parent class.
- Create multiple child classes from one parent class.
- Understand how different child classes can provide their own functionality.
- Execute and test inheritance programs.

## 5. Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Eclipse IDE

## 6. Conclusion

This package demonstrates inheritance through Animal and Shape examples. It helps understand how multiple child classes can reuse common functionality from a single parent class while maintaining their own specific behaviour.
