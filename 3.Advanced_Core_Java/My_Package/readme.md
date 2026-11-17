

# My Package (`myPackage`)

## 1. Introduction

The `myPackage` folder contains a Java class named `MyPackageClass.java`.

This package represents a user-defined package example.

It helps learners understand how to create a package and organize Java classes inside it.

## 2. Package Structure

```text
myPackage/
│
└── MyPackageClass.java
```

## 3. File Explanation

### MyPackageClass.java

**Purpose:**

This file represents a class inside the `myPackage` package.

It can be used to understand:

- User-defined package declaration
- Class creation
- Methods and variables
- Access modifiers
- Importing and using classes from another package

## 4. Important Concepts

### Creating a Package

```java
package myPackage;

public class MyPackageClass {

    public void display() {
        System.out.println("Welcome to My Package");
    }
}
```

### Using a Class from Another Package

```java
import myPackage.MyPackageClass;

class MainClass {

    public static void main(String[] args) {

        MyPackageClass obj = new MyPackageClass();

        obj.display();
    }
}
```

The importing class can access the public class and its public members.

## 5. Conceptual Flowchart

```text
       START
         |
         v
   Create Package
         |
         v
 Create Java Class
         |
         v
 Declare Class Members
         |
         v
 Import Package Class
         |
         v
    Create Object
         |
         v
    Call Methods
         |
         v
        END
```

## 6. Learning Outcomes

- Create user-defined packages.
- Declare package names.
- Create classes inside packages.
- Import classes from other packages.
- Understand class accessibility.

## 7. Conclusion

The `myPackage` package demonstrates the basic structure of a user-defined Java package and helps learners understand package organization and class reuse.

## Author

**Sri Dhanya**


