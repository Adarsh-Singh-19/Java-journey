# Approach

1. First I use a `for` loop to select the first element of the array.

2. Then I use another `for` loop to select the second element.

3. I start the second loop from `i + 1` so that:

   * I don't use the same element twice.
   * I don't check the same pair again.

4. I add `nums[i] + nums[j]`.

5. I check whether the sum is equal to the given `target`.

6. If the sum is equal to the target, I return the indexes of both elements:

   ```java
   return new int[]{i, j};
   ```

7. If no pair is found, I return:

   ```java
   return new int[]{-1, -1};
   ```

### Example

```text
nums = [2, 7, 11, 15]
target = 9

2 + 7 = 9 ✅

Answer = [0, 1]
```

### Complexity

Time Complexity: `O(n²)`

Space Complexity: `O(1)`

### Approach Used

Brute Force — checking every possible pair.
