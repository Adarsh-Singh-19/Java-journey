# Maximum Subarray Sum (Brute Force)

## Definition

A Maximum Subarray is the contiguous subarray whose sum is the largest among all possible subarrays.

### Example

Array:

```text
[1, -2, 6, -1, 3]
```

Possible subarray sums:

```text
[1] = 1
[1, -2] = -1
[1, -2, 6] = 5
[6] = 6
[6, -1] = 5
[6, -1, 3] = 8
[3] = 3
```

Maximum Sum:

```text
8
```

Maximum Subarray:

```text
[6, -1, 3]
```

---

## Objective

Find the largest sum among all possible subarrays of an array.

---

## Approach

The brute-force approach generates every possible subarray and calculates its sum.

### Steps

1. Select the starting index.
2. Select the ending index.
3. Calculate the sum of elements between them.
4. Compare the sum with the current maximum.
5. Update the maximum if needed.

---

## Algorithm

```text
Initialize maxSum with Integer.MIN_VALUE

For each starting index:
    For each ending index:
        Calculate the sum of the subarray
        If currentSum > maxSum:
            Update maxSum

Print maxSum
```

---

## Why Integer.MIN_VALUE?

```java
int maxSum = Integer.MIN_VALUE;
```

Value:

```text
-2147483648
```

It ensures that the program works correctly even when all array elements are negative.

### Example

```text
[-5, -2, -8]
```

Subarray sums:

```text
-5
-2
-8
-7
-10
-15
```

Maximum Sum:

```text
-2
```

If maxSum were initialized to 0, the answer would be incorrect.

---

## Code Logic

### First Loop

```java
for(int start = 0; start < size; start++)
```

Selects the starting index of the subarray.

### Second Loop

```java
for(int end = start; end < size; end++)
```

Selects the ending index.

### Third Loop

```java
for(int k = start; k <= end; k++)
```

Calculates the sum of the current subarray.

### Sum Calculation

```java
currentSum += arr[k];
```

Adds each element of the current subarray.

### Updating Maximum Sum

```java
if(currentSum > maxSum){
    maxSum = currentSum;
}
```

Stores the largest sum found so far.

---

## Dry Run

Array:

```text
[1, -2, 6]
```

### Start = 0

```text
[1] = 1
maxSum = 1

[1, -2] = -1
maxSum = 1

[1, -2, 6] = 5
maxSum = 5
```

### Start = 1

```text
[-2] = -2
maxSum = 5

[-2, 6] = 4
maxSum = 5
```

### Start = 2

```text
[6] = 6
maxSum = 6
```

Final Answer:

```text
Maximum Subarray Sum = 6
```

---

## Relationship with Subarray Program

### Printing Subarrays

```java
for(int k = start; k <= end; k++){
    System.out.print(arr[k] + " ");
}
```

Purpose:

```text
Print the elements.
```

### Maximum Subarray Sum

```java
for(int k = start; k <= end; k++){
    currentSum += arr[k];
}
```

Purpose:

```text
Calculate the sum.
```

The overall structure remains the same.

---

## Time Complexity

Three nested loops are used.

Time Complexity:

O(n³)

---

## Space Complexity

Only a few variables are used.

Space Complexity:

O(1)

---

## Key Concepts Learned

* Arrays
* Subarrays
* Nested Loops
* Brute Force Technique
* Sum Calculation
* Maximum Value Tracking
* Time Complexity Analysis

---

## Next Step

After understanding the brute-force approach, learn:

1. Prefix Sum Method — O(n²)
2. Kadane's Algorithm — O(n)

Kadane's Algorithm is the most optimized solution for the Maximum Subarray Sum problem.

---

## Conclusion

The Maximum Subarray Sum problem finds the largest possible sum from all contiguous subarrays. The brute-force approach checks every subarray, calculates its sum, and keeps track of the maximum sum encountered.
