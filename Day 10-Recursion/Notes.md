# Recursion in Java

## What is Recursion?

Recursion is a programming technique in which a function calls itself to solve a smaller version of the same problem.

Instead of using loops, recursion repeatedly breaks a problem into smaller subproblems until it reaches a stopping condition called the **Base Case**.

---

## Basic Structure

```java
void recursiveFunction(parameters) {

    // Base Case
    if(condition) {
        return;
    }

    // Work

    // Recursive Call
    recursiveFunction(smallerProblem);
}
```

---

## Components of Recursion

### 1. Base Case

The condition that stops the recursion.

Without a base case, the function keeps calling itself forever and causes a **StackOverflowError**.

Example:

```java
if(n == 0)
    return;
```

---

### 2. Recursive Case

The part where the function calls itself with a smaller input.

Example:

```java
factorial(n - 1);
```

---

### 3. Self Call

A method calling itself.

```java
recursiveFunction();
```

---

## How Recursion Works

Suppose:

```java
print(3);
```

Function:

```java
void print(int n){
    if(n==0)
        return;

    System.out.println(n);
    print(n-1);
}
```

Execution:

```
print(3)
|
|-- print(2)
|      |
|      |-- print(1)
|              |
|              |-- print(0)
|                     return
```

Output

```
3
2
1
```

---

## Recursion Tree

Example:

```
factorial(4)

factorial(4)
    |
factorial(3)
    |
factorial(2)
    |
factorial(1)
    |
factorial(0)
```

---

## Call Stack

Every recursive call is stored inside the **Call Stack**.

Example:

```
factorial(3)

Stack

------------
factorial(0)
------------
factorial(1)
------------
factorial(2)
------------
factorial(3)
------------
main()
------------
```

When the base case is reached, the stack starts popping.

---

## Types of Recursion

### 1. Head Recursion

Recursive call happens before the work.

```java
fun(n-1);
System.out.println(n);
```

Output:

```
1
2
3
4
5
```

---

### 2. Tail Recursion

Work happens before the recursive call.

```java
System.out.println(n);
fun(n-1);
```

Output:

```
5
4
3
2
1
```

---

## Advantages

- Makes code short and clean.
- Easy to solve tree and graph problems.
- Useful for divide-and-conquer algorithms.
- Natural solution for recursive problems.

---

## Disadvantages

- Uses extra memory due to the call stack.
- Slower than loops in many cases.
- Can cause StackOverflowError.
- Harder to debug.

---

## Time Complexity

Depends on the number of recursive calls.

Examples:

| Problem | Time Complexity |
|----------|-----------------|
| Print 1 to N | O(n) |
| Sum of N Numbers | O(n) |
| Factorial | O(n) |
| Reverse String | O(n) |
| First & Last Occurrence | O(n) |
| Fibonacci (Recursive) | O(2ⁿ) |
| Tower of Hanoi | O(2ⁿ) |

---

## Space Complexity

Usually equals the maximum depth of recursion.

```
Depth = Number of recursive calls
```

Example:

```
Factorial
Space = O(n)
```

---

## Common Problems Using Recursion

- Print Numbers
- Sum of First N Numbers
- Factorial
- Power (xⁿ)
- Fibonacci Series
- Reverse String
- Check Palindrome
- First & Last Occurrence
- Move All 'x' to End
- Remove Duplicates
- Subsequences
- Permutations
- Tower of Hanoi

---

## Common Mistakes

### Forgetting the Base Case

```java
fun(n){
    fun(n-1);
}
```

Result:

```
StackOverflowError
```

---

### Base Case Without Return

```java
if(n==0){
    System.out.println("Done");
}
```

Correct:

```java
if(n==0){
    System.out.println("Done");
    return;
}
```

---

### Infinite Recursion

Wrong:

```java
fun(n){
    fun(n);
}
```

Correct:

```java
fun(n){
    fun(n-1);
}
```

---

## Recursive Thinking

Whenever solving a recursion problem:

1. Identify the Base Case.
2. Assume the recursive call works correctly.
3. Do the current level's work.
4. Call the function on a smaller problem.

---

## Recursion vs Iteration

| Feature | Recursion | Iteration |
|---------|-----------|-----------|
| Uses Function Calls | ✅ | ❌ |
| Uses Stack Memory | ✅ | ❌ |
| Easy to Write | ✅ | ❌ |
| Faster | ❌ | ✅ |
| Memory Efficient | ❌ | ✅ |

---

## Interview Tip

Always remember these three questions before writing recursion:

1. What is the **Base Case**?
2. What is the **Recursive Call**?
3. How does the input become **smaller** after each call?

If you can answer these, writing recursive solutions becomes much easier.