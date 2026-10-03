# Search Element in a 2D Array

## Problem

Search for a target element in a given 2D array.

If the target is found, return its **row and column index**.

If the target is not found, return `[-1, -1]`.

## Approach

- Take the number of rows and columns.
- Create a 2D array and take its elements as input.
- Take the target element.
- Traverse the complete 2D array using nested loops.
- Compare each element with the target.
- If the target is found, return its row and column.
- If the complete array is searched and the target is not found, return `[-1, -1]`.

## Example

2D Array:

`10  20  30`  
`40  50  60`  
`70  80  90`

Target:

`50`

The target is found at:

`Row = 1`

`Column = 1`

Result:

`[1, 1]`

## Return Value

A 1D integer array is used to return two values:

`ans[0]` → Row index

`ans[1]` → Column index

If the element is not found:

`[-1, -1]`

## Important Concepts

### 2D Array

A 2D array uses two indexes:

`arr[i][j]`

- `i` → row
- `j` → column

### Nested Loops

The outer loop traverses the rows.

The inner loop traverses the columns.

### Returning an Array

A Java method can return an array.

Here, a 1D array is used to return both the row and column of the target.

## Complexity

**Time Complexity:** O(row × col)

Every element may need to be checked.

**Space Complexity:** O(1)

Apart from the small returned array, no additional data structure is used.

## Key Points

- Use nested loops to search a 2D array.
- Use `arr[i][j]` to access each element.
- Return `{i, j}` when the target is found.
- Return `{-1, -1}` when the target is not found.
- Array indexing starts from `0`.