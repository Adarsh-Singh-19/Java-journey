# Reverse String Using Recursion

## Problem Statement
Given a string, print it in reverse order using recursion.

---

## Approach

1. Read the input string from the user.
2. Start the recursion from the last index of the string (`length - 1`).
3. Print the character at the current index.
4. Recursively call the function with `index - 1`.
5. Stop the recursion when the index becomes less than `0` (or reaches `0` in the original approach).

---

## Algorithm

1. Input the string.
2. Call `reverse(str, str.length() - 1)`.
3. If `index < 0`, return.
4. Print `str.charAt(index)`.
5. Call `reverse(str, index - 1)`.
6. End.

---

## Dry Run

### Input
```
Hello
```

### Recursive Calls
```
reverse("Hello", 4) -> prints 'o'
reverse("Hello", 3) -> prints 'l'
reverse("Hello", 2) -> prints 'l'
reverse("Hello", 1) -> prints 'e'
reverse("Hello", 0) -> prints 'H'
reverse("Hello", -1) -> return
```

### Output
```
olleH
```

---

## Time Complexity

- **O(n)**

Each character is visited exactly once.

---

## Space Complexity

- **O(n)**

Due to the recursion call stack.

---

## Key Concepts

- Recursion
- Base Case
- Recursive Case
- String Traversal