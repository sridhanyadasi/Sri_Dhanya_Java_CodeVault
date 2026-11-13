# Encapsulation in Java

## 1. Introduction – What is Encapsulation?

Encapsulation is one of the four main principles of Object-Oriented Programming (OOP) in Java.

**Encapsulation means wrapping data (variables) and the methods that operate on that data into a single unit (class), while controlling direct access to the data.**

In Java, encapsulation is commonly achieved by:

1. Declaring instance variables as `private`.
2. Providing `public` getter and setter methods to access and update those variables.

This helps protect the data from unwanted direct access.

**Example:**

```java
class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
```

Test class:

```java
class TestStudent {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Dhanya");
        student.setAge(23);

        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
```

Here:
- `name` and `age` are private variables.
- `setName()` and `setAge()` are setter methods.
- `getName()` and `getAge()` are getter methods.
- The variables are accessed and updated through public methods.

## 2. Why is Encapsulation Used?

Encapsulation is used to protect data and control how the data is accessed or modified.

Without encapsulation, other classes may directly change an object's variables without following the required rules.

With encapsulation, we can decide how data should be accessed and updated.

**Main reasons:**

- To protect data from direct external access.
- To control how variables are modified.
- To provide data validation.
- To improve security at the class level.
- To make code easier to maintain.
- To keep data and related methods together.

## 3. How Does Encapsulation Work?

Encapsulation works by combining private variables and public methods inside a class.

**Step-by-step process:**

1. Create a Java class.
2. Declare the variables as `private`.
3. Create getter methods to read the values.
4. Create setter methods to update the values.
5. Create an object in another class.
6. Access or modify the variables through the available methods.

**Flowchart – Working of Encapsulation**

```text
       ┌────────────────────────┐
       │       Start            │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Create a Java Class    │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Declare Private       │
       │ Variables             │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Create Getter and      │
       │ Setter Methods         │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Create Class Object    │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Access or Update Data  │
       │ Through Public Methods │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Display or Use Data    │
       └────────────────────────┘
```

## 4. Main Components of Encapsulation

### 4.1 Private Variables

Private variables can be accessed directly only within the class in which they are declared.

Example:

```java
private String password;
private int age;
```

They help prevent direct access from other classes.

### 4.2 Getter Methods

A getter method is used to retrieve the value of a private variable.

Example:

```java
public String getPassword() {
    return password;
}
```

### 4.3 Setter Methods

A setter method is used to update the value of a private variable.

Example:

```java
public void setPassword(String password) {
    this.password = password;
}
```

A setter can also validate the value before updating the variable.

### 4.4 `this` Keyword

The `this` keyword refers to the current object.

It is commonly used in setter methods when the parameter name and instance variable name are the same.

Example:

```java
public void setName(String name) {
    this.name = name;
}
```

Here:
- `this.name` refers to the instance variable.
- `name` refers to the method parameter.

## 5. Access Modifiers in Encapsulation

Java provides four access levels that control where classes, variables, constructors, and methods can be accessed.

| Access Modifier | Same Class | Same Package | Subclass in Another Package | Other Packages |
|---|---|---|---|---|
| `private` | Yes | No | No | No |
| Default (no modifier) | Yes | Yes | No | No |
| `protected` | Yes | Yes | Yes, through inheritance rules | No |
| `public` | Yes | Yes | Yes | Yes |

**Important:** Access modifiers control visibility. Encapsulation commonly uses `private` fields and carefully selected public methods to control access to an object's data.

## 6. Types and Approaches Used in Encapsulation

Java does not define separate formal types of encapsulation. However, encapsulation can be implemented in different ways depending on how data access is provided.

### 6.1 Read-Write Encapsulation

Both getter and setter methods are provided.

- Getter allows reading the value.
- Setter allows updating the value.

### 6.2 Read-Only Encapsulation

Only getter methods are provided.

The value can be accessed, but it cannot be changed through a public setter.

### 6.3 Write-Only Encapsulation

Only setter methods are provided.

A value can be updated through the method, but no public getter is provided to retrieve it.

### 6.4 Validation-Based Encapsulation

Setter methods validate incoming values before updating private variables.

Example:

```java
public void setAge(int age) {
    if (age >= 18) {
        this.age = age;
    } else {
        System.out.println("Invalid age");
    }
}
```

