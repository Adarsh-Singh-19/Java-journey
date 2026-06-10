# Linear Search

## Definition

Linear Search is a searching algorithm that checks each element of an array sequentially until the target element is found or the array ends.

## Algorithm

1. Take the element to be searched.
2. Traverse the array from the first element to the last.
3. Compare each element with the target.
4. If a match is found, return its index.
5. If the traversal completes without a match, return `-1`.

## Time Complexity

* Best Case: `O(1)`
* Average Case: `O(n)`
* Worst Case: `O(n)`

## Space Complexity

* `O(1)`

## Advantages

* Simple to implement.
* Works on both sorted and unsorted arrays.
* No extra space required.

## Disadvantages

* Inefficient for large datasets.
* Slower than Binary Search on sorted arrays.

## Example

Array: `[10, 20, 30, 40, 50]`

Search: `30`

Output: `Element found at index 2`

## Key Concepts Learned

* Arrays
* Loops
* Methods
* Returning values
* Searching algorithms
* Time and Space Complexity
