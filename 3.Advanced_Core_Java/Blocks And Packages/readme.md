

# Java Blocks and Packages

## 1. Introduction

Java is an object-oriented programming language that provides different features to organize and execute code.

This project covers two important Java concepts:

1. **Blocks:** Groups of statements enclosed within curly braces `{ }`.
2. **Packages:** A mechanism used to organize related classes and interfaces.

It also includes examples related to constructors and organizing Java classes into packages and subpackages.

## 2. Project Structure

```text
Blocks & Packages/
│
└── src/
    └── com/
        └── te/
            │
            ├── BlocksAndPackages/
            │   ├── Q1TwoConstructors.java
            │   ├── Student.java
            │   ├── Student1.java
            │   └── TaskQuestions.java
            │
            ├── mainPackage/
            │   └── MainClass.java
            │
            ├── myPackage/
            │   └── MyPackageClass.java
            │
            └── university/
                │
                ├── MainClass.java
                │
                ├── staff/
                │   └── StaffMember.java
                │
                └── studnets/
                    └── Student.java
```

## 3. What Are Blocks in Java?

A block is a group of statements enclosed within curly braces.

Blocks help organize code and define where variables and statements belong.

### Types of Blocks

**3.1 Instance Initialization Block**

An instance initialization block is written inside a class but outside methods and constructors.

It executes whenever an object is created, before the constructor body.

```java
class Student {

    {
        System.out.println("Instance block executed");
    }

    Student() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {

        Student s = new Student();
    }
}
```

Output:

```text
Instance block executed
Constructor executed
```

**3.2 Static Block**

A static block is declared using the `static` keyword.

It executes when the class is initialized.

```java
class Student {

    static {
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {

        System.out.println("Main method executed");
    }
}
```

Output:

```text
Static block executed
Main method executed
```

**3.3 Local Block**

A block can also be declared inside a method.

Variables declared inside that block have a limited scope.

```java
class Demo {

    public static void main(String[] args) {

        {
            int number = 100;
            System.out.println(number);
        }
    }
}
```

Output:

```text
100
```

## 4. What Is a Constructor?

A constructor is a special member of a class used to initialize objects.

Important characteristics:

- Constructor name must be the same as the class name.
- A constructor does not have a return type.
- It executes when an object is created.
- Constructors can be overloaded.
- Constructors are not inherited.

### Types of Constructors

**4.1 No-Argument Constructor**

A constructor that does not accept parameters.

```java
class Student {

    Student() {
        System.out.println("Student object created");
    }
}
```

**4.2 Parameterized Constructor**

A constructor that accepts parameters.

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}
```

**4.3 Constructor Overloading**

A class can have multiple constructors with different parameter lists.

```java
class Student {

    Student() {
        System.out.println("Default constructor");
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }

    Student(int id) {
        System.out.println("ID: " + id);
    }
}
```

## 5. What Is a Package in Java?

A package is a group of related classes, interfaces, and subpackages.

Packages help organize Java applications and avoid naming conflicts.

### Why Do We Use Packages?

- To organize related classes.
- To avoid class-name conflicts.
- To improve code maintainability.
- To support access control.
- To reuse classes across applications.

### Syntax

```java
package packageName;
```

Example:

```java
package myPackage;

public class MyPackageClass {

    public void display() {
        System.out.println("My Package");
    }
}
```

## 6. Types of Packages

### 6.1 Built-in Packages

Java provides predefined packages.

Examples:

- `java.lang`
- `java.util`
- `java.io`
- `java.sql`
- `java.time`

### 6.2 User-Defined Packages

Developers can create their own packages to organize application classes.

Example:

```java
package myPackage;

public class MyPackageClass {
}
```

## 7. Importing a Package

The `import` keyword allows a class to use accessible classes from another package without writing their fully qualified names.

Example:

```java
import myPackage.MyPackageClass;

class MainClass {

    public static void main(String[] args) {

        MyPackageClass obj = new MyPackageClass();
    }
}
```

You can also import all accessible types from a package:

```java
import myPackage.*;
```

## 8. Subpackages

A package can contain subpackages.

For example:

```text
university/
│
├── MainClass.java
│
├── staff/
│   └── StaffMember.java
│
└── studnets/
    └── Student.java
```

Here, `staff` and `studnets` are separate subpackages under `university`.

A subpackage is a separate package in Java. It does not automatically inherit the classes or access permissions of its parent package.

## 9. Package Access and Access Modifiers

Java provides four main access levels.

| Modifier | Same Class | Same Package | Subclass in Other Package | Other Package |
|---|---|---|---|---|
| private | Yes | No | No | No |
| default | Yes | Yes | No | No |
| protected | Yes | Yes | Yes, subject to access rules | No |
| public | Yes | Yes | Yes | Yes |

Access modifiers help control the visibility of classes, constructors, variables, and methods.

## 10. Conceptual Flowcharts

### Block Execution

```text
       START
         |
         v
    Class Loading
         |
         v
    Static Block
         |
         v
    Main Method
         |
         v
    Object Creation
         |
         v
 Instance Initialization Block
         |
         v
    Constructor
         |
         v
   Object Ready
         |
         v
        END
```

### Package Execution

```text
       START
         |
         v
   Create Package
         |
         v
 Create Java Classes
         |
         v
 Declare Package Names
         |
         v
 Import Required Classes
         |
         v
 Create Objects
         |
         v
  Call Accessible Methods
         |
         v
        END
```

## 11. Project Packages

This project contains four main folders:

| Package | Main Purpose |
|---|---|
| `BlocksAndPackages` | Blocks, constructors, and related Java examples |
| `mainPackage` | User-defined package example |
| `myPackage` | Custom package and class example |
| `university` | Package and subpackage organization |

The `university` package contains the `staff` and `studnets` subpackages.

## 12. Advantages

- Organizes Java code into meaningful groups.
- Makes code easier to maintain.
- Supports code reuse.
- Helps avoid naming conflicts.
- Blocks organize statements and control variable scope.
- Constructors simplify object initialization.

## 13. Learning Outcomes

After completing this project, learners should be able to:

- Understand Java blocks.
- Differentiate static and instance initialization blocks.
- Understand local block scope.
- Create constructors.
- Understand constructor overloading.
- Create user-defined packages.
- Import classes from other packages.
- Understand packages and subpackages.
- Use access modifiers.
- Organize Java applications using packages.

## 14. Technologies Used

- Programming Language: Java
- IDE: Eclipse
- Concepts: Blocks, Constructors, Packages, Subpackages, Access Modifiers

## 15. Conclusion

Java blocks help organize statements and control execution and variable scope.

Constructors help initialize objects, while packages organize related classes and interfaces.

Understanding these concepts provides a strong foundation for developing structured and maintainable Java applications.

## Author

**Sri Dhanya**


