# Quick Sort

## 1. What is Quick Sort?

Quick Sort is a **Divide and Conquer** sorting algorithm.

It selects an element called a **pivot** and rearranges the array so that:

* Elements smaller than the pivot are placed on the left.
* Elements greater than the pivot are placed on the right.
* The pivot reaches its correct position.

Then Quick Sort is recursively applied to the left and right parts.

### Main idea

**Choose Pivot → Partition → Recursively Sort**

---

# 2. How Quick Sort Works

Suppose:

```text
[8, 3, 5, 1, 9, 2]
```

Choose `2` as the pivot.

After partitioning:

```text
[1] [2] [8, 3, 5, 9]
     ↑
   Pivot
```

Now the pivot `2` is in its correct position.

Then recursively sort:

```text
[1]
```

and

```text
[8, 3, 5, 9]
```

Eventually:

```text
[1, 2, 3, 5, 8, 9]
```

---

# 3. Divide and Conquer

Quick Sort follows three main steps:

### Divide

Choose a pivot and partition the array around it.

### Conquer

Recursively sort the elements on the left and right of the pivot.

### Combine

No separate merging step is required.

The array becomes sorted through the partitioning process itself.

```text
Choose Pivot
     ↓
 Partition
   ↙     ↘
Left    Right
 ↓        ↓
Sort     Sort
 ↘       ↙
 Sorted Array
```

---

# 4. What is a Pivot?

The **pivot** is the element around which the array is partitioned.

For example:

```text
[7, 2, 9, 4, 5]
```

If `5` is selected as the pivot:

```text
Smaller        Pivot       Greater
[2, 4]           5          [7, 9]
```

The goal of partitioning is to place the pivot in its correct position.

---

# 5. Pivot Selection

There are several ways to choose a pivot.

### 1. First element

```text
[5, 2, 8, 1, 9]
 ↑
Pivot
```

### 2. Last element

```text
[5, 2, 8, 1, 9]
             ↑
           Pivot
```

### 3. Middle element

```text
[5, 2, 8, 1, 9]
         ↑
       Pivot
```

### 4. Random element

A random element is selected as the pivot.

### Important

The choice of pivot can significantly affect Quick Sort's performance.

---

# 6. Partition

**Partitioning** is the most important operation in Quick Sort.

Its purpose is to rearrange the array around the pivot.

For example:

```text
[7, 2, 9, 4, 5]
```

Pivot:

```text
5
```

After partitioning:

```text
[2, 4] [5] [7, 9]
        ↑
      Pivot
```

Everything on the left is smaller than the pivot, and everything on the right is greater than the pivot.

---

# 7. Pivot's Correct Position

After partitioning, the pivot reaches its final sorted position.

Example:

```text
Before:

[7, 2, 9, 4, 5]

Pivot = 5


After:

[2, 4, 5, 7, 9]
       ↑
     Pivot
```

The pivot `5` will not need to move again.

---

# 8. Recursive Process

After partitioning, Quick Sort recursively sorts the two sides.

Example:

```text
[7, 2, 9, 4, 5]

        Pivot = 5
             ↓

[2, 4] [5] [7, 9]
   ↓            ↓
 Quick Sort   Quick Sort
```

Eventually:

```text
[2, 4, 5, 7, 9]
```

---

# 9. Base Case

Quick Sort stops when the subarray contains **0 or 1 element**.

```text
[5]
```

is already sorted.

So recursion stops when:

```text
low >= high
```

or equivalently when there is no more than one element to sort.

---

# 10. Important Variables

Typical Quick Sort implementations use:

| Variable | Purpose                                |
| -------- | -------------------------------------- |
| `low`    | Starting index of the current subarray |
| `high`   | Ending index of the current subarray   |
| `pivot`  | Element selected for partitioning      |
| `i`      | Pointer used during partitioning       |
| `j`      | Pointer used during partitioning       |

The exact variables can differ depending on the partition technique.

---

# 11. Partitioning Example

Consider:

```text
[6, 3, 8, 5, 2, 7]
```

Choose:

```text
Pivot = 7
```

Partition around `7`:

```text
[6, 3, 5, 2] [7] [8]
                    ↑
                  Pivot
```

Now:

```text
Left  → [6, 3, 5, 2]
Right → [8]
```

Quick Sort is recursively applied to both sides.

---

# 12. Quick Sort Algorithm

