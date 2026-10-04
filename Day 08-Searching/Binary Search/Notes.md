# Binary Search

## What is Binary Search?

Binary Search is a searching algorithm used to find an element in a **sorted array**.

It works by repeatedly dividing the search range into two halves.

Instead of checking every element one by one, we check the middle element and decide whether to search in the left half or right half.

---

## Important Condition

The array **must be sorted** for Binary Search to work correctly.

Example:

`1 3 5 7 9 11 15`

This is sorted, so Binary Search can be applied.

---

## How Binary Search Works

Suppose the array is:

`10 20 30 40 50 60 70`

Target = `60`

### Step 1

Start = `0`

End = `6`

Middle = `3`

Middle element = `40`

Target `60` is greater than `40`.

So we search in the **right half**.

---

### Step 2

New range:

Start = `4`

End = `6`

Middle = `5`

Middle element = `60`

Target = `60`

So the element is found at index `5`.

---

# Logic

There are 3 main cases:

### 1. Target == Middle Element

Element is found.

Return the middle index.

### 2. Target > Middle Element

Target can only exist on the right side.

Search:

`mid + 1 → end`

### 3. Target < Middle Element

Target can only exist on the left side.

Search:

`start → mid - 1`

---

# Base Condition

In recursive Binary Search:

If:

`start > end`

then there are no elements left to search.

So return:

`-1`

`-1` means the element was not found.

---

# Why `start <= end`?

In my program I used:

`start <= end`

instead of:

`start < end`

because when:

`start == end`

there is still **one element left to check**.

If I use `start < end`, that last element may not be checked.

---

# Middle Calculation

Middle is calculated as:

`start + (end - start) / 2`

This is preferred over:

`(start + end) / 2`

because it helps prevent integer overflow when the values of start and end are very large.

---

# Recursion Used

I used recursion in the `search()` method.

When the target is not found at the middle:

### Target > Middle

Call the search method again for the right half.

New range:

`mid + 1 → end`

### Target < Middle

Call the search method again for the left half.

New range:

`start → mid - 1`

Every recursive call reduces the search range.

---

# My Program Flow

1. Take the size of the array.
2. Create the array.
3. Take array elements from the user.
4. Take the target element.
5. Call the `search()` method.
6. Start searching from index `0` to `size - 1`.
7. Check the base condition.
8. Find the middle index.
9. Compare the middle element with the target.
10. If found, return the index.
11. If target is greater, search the right half.
12. If target is smaller, search the left half.
13. If the search range becomes empty, return `-1`.
14. Print the result.

---

# Example

Array:

`2 5 8 12 16 23 38 56 72`

Target:

`23`

### First

Start = `0`

End = `8`

Middle = `4`

Middle element = `16`

`23 > 16`

Search right half.

### Second

Start = `5`

End = `8`

Middle = `6`

Middle element = `38`

`23 < 38`

Search left half.

### Third

Start = `5`

End = `5`

Middle = `5`

Middle element = `23`

Target found.

Answer:

`Index = 5`

---

# Time Complexity

### Best Case

`O(1)`

Target is found at the middle in the first attempt.

### Average Case

`O(log n)`

### Worst Case

`O(log n)`

Binary Search is fast because the search space becomes half after every step.

---

# Space Complexity

Since my implementation uses **recursion**:

`O(log n)`

because recursive calls are stored in the call stack.

---

# Why Binary Search is Faster

Suppose there are `1,000,000` elements.

Linear Search may check up to:

`1,000,000`

elements.

Binary Search keeps dividing:

`1,000,000`

↓

`500,000`

↓

`250,000`

↓

`125,000`

↓

...

So only around `20` divisions are needed to reach one element.

That is why Binary Search has:

`O(log n)`

time complexity.

---

# Important Observation About My Code

My program uses both:

* `while` loop
* recursion

But the actual repeated searching is being done using **recursion**.

Inside the `while` loop, every condition immediately returns either:

* the answer, or
* another recursive call.

So the loop does not actually repeat multiple times in the same method call.

A cleaner recursive implementation would not need the `while` loop.

---

# Common Mistakes

## 1. Using Binary Search on an unsorted array

Binary Search requires a sorted array.

## 2. Using `start < end`

This can skip the last remaining element.

Use:

`start <= end`

## 3. Forgetting the base condition

Without:

`start > end`

recursion may continue indefinitely.

## 4. Wrong boundaries

For the right half:

`mid + 1`

For the left half:

`mid - 1`

## 5. Searching the same middle again

The middle element has already been checked, so it should be excluded from the next search range.

---

# Important Points to Remember

* Binary Search works on a **sorted array**.
* It follows the **divide and conquer** approach.
* It checks the middle element.
* If target is greater → go right.
* If target is smaller → go left.
* If target equals middle → element found.
* If `start > end` → element not found.
* Time complexity = `O(log n)`.
* Recursive space complexity = `O(log n)`.
* Middle can be calculated using:
  `start + (end - start) / 2`

---

# What I Learned From This Program

* How arrays work in Java.
* How to take array input using `Scanner`.
* How to create and call methods.
* How recursion works.
* How Binary Search works.
* How to reduce a search space.
* How to use start, end and middle indexes.
* Difference between left and right search.
* Base condition in recursion.
* Time complexity of Binary Search.
* Space complexity of recursive Binary Search.

---

# Interview Explanation

If someone asks me to explain my program:

> I implemented Binary Search using recursion. The array must be sorted. I maintain start and end indexes and calculate the middle index. If the middle element is equal to the target, I return its index. If the target is greater, I recursively search the right half, otherwise I search the left half. If start becomes greater than end, the element is not present, so I return -1. The time complexity is O(log n).

---

# Conclusion

Binary Search is much faster than Linear Search for a sorted array.

The main idea is:

**Find Middle → Compare → Choose Half → Repeat**

`Sorted Array`

↓

`Find Middle`

↓

`Compare with Target`

↓

`Left Half / Right Half`

↓

`Repeat`

↓

`Found / -1`
