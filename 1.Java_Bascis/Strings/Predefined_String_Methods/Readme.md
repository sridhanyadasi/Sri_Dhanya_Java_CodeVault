# Predefined Strings in Java

## 1. Introduction – What are Predefined Strings?

In Java, a String is a sequence of characters used to store and manipulate text.

Java provides a built-in `String` class in the `java.lang` package. This class contains several predefined methods that help developers perform different operations on strings.

Instead of writing logic manually for every string operation, we can use these predefined methods directly.

For example:

```java
String name = "Java Programming";

System.out.println(name.length());
System.out.println(name.charAt(0));
System.out.println(name.isEmpty());
```

Here, `length()`, `charAt()`, and `isEmpty()` are predefined String methods.

## 2. Why are Predefined String Methods Used?

Predefined String methods are used to perform common operations on text easily.

Main reasons:

- To access individual characters.
- To compare two strings.
- To check whether a string is empty or blank.
- To find the position of a character or substring.
- To convert strings into byte arrays.
- To copy characters from a string into another array.
- To work with Unicode characters and code points.
- To reduce manual coding.

## 3. Categories of Predefined String Methods

Java provides many predefined String methods. The methods in this project cover the following categories:

### 3.1 Character Access Methods

These methods help access characters or Unicode code points from a string.

Examples:
- `charAt()`
- `codePointAt()`
- `codePointBefore()`
- `codePointCount()`

### 3.2 String Comparison Methods

These methods compare two strings.

Examples:
- `compareTo()`
- `equalsIgnoreCase()`

### 3.3 String Checking Methods

These methods check whether a string contains text or is empty or blank.

Examples:
- `isEmpty()`
- `isBlank()`

### 3.4 String Searching Methods

These methods help find the position of characters or substrings.

Examples:
- `lastIndexOf(char)`
- `lastIndexOf(String)`

### 3.5 String Conversion and Copying Methods

These methods convert string data into byte arrays or copy characters into another array.

Examples:
- `getBytes()`
- `getBytes(Charset)`
- `getBytes(int, int, byte[], int)` – deprecated
- `getChars()`

## 4. Package Structure

```text
PerdefinedStrings/
│
├── CharAtIndex.java
├── CodePointAtIndex.java
├── CodePointBefore.java
├── CodePointCount.java
├── CompareTo.java
├── EqualIgnoranceCase_2Strings.java
├── GetByteCharSetName.java
├── GetBytes.java
├── GetBytesCopiesChar.java
├── GetChars.java
├── IsBlankMehod.java
├── IsEmpty.java
├── LastIndexOfChar.java
└── LastIndexOfStr.java
```

## 5. Examples Available in This Package

### 5.1 CharAtIndex.java

**Method:** `charAt()`

Returns the character at the specified index of a string.

Example:

```java
String text = "Java";
System.out.println(text.charAt(1));
```

Output:

```text
a
```

### 5.2 CodePointAtIndex.java

**Method:** `codePointAt()`

Returns the Unicode code point of the character starting at the specified index.

Example:

```java
String text = "Java";
System.out.println(text.codePointAt(0));
```

Output:

```text
74
```

### 5.3 CodePointBefore.java

**Method:** `codePointBefore()`

Returns the Unicode code point of the character before the specified index.

Example:

```java
String text = "Java";
System.out.println(text.codePointBefore(2));
```

Output:

```text
97
```

### 5.4 CodePointCount.java

**Method:** `codePointCount()`

Returns the number of Unicode code points in a specified range of a string.

Example:

```java
String text = "Java";
System.out.println(text.codePointCount(0, 4));
```

Output:

```text
4
```

### 5.5 CompareTo.java

**Method:** `compareTo()`

Compares two strings lexicographically.

It returns:
- `0` when both strings are equal.
- A negative value when the first string comes before the second.
- A positive value when the first string comes after the second.

Example:

```java
String first = "Apple";
String second = "Banana";

System.out.println(first.compareTo(second));
```

### 5.6 EqualIgnoranceCase_2Strings.java

**Method:** `equalsIgnoreCase()`

Compares two strings without considering uppercase and lowercase differences.

Example:

```java
String first = "JAVA";
String second = "java";

System.out.println(first.equalsIgnoreCase(second));
```

Output:

```text
true
```

### 5.7 GetByteCharSetName.java

**Method:** `getBytes(Charset)`

Converts a string into a byte array using the specified character encoding.

Example:

```java
import java.nio.charset.StandardCharsets;

String text = "Java";

byte[] data = text.getBytes(StandardCharsets.UTF_8);
```

### 5.8 GetBytes.java

**Method:** `getBytes()`

Converts a string into a byte array using the default charset.

Example:

```java
String text = "Java";

byte[] data = text.getBytes();
```

### 5.9 GetBytesCopiesChar.java

**Method:** `getBytes(int, int, byte[], int)`

Copies characters from a string into a byte array.

This is a deprecated method in modern Java. For new programs, prefer `getBytes(Charset)`.

### 5.10 GetChars.java

**Method:** `getChars()`

Copies characters from a string into a character array.

Example:

```java
String text = "Java";

char[] data = new char[4];

text.getChars(0, 4, data, 0);
```

