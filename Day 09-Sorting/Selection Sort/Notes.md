# Selection Sort

## Problem Statement

Given an integer array, sort it in ascending order using the Selection Sort algorithm.

---

## Intuition

At every iteration, divide the array into two parts:

- Sorted part (left side)
- Unsorted part (right side)

Find the smallest element in the unsorted part and place it at the beginning of the unsorted part.

After every pass, one more element reaches its correct position.

---

## Approach

1. Start from index `0`.
2. Assume the current element is the smallest.
3. Traverse the remaining unsorted elements.
4. Update the smallest index whenever a smaller element is found.
5. Swap the smallest element with the first element of the unsorted part.
6. Repeat until only one element remains.

---

## Dry Run

Input

```
64 25 12 22 11
```

### Pass 1

Smallest = 11

```
11 25 12 22 64
```

### Pass 2

Smallest = 12

```
11 12 25 22 64
```

### Pass 3

Smallest = 22

```
11 12 22 25 64
```

### Pass 4

Smallest = 25

```
11 12 22 25 64
```

Output

```
11 12 22 25 64
```

---

## Correctness

After every iteration:

- The left part of the array is completely sorted.
- The smallest remaining element is placed in its correct position.
- Therefore, after `n-1` passes, the whole array becomes sorted.

---

## Complexity Analysis

| Complexity | Value |
|------------|-------|
| Best Case | O(n²) |
| Average Case | O(n²) |
| Worst Case | O(n²) |
| Space Complexity | O(1) |

---

## Interview Discussion

### Why is it called Selection Sort?

Because in every iteration we **select** the smallest element from the unsorted part.

### Is it Stable?

❌ No

Equal elements may change their relative order after swapping.

### Is it In-place?

✅ Yes

Only one temporary variable is used.

### Is it Adaptive?

❌ No

Even if the array is already sorted, it still performs all comparisons.

### Number of Swaps

At most `n - 1`.

This is one advantage over Bubble Sort.

### When should we use it?

Suitable for

- Small datasets
- Situations where swapping is expensive
- Educational purposes

Not suitable for large datasets because of O(n²) time complexity.

---

## Key Takeaways

- Divide the array into sorted and unsorted parts.
- Find the minimum element.
- Swap it with the first unsorted element.
- Repeat until sorted.
