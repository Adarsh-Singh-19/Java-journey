# First and Last Occurrence of a Character Using Recursion

## Problem Statement

Given a string and a character, find the first and last occurrence of that character using recursion.

---

## Approach

1. Read the input string from the user.
2. Read the character whose occurrences need to be found.
3. Initialize two variables:
   - `first = -1` (stores the first occurrence)
   - `last = -1` (stores the last occurrence)
4. Start traversing the string recursively from index `0`.
5. For each character:
   - If it matches the given character:
     - If `first` is `-1`, store the current index in `first`.
     - Update `last` with the current index.
6. Continue the recursion until the end of the string.
7. When the index reaches `str.length()`, print the first and last occurrence.

---

## Algorithm

1. Input the string.
2. Input the character to search.
3. Call `find_Occurance(str, 0, element)`.
4. If `index == str.length()`:
   - Print `first` and `last`.
   - Return.
5. Compare `str.charAt(index)` with the given character.
6. If they match:
   - If `first == -1`, set `first = index`.
   - Set `last = index`.
7. Recursively call the function with `index + 1`.

---

## Dry Run

### Input

```
String : banana
Character : a
```

### Recursive Traversal

```
Index 0 -> b (Not Matched)
Index 1 -> a (Matched)
first = 1
last = 1

Index 2 -> n (Not Matched)

Index 3 -> a (Matched)
last = 3

Index 4 -> n (Not Matched)

Index 5 -> a (Matched)
last = 5

Index 6 -> End of String
```

### Output

```
First Occurrence of a is at index 1
Last Occurrence of a is at index 5
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
- Global Variables
- Character Comparison