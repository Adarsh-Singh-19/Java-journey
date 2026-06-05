# Power of a Number

## Objective

Create a Java program to calculate the power of a number using the built-in `Math.pow()` method.

---

## What is Power?

Power means multiplying a number by itself a certain number of times.

Notation:

```text
baseexponent
```

Example:

```text
2³ = 2 × 2 × 2 = 8
```

---

## Examples

### Example 1

```text
Base = 2
Exponent = 3
```

Calculation:

```text
2³ = 8
```

---

### Example 2

```text
Base = 5
Exponent = 2
```

Calculation:

```text
5² = 25
```

---

### Example 3

```text
Base = 10
Exponent = 0
```

Calculation:

```text
10⁰ = 1
```

---

## Concepts Used

* Scanner Class
* User Input
* Math Class
* Math.pow() Method
* Variables
* Output Formatting

---

## What is Math.pow()?

`Math.pow()` is a built-in Java method used to calculate powers.

Syntax:

```java
Math.pow(base, exponent);
```

Returns:

```text
base^exponent
```

Example:

```java
Math.pow(2, 3);
```

Output:

```text
8.0
```

---

## Program Workflow

1. Take the base number as input.
2. Take the exponent as input.
3. Call the `Math.pow()` method.
4. Store the result in a variable.
5. Display the result.

---

## Important Logic

### Reading Input

```java
double base = scanner.nextDouble();
double exponent = scanner.nextDouble();
```

Allows decimal values.

---

### Calculating Power

```java
double result = Math.pow(base, exponent);
```

Example:

```text
Math.pow(3, 4)
```

Calculation:

```text
3 × 3 × 3 × 3 = 81
```

Output:

```text
81.0
```

---

## Flowchart

Start
|
Take Base Number
|
Take Exponent
|
Call Math.pow(base, exponent)
|
Store Result
|
Display Result
|
End

---

## Example

### Input

```text
Enter the base number: 2
Enter the exponent: 5
```

### Output

```text
2.0 raised to the power of 5.0 is: 32.0
```

---

## Special Cases

### Any Number Raised to 0

```text
5⁰ = 1
10⁰ = 1
100⁰ = 1
```

---

### Zero Raised to Positive Power

```text
0³ = 0
```

---

### Negative Base

```text
(-2)³ = -8
(-2)² = 4
```

---

### Fractional Exponents

```text
9^0.5 = 3
16^0.5 = 4
```

---

## Time Complexity

```text
O(1)
```

The computation is handled internally by Java's Math library.

---

## Space Complexity

```text
O(1)
```

Only a few variables are used.

---

## Learning Outcome

After completing this program, I learned:

* What powers and exponents are.
* How to use the Math class.
* How to use the Math.pow() method.
* How to take numeric input from the user.
* How Java handles mathematical calculations.
* Different cases involving exponents.
