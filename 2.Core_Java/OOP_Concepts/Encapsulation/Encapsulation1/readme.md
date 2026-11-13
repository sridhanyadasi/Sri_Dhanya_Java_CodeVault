# Encapsulation – Package 1

## 1. Introduction

The `encapsulation` package contains Java programs that demonstrate encapsulation using car-related examples.

Encapsulation is an Object-Oriented Programming concept that combines data and methods inside a class while controlling direct access to the data.

In Java, it is commonly implemented using private variables and public getter and setter methods.

This package contains two car-related examples and their corresponding test classes.

## 2. Purpose of This Package

The main purpose of this package is to understand how encapsulation can be implemented using Java classes and objects.

This package helps learners understand:

- How to declare variables inside a class.
- How to control access to class data.
- How to use getter and setter methods.
- How to create objects for different classes.
- How to access class data through methods.
- How to test encapsulated classes using separate test classes.

## 3. Package Structure

```text id="3wr8jf"
encapsulation/
│
├── Car.java
├── Car1.java
├── TestCar.java
└── TestCar1.java
```

## 4. Examples Available in This Package

### 4.1 Car.java

**File:** `Car.java`

This file contains a car-related Java class.

It can demonstrate how car details are declared and managed inside a class using encapsulation.

For example, a car class may contain details such as:
- Brand
- Model
- Price
- Color

Private variables can be used to restrict direct access to these details, while public methods can provide controlled access.

### 4.2 TestCar.java

**File:** `TestCar.java`

This file is used to test the `Car` class.

It can demonstrate:
- Creating a `Car` object.
- Assigning values through setter methods.
- Retrieving values through getter methods.
- Displaying car details.

### 4.3 Car1.java

**File:** `Car1.java`

This file contains another car-related Java class.

It provides a separate example for practising encapsulation and understanding how data and methods can be organized inside a class.

### 4.4 TestCar1.java

**File:** `TestCar1.java`

This file is used to test the `Car1` class.

It helps demonstrate object creation and access to class data through the methods provided by the class.

## 5. Working Flowchart

The following flowchart represents the general execution flow of the car-related encapsulation examples.

```text id="2ejx77"
       ┌────────────────────────┐
       │       Start            │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Create Car Class       │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Declare Private        │
       │ Variables              │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Create Getter and      │
       │ Setter Methods         │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Create Object in       │
       │ TestCar Class          │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Set and Get Values     │
       │ Through Methods        │
       └───────────┬────────────┘
                   ↓
       ┌────────────────────────┐
       │ Display Car Details    │
       └────────────────────────┘
```

*Note: This is a conceptual encapsulation flow. The exact variables and methods should be matched with the source code.*

## 6. Important Concepts Explained

### 6.1 Class

A class is a blueprint used to create objects.

In this package, `Car.java` and `Car1.java` represent separate car-related classes.

### 6.2 Object

An object is an instance of a class.

Example:

```java id="m1o8jb"
Car car = new Car();
```

Here, `car` is an object of the `Car` class.

### 6.3 Private Variables

Private variables cannot be accessed directly from outside their declaring class.

Example:

```java id="u4f3a1"
private String brand;
private double price;
```

### 6.4 Getter Method

A getter method retrieves the value of a private variable.

Example:

```java id="ng2yka"
public String getBrand() {
    return brand;
}
```

### 6.5 Setter Method

A setter method updates the value of a private variable.

Example:

```java id="v1o7kd"
public void setBrand(String brand) {
    this.brand = brand;
}
```

### 6.6 Test Class

A test class is used to create objects and execute methods of another class.

In this package:
- `TestCar.java` tests `Car.java`.
- `TestCar1.java` tests `Car1.java`.

## 7. Uses of Encapsulation in This Package

- Protecting car-related data from direct external access.
- Controlling how car details are updated.
- Retrieving car information through getter methods.
- Keeping car data and related methods together.
- Separating class implementation from program execution.

## 8. Advantages

1. **Data Protection:** Private variables prevent direct access from other classes.
2. **Controlled Access:** Getter and setter methods control how values are accessed and updated.
3. **Data Validation:** Setter methods can validate car details before assigning values.
4. **Code Organization:** Car-related data and methods are maintained inside their respective classes.
5. **Maintainability:** Internal implementation can be modified without necessarily changing the public methods.

## 9. Disadvantages

1. **More Code:** Getter and setter methods require additional code.
2. **Development Time:** Creating access methods takes extra effort.
3. **Unnecessary Methods:** Creating getters and setters for every variable may not always be required.
4. **Validation Errors:** Incorrect setter logic may allow invalid values.
5. **Complexity:** Beginners may need time to understand how private variables are accessed through public methods.

## 10. Learning Outcomes

After completing this package, learners will understand:

- How to create Java classes and objects.
- How encapsulation works in practical programs.
- How private variables restrict direct access.
- How getter and setter methods work.
- How to use the `this` keyword.
- How to test classes using separate Java files.
- How to organize related data and methods inside a class.

## 11. Technologies Used

- **Programming Language:** Java
- **Concept:** Encapsulation
- **IDE:** Eclipse / VS Code
- **Execution:** Java Compiler and JVM

## 12. Conclusion

The `encapsulation` package provides car-related examples to understand how encapsulation is implemented in Java.

By working with `Car`, `Car1`, `TestCar`, and `TestCar1`, learners can practise creating objects and managing class data through methods.

These examples provide a foundation for implementing data protection and controlled access in Java applications.

## Author

**Sri Dhanya**
