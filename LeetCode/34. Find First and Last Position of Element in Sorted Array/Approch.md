# Approach

1. First I create an array `ans` with two values:

   ```java
   int[] ans = {-1, -1};
   ```

   The first position will be stored at `ans[0]` and the last position at `ans[1]`.

2. I use the same `search()` method two times.

3. First I call:

   ```java
   search(nums, target, true);
   ```

   Here `true` means I want to find the **first occurrence**.

4. In the `search()` method, I use Binary Search because the array is sorted.

5. When `nums[mid] == target`, I store:

   ```java
   ans = mid;
   ```

6. If I am finding the first occurrence:

   ```java
   end = mid - 1;
   ```

   I continue searching on the **left side** because there may be another target before `mid`.

7. If I am finding the last occurrence:

   ```java
   start = mid + 1;
   ```

   I continue searching on the **right side** because there may be another target after `mid`.

8. If:

   ```java
   nums[mid] < target
   ```

   I move to the right:

   ```java
   start = mid + 1;
   ```

9. If:

   ```java
   nums[mid] > target
   ```

   I move to the left:

   ```java
   end = mid - 1;
   ```

10. If the target is not found, `ans` remains `-1`.

11. After finding the first position, I only search for the last position if the first position is not `-1`:

```java
if (ans[0] != -1) {
    ans[1] = search(nums, target, false);
}
```

12. Finally, I return the `ans` array.

### Example

```text id="q5q4kv"
nums = [5, 7, 7, 8, 8, 10]
target = 7

First occurrence:
→ Search left
→ index = 1

Last occurrence:
→ Search right
→ index = 2

Answer = [1, 2]
```

### Complexity

Time Complexity: `O(log n)`

Because I perform binary search at most two times.

Space Complexity: `O(1)`

### Approach Used

Binary Search with one method for finding both the first and last occurrence.
