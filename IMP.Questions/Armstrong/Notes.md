# Armstrong Number Checker

## Objective

Create a Java program to check whether a given number is an Armstrong Number or not using methods.

---

## What is an Armstrong Number?

An Armstrong Number is a number that is equal to the sum of its digits raised to the power of the total number of digits.

### Example 1

Number = 153

Number of digits = 3

Calculation:

1³ + 5³ + 3³

= 1 + 125 + 27

= 153

Therefore, 153 is an Armstrong Number.

### Example 2

Number = 9474

Number of digits = 4

Calculation:

9⁴ + 4⁴ + 7⁴ + 4⁴

= 6561 + 256 + 2401 + 256

= 9474

Therefore, 9474 is an Armstrong Number.

---

## Concepts Used

* Scanner Class
* Methods
* Boolean Return Type
* While Loop
* Modulus Operator (%)
* Integer Division (/)
* Math.pow()
* String.valueOf()
* Conditional Statements

---

## Program Workflow

1. Take a number as input from the user.
2. Call the `isArmstrong()` method.
3. Calculate the total number of digits.
4. Extract each digit using `% 10`.
5. Raise the digit to the power of the number of digits.
6. Add all powered digits.
7. Compare the sum with the original number.
8. Return `true` if both are equal, otherwise return `false`.
9. Display the result.

---

## Method Used

### isArmstrong(int num)

Purpose:
Checks whether the given number is an Armstrong Number.

Return Type:

```java
boolean
```

Returns:

* `true` → Armstrong Number
* `false` → Not an Armstrong Number

---

## Important Logic

### Counting Digits

```java
int power = String.valueOf(num).length();
```

Explanation:

* Convert number into String.
* Find the length of the String.
* Length represents the total number of digits.

Example:

```java
153 → "153" → length = 3
9474 → "9474" → length = 4
```

---

### Extracting Digits

```java
int digit = num % 10;
```

Example:

```java
153 % 10 = 3
```

Gets the last digit.

---

### Removing Last Digit

```java
num /= 10;
```

Example:

```java
153 / 10 = 15
15 / 10 = 1
1 / 10 = 0
```

---

### Power Calculation

```java
Math.pow(digit, power);
```

Example:

```java
Math.pow(5, 3)
= 125
```

Raises the digit to the required power.

---

## Flowchart

Start
|
Take Input Number
|
Call isArmstrong()
|
Find Number of Digits
|
While Number > 0
|
Extract Digit
|
Digit ^ Power
|
Add to Sum
|
Remove Last Digit
|
Repeat
|
Compare Sum with Original Number
|
True ? Armstrong : Not Armstrong
|
End

---

## Time Complexity

```text
O(d)
```

Where `d` is the number of digits.

---

## Learning Outcome

After completing this project, I learned:

* How Armstrong Numbers work.
* How to create methods that return boolean values.
* How to use loops for digit extraction.
* How to use Math.pow().
* How to count digits dynamically.
* How to solve mathematical problems using functions.
