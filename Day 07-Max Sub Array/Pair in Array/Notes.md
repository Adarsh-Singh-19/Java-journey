# Printing All Pairs of an Array

## Problem Statement

Write a Java program to print all unique pairs of elements in an array.

---

## Approach

1. Take the size of the array as input.
2. Store the elements in an array.
3. Display the array.
4. Use nested loops to generate pairs:

   * The outer loop selects the first element.
   * The inner loop starts from `i + 1` to select the second element.
5. Print each pair.

---

## Code Explanation

### Array Input

```java
int[] arr = new int[size];

for(int i = 0; i < size; i++){
    arr[i] = sc.nextInt();
}
```

Stores all user-entered elements in the array.

### Traversing the Array

```java
for(int i = 0; i < size; i++){
    System.out.print(arr[i] + " ");
}
```

Displays all elements of the array.

### Printing Pairs

```java
for(int i = 0; i < size; i++){
    for(int j = i + 1; j < size; j++){
        System.out.println("[" + arr[i] + "," + arr[j] + "]");
    }
}
```

The inner loop starts from `i + 1`, ensuring:

* No self-pairs like `[1,1]`
* No duplicate pairs like `[2,1]` after `[1,2]`

---

## Example

### Input

```text
Size = 4

Array = [10, 20, 30, 40]
```

### Output

```text
[10,20]
[10,30]
[10,40]
[20,30]
[20,40]
[30,40]
```

---

## Dry Run

Array:

```text
[1, 2, 3]
```

### Iteration 1

```text
i = 0
j = 1 → [1,2]
j = 2 → [1,3]
```

### Iteration 2

```text
i = 1
j = 2 → [2,3]
```

### Iteration 3

```text
i = 2
No pair possible
```

Output:

```text
[1,2]
[1,3]
[2,3]
```

---

## Time Complexity

The nested loops run approximately:

n × (n - 1) / 2

Time Complexity: O(n²)

---

## Space Complexity

No extra data structure is used.

Space Complexity: O(1)

---

## Key Concepts Learned

* Array Traversal
* Nested Loops
* Pair Generation
* Time Complexity Analysis
* Space Complexity Analysis

---

## Conclusion

This program demonstrates how nested loops can be used to generate all unique pairs from an array. It is a fundamental DSA problem that helps build understanding of arrays, iteration, and complexity analysis.
