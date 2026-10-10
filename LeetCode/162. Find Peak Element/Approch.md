# Approach

1. We need to find **any peak element** in the array.

2. A peak element is an element which is greater than its neighboring elements.

3. I use **Binary Search** instead of checking every element.

4. First I take:

   ```java
   int start = 0;
   int end = nums.length - 1;
   ```

5. I run the loop while:

   ```java
   while(start < end)
   ```

6. Find the middle:

   ```java
   int mid = start + (end - start) / 2;
   ```

7. Now compare:

   ```java
   nums[mid] < nums[mid + 1]
   ```

8. If:

   ```text
   nums[mid] < nums[mid + 1]
   ```

   it means the array is going **up** at this point.

   So a peak must exist on the **right side**.

   ```java
   start = mid + 1;
   ```

9. Otherwise:

   ```text
   nums[mid] > nums[mid + 1]
   ```

   the array is going **down**.

   So `mid` itself can be a peak, or the peak can be on the left.

   Therefore:

   ```java
   end = mid;
   ```

10. When:

```text
start == end
```

only one index is left, and that index is a peak.

11. Finally:

```java
return start;
```

### Example

```text
nums = {1, 2, 3, 1}

        3
        ↑
1   2   3   1
        ↑
      peak

Answer = 2
```

Another example:

```text
nums = {1, 2, 1, 3, 5, 6, 4}

Possible peaks = index 1 or index 5

The problem allows returning either one.
```

### Important Point

I don't need to find the **highest element**.

I only need to find **any local peak**.

That's why Binary Search works by checking the direction of the slope.

### Complexity

Time Complexity: `O(log n)`

Space Complexity: `O(1)`

### Approach Used

**Binary Search based on the slope between `mid` and `mid + 1`.**
