# Reverse a Number

## Objective

Create a Java program to reverse the digits of a given number.

---

## What is Number Reversal?

Number reversal means changing the order of digits from last to first.

Example:

```text
1234 → 4321
```

```text
56789 → 98765
```

---

## Concepts Used

* Scanner Class
* Methods
* For Loop
* Modulus Operator (%)
* Integer Division (/)
* Variables

---

## Program Workflow

1. Take a number as input from the user.
2. Extract the last digit using `% 10`.
3. Add the digit to the reversed number.
4. Remove the last digit using `/ 10`.
5. Repeat until the number becomes 0.
6. Return the reversed number.
7. Display the result.

---

## Method Used

### reverseNumber(int number)

Purpose:

Reverses the digits of a number.

Return Type:

```java
int
```

Returns:

The reversed number.

---

## Important Logic

### Extract Last Digit

```java
int digit = number % 10;
```

Example:

```text
1234 % 10 = 4
```

Gets the last digit.

---

### Add Digit to Reverse Number

```java
temp = temp * 10 + digit;
```

Example:

```text
temp = 12
digit = 3

temp = 12 * 10 + 3
     = 123
```

---

### Remove Last Digit

```java
number = number / 10;
```

Example:

```text
1234 / 10 = 123
123 / 10 = 12
12 / 10 = 1
1 / 10 = 0
```

---

## Dry Run

Input:

```text
1234
```

### Iteration 1

```text
digit = 4
temp = 0 * 10 + 4 = 4
number = 123
```

### Iteration 2

```text
digit = 3
temp = 4 * 10 + 3 = 43
number = 12
```

### Iteration 3

```text
digit = 2
temp = 43 * 10 + 2 = 432
number = 1
```

### Iteration 4

```text
digit = 1
temp = 432 * 10 + 1 = 4321
number = 0
```

Output:

```text
4321
```

---

## Flowchart

Start
|
Take Input Number
|
number != 0 ?
|
+---- Yes ----> Extract Digit
|                temp = temp * 10 + digit
|                Remove Last Digit
|                Repeat
|
+---- No -----> Return temp
|
Display Reversed Number
|
End

---

## Example 1

### Input

```text
12345
```

### Output

```text
54321
```

---

## Example 2

### Input

```text
987
```

### Output

```text
789
```

---

## Time Complexity

```text
O(d)
```

Where `d` is the number of digits.

---

## Space Complexity

```text
O(1)
```

Only a few variables are used.

---

## Learning Outcome

After completing this program, I learned:

* How to extract digits from a number.
* How to reverse a number mathematically.
* How modulus (%) works.
* How integer division works.
* How loops can process digits one by one.
* Time and space complexity analysis.

---