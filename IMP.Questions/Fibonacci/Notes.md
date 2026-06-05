# Fibonacci Number Checker

## Objective

Create a Java program to determine whether a given number belongs to the Fibonacci sequence.

---

## What is a Fibonacci Sequence?

A Fibonacci sequence is a series of numbers where each number is the sum of the previous two numbers.

Sequence:

```text
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
```

Formula:

```text
F(n) = F(n-1) + F(n-2)
```

---

## Examples

### Fibonacci Numbers

```text
0, 1, 2, 3, 5, 8, 13, 21, 34
```

### Non-Fibonacci Numbers

```text
4, 6, 7, 9, 10, 12
```

---

## Concepts Used

* Scanner Class
* Methods
* Boolean Return Type
* While Loop
* Variables
* Conditional Statements

---

## Program Workflow

1. Take a number as input from the user.
2. Call the `isFibonacci()` method.
3. Handle special cases:

   * 0 is a Fibonacci number.
   * 1 is a Fibonacci number.
4. Generate Fibonacci numbers using a loop.
5. Continue generating terms until:

   * The generated number becomes equal to the input, or
   * The generated number becomes greater than the input.
6. Return:

   * `true` if the number is found.
   * `false` otherwise.
7. Display the result.

---

## Method Used

### isFibonacci(int n)

Purpose:

Checks whether a given number belongs to the Fibonacci sequence.

Return Type:

```java
boolean
```

Returns:

* `true` → Fibonacci Number
* `false` → Not a Fibonacci Number

---

## Important Logic

### Base Case

```java
if (n == 0 || n == 1) {
    return true;
}
```

Reason:

```text
0 and 1 are the first Fibonacci numbers.
```

---

### Generating Fibonacci Numbers

```java
int a = 0;
int b = 1;
```

Initial values:

```text
a = 0
b = 1
```

---

### Loop Logic

```java
while (b < n)
```

Continue generating Fibonacci terms until the current term becomes greater than or equal to the input number.

---

### Next Fibonacci Number

```java
int temp = a + b;
a = b;
b = temp;
```

Example:

```text
a=0, b=1

temp=1
a=1
b=1

temp=2
a=1
b=2

temp=3
a=2
b=3

temp=5
a=3
b=5
```

---

### Final Check

```java
return b == n;
```

If the generated Fibonacci number equals the input number, return true.

---

## Flowchart

Start
|
Take Input Number
|
n == 0 or n == 1 ?
|
+---- Yes ----> Fibonacci Number
|
+---- No
|
Initialize a=0, b=1
|
Generate Fibonacci Numbers
|
b < n ?
|
+---- Yes ----> Continue
|
+---- No
|
b == n ?
|
+---- Yes ----> Fibonacci Number
|
+---- No -----> Not Fibonacci Number
|
End

---

## Example 1

### Input

```text
21
```

### Output

```text
21 is a Fibonacci number.
```

---

## Example 2

### Input

```text
20
```

### Output

```text
20 is not a Fibonacci number.
```

---

## Time Complexity

```text
O(k)
```

Where `k` is the position of the Fibonacci number near `n`.

---

## Space Complexity

```text
O(1)
```

Only a few variables are used.

---

## Learning Outcome

After completing this program, I learned:

* What Fibonacci numbers are.
* How Fibonacci sequences are generated.
* How to use loops to generate series.
* How to create methods that return boolean values.
* How to use conditional statements for decision making.
* How to solve mathematical problems efficiently in Java.
