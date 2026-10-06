# Approach

1. First I take a **sorted array** and a `target` number.

2. I use **Binary Search** because the array is sorted.

3. First I check if the target is greater than the last element of the array:

   ```java
   if(target > arr[arr.length - 1]){
       return -1;
   }
   ```

   If it is greater, then the ceiling does not exist.

4. I use a `while` loop:

   ```java
   while(start <= end)
   ```

5. I calculate the middle index:

   ```java
   int mid = start + (end - start) / 2;
   ```

6. If the target is smaller than `arr[mid]`, then the ceiling can be on the left side, so:

   ```java
   end = mid - 1;
   ```

7. If the target is greater than `arr[mid]`, then I search on the right side:

   ```java
   start = mid + 1;
   ```

8. If the target is equal to `arr[mid]`, then the target itself is the ceiling, so I return:

   ```java
   return arr[mid];
   ```

9. If the target is not found, the loop ends when:

   ```text
   start > end
   ```

10. At this point, `start` points to the smallest element greater than the target.

11. So I can return either:

```java
return arr[start];
```

or:

```java
return arr[end + 1];
```

Because after the loop:

```text
start = end + 1
```

### Example

```text
arr = {2, 3, 5, 9, 14, 16, 18}
target = 15

15 is not present.

14 < 15
16 > 15

Ceiling = 16
```

### Edge Case

```text
arr = {2, 3, 5, 9}
target = 15

15 > 9

Ceiling does not exist.

Answer = -1
```

### Complexity

Time Complexity: `O(log n)`

Space Complexity: `O(1)`

### Approach Used

Binary Sea
