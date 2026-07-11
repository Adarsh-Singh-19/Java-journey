# Bubble Sort

## Problem Statement

Given an array of integers, sort the array in ascending order using the **Bubble Sort** algorithm.

---

## Approach

1. Read the size of the array and its elements.
2. Start from the first element of the array.
3. Compare each pair of adjacent elements.
4. If the left element is greater than the right element, swap them.
5. Continue this process until the largest element reaches the last position.
6. Repeat the same process for the remaining unsorted part of the array.
7. After every pass, one element is placed in its correct sorted position.
8. Continue until all elements are sorted.

---

## Algorithm

1. Input the size of the array `n`.
2. Input all array elements.
3. Run the outer loop from `0` to `n - 2`.
4. Run the inner loop from `0` to `n - i - 2`.
5. Compare `arr[j]` and `arr[j + 1]`.
6. If `arr[j] > arr[j + 1]`, swap them.
7. Repeat until the array is completely sorted.
8. Print the sorted array.

---

## Dry Run

### Input

```
Array = [5, 2, 4, 1, 3]
```

### Pass 1

```
5 2 4 1 3
↓
2 5 4 1 3
↓
2 4 5 1 3
↓
2 4 1 5 3
↓
2 4 1 3 5
```

### Pass 2

```
2 4 1 3 5
↓
2 1 4 3 5
↓
2 1 3 4 5
```

### Pass 3

```
2 1 3 4 5
↓
1 2 3 4 5
```

### Pass 4

```
1 2 3 4 5
```

### Output

```
1 2 3 4 5
```

---

## Why `arr.length - 1`?

### Outer Loop

```java
for(int i = 0; i < arr.length - 1; i++)
```

For an array of `n` elements, only **n − 1 passes** are required because after each pass, the largest unsorted element reaches its correct position.

Example:

```
5 elements

Pass 1 → Largest element fixed
Pass 2 → Second largest fixed
Pass 3 → Third largest fixed
Pass 4 → Fourth largest fixed

The remaining element is automatically sorted.
```

---

### Inner Loop

```java
for(int j = 0; j < arr.length - i - 1; j++)
```

- `j + 1` is used during comparison.
- Therefore, `j` cannot reach the last index.
- `-i` skips the elements that are already sorted after each pass.

Example:

```
Pass 1 → Compare 4 pairs
Pass 2 → Compare 3 pairs
Pass 3 → Compare 2 pairs
Pass 4 → Compare 1 pair
```

---

## Time Complexity

| Case | Complexity |
|------|------------|
| Best Case (Optimized) | O(n) |
| Average Case | O(n²) |
| Worst Case | O(n²) |

---

## Space Complexity

**O(1)**

Bubble Sort is an **in-place sorting algorithm**, meaning it does not require any extra array.

---

## Advantages

- Simple and easy to understand.
- In-place sorting algorithm.
- Stable sorting algorithm.
- Suitable for small datasets.

---

## Disadvantages

- Slow for large datasets.
- Performs many unnecessary comparisons.
- Inefficient compared to Merge Sort or Quick Sort.

---

## Key Concepts

- Sorting
- Bubble Sort
- Nested Loops
- Swapping
- Adjacent Element Comparison
- In-Place Sorting
- Stable Sorting Algorithm