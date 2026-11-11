# StringBuilder in Java

## 1. Introduction

StringBuilder is a predefined class in Java used to create and manipulate mutable sequences of characters.

Unlike String, StringBuilder allows us to modify the existing character sequence without creating a new object for every modification.

It is available in the `java.lang` package, so no separate import statement is required.

## 2. Why Do We Use StringBuilder?

In Java, String objects are immutable. This means that once a String object is created, its original value cannot be changed.

Whenever we modify a String, Java creates a new String object.

When we perform multiple modifications, such as concatenating strings inside a loop, creating many temporary String objects can affect performance.

StringBuilder solves this problem by allowing us to modify the same character sequence.

### Example

```java
public class StringExample {
    public static void main(String[] args) {
        String str = "Java";
        str = str + " Programming";

        System.out.println(str);
    }
}
```

In this example, the original String object is not modified. A new String object is created with the updated value.

Using StringBuilder:

```java
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");

        System.out.println(sb);
    }
}
```

Here, StringBuilder modifies its existing character sequence.

## 3. Important Features of StringBuilder

- Mutable: Its content can be modified.
- Efficient modification: Suitable for repeated string modifications.
- Not synchronized: It is not thread-safe by default.
- Dynamic capacity: Its capacity can grow when additional characters are added.
- Faster in many single-threaded modification scenarios compared with StringBuffer.

## 4. StringBuilder Methods

| Method | Description |
|---|---|
| append() | Adds text at the end. |
| insert() | Inserts text at a specified position. |
| replace() | Replaces characters within a specified range. |
| delete() | Removes characters from a specified range. |
| deleteCharAt() | Removes a character at a specified index. |
| reverse() | Reverses the character sequence. |
| length() | Returns the number of characters. |
| capacity() | Returns the current storage capacity. |
| charAt() | Returns the character at a specified index. |
| setCharAt() | Changes the character at a specified index. |
| ensureCapacity() | Ensures that the minimum required capacity is available. |
| toString() | Converts StringBuilder into a String. |

## 5. Advantages of StringBuilder

- Reduces unnecessary String object creation during repeated modifications.
- Generally provides better performance than StringBuffer in single-threaded operations.
- Supports multiple modification operations.
- Automatically increases capacity when required.
- Useful when building strings dynamically.

## 6. Limitations of StringBuilder

- It is not thread-safe.
- It should not be shared between multiple threads when synchronized access is required.
- It is mutable, so unintended modifications can affect the same object.
- It is not ideal when immutable String values are required.
- It does not automatically provide thread synchronization.

## 7. Difference Between String, StringBuilder and StringBuffer

| Feature | String | StringBuilder | StringBuffer |
|---|---|---|---|
| Mutability | Immutable | Mutable | Mutable |
| Modification | Creates a new String object | Modifies the existing object | Modifies the existing object |
| Thread Safety | Immutable, so safe to share | Not thread-safe | Thread-safe through synchronized methods |
| Synchronization | Not applicable | Not synchronized | Synchronized |
| Performance | Less suitable for repeated modifications | Generally faster for single-threaded modifications | Generally slower than StringBuilder due to synchronization overhead |
| Memory Usage | May create multiple objects during modifications | Reuses its mutable character sequence | Reuses its mutable character sequence |
| Usage | Fixed text and string values | Frequent modifications in single-threaded code | Frequent modifications when shared access requires synchronization |

## 8. String vs StringBuilder vs StringBuffer – Which One Should We Use?

### Use String when:

- The text does not need frequent modifications.
- You want immutable values.
- You are storing names, email addresses, messages and other fixed text.

### Use StringBuilder when:

- You need to modify text frequently.
- You are performing concatenation inside loops.
- You are building dynamic strings.
- Your code does not require thread synchronization.

### Use StringBuffer when:

- You need a mutable character sequence.
- Multiple threads may access and modify the same StringBuffer instance.
- You need its synchronized methods to protect individual operations.

**Important:** StringBuffer's synchronized methods provide thread safety for individual operations. Multiple method calls that form one complete operation may still need additional synchronization.

## 9. Real-Time Usage of StringBuilder

StringBuilder is useful in many practical situations:

- Building dynamic SQL query strings.
- Generating HTML content.
- Creating comma-separated values.
- Constructing reports.
- Combining data inside loops.
- Building dynamic messages.

## 10. Packages and Programs

### 1. com.te.stringBuilder

This package contains programs related to StringBuilder operations and comma-separated values.

| Program | Description |
|---|---|
| CommaSeperated.java | Demonstrates working with comma-separated values using StringBuilder. |
| CommaSeperatedArray.java | Converts array elements into a comma-separated string. |

## 11. Learning Outcomes

- Understand StringBuilder and its purpose.
- Understand mutable and immutable objects.
- Perform string modifications using predefined methods.
- Understand the advantages and limitations of StringBuilder.
- Differentiate between String, StringBuilder and StringBuffer.
- Choose the appropriate class based on application requirements.

## Author

Sri Dhanya
