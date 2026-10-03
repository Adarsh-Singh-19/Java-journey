# Find Minimum and Maximum in a 2D Array

## Problem

Find the **minimum** and **maximum** elements in a given 2D integer array.

## Approach

### Finding Minimum

- Start with the first element of the array as `min`.
- Traverse every row and column.
- Compare each element with `min`.
- If the current element is smaller, update `min`.
- After traversing the complete array, return `min`.

### Finding Maximum

- Start with the first element of the array as `max`.
- Traverse every row and column.
- Compare each element with `max`.
- If the current element is larger, update `max`.
- After traversing the complete array, return `max`.

## Example

2D Array:

`5  8  2`  
`9  1  7`  
`4  6  3`

Minimum element: `1`

Maximum element: `9`

## Important Concepts

### 2D Array

A 2D array contains elements arranged in rows and columns.

`arr[i][j]`

- `i` → row index
- `j` → column index

### Array Traversal

A nested loop is used to visit every element:

- Outer loop → rows
- Inner loop → columns

### Initial Value

The first element `arr[0][0]` is used as the initial value for both `min` and `max`.

This is useful because the array can contain positive, negative, or zero values.

## Complexity

**Time Complexity:** O(row × col)

Every element of the 2D array is checked.

**Space Complexity:** O(1)

No extra data structure is used.

## Key Points

- Use `int arr[][]` for a 2D integer array.
- Use `arr[i][j]` to access an element.
- Use nested loops to traverse a 2D array.
- Initialize `min` and `max` with `arr[0][0]`.
- Return the result only after the complete array has been traversed.