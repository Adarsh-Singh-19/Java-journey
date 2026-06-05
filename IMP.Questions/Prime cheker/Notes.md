# Check Prime Number

## Problem Statement

Write a Java program to check whether a given number is Prime or Not Prime.

---

## Definition

A Prime Number is a number that has exactly two factors:

1. 1
2. Itself

Examples:

Prime Numbers:

* 2
* 3
* 5
* 7
* 11
* 13

Not Prime:

* 1
* 4
* 6
* 8
* 9
* 10

---

## Approach

1. Take a number as input from the user.
2. If the number is less than or equal to 1, return `false`.
3. Check divisibility from `2` to `√n`.
4. If any number divides `n` completely, the number is not prime.
5. If no divisor is found, the number is prime.

---

## Why Check Till √n?

Factors always occur in pairs.

Example:

36 = 1 × 36
36 = 2 × 18
36 = 3 × 12
36 = 4 × 9
36 = 6 × 6

After √36 (= 6), the factors start repeating.

Therefore, checking beyond √n is unnecessary and wastes time.

---

## Algorithm

1. Input number `n`.
2. If `n <= 1`, return `false`.
3. Loop from `i = 2` to `√n`.
4. If `n % i == 0`, return `false`.
5. Return `true`.

---

## Flowchart

```text
Start
  |
Input n
  |
n <= 1 ?
 /     \
Yes     No
 |       |
False    Check divisors
          from 2 to √n
               |
        n % i == 0 ?
          /      \
       Yes        No
        |          |
     False    Continue
                   |
            Loop Finished?
                   |
                  Yes
                   |
                 True
                   |
                  End
```

---

## Method Used

```java
public static boolean isPrime(int n)
```

### Return Type

`boolean`

Returns:

* `true` → Number is Prime
* `false` → Number is Not Prime

---

## Dry Run

Input:

```text
n = 13
```

Loop:

```text
i = 2 → 13 % 2 ≠ 0
i = 3 → 13 % 3 ≠ 0
```

No divisor found.

Output:

```text
13 is a prime number.
```

---

## Time Complexity

O(√n)

---

## Space Complexity

O(1)

---

## Key Concepts Used

* Methods
* Boolean Return Type
* For Loop
* Conditional Statements
* Mathematical Optimization (`√n`)
* Modulus Operator (`%`)
