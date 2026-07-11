# Move All Occurrences of a Character to the End Using Recursion

## Problem Statement

Given a string and a character, move all occurrences of the given character to the end of the string while maintaining the relative order of the remaining characters. Solve the problem using recursion.

---

## Approach

1. Read the input string and the character to be moved.
2. Start traversing the string recursively from index `0`.
3. Maintain:
   - `count` to store the number of occurrences of the given character.
   - `newStr` to store all characters except the given character.
4. For each character:
   - If it matches the given character, increment `count`.
   - Otherwise, append it to `newStr`.
5. Continue the recursion until the end of the string.
6. When the base case is reached (`index == str.length()`):
   - Append the given character `count` times to `newStr`.
   - Print the final string.

---

## Algorithm

1. Input the string.
2. Input the character to move.
3. Call `move(str, ch, 0, 0, "")`.
4. If `index == str.length()`:
   - Append `ch` to `newStr`, `count` times.
   - Print `newStr`.
   - Return.
5. Compare `str.charAt(index)` with `ch`.
6. If they are equal:
   - Increment `count`.
7. Otherwise:
   - Append the current character to `newStr`.
8. Recursively call `move(str, ch, index + 1, count, newStr)`.

---

## Dry Run

### Input

```
String : axbcxxd
Character : x
```

### Recursive Traversal

```
Index 0 -> a → newStr = "a"

Index 1 -> x → count = 1

Index 2 -> b → newStr = "ab"

Index 3 -> c → newStr = "abc"

Index 4 -> x → count = 2

Index 5 -> x → count = 3

Index 6 -> d → newStr = "abcd"

End of String
Append 'x' three times
```

### Output

```
The new string is: abcdxxx
```

---

## Another Example

### Input

```
String : xxabxc
Character : x
```

### Output

```
The new string is: abcxxx
```

---

## Time Complexity

- **O(n)**

Each character of the string is visited exactly once.

---

## Space Complexity

- **O(n)**

The recursion call stack grows up to the length of the string.

---

## Key Concepts

- Recursion
- Base Case
- Recursive Traversal
- String Manipulation
- Character Comparison
- Counting Occurrences