# Approach – Sum of First N Natural Numbers (Recursion)

## Problem

Find the sum of the first **N natural numbers** using recursion.

### Example

**Input**

```
5
```

**Output**

```
15
```

---

# Approach

### Step 1: Define the Base Case

Every recursive function must have a stopping condition.

If `n == 0`, there are no numbers left to add, so return `0`.

```java
if (n == 0) {
    return 0;
}
```

---

### Step 2: Solve a Smaller Problem

Instead of finding the sum of `1` to `n` directly, find the sum of `1` to `n - 1`.

```java
printSum(n - 1)
```

---

### Step 3: Combine the Result

After getting the sum of the smaller problem, add the current number (`n`) to it.

```java
return n + printSum(n - 1);
```

This means:

* Current number = `n`
* Remaining sum = `printSum(n - 1)`

So,

```
Sum(5)
= 5 + Sum(4)

= 5 + (4 + Sum(3))

= 5 + (4 + (3 + Sum(2)))

= 5 + (4 + (3 + (2 + Sum(1))))

= 5 + (4 + (3 + (2 + (1 + Sum(0)))))

= 5 + 4 + 3 + 2 + 1 + 0

= 15
```

---

# Recursive Flow

```
printSum(5)
│
├── printSum(4)
│   ├── printSum(3)
│   │   ├── printSum(2)
│   │   │   ├── printSum(1)
│   │   │   │   └── printSum(0)
│   │   │   │
│   │   │   └── returns 1
│   │   └── returns 3
│   └── returns 6
└── returns 10

Final Answer = 15
```

---

# Algorithm

1. Read the value of `n`.
2. If `n == 0`, return `0`.
3. Otherwise, return `n + printSum(n - 1)`.
4. Print the final result.

---

# Time Complexity

* **Time:** `O(n)`
* Each number from `n` to `0` is visited exactly once.

# Space Complexity

* **Space:** `O(n)`
* Due to the recursive call stack.

---

# Key Learning

* Every recursive problem has:

  * **Base Case** → Stops recursion.
  * **Recursive Case** → Solves a smaller version of the same problem.
* The statement:

```java
return n + printSum(n - 1);
```

means:

> Add the current number (`n`) to the sum of all previous natural numbers (`1` to `n - 1`).

This is a classic example of recursion where a problem is reduced into a smaller subproblem until the base case is reached.
