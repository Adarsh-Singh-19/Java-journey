# Merge Sort

## 1. What is Merge Sort?

Merge Sort is a **Divide and Conquer** sorting algorithm.

It divides an array into smaller parts, sorts those parts, and then merges them to create the final sorted array.

### Main idea

**Divide → Sort → Merge**

---

## 2. How Merge Sort Works

Suppose:

```text
[8, 3, 5, 1, 9, 2]
```

### Divide

```text
[8, 3, 5]     [1, 9, 2]
```

Divide again:

```text
[8] [3, 5]    [1] [9, 2]
```

Continue until every part contains one element:

```text
[8] [3] [5] [1] [9] [2]
```

A single-element array is already sorted.

### Merge

Now the smaller sorted arrays are merged:

```text
[3] + [5] → [3, 5]
```

```text
[8] + [3, 5] → [3, 5, 8]
```

```text
[9] + [2] → [2, 9]
```

```text
[1] + [2, 9] → [1, 2, 9]
```

Finally:

```text
[3, 5, 8] + [1, 2, 9]
            ↓
[1, 2, 3, 5, 8, 9]
```

---

## 3. Divide and Conquer

Merge Sort has three main stages:

### Divide

Split the array into two approximately equal halves.

### Conquer

Recursively sort both halves.

### Combine

Merge the two sorted halves.

```text
Divide
  ↓
Recursively Sort
  ↓
Merge
```

---

## 4. Base Case

The recursion stops when the array contains **0 or 1 element**.

Why?

Because an array with one element is already sorted.

```text
[7] → Already sorted
```

---

## 5. Recursive Process

The `sort()` method keeps dividing the array until the base case is reached.

Example:

```text
[8, 3, 5, 1]
       ↓
[8, 3] [5, 1]
   ↓       ↓
[8][3]   [5][1]
   ↓       ↓
 [3,8]   [1,5]
      \   /
       ↓
   [1,3,5,8]
```

---

## 6. Merge Operation

The **merge operation** combines two already sorted arrays.

Example:

```text
Left  = [3, 8]
Right = [1, 5]
```

Compare the first elements:

```text
3 vs 1 → take 1
3 vs 5 → take 3
8 vs 5 → take 5
```

Remaining element:

```text
8
```

Final result:

```text
[1, 3, 5, 8]
```

### Important

The `merge()` method is called **after both halves have been sorted**.

```text
Sort Left
    ↓
Sort Right
    ↓
Merge Both
```

---

## 7. Important Pointers

During merging, three pointers are used:

| Pointer | Purpose                                       |
| ------- | --------------------------------------------- |
| `i`     | Tracks the current element of the left array  |
| `j`     | Tracks the current element of the right array |
| `k`     | Tracks the position in the original array     |

The basic comparison is:

```text
left[i]  vs  right[j]
```

The smaller element is placed into the original array.

---

## 8. Why Do We Need Remaining Elements?

During merging, one array may become empty before the other.

Example:

```text
Left  = [2, 4, 8]
Right = [1, 3]
```

After comparisons:

```text
[1, 2, 3, 4]
```

The element `8` is still remaining.

Therefore, the remaining elements must be copied into the original array.

---

## 9. Algorithm

```text
1. Check the base case.
2. Find the middle of the array.
3. Divide the array into left and right halves.
4. Recursively sort the left half.
5. Recursively sort the right half.
6. Merge the two sorted halves.
7. Repeat until the complete array is sorted.
```

---

## 10. Time Complexity

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(n log n) |
| Average Case | O(n log n) |
| Worst Case   | O(n log n) |

Merge Sort has **O(n log n)** time complexity in all three cases.

---

## 11. Space Complexity

```text
O(n)
```

Standard Merge Sort requires additional memory for temporary arrays during the merging process.

---

## 12. Properties

* **Technique:** Divide and Conquer
* **Best Time:** O(n log n)
* **Average Time:** O(n log n)
* **Worst Time:** O(n log n)
* **Space:** O(n)
* **Stable:** Yes
* **Recursive:** Yes
* **In-place:** No, in the standard implementation

---

## 13. Recurrence Relation

Merge Sort can be represented using:

```text
T(n) = 2T(n/2) + O(n)
```

Therefore:

```text
T(n) = O(n log n)
```

---

## 14. Merge Sort vs Bubble Sort

| Feature   | Merge Sort       | Bubble Sort |
| --------- | ---------------- | ----------- |
| Technique | Divide & Conquer | Comparison  |
| Best      | O(n log n)       | O(n)        |
| Average   | O(n log n)       | O(n²)       |
| Worst     | O(n log n)       | O(n²)       |
| Space     | O(n)             | O(1)        |
| Stable    | Yes              | Yes         |

---

## 15. Advantages

* Efficient for large datasets.
* Guaranteed O(n log n) time complexity.
* Stable sorting algorithm.
* Works well with linked lists and external sorting.
* Predictable performance.

---

## 16. Disadvantages

* Requires additional memory.
* More complex than simple algorithms like Bubble Sort.
* Standard implementation is not in-place.

---

## 17. Common Mistakes

1. Forgetting the base case.
2. Incorrectly finding the middle.
3. Incorrectly dividing the array.
4. Forgetting recursive calls.
5. Calling `merge()` before sorting both halves.
6. Comparing the wrong elements during merging.
7. Forgetting remaining elements.
8. Incorrectly updating `i`, `j`, or `k`.

---

## 18. Key Concept to Remember

> **Merge Sort = Divide + Recursion + Merge**

The most important part is understanding that **`merge()` combines two already sorted arrays**.

```text
Unsorted Array
      ↓
    Divide
      ↓
Smaller Arrays
      ↓
   Recursion
      ↓
Sorted Smaller Arrays
      ↓
     Merge
      ↓
 Sorted Array
```

---

## 19. Practice Arrays

Try tracing Merge Sort manually:

### Practice 1

```text
[5, 2, 8, 1, 3]
```

### Practice 2

```text
[10, 7, 4, 9, 2, 6]
```

### Practice 3

```text
[12, 5, 8, 3, 15, 1, 7]
```

### Practice 4

```text
[9, 9, 2, 5, 1, 2]
```

Focus on understanding:

**Divide → Recursive Sort → Merge**

-