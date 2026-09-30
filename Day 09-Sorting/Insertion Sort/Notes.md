# Insertion Sort

## Problem Statement

Given an integer array, sort it in ascending order using the Insertion Sort algorithm.

---

## Intuition

Insertion Sort works the same way people arrange playing cards.

Assume the first element is already sorted.

Take the next element and insert it into its correct position in the sorted portion by shifting larger elements one position to the right.

After every iteration, the sorted portion of the array grows by one element.

---

## Approach

1. Assume the first element is already sorted.
2. Start from the second element (`i = 1`).
3. Store the current element in a temporary variable (`current`).
4. Compare `current` with elements on its left.
5. Shift all larger elements one position to the right.
6. Insert `current` into its correct position.
7. Repeat until all elements are processed.

---

## Algorithm

For every index `i` from `1` to `n-1`:

- Store `arr[i]` in `current`.
- Compare it with previous elements.
- Shift larger elements one position to the right.
- Insert `current` at the correct position.

---

## Dry Run

### Input

```
12 11 13 5 6
```

### Pass 1

Current = 11

```
11 12 13 5 6
```

### Pass 2

Current = 13

```
11 12 13 5 6
```

(No shifting required.)

### Pass 3

Current = 5

```
5 11 12 13 6
```

### Pass 4

Current = 6

```
5 6 11 12 13
```

### Output

```
5 6 11 12 13
```

---

## Correctness

After each iteration:

- The subarray from index `0` to `i` is sorted.
- The next element is inserted into its correct position.
- Therefore, after the final iteration, the entire array is sorted.

---

## Complexity Analysis

| Complexity | Value |
|------------|-------|
| Best Case | O(n) |
| Average Case | O(n²) |
| Worst Case | O(n²) |
| Space Complexity | O(1) |

---

## Interview Discussion

### Why is it called Insertion Sort?

Because each element is **inserted** into its correct position within the already sorted part of the array.

### Is it Stable?

✅ Yes

Equal elements keep their original relative order.

### Is it In-place?

✅ Yes

No extra array is used.

### Is it Adaptive?

✅ Yes

If the array is already sorted, it performs only one comparison per element.

### Why is the Best Case O(n)?

When the array is already sorted, no shifting is required.

### Number of Shifts

Depends on the input.

- Best Case: 0 shifts
- Worst Case: Nearly n² shifts

---

## Advantages

- Simple to implement
- Stable sorting algorithm
- Adaptive
- Efficient for small datasets
- Performs well on nearly sorted arrays

---

## Disadvantages

- Inefficient for large datasets
- Worst-case time complexity is O(n²)

---

## Applications

- Small datasets
- Nearly sorted data
- Online sorting (processing elements as they arrive)

---

## Key Takeaways

- Divide the array into sorted and unsorted parts.
- Pick one element at a time.
- Shift larger elements to the right.
- Insert the current element at its correct position.
- Grow the sorted portion until the entire array is sorted.