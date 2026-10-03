# Search String — Linear Search

## Problem

Find the index of a target character in a given string.

If the target character is not present, return `-1`.

## Approach

- Take the string as input.
- Take the target character as input.
- Traverse the string from left to right.
- Compare each character with the target.
- If the character matches, return its index.
- If the complete string is traversed without finding the target, return `-1`.

## Example

String: `programming`

Target: `g`

First occurrence of `g` is at index `3`.

Output: `3`

## Important Concepts

### Linear Search

Linear Search checks each element one by one until the target is found.

### String Indexing

String indexing starts from `0`.

For `programming`:

`p r o g r a m m i n g`

`0 1 2 3 4 5 6 7 8 9 10`

### First Occurrence

The search stops as soon as the target character is found, so the returned index is the first occurrence.

## Complexity

**Time Complexity:** O(n)

**Space Complexity:** O(1)

## Key Points

- Linear Search works by checking elements sequentially.
- String indexes start from `0`.
- `-1` represents that the target was not found.
- The algorithm returns the first occurrence of the target.