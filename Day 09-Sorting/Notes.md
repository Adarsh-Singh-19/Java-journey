# Sorting in Data Structures and Algorithms (DSA)

## What is Sorting?

Sorting is the process of arranging data in a specific order, usually:

- **Ascending Order:** Smallest to Largest
- **Descending Order:** Largest to Smallest

### Example

Unsorted Array

```
5 2 8 1 3
```

Ascending Order

```
1 2 3 5 8
```

Descending Order

```
8 5 3 2 1
```

---

# Why is Sorting Important?

Sorting helps to:

- Search data efficiently (Binary Search).
- Organize records.
- Remove duplicates easily.
- Improve algorithm performance.
- Process large datasets efficiently.

---

# Types of Sorting Algorithms

## 1. Bubble Sort

- Compare adjacent elements.
- Swap if they are in the wrong order.
- Largest element moves to the end after every pass.

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n)* |
| Average | O(n²) |
| Worst | O(n²) |

> *Best case is O(n) only in the optimized version.

### Space Complexity

```
O(1)
```

### Stable

✅ Yes

---

## 2. Selection Sort

- Find the smallest element.
- Swap it with the first unsorted position.

### Time Complexity

```
Best = Average = Worst = O(n²)
```

### Space Complexity

```
O(1)
```

### Stable

❌ No

---

## 3. Insertion Sort

- Insert every element into its correct position.
- Similar to arranging playing cards.

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n) |
| Average | O(n²) |
| Worst | O(n²) |

### Space Complexity

```
O(1)
```

### Stable

✅ Yes

---

## 4. Merge Sort

Uses the **Divide and Conquer** technique.

Steps:

1. Divide the array into two halves.
2. Sort each half recursively.
3. Merge the sorted halves.

### Time Complexity

```
Best = Average = Worst = O(n log n)
```

### Space Complexity

```
O(n)
```

### Stable

✅ Yes

---

## 5. Quick Sort

Uses **Divide and Conquer**.

Steps:

1. Select a Pivot.
2. Partition the array.
3. Recursively sort both partitions.

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n log n) |
| Average | O(n log n) |
| Worst | O(n²) |

### Space Complexity

```
O(log n)
```

### Stable

❌ No

---

## 6. Heap Sort

Uses a **Binary Heap**.

### Time Complexity

```
Best = Average = Worst = O(n log n)
```

### Space Complexity

```
O(1)
```

### Stable

❌ No

---

## 7. Counting Sort

Works only for integers within a limited range.

### Time Complexity

```
O(n + k)
```

### Space Complexity

```
O(k)
```

### Stable

✅ Yes

---

## 8. Radix Sort

Sorts numbers digit by digit.

### Time Complexity

```
O(d × (n + k))
```

where

- d = number of digits
- k = range of digits (0–9)

### Stable

✅ Yes

---

## 9. Bucket Sort

Distributes elements into buckets and sorts each bucket.

### Average Time Complexity

```
O(n)
```

Worst Case

```
O(n²)
```

---

## 10. Shell Sort

Improved version of Insertion Sort.

### Average Complexity

```
≈ O(n^1.5)
```

Worst Case

```
O(n²)
```

---

# Comparison Table

| Algorithm | Best | Average | Worst | Space | Stable |
|-----------|------|---------|-------|-------|--------|
| Bubble Sort | O(n)* | O(n²) | O(n²) | O(1) | ✅ |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | ❌ |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | ✅ |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | ✅ |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | ❌ |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) | ❌ |
| Counting Sort | O(n+k) | O(n+k) | O(n+k) | O(k) | ✅ |
| Radix Sort | O(d(n+k)) | O(d(n+k)) | O(d(n+k)) | O(n+k) | ✅ |
| Bucket Sort | O(n) | O(n+k) | O(n²) | O(n+k) | Depends |
| Shell Sort | Depends | ≈O(n^1.5) | O(n²) | O(1) | ❌ |

---

# Stable vs Unstable Sorting

## Stable Sorting

Equal elements keep their original order.

Example

```
Before

(10,A)
(20,B)
(10,C)

After Stable Sort

(10,A)
(10,C)
(20,B)
```

Examples

- Bubble Sort
- Insertion Sort
- Merge Sort
- Counting Sort
- Radix Sort
- Tim Sort

---

## Unstable Sorting

Equal elements may change their relative order.

Examples

- Selection Sort
- Quick Sort
- Heap Sort
- Shell Sort

---

# In-place vs Out-of-place Sorting

## In-place Sorting

Uses very little extra memory.

Examples

- Bubble Sort
- Selection Sort
- Insertion Sort
- Heap Sort
- Quick Sort

---

## Out-of-place Sorting

Requires additional memory.

Examples

- Merge Sort
- Counting Sort
- Radix Sort
- Bucket Sort

---

# Adaptive Sorting

An adaptive algorithm performs faster if the array is already partially sorted.

Examples

- Bubble Sort (Optimized)
- Insertion Sort
- Tim Sort

---

# Internal vs External Sorting

## Internal Sorting

The entire data fits into RAM.

Examples

- Bubble Sort
- Merge Sort
- Quick Sort
- Heap Sort

---

## External Sorting

The data is too large to fit into memory and is sorted using external storage.

Example

- External Merge Sort

---

# Which Sorting Algorithm Should You Use?

| Situation | Recommended Algorithm |
|-----------|-----------------------|
| Small arrays | Bubble / Selection / Insertion |
| Nearly sorted arrays | Insertion Sort |
| Large datasets | Merge Sort |
| Fast average performance | Quick Sort |
| Guaranteed O(n log n) | Merge Sort / Heap Sort |
| Integer values with small range | Counting Sort |
| Large integers | Radix Sort |
| Real-world applications | Tim Sort |

---

# Interview Tips

Remember these points:

- Bubble Sort compares **adjacent elements**.
- Selection Sort performs the **minimum number of swaps**.
- Insertion Sort is best for **nearly sorted arrays**.
- Merge Sort is **stable** and always **O(n log n)**.
- Quick Sort is generally the **fastest in practice** but has a worst case of **O(n²)**.
- Heap Sort guarantees **O(n log n)** without extra array memory.
- Counting Sort works only when the **range of values is small**.

---

# Common Interview Questions

1. What is sorting?
2. What is a stable sorting algorithm?
3. What is an in-place sorting algorithm?
4. Which sorting algorithm is the fastest?
5. Which sorting algorithm is best for nearly sorted arrays?
6. Which sorting algorithm uses Divide and Conquer?
7. What is the difference between Merge Sort and Quick Sort?
8. Why is Bubble Sort called Bubble Sort?
9. Which sorting algorithms are stable?
10. What is the time complexity of each sorting algorithm?

---

# Key Concepts

- Sorting
- Stable Sorting
- Unstable Sorting
- In-place Sorting
- Out-of-place Sorting
- Adaptive Sorting
- Divide and Conquer
- Time Complexity
- Space Complexity
- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Heap Sort
- Counting Sort
- Radix Sort
- Bucket Sort
- Shell Sort