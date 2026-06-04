# Day 01 - Java Fundamentals ☕

## Topics Covered

* Java Setup (JDK & VS Code)
* Hello World Program
* Variables
* Data Types
* User Input using Scanner

## What is Java?

Java is a high-level, object-oriented programming language developed by Sun Microsystems. It follows the principle "Write Once, Run Anywhere (WORA)".

## Java Program Structure

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Explanation

* `public class HelloWorld` → Defines a class.
* `main()` → Entry point of the program.
* `System.out.println()` → Prints output to the console.

## Variables

Variables are used to store data values.

Example:

```java
int age = 19;
String name = "Adarsh";
```

## Data Types

| Data Type | Example |
| --------- | ------- |
| int       | 10      |
| double    | 3.14    |
| char      | 'A'     |
| boolean   | true    |
| String    | "Hello" |

## User Input

Scanner class is used to take input from the user.

Example:

```java
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
```

## Programs Created

1. HelloWorld.java
2. Variable.java
3. UserInput.java

## Key Learnings

* How to write and run a Java program.
* How variables store data.
* Different data types in Java.
* Taking input from the user using Scanner.
* Basic Git and GitHub workflow.

## Output Examples

Hello, World!

Integer variable: 10
Double variable: 3.14
Character variable: A
String variable: Hello
Boolean variable: true

## . Type Conversion


Automatic conversion of a smaller data type into a larger data type.


Example:


```java
int a = 10;
double b = a;
```


Output:


```text
10.0
```


---


## . Type Casting


Manual conversion of a larger data type into a smaller data type.


Example:


```java
double c = 9.99;
int d = (int) c;
```


Output:


```text
9
```


---