# Sum of Digits of a Number

## Objective

Create a Java program to calculate the sum of all digits present in a given number.

---

## What is Sum of Digits?

The sum of digits is obtained by adding each digit of a number individually.

Example:

```text
1234 = 1 + 2 + 3 + 4 = 10
```

```text
567 = 5 + 6 + 7 = 18
```

---

## Concepts Used

* Scanner Class
* Methods
* While Loop
* Modulus Operator (%)
* Integer Division (/)

---

## Program Workflow

1. Take a number as input from the user.
2. Extract the last digit using `% 10`.
3. Add the digit to the sum.
4. Remove the last digit using `/ 10`.
5. Repeat until the number becomes 0.
6. Return the final sum.
7. Display the result.

---

## Method Used

### sumOfDigits(int n)

Purpose:

Calculates the sum of all digits of a number.

Return Type:

```java
int
```

Returns:

The sum of all digits.

---

## Important Logic

### Extract Last Digit

```java
n % 10
```

Example:

```text
1234 % 10 = 4
```

Gets the last digit.

---

### Add Digit to Sum

```java
sum += n % 10;
```

Example:

```text
sum = 0

Digit = 4

sum = 0 + 4
    = 4
```

---

### Remove Last Digit

```java
n /= 10;
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
Digit = 4
Sum = 4
Number = 123
```

### Iteration 2

```text
Digit = 3
Sum = 7
Number = 12
```

### Iteration 3

```text
Digit = 2
Sum = 9
Number = 1
```

### Iteration 4

```text
Digit = 1
Sum = 10
Number = 0
```

Output:

```text
10
```

---

## Flowchart

Start
|
Take Input Number
|
n != 0 ?
|
+---- Yes ----> Extract Digit
|                Add to Sum
|                Remove Digit
|                Repeat
|
+---- No -----> Return Sum
|
Display Result
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
The sum of the digits of 12345 is: 15
```

---

## Example 2

### Input

```text
987
```

### Output

```text
The sum of the digits of 987 is: 24
```

---

## Special Cases

### Single Digit Number

```text
Input: 7
Output: 7
```

### Number Containing Zero

```text
Input: 1020
Output: 3
```

Calculation:

```text
1 + 0 + 2 + 0 = 3
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

* How to extract digits using `%`.
* How to remove digits using `/`.
* How to process numbers digit by digit.
* How loops can be used for mathematical problems.
* Time and space complexity analysis.
