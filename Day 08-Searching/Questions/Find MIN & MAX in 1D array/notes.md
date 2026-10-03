# Find Minimum and Maximum in an Array

## Problem

Find the **minimum** and **maximum** elements in a given integer array.

If the array is empty, return `-1`.

## Approach

### Finding Minimum

- Take the first element as the initial minimum.
- Traverse the array.
- Compare each element with the current minimum.
- If the current element is smaller, update the minimum.
- After traversing the complete array, return the minimum value.

### Finding Maximum

- Take the first element as the initial maximum.
- Traverse the array.
- Compare each element with the current maximum.
- If the current element is larger, update the maximum.
- After traversing the complete array, return the maximum value.

## Example

Array:

`[12, 5, 8, 20, 3, 15]`

Minimum:

`3`

Maximum:

`20`

## Important Concepts

### Array Traversal

The array is traversed from the first element to the last element.

### Initial Value

The first element is used as the initial value for both minimum and maximum.

This is better than assuming a fixed value such as `0`, because the array can contain negative numbers.

### Empty Array

If the array has no elements, the method returns `-1`.

## Complexity

**Time Complexity:** O(n)

Each element is checked once.

**Space Complexity:** O(1)

No extra data structure is used.

## Key Points

- Initialize `min` and `max` with the first array element.
- Traverse the array and update them when a smaller or larger element is found.
- The same array can be traversed separately for minimum and maximum.
- Works with positive, negative, and zero values.