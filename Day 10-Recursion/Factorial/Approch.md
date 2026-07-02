# 📘 Approach – Factorial of a Number Using Recursion

## Problem Statement

Write a Java program to find the **factorial** of a given non-negative integer using **recursion**.

The factorial of a number `n` is the product of all positive integers from `1` to `n`.

### Formula

```text
n! = n × (n - 1) × (n - 2) × ... × 2 × 1
```

### Examples

```text
Input: 5
Output: 120

Input: 0
Output: 1

Input: 1
Output: 1
```

---

# Approach

### Step 1: Validate the Input

Factorial is **not defined for negative numbers**.

If the input is negative, print an error message and return `-1`.

```java
if (n < 0) {
    System.out.println("Factorial is not defined for negative numbers.");
    return -1;
}
```

---

### Step 2: Define the Base Case

Every recursive function must have a stopping condition.

When `n` is `0` or `1`, return `1`.

```java
if (n == 0 || n == 1) {
    return 1;
}
```

Why?

* `0! = 1`
* `1! = 1`

These values stop further recursive calls.

---

### Step 3: Recursive Case

Multiply the current number by the factorial of the previous number.

```java
return n * factorial(n - 1);
```

The problem becomes smaller with every recursive call.

For example:

```text
factorial(5)
= 5 × factorial(4)
```

---

# Dry Run (Input = 5)

```text
factorial(5)
= 5 × factorial(4)

= 5 × (4 × factorial(3))

= 5 × (4 × (3 × factorial(2)))

= 5 × (4 × (3 × (2 × factorial(1))))

= 5 × (4 × (3 × (2 × 1)))

= 5 × 4 × 3 × 2 × 1

= 120
```

---

# Recursive Flow

```text
factorial(5)
│
├── factorial(4)
│      │
│      ├── factorial(3)
│      │      │
│      │      ├── factorial(2)
│      │      │      │
│      │      │      ├── factorial(1)
│      │      │      │
│      │      │      └── returns 1
│      │      └── returns 2
│      └── returns 6
└── returns 24

Final Answer = 120
```

---

# Algorithm

1. Read the input number `n`.
2. If `n` is negative, print an error message and return `-1`.
3. If `n` is `0` or `1`, return `1`.
4. Otherwise, return `n × factorial(n - 1)`.
5. In `main()`, print the factorial only if the returned value is not `-1`.

---

# Time Complexity

**O(n)**

* One recursive call is made for each value from `n` to `1`.

---

# Space Complexity

**O(n)**

* Due to the recursion call stack.

---

# Key Learning

* A recursive function consists of:

  * **Base Case** – Stops recursion.
  * **Recursive Case** – Solves a smaller version of the same problem.

* The statement

```java
return n * factorial(n - 1);
```

means:

> Multiply the current number by the factorial of the previous number until the base case (`0` or `1`) is reached.

This is one of the most fundamental examples of recursion and helps build a strong foundation for solving recursive and DSA problems.
