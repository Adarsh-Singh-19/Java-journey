# Even Odd Checker

## Objective

Create a Java program to check whether a given number is Even or Odd using a method that returns a boolean value.

---

## What is an Even Number?

An Even Number is a number that is completely divisible by 2.

Examples:

```text
2, 4, 6, 8, 10, 12...
```

---

## What is an Odd Number?

An Odd Number is a number that is not completely divisible by 2.

Examples:

```text
1, 3, 5, 7, 9, 11...
```

---

## Concepts Used

* Scanner Class
* Methods
* Boolean Return Type
* Modulus Operator (%)
* If-Else Statement

---

## Program Workflow

1. Take a number as input from the user.
2. Call the `checkEven()` method.
3. Check whether the number is divisible by 2.
4. Return:

   * `true` if the number is even.
   * `false` if the number is odd.
5. Display the result using an if-else statement.

---

## Method Used

### checkEven(int number)

Purpose:
Checks whether a number is even.

Return Type:

```java
boolean
```

Returns:

* `true` → Even Number
* `false` → Odd Number

---

## Important Logic

### Modulus Operator (%)

The modulus operator returns the remainder after division.

Example:

```java
10 % 2 = 0
11 % 2 = 1
```

Logic Used:

```java
return number % 2 == 0;
```

Explanation:

* If remainder is 0 → Number is Even.
* Otherwise → Number is Odd.

---

## Flowchart

Start
|
Take Input Number
|
Call checkEven()
|
Number % 2 == 0 ?
|
+---- Yes ----> Even Number
|
+---- No -----> Odd Number
|
End

---

## Example

### Input

```text
Enter a number: 8
```

### Output

```text
8 is an even number.
```

---

### Input

```text
Enter a number: 7
```

### Output

```text
7 is an odd number.
```

---

## Time Complexity

```text
O(1)
```

The program performs only one calculation.

---

## Learning Outcome

After completing this project, I learned:

* How to create methods that return boolean values.
* How to use the modulus operator (%).
* How to determine whether a number is even or odd.
* How to use if-else statements.
* How to take user input using Scanner.
* How to call and use methods in Java.
