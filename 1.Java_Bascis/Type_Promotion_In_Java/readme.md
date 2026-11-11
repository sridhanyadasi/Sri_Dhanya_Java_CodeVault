# Type Promotion in Java

## 1. Introduction

Type Promotion in Java is the process of automatically converting a smaller data type into a larger compatible data type during an operation.

Java performs type promotion when different data types are used together in expressions to avoid data loss during calculations.

For example, when an `int` value and a `double` value are used in the same expression, the `int` value is promoted to `double`.

## 2. Why Do We Use Type Promotion?

Type promotion helps Java perform calculations involving different data types safely.

It allows smaller data types to participate in operations with larger data types without requiring manual conversion.

### Example

```java
public class TypePromotionExample {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.5;

        double result = a + b;

        System.out.println(result);
    }
}
```

**Output:**

```text
30.5
```

Here, the `int` value is automatically promoted to `double` before addition.

## 3. Types of Type Conversion

### 1. Widening Conversion

Widening conversion means automatically converting a smaller compatible data type into a larger data type.

Example:

```java
int num = 100;
double value = num;
```

### 2. Narrowing Conversion

Narrowing conversion means manually converting a larger data type into a smaller data type.

Example:

```java
double num = 100.75;
int value = (int) num;
```

The decimal portion is lost during this conversion.

## 4. Type Promotion in Expressions

When different data types are used in an arithmetic expression, Java automatically promotes `byte`, `short` and `char` values to `int`.

If an expression contains a `long`, `float` or `double`, the operands may be promoted according to Java's numeric promotion rules.

Example:

```java
byte a = 10;
byte b = 20;

int result = a + b;
```

Here, both `byte` values are promoted to `int` before addition.

## 5. Advantages of Type Promotion

- Helps perform operations with different numeric data types.
- Reduces the need for explicit type conversion.
- Supports calculations using compatible data types.
- Helps avoid data loss during widening conversions.

## 6. Limitations of Type Promotion

- Automatic promotion may produce a result with a larger data type than expected.
- Narrowing conversion requires explicit casting.
- Narrowing may cause data loss or overflow.
- Incorrect assumptions about the resulting data type can lead to compilation errors.

## 7. Packages and Programs

### 1. com.te.typepromotion

This package contains programs related to type promotion and arithmetic operations.

| Program | Description |
|---|---|
| Addition.java | Demonstrates addition using different data types. |
| Addition1.java | Demonstrates another example of addition and type conversion. |
| Student.java | Demonstrates type-related operations using a Student class. |
| TypePromotion.java | Demonstrates type promotion in Java expressions. |

## 8. Learning Outcomes

- Understand type promotion in Java.
- Differentiate between widening and narrowing conversions.
- Understand automatic type conversion.
- Perform arithmetic operations using different data types.
- Understand type promotion in expressions.
- Identify possible data loss during narrowing conversion.

## Author

Sri Dhanya
