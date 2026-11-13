

# Encapsulation – Package 3 (`Encapsulation2`)

## 1. Introduction

The `Encapsulation2` package contains Java examples related to encapsulation using a `Person` class.

Encapsulation is an Object-Oriented Programming (OOP) concept that combines data and methods into a single unit called a class.

It helps protect data by controlling how class members are accessed and modified.

This package appears to demonstrate encapsulation through a Person-related example.

## 2. Purpose of This Package

The purpose of this package is to understand how encapsulation can be implemented using a real-world entity such as a Person.

Through this example, we can learn:

- How to define a class.
- How to represent person-related information.
- How to create and use objects.
- How to access class functionality through methods.
- How a test class interacts with another class.

## 3. Package Structure

```text
Encapsulation2/
│
├── Person.java
└── PersonTest.jav
```

**Note:** Confirm whether the test filename is `PersonTest.java` or `PersonTest.jav`.

## 4. Files in This Package

### 4.1 Person.java

This file contains a class named `Person`.

A Person class can represent a real-world person using data members and methods.

For example, a person may have details such as name, age, or address.

**Purpose:**

- Understand how to create a class.
- Learn how to organize person-related data.
- Understand how encapsulation can be applied to a Person object.
- Learn how class methods can provide controlled access to data.

*Note: The exact variables, access modifiers, constructors, and methods depend on the implementation in `Person.java`.*

### 4.2 PersonTest.jav

This file appears to be the test class for the `Person` example.

A test class is generally used to create an object of another class and execute its methods.

**Purpose:**

- Understand object creation.
- Access the functionality of the Person class.
- Execute and observe the program output.
- Understand the relationship between a class and its test class.

*Note: The exact execution flow depends on the source code.*

## 5. Program Flow

The following diagram represents a general flow for a Person class and its test class.

```text
       ┌──────────────────────┐
       │        START         │
       └──────────┬───────────┘
                  │
                  ▼
       ┌──────────────────────┐
       │ Execute Person Test  │
       └──────────┬───────────┘
                  │
                  ▼
       ┌──────────────────────┐
       │ Create Person Object │
       └──────────┬───────────┘
                  │
                  ▼
       ┌──────────────────────┐
       │  Call Class Methods  │
       └──────────┬───────────┘
                  │
                  ▼
       ┌──────────────────────┐
       │ Access or Update Data│
       └──────────┬───────────┘
                  │
                  ▼
       ┌──────────────────────┐
       │ Display the Result   │
       └──────────┬───────────┘
                  │
                  ▼
       ┌──────────────────────┐
       │         END          │
       └──────────────────────┘
```

This is a conceptual flow. The actual steps may differ depending on the implementation.

## 6. Important Concepts

### 6.1 Class

A class is a blueprint used to create objects.

It defines the variables and methods that represent an object's properties and behaviour.

### 6.2 Object

An object is an instance of a class.

It is used to access the functionality defined inside the class.

### 6.3 Encapsulation

Encapsulation combines data and methods into a single class.

It helps control how data is accessed and modified.

### 6.4 Data Hiding

Data hiding means restricting direct access to internal class data.

Java provides access modifiers such as `private` to help achieve data hiding.

### 6.5 Getters and Setters

Getters and setters are commonly used to access and update private variables.

- Getter: Returns the value of a variable.
- Setter: Updates the value of a variable.

Example:

```java
class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

In this example:

- `name` is declared as private.
- `setName()` updates the name.
- `getName()` returns the name.

This is a general example of encapsulation and does not confirm the exact implementation of `Person.java`.

## 7. Real-Time Applications

The Person example can help us understand how encapsulation is used in real-world applications.

Examples include:

- **Employee Management:** Managing employee details.
- **Student Management:** Managing student information.
- **User Management:** Maintaining user profiles.
- **Hospital Management:** Managing patient information.
- **Banking Applications:** Protecting customer information.

## 8. Advantages of Encapsulation

1. **Data Protection:** Restricts direct access to internal data.
2. **Controlled Access:** Provides access through defined methods.
3. **Maintainability:** Makes code easier to manage.
4. **Reusability:** Classes can be reused in different applications.
5. **Flexibility:** Internal implementation can be modified without necessarily changing external usage.

## 9. Disadvantages of Encapsulation

1. Additional methods may increase the amount of code.
2. Writing getters and setters can take extra time.
3. Poorly designed methods may still allow unwanted data changes.
4. It can introduce unnecessary complexity in very small programs.

## 10. Learning Outcomes

After completing this package, we can understand:

- How to create a Person class.
- How to create and use objects.
- How a test class interacts with another class.
- Why data hiding is important.
- How getters and setters support controlled access.
- How encapsulation can be applied to real-world entities.

## 11. Technologies Used

- Programming Language: Java
- Concept: Object-Oriented Programming
- OOP Topic: Encapsulation
- IDE: Eclipse / Any Java-supported IDE

## 12. Conclusion

The `Encapsulation2` package provides a Person-related example for understanding encapsulation in Java.

By studying the `Person` class and its test class, we can understand how classes organize data and methods and how controlled access helps protect information.

## Author

**Sri Dhanya**

