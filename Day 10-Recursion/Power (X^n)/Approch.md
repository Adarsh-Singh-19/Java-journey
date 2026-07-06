# Power of a Number Using Recursion

## Aim

Write a Java program to calculate the power of a number (`xⁿ`) using recursion.

---

# Concept

Recursion is a technique where a method calls itself until a base condition is reached.

For power:

```
xⁿ = x × xⁿ⁻¹
```

Example:

```
2⁴

= 2 × 2³
= 2 × 2 × 2²
= 2 × 2 × 2 × 2¹
= 2 × 2 × 2 × 2⁰
= 2 × 2 × 2 × 2 × 1
= 16
```

---

# Base Case

```java
if(n == 0){
    return 1;
}
```

Any number raised to the power **0** is always **1**.

---

# Recursive Case

```java
int p = x;
p *= power(n - 1, x);
return p;
```

Each recursive call multiplies the base number with the result of the previous power.

---

# Working

Input:

```
Base = 2
Power = 4
```

Recursive Calls:

```
power(4,2)
↓
2 × power(3,2)
↓
2 × 2 × power(2,2)
↓
2 × 2 × 2 × power(1,2)
↓
2 × 2 × 2 × 2 × power(0,2)
↓
1
```

Returns:

```
16
```

---

# Flowchart

```
Start
   │
Read x and n
   │
Call power(n, x)
   │
n == 0 ?
 ┌───┴───┐
Yes     No
 │        │
Return 1  Return x × power(n-1,x)
     │
Print Answer
     │
    End
```

---

# Dry Run

Input:

```
x = 3
n = 3
```

Calls:

```
power(3,3)

= 3 × power(2,3)

= 3 × 3 × power(1,3)

= 3 × 3 × 3 × power(0,3)

= 27
```

Output:

```
27
```

---

# Time Complexity

```
O(n)
```

One recursive call is made for each power.

---

# Space Complexity

```
O(n)
```

Due to the recursive call stack.

---

# Learning Outcomes

* Understanding recursion
* Base case and recursive case
* Solving mathematical problems recursively
* Recursive call stack
* Time and space complexity analysis
