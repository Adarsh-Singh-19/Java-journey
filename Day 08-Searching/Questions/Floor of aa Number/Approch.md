# Approach

1. First I take a **sorted array** and a `target` number.

2. I use **Binary Search** because the array is sorted.

3. First I check if the target is smaller than the first element:

   ```java
   if(target < arr[0]){
       return -1;
   }
   ```

   If it is smaller, then the floor does not exist.

4. I use a `while` loop:

   ```java
   while(start <= end)
   ```

5. I calculate the middle index:

   ```java
   int mid = start + (end - start) / 2;
   ```

6. If the target is smaller than `arr[mid]`, I search on the left side:

   ```java
   end = mid - 1;
   ```

7. If the target is greater than `arr[mid]`, I search on the right side:

   ```java
   start = mid + 1;
   ```

8. If the target is equal to `arr[mid]`, then the target itself is the floor:

   ```java
   return arr[mid];
   ```

9. If the target is not found, the loop ends when:

   ```text
   start > end
   ```

10. At this point, `end` points to the largest element smaller than the target.

11. So I return:

```java
return arr[end];
```

### Example

```text id="j5j5yr"
arr = {2, 3, 5, 9, 14, 16, 18}
target = 15

14 < 15
16 > 15

Floor = 14
```

### Edge Case

```text id="6e9hce"
arr = {2, 3, 5, 9, 14, 16, 18}
target = 1

1 < 2

Floor does not exist.

Answer = -1
```

### Complexity

Time Complexity: `O(log n)`

Space Complexity: `O(1)`

### Approach Used

Binary Search.
