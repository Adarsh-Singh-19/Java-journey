# Order Agnostic Binary Search

## What is it?

Normal Binary Search works when array is sorted.

But sometimes array can be sorted in:

* Ascending order
* Descending order

So Order Agnostic Binary Search is used when we don't know whether array is ascending or descending.

---

## Example

Ascending:

`1 3 5 7 9`

Descending:

`9 7 5 3 1`

Both can be searched using Order Agnostic Binary Search.

---

## Main Logic

First I find:

* start
* end
* whether array is ascending or descending

Then apply Binary Search.

---

## Start and End

Start will be:

`0`

End will be:

`arr.length - 1`

If:

`start > end`

then array is empty / nothing to search.

Return:

`-1`

---

## Find Array Order

I check:

`arr[start] < arr[end]`

If true:

`isAsc = true`

Means array is ascending.

Otherwise:

`isAsc = false`

Means array is descending.

---

# Binary Search Logic

First find middle:

`mid = start + (end - start) / 2`

Then check:

`arr[mid] == target`

If true:

Target found → return `mid`.

---

# If Array is Ascending

Example:

`1 3 5 7 9 11`

### If

`arr[mid] < target`

Target will be on right side.

So:

`start = mid + 1`

### Else

Target will be on left side.

So:

`end = mid - 1`

---

# If Array is Descending

Example:

`11 9 7 5 3 1`

Here logic is opposite.

### If

`arr[mid] > target`

Target will be on right side.

So:

`start = mid + 1`

### Else

Target will be on left side.

So:

`end = mid - 1`

---

# Easy Way to Remember

## Ascending

Small → Right

Large → Left

## Descending

Large → Right

Small → Left

---

# Example 1

Array:

`1 3 5 7 9 11`

Target:

`9`

Start = `0`

End = `5`

Mid = `2`

Middle = `5`

`5 < 9`

So go right.

Start = `3`

Mid = `4`

Middle = `9`

Target found.

Answer:

`4`

---

# Example 2

Array:

`11 9 7 5 3 1`

Target:

`9`

Start = `0`

End = `5`

Mid = `2`

Middle = `7`

Array is descending.

`7 < 9`

So target is on left side.

End = `1`

Mid = `0`

Middle = `11`

`11 > 9`

So target is on right side.

Start = `1`

Mid = `1`

Middle = `9`

Target found.

Answer:

`1`

---

# Why I used while loop?

I used:

`while(start <= end)`

because when:

`start == end`

there is still one element left to check.

If I use:

`start < end`

then last element can be skipped.

---

# Why mid is calculated like this?

`start + (end - start) / 2`

Instead of:

`(start + end) / 2`

This is safer because it avoids integer overflow for very large values.

---

# Why this is called Order Agnostic?

Because I don't care whether the array is:

Ascending

or

Descending

I first find the order and then apply the correct Binary Search logic.

---

# Time Complexity

Best case:

`O(1)`

Average case:

`O(log n)`

Worst case:

`O(log n)`

Because after every step, around half of the array is removed from the search.

---

# Space Complexity

I used a `while` loop, not recursion.

So:

`O(1)`

Only a few variables are used.

---

# Difference from My Previous Binary Search

Previous Binary Search:

* Only ascending array
* Used recursion
* Space = `O(log n)`

This Binary Search:

* Ascending + Descending
* Uses while loop
* Space = `O(1)`

Both:

Time = `O(log n)`

---

# Important Things

* Array must be sorted.
* It can be ascending or descending.
* First check the order.
* Find middle.
* Compare middle with target.
* Decide left or right.
* Keep reducing the search range.
* If target found → return index.
* If `start > end` → return `-1`.

---

# Common Mistakes

### Mistake 1

Using it on an unsorted array.

It will not work.

### Mistake 2

Using ascending logic for a descending array.

The conditions are different.

### Mistake 3

Using `start < end`.

Use:

`start <= end`

### Mistake 4

Forgetting:

`mid + 1`

and

`mid - 1`

Otherwise same middle element can be checked again.

---

# My Understanding

Normal Binary Search:

**Sorted + Ascending**

Order Agnostic Binary Search:

**Sorted + Ascending/Descending**

Main idea:

**Find Order → Find Mid → Compare → Choose Half → Repeat**

---

# Final

Order Agnostic Binary Search is basically Binary Search with one extra step:

**First find whether array is ascending or descending.**

Then use the correct condition for searching left or right.