This prevents values that do not satisfy the specified condition from being assigned through the setter.

## 7. Uses of Encapsulation

Encapsulation is widely used in real-world Java applications.

1. **Banking Applications:** Protect account balance and control deposits and withdrawals through methods.
2. **User Registration:** Control how names, email addresses, and passwords are stored or updated.
3. **Employee Management:** Protect employee details such as salary and personal information.
4. **E-Commerce Applications:** Control product prices, stock quantities, and customer details.
5. **Password Management:** Control how password values are assigned and accessed.
6. **Application Development:** Keep data and related operations together inside classes.

## 8. Advantages of Encapsulation

1. **Data Protection:** Prevents direct external access to private variables.
2. **Controlled Access:** Allows access through selected methods.
3. **Data Validation:** Setter methods can validate values before updating variables.
4. **Maintainability:** Internal implementation can be changed without necessarily changing the public methods.
5. **Code Organization:** Keeps data and related methods together in one class.
6. **Reusability:** Encapsulated classes can be reused in different parts of an application.
7. **Flexibility:** Developers can change the internal implementation while maintaining the same public interface.

## 9. Disadvantages of Encapsulation

1. **More Code:** Getter and setter methods require additional code.
2. **Development Time:** Creating and maintaining access methods can take extra time.
3. **Unnecessary Methods:** Providing getters and setters for every variable without a real requirement can make a class unnecessarily large.
4. **Incorrect Validation:** Poorly written setter methods may allow invalid data.
5. **Not Complete Security:** Encapsulation controls access through Java's language rules; it does not by itself provide complete application or system security.

## 10. Encapsulation vs Data Hiding

These two terms are related, but they are not exactly the same.

| Encapsulation | Data Hiding |
|---|---|
| Combines data and related methods inside a class. | Restricts direct access to internal data. |
| Achieved using classes and access control. | Commonly achieved using access modifiers such as `private`. |
| Focuses on organizing and controlling access to data. | Focuses on preventing unwanted direct access. |
| Provides a structured way to expose selected operations. | Keeps implementation details hidden from external classes. |

## 11. Overall Encapsulation Flowchart

```text
       ┌──────────────────────────┐
       │       Encapsulation      │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │ Combine Data and Methods │
       │ Inside a Class           │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │ Declare Variables as    │
       │ Private                  │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │ Provide Required Public  │
       │ Methods                  │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │ Validate and Control     │
       │ Data Access               │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │ Protect Internal Data    │
       │ and Use the Object       │
       └──────────────────────────┘
```

## 12. Examples Available in This Project

This Encapsulation project contains three packages.

### Package 1: `encapsulation`

Files:
- `Car.java`
- `Car1.java`
- `TestCar.java`
- `TestCar1.java`

This package contains two car-related Java examples and their corresponding test classes.

It can be used to understand how data and methods are organized inside classes and how objects are tested.

### Package 2: `encapsulation1`

Files:
- `Car.java`
- `TestCar.java`
- `TestPassword.java`
- `User.java`

This package contains car-related and user/password-related examples.

It provides a practical context for understanding controlled access to data, particularly user-related information.

### Package 3: `Encapsulation2`

Files:
- `Person.java`
- `PersonTest.java` (filename appears truncated in the supplied tree output)

This package contains a person-related example and a test class.

It can be used to understand encapsulation through a person object and its associated data.

## 13. Learning Outcomes

After completing this project, learners will understand:

- What encapsulation means in Java.
- Why encapsulation is important.
- How to declare private variables.
- How getter and setter methods work.
- How to use the `this` keyword.
- How access modifiers control visibility.
- How to implement validation using setter methods.
- The difference between encapsulation and data hiding.
- How encapsulation is used in real-world applications.
- How to organize data and methods inside Java classes.

## 14. Technologies Used

- **Programming Language:** Java
- **Concept:** Object-Oriented Programming
- **IDE:** Eclipse / VS Code
- **Execution:** Java Compiler and JVM

## 15. Conclusion

Encapsulation is an important principle of Object-Oriented Programming in Java.

It combines data and related methods inside a class and controls how the data can be accessed or modified.

By using private variables, getter methods, setter methods, and access modifiers, developers can create organized, maintainable, and controlled Java applications.

## Author

**Sri Dhanya**
