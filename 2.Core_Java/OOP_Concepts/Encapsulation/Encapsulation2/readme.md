

# Encapsulation – Package 2 (`encapsulation1`)

## 1. Introduction

The `encapsulation1` package contains Java examples related to encapsulation.

Encapsulation is an Object-Oriented Programming (OOP) concept that combines data and the methods that operate on that data into a single unit called a class.

It helps protect data by controlling how it is accessed and modified.

Based on the filenames, this package includes:
- A Car-related example.
- A User and Password-related example.

## 2. Purpose of This Package

The purpose of this package is to understand how encapsulation can be applied to different real-world examples.

Through these examples, we can learn:
- How classes organize data and methods.
- How objects are used to access class functionality.
- How data access can be controlled.
- How test classes execute and verify example programs.
- How encapsulation can be applied to user-related information.

## 3. Package Structure

```text
encapsulation1/
│
├── Car.java
├── TestCar.java
├── TestPassword.java
└── User.java
```

## 4. Examples in This Package

### 4.1 Car.java

This file contains a class named `Car`.

A Car class can represent a real-world car using data members and methods.

For example, a car may have details such as its brand, model, or price. These details can be managed through class methods.

**Purpose:**
- Understand how a class represents a real-world object.
- Learn how data and methods are organized together.
- Understand how encapsulation can be applied to a Car object.

*Note: The exact variables and methods depend on the implementation in `Car.java`.*

### 4.2 TestCar.java

This file contains a class named `TestCar`.

A test class is generally used to create objects and execute the methods of another class.

**Purpose:**
- Understand object creation.
- Access class functionality through an object.
- Execute and observe the Car example.

*Note: The exact execution flow depends on the code written in `TestCar.java`.*

### 4.3 User.java

This file contains a class named `User`.

A User class can represent user-related information in a Java application.

For example, an application may maintain information about a user and provide methods to access or update that information.

**Purpose:**
- Understand how user-related data can be represented using a class.
- Learn how encapsulation can be applied to user information.
- Understand how class methods can control access to data.

*Note: The actual data members, access modifiers, and methods must be confirmed from `User.java`.*

### 4.4 TestPassword.java

This file contains a class named `TestPassword`.

Based on its filename, this class appears to be related to testing password functionality.

Password-related examples can help demonstrate why controlling access to sensitive information is important.

**Purpose:**
- Understand how a test class can execute password-related functionality.
- Learn how objects interact with class methods.
- Understand the importance of controlled access to user-related information.

*Note: The exact password handling, validation rules, and method calls depend on the source code.*

## 5. Program Flow

The following is a conceptual flow for understanding how a test class may interact with an encapsulated class.

```text
       ┌──────────────────────┐
       │        START         │
       └──────────┬───────────┘
                  │
                  ▼
       ┌──────────────────────┐
       │  Execute Test Class  │
       └──────────┬───────────┘
                  │
                  ▼
       ┌──────────────────────┐
       │   Create an Object   │
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

This diagram explains a general encapsulation workflow. The exact sequence may differ in the actual programs.

## 6. Important Concepts

### 6.1 Class

A class is a blueprint used to create objects.

It contains variables and methods that define the properties and behaviour of objects.

### 6.2 Object

An object is an instance of a class.

Objects are used to access the methods and functionality provided by a class.

### 6.3 Data Hiding

Data hiding means restricting direct access to class data.

In Java, the `private` access modifier is commonly used to prevent direct access to variables from outside the class.

### 6.4 Getters and Setters

Getters and setters are methods commonly used to read and update private variables.

**Getter:** Returns the value of a variable.

**Setter:** Assigns or updates the value of a variable.

Example:

```java
class User {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
```

In this example:
- `username` is declared as private.
- `setUsername()` updates the username.
- `getUsername()` returns the username.

This is a general example of encapsulation, not a claim about the exact implementation of `User.java`.

### 6.5 Validation

Validation means checking whether the provided data satisfies certain conditions before accepting or processing it.

For example, an application may check whether a password meets its required rules.

Whether validation is implemented in this package depends on the actual source code.

## 7. Real-Time Applications

Encapsulation is useful in many real-world applications:

- **User Management:** Managing user information.
- **Password Management:** Controlling access to password-related data.
- **Banking Applications:** Protecting account information.
- **Vehicle Management:** Managing vehicle details.
- **Employee Management:** Controlling access to employee information.
- **E-commerce Applications:** Managing customer and product information.

## 8. Advantages of Encapsulation

1. **Data Protection:** Restricts direct access to internal data.
2. **Controlled Access:** Allows data to be accessed through defined methods.
3. **Maintainability:** Makes code easier to modify and manage.
4. **Reusability:** Classes can be reused in different parts of an application.
5. **Flexibility:** Internal implementation can be changed without necessarily changing how other classes use it.

## 9. Disadvantages of Encapsulation

1. Additional getter and setter methods may increase code.
2. Writing separate methods for accessing and updating data can take extra time.
3. Poorly designed public methods can still allow unwanted data changes.
4. It may introduce additional complexity in very small programs.

## 10. Learning Outcomes

After completing this package, we can understand:

- How to organize data and methods inside a class.
- How to create and use objects.
- How a test class interacts with another class.
- Why data hiding is important.
- How getters and setters support controlled access.
- How encapsulation can be applied to car and user-related examples.

## 11. Technologies Used

- Programming Language: Java
- Concept: Object-Oriented Programming
- OOP Topic: Encapsulation
- IDE: Eclipse / Any Java-supported IDE

## 12. Conclusion

The `encapsulation1` package provides examples related to Car and User/Password functionality.

By studying these programs, we can understand how Java classes organize data and methods and how encapsulation helps control access to information.

These examples help build a practical understanding of encapsulation in Java.

## Author

**Sri Dhanya**