### 5.11 IsBlankMehod.java

**Method:** `isBlank()`

Checks whether a string is empty or contains only whitespace characters.

Example:

```java
String text = "   ";

System.out.println(text.isBlank());
```

Output:

```text
true
```

### 5.12 IsEmpty.java

**Method:** `isEmpty()`

Checks whether a string has zero characters.

Example:

```java
String text = "";

System.out.println(text.isEmpty());
```

Output:

```text
true
```

### 5.13 LastIndexOfChar.java

**Method:** `lastIndexOf(char)`

Returns the index of the last occurrence of the specified character.

Example:

```java
String text = "Programming";

System.out.println(text.lastIndexOf('m'));
```

Output:

```text
7
```

### 5.14 LastIndexOfStr.java

**Method:** `lastIndexOf(String)`

Returns the index of the last occurrence of the specified substring.

Example:

```java
String text = "Java is easy. Java is powerful.";

System.out.println(text.lastIndexOf("Java"));
```

Output:

```text
14
```

## 6. Overall String Methods Flowchart

```text
       ┌──────────────────────────┐
       │       Start Program      │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │ Create a String Object   │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │ Select Required String   │
       │ Method                   │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │ Pass Required Arguments  │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │ Execute Predefined       │
       │ String Method            │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │ Receive Result           │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │ Display Result           │
       └────────────┬─────────────┘
                    ↓
       ┌──────────────────────────┐
       │          End             │
       └──────────────────────────┘
```

## 7. Important Concepts Explained

### 7.1 String

A String is an object that represents a sequence of characters.

```java
String name = "Dhanya";
```

### 7.2 String Immutability

Strings in Java are immutable.

This means that once a String object is created, its contents cannot be changed. String methods that appear to modify text generally return a new String rather than changing the original.

### 7.3 Index

An index represents the position of a character in a string.

Java String indexing starts from `0`.

For example:

```text
String: J  A  V  A
Index:  0  1  2  3
```

### 7.4 Unicode Code Point

A Unicode code point is a numeric value assigned to a character in the Unicode standard.

Methods such as `codePointAt()`, `codePointBefore()`, and `codePointCount()` help work with Unicode text.

### 7.5 Charset

A charset defines how characters are encoded into bytes.

For example, UTF-8 is a commonly used character encoding.

### 7.6 Empty String vs Blank String

| `isEmpty()` | `isBlank()` |
|---|---|
| Checks whether the length is zero. | Checks whether the string is empty or contains only whitespace. |
| `"".isEmpty()` returns `true`. | `"".isBlank()` returns `true`. |
| `" ".isEmpty()` returns `false`. | `" ".isBlank()` returns `true`. |

## 8. Uses of Predefined String Methods

1. **User Input Validation:** Check whether a name or field is empty or blank.
2. **Text Comparison:** Compare usernames, names, and other text values.
3. **Character Processing:** Access individual characters from strings.
4. **Text Searching:** Find the position of a character or word.
5. **Data Conversion:** Convert text into byte arrays for encoding and processing.
6. **Unicode Processing:** Work with characters from different languages.
7. **Application Development:** Process text in registration forms, search boxes, and other input fields.

## 9. Advantages

1. **Easy to Use:** Predefined methods reduce the amount of code developers need to write.
2. **Code Reusability:** The same methods can be used in different applications.
3. **Time Saving:** Common string operations can be performed directly.
4. **Reliability:** Standard library methods provide established implementations.
5. **Better Readability:** Method names clearly describe the operation being performed.
6. **Unicode Support:** Java provides methods to work with Unicode text.

## 10. Disadvantages and Limitations

1. **Index Errors:** Invalid indexes passed to methods such as `charAt()` can cause `StringIndexOutOfBoundsException`.
2. **Encoding Issues:** Using an unsuitable charset can produce incorrect byte representations.
3. **Immutability:** Repeated string modifications can create additional String objects.
4. **Method Limitations:** Each predefined method performs a specific operation; complex requirements may need additional logic.
5. **Deprecated Methods:** Some older methods, such as the specified `getBytes(int, int, byte[], int)` overload, should not be used in new applications.
6. **Unicode Complexity:** A visible character can consist of more than one UTF-16 code unit, so a `char` index is not always the same as a user-perceived character position.

## 11. Learning Outcomes

After completing this package, learners will understand:

- What predefined String methods are.
- How to access characters using `charAt()`.
- How to work with Unicode code points.
- How to compare strings.
- How to check empty and blank strings.
- How to search for characters and substrings.
- How to convert strings into byte arrays.
- How to copy characters into arrays.
- How to use predefined Java String methods in practical applications.

## 12. Technologies Used

- **Programming Language:** Java
- **Package:** `java.lang`
- **Concept:** Predefined String Methods
- **IDE:** Eclipse / VS Code
- **Execution:** Java Compiler and JVM

## 13. Conclusion

Predefined String methods are important features of Java that help developers perform common text operations easily.

This package demonstrates character access, Unicode processing, string comparison, checking, searching, conversion, and copying methods.

By practising these methods, learners can understand how to handle and process strings effectively in Java applications.

## Author

**Sri Dhanya**

Java Learning Repository – Predefined Strings
