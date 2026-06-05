# LCM (Least Common Multiple)

## Objective

Create a Java program to find the Least Common Multiple (LCM) of two numbers using the relationship between HCF and LCM.

---

## What is LCM?

LCM (Least Common Multiple) is the smallest positive number that is divisible by both given numbers.

---

## Examples

### Example 1

```text
Number 1 = 12
Number 2 = 18
```

Multiples of 12:

```text
12, 24, 36, 48, 60...
```

Multiples of 18:

```text
18, 36, 54, 72...
```

Smallest common multiple:

```text
36
```

Therefore:

```text
LCM(12, 18) = 36
```

---

### Example 2

```text
Number 1 = 4
Number 2 = 6
```

LCM:

```text
12
```

---

## Concepts Used

* Scanner Class
* Methods
* Recursion
* HCF (GCD)
* Mathematical Formula

---

## Formula Used

The relationship between HCF and LCM is:

```text
LCM(a,b) × HCF(a,b) = a × b
```

Therefore:

```text
LCM(a,b) = (a × b) / HCF(a,b)
```

---

## Program Workflow

1. Take two numbers as input.
2. Calculate the HCF using recursion.
3. Apply the LCM formula.
4. Display the result.

---

## Method Used

### hcf(int a, int b)

Purpose:

Calculates the HCF using the Euclidean Algorithm.

Return Type:

```java
int
```

---

## Important Logic

### Recursive HCF

```java
if (b == 0) {
    return a;
}
```

This is the base case.

---

### Recursive Call

```java
return hcf(b, a % b);
```

The process continues until `b` becomes 0.

---

### LCM Calculation

```java
int lcm = (num1 * num2) / hcf(num1, num2);
```

Example:

```text
num1 = 12
num2 = 18

HCF = 6

LCM = (12 × 18) / 6
     = 216 / 6
     = 36
```

---

## Flowchart

Start
|
Take Two Numbers
|
Calculate HCF
|
Apply Formula
LCM = (a × b) / HCF
|
Display LCM
|
End

---

## Example

### Input

```text
Enter first number: 12
Enter second number: 18
```

### Output

```text
The LCM of 12 and 18 is: 36
```

---

## Time Complexity

### HCF Calculation

```text
O(log(min(a,b)))
```

Using the Euclidean Algorithm.

### LCM Calculation

```text
O(1)
```

---

## Space Complexity

```text
O(log(min(a,b)))
```

Due to recursive function calls.

---

## Learning Outcome

After completing this program, I learned:

* What LCM means.
* The relationship between HCF and LCM.
* How recursion works.
* How to implement the Euclidean Algorithm.
* How to solve mathematical problems efficiently.
* Time and space complexity analysis.
