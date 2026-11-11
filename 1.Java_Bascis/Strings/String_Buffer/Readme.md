# StringBuffer in Java

## 1. Introduction

StringBuffer is a predefined class in Java used to create and manipulate mutable sequences of characters.

It allows us to modify the existing character sequence without creating a new object for every modification.

StringBuffer is available in the `java.lang` package, so no separate import statement is required.

## 2. Why Do We Use StringBuffer?

In Java, String objects are immutable. Whenever we modify a String, a new String object is created instead of changing the original object.

For applications that perform frequent string modifications, creating multiple String objects can cause unnecessary object creation.

StringBuffer solves this problem by allowing modifications to the existing character sequence.

It also provides synchronized methods, making it suitable when multiple threads need to access and modify the same StringBuffer object.

### Example

```java
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");

        System.out.println(sb);
    }
}
```

**Output:**

```text
Java Programming
```

Here, the existing StringBuffer object is modified when we append additional text.

## 3. Important Features of StringBuffer

- Mutable: Its content can be modified.
- Thread-safe methods: Its methods are synchronized.
- Dynamic capacity: Its capacity can increase when additional characters are added.
- Efficient modification: Useful for repeated string modifications.
- Synchronization: Helps protect individual StringBuffer operations when multiple threads access the same object.

## 4. StringBuffer Methods

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
| setCharAt() | Changes a character at a specified index. |
| ensureCapacity() | Ensures that the minimum required capacity is available. |
| toString() | Converts StringBuffer into a String. |

## 5. Advantages of StringBuffer

- Allows modification of the existing character sequence.
- Reduces unnecessary String object creation during repeated modifications.
- Provides synchronized methods.
- Supports access from multiple threads with synchronization at the method level.
- Automatically increases capacity when required.

## 6. Limitations of StringBuffer

- Generally slower than StringBuilder because of synchronization overhead.
- Synchronization does not automatically make a sequence of multiple method calls atomic.
- Mutable content can be changed unintentionally.
- Not necessary for most ordinary single-threaded string operations.
- Synchronization adds overhead even when multiple threads are not involved.

## 7. Difference Between String, StringBuilder and StringBuffer

| Feature | String | StringBuilder | StringBuffer |
|---|---|---|---|
| Mutability | Immutable | Mutable | Mutable |
| Modification | Creates a new String object | Modifies the existing object | Modifies the existing object |
| Thread Safety | Immutable, so safe to share | Not thread-safe | Thread-safe through synchronized methods |
| Synchronization | Not applicable | Not synchronized | Synchronized |
| Performance | Less suitable for repeated modifications | Generally faster for single-threaded modifications | Generally slower than StringBuilder due to synchronization overhead |
| Usage | Fixed text and string values | Frequent modifications in single-threaded code | Frequent modifications when synchronized access is required |

## 8. String vs StringBuilder vs StringBuffer – Which One Should We Use?

### Use String when:

- The text does not need frequent modifications.
- You want immutable values.
- You are storing names, email addresses, messages and other fixed text.

### Use StringBuilder when:

- You need frequent string modifications.
- You are performing concatenation inside loops.
- You are building dynamic strings in single-threaded code.
- Thread synchronization is not required.

### Use StringBuffer when:

- You need a mutable character sequence.
- Multiple threads may access and modify the same StringBuffer instance.
- You need synchronized methods to protect individual operations.

**Important:** StringBuffer synchronizes individual methods. If multiple operations must work together as one atomic task, additional synchronization may still be required.

## 9. Real-Time Usage of StringBuffer

StringBuffer can be useful in situations such as:

- Building dynamic messages shared between threads.
- Modifying shared text data in multithreaded applications.
- Creating dynamic reports.
- Performing repeated text modifications.
- Maintaining a shared mutable character sequence with synchronized method access.

## 10. Packages and Programs

### 1. com.te.stringBuffer

This package contains programs related to StringBuffer operations and string manipulation.

| Program | Description |
|---|---|
| Concatenate2Strings.java | Combines two strings using StringBuffer. |
| OccurancesOfSubStrng.java | Finds the occurrences of a substring in a string. |
| Palindrome.java | Checks whether a string is a palindrome. |

## 11. Learning Outcomes

- Understand StringBuffer and its purpose.
- Understand mutable and immutable objects.
- Perform string modifications using predefined methods.
- Understand synchronization and thread safety.
- Identify the advantages and limitations of StringBuffer.
- Differentiate between String, StringBuilder and StringBuffer.
- Choose the appropriate class based on application requirements.

## Author

Sri Dhanya
