# Swapping Two Numbers

## Problem Statement

Write a Java program to swap two numbers entered by the user.

---

## What is Swapping?

Swapping means exchanging the values of two variables.

Example:

Before Swapping:

```text
num1 = 10
num2 = 20
```

After Swapping:

```text
num1 = 20
num2 = 10
```

---

## Approach

1. Take two numbers as input.
2. Store the first number in a temporary variable.
3. Assign the second number to the first variable.
4. Assign the temporary value to the second variable.
5. Print the swapped values.

---

## Algorithm

1. Input `num1` and `num2`.
2. Create a variable `temp`.
3. Store `num1` in `temp`.
4. Assign `num2` to `num1`.
5. Assign `temp` to `num2`.
6. Print the swapped numbers.

---

## Flowchart

```text
Start
  |
Input num1, num2
  |
temp = num1
  |
num1 = num2
  |
num2 = temp
  |
Print num1, num2
  |
 End
```

---

## Dry Run

Input:

```text
num1 = 10
num2 = 20
```

Execution:

```text
temp = 10
num1 = 20
num2 = 10
```

Output:

```text
After swapping:
num1 = 20
num2 = 10
```

---

## Time Complexity

O(1)

---

## Space Complexity

O(1)

---

## Concepts Used

* Variables
* User Input
* Temporary Variable
* Assignment Operator
* Output Statements

---

## Alternative Method (Without Temporary Variable)

```java
num1 = num1 + num2;
num2 = num1 - num2;
num1 = num1 - num2;
```

This swaps the values without using an extra variable.
