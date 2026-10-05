# Heap Sort

## 1. Definition

**Heap Sort** is a **comparison-based sorting algorithm** that uses a **Binary Heap** data structure.

For sorting in **ascending order**, Heap Sort generally uses a **Max Heap**.

In a Max Heap, the largest element is always at the root.

### Main idea

**Build Max Heap → Move Maximum to End → Heapify → Repeat**

---

## 2. Approach

Heap Sort works in two main phases:

### Phase 1: Build Max Heap

Convert the given array into a Max Heap.

Example:

```text
[4, 10, 3, 5, 1]
```

After building Max Heap:

```text
[10, 5, 3, 4, 1]
```

The largest element `10` is now at the root.

---

### Phase 2: Extract Maximum

Swap the root with the last element:

```text
[1, 5, 3, 4, 10]
```

Now `10` is in its final sorted position.

Reduce the heap size and heapify the remaining elements:

```text
[5, 4, 3, 1, 10]
```

Repeat the same process until the complete array is sorted.

Final:

```text
[1, 3, 4, 5, 10]
```

---

## 3. Example

Given:

```text
[6, 3, 9, 5, 2, 8]
```

### Build Max Heap

```text
[9, 5, 8, 3, 2, 6]
```

### Move maximum to the end

```text
[6, 5, 8, 3, 2, 9]
```

Heapify:

```text
[8, 5, 6, 3, 2, 9]
```

Move maximum:

```text
[2, 5, 6, 3, 8, 9]
```

Continue:

```text
[6, 5, 2, 3, 8, 9]
```

Eventually:

```text
[2, 3, 5, 6, 8, 9]
```

### Final Answer

```text
2 3 5 6 8 9
```

---

## 4. Heap Structure

A Max Heap follows:

```text
Parent >= Children
```

Example:

```text
        9
       / \
      5   8
     / \  /
    3   2 6
```

The root contains the largest element.

---

## 5. Array Representation

A Heap is usually stored in an array.

For an element at index `i`:

```text
Left Child  = 2 * i + 1
Right Child = 2 * i + 2
Parent      = (i - 1) / 2
```

### Important

```text
Left  → 2i + 1
Right → 2i + 2
Parent → (i - 1) / 2
```

---

## 6. Heapify

**Heapify** is the process of restoring the Max Heap property.

If a parent is smaller than one of its children, swap it with the larger child.

Example:

```text
        3
       / \
      9   5
```

This is not a Max Heap.

After heapify:

```text
        9
       / \
      3   5
```

The process may continue downward until the heap property is restored.

---

## 7. Algorithm

```text
1. Build a Max Heap.
2. Take the root element (maximum).
3. Swap the root with the last element.
4. Reduce the heap size.
5. Heapify the root.
6. Repeat until the heap contains one element.
7. The array is sorted.
```

---

## 8. Complexity

| Operation         | Time Complexity |
| ----------------- | --------------: |
| Build Max Heap    |            O(n) |
| Heapify           |        O(log n) |
| Extract Maximum   |        O(log n) |
| Overall Heap Sort |      O(n log n) |

### Overall Time Complexity

```text
Best Case    → O(n log n)
Average Case → O(n log n)
Worst Case   → O(n log n)
```

### Space Complexity

```text
O(1)
```

Heap Sort is an **in-place sorting algorithm**.

---

## 9. Properties

* **Type:** Comparison-based
* **Technique:** Heap-based sorting
* **Data Structure:** Binary Heap
* **Ascending Order:** Max Heap
* **Descending Order:** Min Heap
* **Best:** O(n log n)
* **Average:** O(n log n)
* **Worst:** O(n log n)
* **Space:** O(1)
* **Stable:** No
* **In-place:** Yes

---

## 10. Key Concept

Remember:

```text
Build Max Heap
      ↓
Largest element at Root
      ↓
Swap Root with Last
      ↓
Reduce Heap Size
      ↓
Heapify
      ↓
Repeat
      ↓
Sorted Array
```

### One-line revision

> **Heap Sort builds a Max Heap and repeatedly moves the maximum element to the end of the array.**
