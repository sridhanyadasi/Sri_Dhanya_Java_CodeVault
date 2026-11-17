


# University Package (`university`)

## 1. Introduction

The `university` package demonstrates how Java packages can be organized using subpackages.

It contains a main class and two subpackages:

- `staff`
- `studnets`

This structure represents a university-related organization of Java classes.

## 2. Package Structure

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

## 3. File Explanation

### MainClass.java

Represents the main class inside the `university` package.

It can be used to understand:

- Package declaration
- Main method
- Object creation
- Using classes from other packages, if imported

### staff/StaffMember.java

Represents a staff-member-related class inside the `staff` subpackage.

It can be used to understand how Java classes are organized into subpackages.

### studnets/Student.java

Represents a student-related class inside the `studnets` subpackage.

The folder spelling `studnets` is preserved exactly as provided.

## 4. Important Concepts

### Parent Package

The `university` package contains the main class.

### Subpackages

The `staff` and `studnets` folders represent separate Java subpackages.

Their package declarations would follow this structure:

```java
package university.staff;
```

```java
package university.studnets;
```

### Importing Subpackage Classes

A class can import a public class from a subpackage.

Example:

```java
import university.staff.StaffMember;
import university.studnets.Student;
```

The actual classes and their members must be accessible for this usage.

## 5. Conceptual Flowchart

```text
          START
            |
            v
     University Package
            |
       +----+----+
       |         |
       v         v
     staff    studnets
       |         |
       v         v
 StaffMember  Student
       |         |
       +----+----+
            |
            v
       MainClass
            |
            v
      Program Execution
            |
            v
           END
```

## 6. Learning Outcomes

- Understand package organization.
- Create subpackages.
- Declare package names.
- Import classes from subpackages.
- Understand the difference between packages and subpackages.
- Organize application classes based on their responsibilities.

## 7. Conclusion

The `university` package provides a practical example of organizing Java classes into a parent package and subpackages.

This structure is useful when developing larger applications with multiple modules.

## Author

**Sri Dhanya**

