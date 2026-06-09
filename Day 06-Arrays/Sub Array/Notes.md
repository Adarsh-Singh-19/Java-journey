# Subarrays in Java

## Definition

A subarray is a contiguous (continuous) part of an array.

For an array:

```text
[1, 2, 3]
```

Possible subarrays are:

```text
[1]
[2]
[3]
[1, 2]
[2, 3]
[1, 2, 3]
```

---

## Key Point

A subarray must contain consecutive elements.

### Valid Subarrays

```text
[1]
[2, 3]
[1, 2, 3]
```

### Invalid Subarray

```text
[1, 3]
```

Reason: The element `2` is skipped, so the elements are not contiguous.

---

## Approach to Print All Subarrays

To generate all subarrays:

1. Select the starting index.
2. Select the ending index.
3. Print all elements between the start and end indices.

This requires three loops:

* First loop → Starting index
* Second loop → Ending index
* Third loop → Print elements

---

## Algorithm

1. Read the array.
2. Traverse the array using a loop for the starting index.
3. For every starting index, traverse again for the ending index.
4. Print all elements between the start and end positions.
5. Repeat until all possible subarrays are generated.

---

## Example

### Input

```text
[1, 2, 3]
```

### Output

```text
[1]
[1, 2]
[1, 2, 3]
[2]
[2, 3]
[3]
```

---

## Dry Run

Array:

```text
[1, 2, 3]
```

### Start = 0

```text
End = 0 → [1]
End = 1 → [1, 2]
End = 2 → [1, 2, 3]
```

### Start = 1

```text
End = 1 → [2]
End = 2 → [2, 3]
```

### Start = 2

```text
End = 2 → [3]
```

---

## Number of Subarrays

For an array of size n:

Total Subarrays = n × (n + 1) / 2

Examples:

```text
n = 3 → 6 subarrays
n = 4 → 10 subarrays
n = 5 → 15 subarrays
```

---

## Time Complexity

Printing all subarrays requires three nested loops.

Time Complexity: O(n³)

---

## Space Complexity

No extra data structure is used.

Space Complexity: O(1)

---

## Subarray vs Subsequence

### Subarray (Contiguous)

```text
Array: [1, 2, 3]

[1]
[2]
[3]
[1, 2]
[2, 3]
[1, 2, 3]
```

### Subsequence (Not Necessarily Contiguous)

```text
[1]
[2]
[3]
[1, 2]
[1, 3]
[2, 3]
[1, 2, 3]
[]
```

Note:

```text
[1, 3]
```

is a subsequence but not a subarray.

---

## Key Concepts Learned

* Arrays
* Nested Loops
* Contiguous Data
* Subarrays
* Time Complexity Analysis
* Space Complexity Analysis

---

## Conclusion

A subarray is a continuous section of an array. Generating all subarrays is a fundamental DSA problem and forms the basis for advanced topics such as Prefix Sum, Sliding Window, and Kadane's Algorithm.
