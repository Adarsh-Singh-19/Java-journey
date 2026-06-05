# HCF (Highest Common Factor)

## Objective

Create a Java program to find the Highest Common Factor (HCF) of two numbers using the Euclidean Algorithm.

---

## What is HCF?

HCF (Highest Common Factor) is the largest positive integer that divides both numbers without leaving a remainder.

It is also known as:

* GCD (Greatest Common Divisor)
* Greatest Common Factor (GCF)

---

## Examples

### Example 1

```text
Number 1 = 12
Number 2 = 18
```

Factors of 12:

```text
1, 2, 3, 4, 6, 12
```

Factors of 18:

```text
1, 2, 3, 6, 9, 18
```

Common Factors:

```text
1, 2, 3, 6
```

Highest Common Factor:

```text
6
```

---

### Example 2

```text
Number 1 = 24
Number 2 = 36
```

HCF:

```text
12
```

---

## Concepts Used

* Scanner Class
* Methods
* While Loop
* Modulus Operator (%)
* Euclidean Algorithm

---

## What is the Euclidean Algorithm?

The Euclidean Algorithm is an efficient method for finding the HCF of two numbers.

Formula:

```text
HCF(a, b) = HCF(b, a % b)
```

Repeat until:

```text
b = 0
```

The remaining value of `a` becomes the HCF.

---

## Program Workflow

1. Take two numbers as input.
2. Call the `findHCF()` method.
3. Continue dividing:

   * Replace `a` with `b`
   * Replace `b` with `a % b`
4. Repeat until `b` becomes 0.
5. Return the value of `a`.
6. Display the HCF.

---

## Method Used

### findHCF(int a, int b)

Purpose:

Finds the HCF of two numbers using the Euclidean Algorithm.

Return Type:

```java
int
```

Returns:

The HCF of the two numbers.

---

## Important Logic

### While Loop

```java
while (b != 0)
```

Continue the process until the second number becomes zero.

---

### Swapping Values

```java
int temp = b;
b = a % b;
a = temp;
```

Example:

```text
a = 18
b = 12
```

Iteration 1:

```text
temp = 12
b = 18 % 12 = 6
a = 12
```

Iteration 2:

```text
temp = 6
b = 12 % 6 = 0
a = 6
```

Loop stops.

Result:

```text
HCF = 6
```

---

## Flowchart

Start
|
Take Two Numbers
|
Call findHCF(a,b)
|
b != 0 ?
|
+---- Yes ----> temp = b
|                b = a % b
|                a = temp
|                Repeat
|
+---- No -----> Return a
|
Display HCF
|
End

---

## Example

### Input

```text
Enter first number: 18
Enter second number: 12
```

### Output

```text
The HCF of 18 and 12 is: 6
```

---

## Time Complexity

```text
O(log(min(a,b)))
```

The Euclidean Algorithm is very efficient.

---

## Space Complexity

```text
O(1)
```

Only a few variables are used.

---

## Learning Outcome

After completing this program, I learned:

* What HCF (GCD) means.
* How the Euclidean Algorithm works.
* How to use the modulus operator (%).
* How to swap values using a temporary variable.
* How to solve mathematical problems efficiently.
* Time and space complexity analysis.
