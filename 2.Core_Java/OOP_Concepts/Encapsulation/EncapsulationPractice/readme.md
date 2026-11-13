

# Encapsulation Practice Programs

## 1. Introduction

This package contains multiple Java programs designed to practise the concept of Encapsulation in Object-Oriented Programming (OOP).

Encapsulation is the process of combining data and methods into a single unit called a class and controlling access to that data.

These practice programs use different real-world examples such as Book, Candy, Employee, Person, Rectangle, and Student.

## 2. Purpose of This Package

The main purpose of this package is to gain practical experience with encapsulation.

Through these programs, we can understand:

- How to create classes with data members and methods.
- How to create objects and access class functionality.
- How to control access to class data.
- How to use getters and setters.
- How to organize real-world information using Java classes.
- How to execute programs using separate test classes.

## 3. Package Structure

```text
encapsulationPractice/
│
├── Book.java
├── Candy.java
├── Employee.java
├── Kitkat.java
├── Person.java
├── Rectangle.java
├── Student.java
│
├── StudentTest.java
├── TestBook.java
├── TestCandy.java
├── TestEmployee.java
├── TestPerson.java
└── TestRectangle.java
```

## 4. Practice Programs

### 4.1 Book.java

This file contains a class named `Book`.

A Book class can represent book-related information such as title, author, price, or other details.

**Concepts to understand:**
- Creating a Book class.
- Organizing book-related information.
- Applying encapsulation to book data.
- Accessing class functionality through methods.

### 4.2 Candy.java

This file contains a class named `Candy`.

A Candy class can represent candy-related information such as name, flavour, or price.

**Concepts to understand:**
- Creating a real-world class.
- Organizing data using variables.
- Accessing and modifying class data through methods.

### 4.3 Employee.java

This file contains a class named `Employee`.

An Employee class can represent employee-related information such as employee name, ID, salary, or department.

**Concepts to understand:**
- Managing employee information.
- Applying data hiding.
- Understanding controlled access to data.

### 4.4 Kitkat.java

This file contains a class named `Kitkat`.

It provides another example for practising encapsulation using a product or candy-related entity.

**Concepts to understand:**
- Representing an entity using a Java class.
- Organizing related data and methods.
- Understanding object creation and class usage.

### 4.5 Person.java

This file contains a class named `Person`.

A Person class can represent details such as name, age, or address.

**Concepts to understand:**
- Creating a Person class.
- Organizing person-related information.
- Applying encapsulation to personal data.

### 4.6 Rectangle.java

This file contains a class named `Rectangle`.

A Rectangle class can represent a geometric shape using properties such as length and width.

**Concepts to understand:**
- Representing a geometric object.
- Managing its properties.
- Understanding how methods can work with class data.

### 4.7 Student.java

This file contains a class named `Student`.

A Student class can represent student-related information such as name, roll number, or marks.

**Concepts to understand:**
- Managing student information.
- Applying encapsulation.
- Controlling access to student data.

## 5. Test Classes

Test classes are generally used to create objects of other classes and execute their methods.

| File Name | Related Class / Example |
|---|---|
| `StudentTest.java` | Student |
| `TestBook.java` | Book |
| `TestCandy.java` | Candy |
| `TestEmployee.java` | Employee |
| `TestPerson.java` | Person |
| `TestRectangle.java` | Rectangle |

**Purpose of test classes:**
- Create objects.
- Call methods.
- Pass values to methods.
- Retrieve values.
- Execute programs and observe the output.

*Note: The exact method calls and test behaviour depend on the source code.*

## 6. General Program Flow

The following diagram represents a common workflow for practising encapsulation.

```text
       ┌────────────────────────┐
       │         START          │
       └───────────┬────────────┘
                   │
                   ▼
       ┌────────────────────────┐
       │  Create a Java Class   │
       └───────────┬────────────┘
                   │
                   ▼
       ┌────────────────────────┐
       │ Declare Class Variables│
       └───────────┬────────────┘
                   │
                   ▼
       ┌────────────────────────┐
       │ Define Class Methods   │
       └───────────┬────────────┘
                   │
                   ▼
       ┌────────────────────────┐
       │ Execute Test Class     │
       └───────────┬────────────┘
                   │
                   ▼
       ┌────────────────────────┐
       │ Create Object          │
       └───────────┬────────────┘
                   │
                   ▼
       ┌────────────────────────┐
       │ Access or Update Data  │
       └───────────┬────────────┘
                   │
                   ▼
       ┌────────────────────────┐
       │ Display Program Output │
       └───────────┬────────────┘
                   │
                   ▼
       ┌────────────────────────┐
       │          END           │
       └────────────────────────┘
```

This is a general learning flow, not the exact execution sequence of every program.

## 7. Important Encapsulation Concepts

### 7.1 Data Hiding

Data hiding means restricting direct access to class variables.

Java provides access modifiers such as `private` to control access.

### 7.2 Private Variables

A variable declared with the `private` keyword cannot be accessed directly from outside its declaring class.

Example:

```java
class Student {

    private String name;
}
```

### 7.3 Getters and Setters

Getters and setters are methods used to read and update private variables.

Example:

```java
class Student {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

### 7.4 Object Creation

An object is an instance of a class.

Example:

```java
Student student = new Student();
```

Here:
- `Student` is the class name.
- `student` is the reference variable.
- `new Student()` creates an object.

### 7.5 Test Class

A test class is used to execute and verify the functionality of another class.

For example, `StudentTest.java` is associated by filename with `Student.java`.

## 8. Real-Time Applications

The examples in this package represent concepts used in different applications.

| Example | Real-Time Application |
|---|---|
| Book | Library Management |
| Candy / Kitkat | Product Management |
| Employee | Employee Management |
| Person | User Profile Management |
| Rectangle | Geometry Applications |
| Student | Student Management |

## 9. Advantages of Encapsulation

1. Protects internal data from direct access.
2. Provides controlled access through methods.
3. Improves code organization.
4. Makes applications easier to maintain.
5. Supports reusability.
6. Allows validation before updating data when validation is implemented.

## 10. Disadvantages of Encapsulation

1. Requires additional methods in many implementations.
2. Can increase the amount of code.
3. May introduce unnecessary complexity for very small programs.
4. Poorly designed access methods can reduce the benefits of data protection.

## 11. Learning Outcomes

After completing these practice programs, we can understand:

- How encapsulation works in Java.
- How to create classes for real-world entities.
- How to declare and manage class variables.
- How getters and setters are used.
- How objects interact with class methods.
- How separate test classes execute Java programs.
- How encapsulation is applied to different types of data.

## 12. Technologies Used

- Programming Language: Java
- Concept: Object-Oriented Programming
- OOP Topic: Encapsulation
- IDE: Eclipse / Any Java-supported IDE

## 13. Conclusion

The `encapsulationPractice` package provides multiple examples to strengthen practical knowledge of encapsulation in Java.

By practising Book, Candy, Employee, Kitkat, Person, Rectangle, and Student examples, we can understand how encapsulation can be applied to different real-world entities.

These programs help build a strong foundation in data hiding, controlled access, class design, and object creation.

## Author

**Sri Dhanya**