```text
1. Choose a pivot.
2. Partition the array around the pivot.
3. Put the pivot in its correct position.
4. Recursively sort the left subarray.
5. Recursively sort the right subarray.
6. Stop when the subarray has 0 or 1 element.
```

---

# 13. Quick Sort Flow

```text
              Array
                ↓
          Choose Pivot
                ↓
            Partition
           ↙         ↘
       Left Part    Right Part
          ↓             ↓
       Recursion     Recursion
           ↘         ↙
           Sorted Array
```

---

# 14. Time Complexity

Quick Sort has different performance depending on how the pivot divides the array.

| Case         | Time Complexity |
| ------------ | --------------- |
| Best Case    | O(n log n)      |
| Average Case | O(n log n)      |
| Worst Case   | O(n²)           |

### Best Case

The pivot divides the array into approximately equal halves.

```text
n
↓
n/2 + n/2
```

This results in:

```text
O(n log n)
```

### Average Case

With reasonably balanced partitions:

```text
O(n log n)
```

### Worst Case

If the pivot repeatedly becomes the smallest or largest element:

```text
n
↓
0 + (n - 1)
↓
0 + (n - 2)
↓
...
```

This results in:

```text
O(n²)
```

---

# 15. Space Complexity

Quick Sort is generally considered an **in-place sorting algorithm** when partitioning is done within the original array.

### Average recursion space

```text
O(log n)
```

### Worst-case recursion space

```text
O(n)
```

The exact space usage depends on the recursion depth and implementation.

---

# 16. Properties

* **Technique:** Divide and Conquer
* **Best Time:** O(n log n)
* **Average Time:** O(n log n)
* **Worst Time:** O(n²)
* **Average Space:** O(log n)
* **Worst Space:** O(n)
* **Stable:** Usually No
* **In-place:** Yes, in the standard in-place implementation
* **Recursive:** Yes

---

# 17. Quick Sort vs Merge Sort

| Feature        | Quick Sort               | Merge Sort       |
| -------------- | ------------------------ | ---------------- |
| Technique      | Divide & Conquer         | Divide & Conquer |
| Best           | O(n log n)               | O(n log n)       |
| Average        | O(n log n)               | O(n log n)       |
| Worst          | O(n²)                    | O(n log n)       |
| Extra Space    | Usually O(log n) average | O(n)             |
| Stable         | Usually No               | Yes              |
| In-place       | Usually Yes              | Usually No       |
| Main Operation | Partition                | Merge            |

---

# 18. Advantages

* Usually very fast in practice.
* Requires little additional memory in its in-place form.
* Good cache performance.
* Works well for large arrays.
* Can be implemented without creating additional arrays.

---

# 19. Disadvantages

* Worst-case time complexity can be O(n²).
* Performance depends heavily on pivot selection.
* Usually not stable.
* Recursive implementation can cause deep recursion with poor pivot choices.

---

# 20. Pivot Selection and Performance

Pivot selection is very important.

### Poor pivot

If the array is:

```text
[1, 2, 3, 4, 5]
```

and we repeatedly choose the first element:

```text
Pivot = 1
```

The partition can become highly unbalanced.

This can lead to:

```text
O(n²)
```

### Better pivot

Choosing a pivot that divides the array more evenly generally gives better performance.

---

# 21. Common Mistakes

1. Forgetting the base case.
2. Incorrectly implementing partition.
3. Using the wrong pivot index.
4. Incorrectly updating pointers.
5. Forgetting to recursively sort both sides.
6. Creating infinite recursion.
7. Not handling duplicate values correctly.
8. Confusing partitioning with merging.
9. Assuming Quick Sort always has O(n log n) complexity.

---

# 22. Key Concept

> **Quick Sort does not merge sorted arrays. It sorts by placing the pivot in its correct position through partitioning.**

Remember:

```text
Quick Sort:

Choose Pivot
     ↓
Partition
     ↓
Pivot in Correct Position
     ↓
Recursively Sort Left & Right
```

---

# 23. One-Line Revision

> **Quick Sort selects a pivot, partitions the array around it, and recursively sorts the left and right partitions.**

---

# 24. Practice Arrays

Try tracing Quick Sort manually.

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

For each array, identify:

1. Pivot
2. Partition result
3. Pivot's final position
4. Left subarray
5. Right subarray
6. Recursive calls

---