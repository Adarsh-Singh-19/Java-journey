# 📘 Approach – Fibonacci Series Using Recursion

## Problem Statement

Write a Java program to print the first **N Fibonacci numbers** using recursion.

The Fibonacci sequence is a series in which each number is the sum of the previous two numbers.

### Formula

```text
F(0) = 0
F(1) = 1

F(n) = F(n - 1) + F(n - 2)
```

### Example

**Input**

```text
7
```

**Output**

```text
0
1
1
2
3
5
8
```

---

# Approach

### Step 1: Print the First Two Fibonacci Numbers

The Fibonacci series always starts with:

```text
0
1
```

These two numbers are printed in the `main()` method.

```java
if (n >= 1) {
    System.out.println(0);
}

if (n >= 2) {
    System.out.println(1);
}
```

---

### Step 2: Pass the Previous Two Numbers

Call the recursive function with:

* `a = 0` (first number)
* `b = 1` (second number)
* `n - 2` (remaining numbers to print)

```java
faboo(0, 1, n - 2);
```

---

### Step 3: Base Case

Stop the recursion when no more numbers need to be printed.

```java
if (n == 0) {
    return;
}
```

---

### Step 4: Generate the Next Fibonacci Number

Find the next Fibonacci number by adding the previous two numbers.

```java
int i = a + b;
```

Print the newly generated number.

```java
System.out.println(i);
```

---

### Step 5: Recursive Call

Move one step forward in the sequence.

The current second number becomes the first number, and the newly generated number becomes the second number.

```java
faboo(b, i, n - 1);
```

This continues until the base case is reached.

---

# Dry Run (Input = 7)

Initially:

```text
0
1
```

Recursive calls:

```text
faboo(0, 1, 5)

i = 0 + 1 = 1
Print 1

faboo(1, 1, 4)

i = 1 + 1 = 2
Print 2

faboo(1, 2, 3)

i = 1 + 2 = 3
Print 3

faboo(2, 3, 2)

i = 2 + 3 = 5
Print 5

faboo(3, 5, 1)

i = 3 + 5 = 8
Print 8

faboo(5, 8, 0)

Stop
```

Final Output:

```text
0
1
1
2
3
5
8
```

---

# Recursive Flow

```text
main()

Print 0
Print 1

        │
        ▼
faboo(0,1,5)
        │
        ▼
Print 1
        │
        ▼
faboo(1,1,4)
        │
        ▼
Print 2
        │
        ▼
faboo(1,2,3)
        │
        ▼
Print 3
        │
        ▼
faboo(2,3,2)
        │
        ▼
Print 5
        │
        ▼
faboo(3,5,1)
        │
        ▼
Print 8
        │
        ▼
faboo(5,8,0)
        │
        ▼
Return
```

---

# Algorithm

1. Read the value of `n`.
2. If `n >= 1`, print `0`.
3. If `n >= 2`, print `1`.
4. Call the recursive function with `(0, 1, n - 2)`.
5. If `n == 0`, stop recursion.
6. Calculate the next Fibonacci number by adding the previous two numbers.
7. Print the new number.
8. Repeat the process recursively until all numbers are printed.

---

# Time Complexity

**O(n)**

* One recursive call is made for each Fibonacci number printed.

---

# Space Complexity

**O(n)**

* Due to the recursion call stack.

---

# Key Learning

* This solution uses **parameterized recursion**, where the previous two Fibonacci numbers (`a` and `b`) are passed as parameters to each recursive call.
* Instead of calculating Fibonacci numbers repeatedly, each recursive call generates the next number directly, making the solution efficient.
* The recursion stops when all required numbers have been printed.

This approach demonstrates how recursion can be used to generate a sequence by carrying forward the required state (`a` and `b`) in each recursive call.
