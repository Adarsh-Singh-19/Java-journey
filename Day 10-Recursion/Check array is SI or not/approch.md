# Check if an Array is Strictly Increasing Using Recursion

## Problem Statement

Given an array of integers, determine whether it is **strictly increasing** using recursion.

A strictly increasing array satisfies:

```
arr[i] > arr[i - 1]
```

for every index `i` from `1` to `n - 1`.

---

## Approach

1. Read the size of the array and its elements.
2. Start checking the array from the last element.
3. Compare the current element with the previous element.
4. If the current element is less than or equal to the previous element, the array is **not** strictly increasing.
5. Otherwise, recursively check the remaining part of the array by reducing the size by one.
6. If the recursion reaches a single element, the array is strictly increasing.

---

## Algorithm

1. Input the size of the array `n`.
2. Input all array elements.
3. Call `check(arr, n)`.
4. If `n <= 1`, return `true`.
5. If `arr[n - 1] <= arr[n - 2]`, return `false`.
6. Otherwise, recursively call `check(arr, n - 1)`.
7. Print the result.

---

## Dry Run

### Input

```
Array = [1, 3, 5, 7, 9]
```

### Recursive Calls

```
check(arr, 5)
9 > 7 ✓

check(arr, 4)
7 > 5 ✓

check(arr, 3)
5 > 3 ✓

check(arr, 2)
3 > 1 ✓

check(arr, 1)
Return true
```

### Output

```
Array is strictly increasing
```

---

## Another Example

### Input

```
Array = [1, 3, 3, 7]
```

### Recursive Calls

```
check(arr, 4)
7 > 3 ✓

check(arr, 3)
3 <= 3 ✗

Return false
```

### Output

```
Array is not strictly increasing
```

---

## Time Complexity

- **O(n)**

Each element is compared exactly once.

---

## Space Complexity

- **O(n)**

The recursive call stack stores one function call for each array element.

---

## Key Concepts

- Recursion
- Base Case
- Recursive Case
- Array Traversal
- Strictly Increasing Sequence
- Boolean Return Type