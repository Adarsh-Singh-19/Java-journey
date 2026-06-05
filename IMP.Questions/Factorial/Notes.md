# Factorial of a Number

## Objective

Create a Java program to calculate the factorial of a number using recursion.

---

## What is Factorial?

The factorial of a non-negative integer `n` is the product of all positive integers less than or equal to `n`.

Notation:

```text id="3yd7m5"
n!
```

Formula:

```text id="l7p6q0"
n! = n × (n-1) × (n-2) × ... × 2 × 1
```

---

## Examples

### Example 1

```text id="z2xv0h"
5! = 5 × 4 × 3 × 2 × 1
   = 120
```

### Example 2

```text id="66mjlwm"
4! = 4 × 3 × 2 × 1
   = 24
```

### Example 3

```text id="n7jw38"
0! = 1
```

---

## Concepts Used

* Scanner Class
* Methods
* Recursion
* Base Case
* Return Statement

---

## What is Recursion?

Recursion is a process in which a method calls itself repeatedly until a stopping condition (base case) is reached.

Example:

```java id="1z0r2l"
factorial(n - 1);
```

---

## Program Workflow

1. Take a number as input from the user.
2. Call the `factorial()` method.
3. Check the base condition:

   * If `n == 0` or `n == 1`, return 1.
4. Otherwise:

   * Multiply `n` by `factorial(n - 1)`.
5. Continue until the base case is reached.
6. Return the final result.
7. Display the factorial.

---

## Method Used

### factorial(int n)

Purpose:
Calculates the factorial of a number using recursion.

Return Type:

```java id="a4c14t"
long
```

Returns:
Factorial of the given number.

---

## Important Logic

### Base Case

```java id="9svqpu"
if (n == 0 || n == 1) {
    return 1;
}
```

Why?

```text id="vnljlwm"
0! = 1
1! = 1
```

This stops the recursive calls.

---

### Recursive Case

```java id="3b0x44"
return n * factorial(n - 1);
```

For:

```text id="tw0hkn"
5!
```

Execution:

```text id="u1uzhm"
5 × factorial(4)
5 × 4 × factorial(3)
5 × 4 × 3 × factorial(2)
5 × 4 × 3 × 2 × factorial(1)
5 × 4 × 3 × 2 × 1
= 120
```

---

## Flowchart

Start
|
Take Input Number
|
Call factorial(n)
|
n == 0 or n == 1 ?
|
+---- Yes ----> Return 1
|
+---- No -----> n × factorial(n-1)
|
Return Result
|
Display Result
|
End

---

## Example

### Input

```text id="6r30zv"
5
```

### Output

```text id="ry8prc"
Factorial of 5 is: 120
```

---

## Time Complexity

```text id="dj6njr"
O(n)
```

The function is called `n` times.

---

## Space Complexity

```text id="8c90f5"
O(n)
```

Because recursive calls are stored in the call stack.

---

## Learning Outcome

After completing this program, I learned:

* What factorial means mathematically.
* How recursion works.
* The importance of a base case.
* How methods can call themselves.
* How recursive solutions are built.
* Time and space complexity of recursive programs.

## Special Case Handling

### Negative Numbers

Factorial is not defined for negative integers.

Example:

```text
-5!
```

is not valid.

Logic Used:

```java
if(n < 0){
    System.out.println("Factorial is not defined for negative numbers.");
    return -1;
}
```

The method returns `-1` as an error indicator when a negative number is entered.
