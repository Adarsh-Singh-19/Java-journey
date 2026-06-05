# Positive, Negative, or Zero Checker

## Objective

Create a Java program that determines whether a given number is:

* Positive
* Negative
* Zero

using conditional statements.

---

## What is a Positive Number?

A positive number is greater than zero.

Examples:

```text
1, 5, 10, 100
```

Condition:

```java
number > 0
```

---

## What is a Negative Number?

A negative number is less than zero.

Examples:

```text
-1, -5, -10, -100
```

Condition:

```java
number < 0
```

---

## What is Zero?

Zero is neither positive nor negative.

Example:

```text
0
```

Condition:

```java
number == 0
```

---

## Concepts Used

* Scanner Class
* User Input
* if Statement
* else-if Statement
* else Statement
* Relational Operators

---

## Program Workflow

1. Take a number as input from the user.
2. Check if the number is greater than 0.
3. If true, print "Positive Number".
4. Otherwise, check if the number is less than 0.
5. If true, print "Negative Number".
6. Otherwise, print "Zero".
7. Close the Scanner object.

---

## Logic Used

### Positive Check

```java
number > 0
```

### Negative Check

```java
number < 0
```

### Zero Check

```java
number == 0
```

---

## Flowchart

Start
|
Take Input Number
|
number > 0 ?
|
+---- Yes ----> Positive Number
|
+---- No
|
v
number < 0 ?
|
+---- Yes ----> Negative Number
|
+---- No -----> Zero
|
End

---

## Example 1

### Input

```text
15
```

### Output

```text
The number is positive.
```

---

## Example 2

### Input

```text
-20
```

### Output

```text
The number is negative.
```

---

## Example 3

### Input

```text
0
```

### Output

```text
The number is zero.
```

---

## Time Complexity

```text
O(1)
```

Only a few comparisons are performed.

---

## Space Complexity

```text
O(1)
```

No extra memory is used.

---

## Learning Outcome

After completing this program, I learned:

* How to take user input using Scanner.
* How to use if, else-if, and else statements.
* How to compare numbers using relational operators.
* How to classify numbers as positive, negative, or zero.
* Basic decision-making in Java.
