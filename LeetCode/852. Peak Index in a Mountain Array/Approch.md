# Approach

1. First I take a **mountain array** where the elements are first increasing and then decreasing.

2. I use **Binary Search** to find the peak instead of checking every element.

3. I create two pointers:

   ```java
   int start = 0;
   int end = arr.length - 1;
   ```

4. I use:

   ```java
   while(start < end)
   ```

   because I want to keep reducing the search range until `start` and `end` point to the same index.

5. I calculate the middle:

   ```java
   int mid = start + (end - start) / 2;
   ```

6. I compare:

   ```java
   arr[mid] < arr[mid + 1]
   ```

7. If:

   ```text
   arr[mid] < arr[mid + 1]
   ```

   then I am on the **increasing part** of the mountain.

   The peak must be on the right side, so:

   ```java
   start = mid + 1;
   ```

8. Otherwise, I am on the **decreasing part** or `mid` itself can be the peak.

   So I keep `mid` in the search:

   ```java
   end = mid;
   ```

9. When the loop ends:

   ```text
   start == end
   ```

   Only one possible peak index remains.

10. So I return:

```java
return start;
```

### Example

```text
arr = {0, 1, 0}

        1
        ↑
0   1   0
    ↑
   peak

Peak index = 1
```

### How the Search Works

```text
If arr[mid] < arr[mid + 1]

        / 
       /
      ↑
    mid
       
Peak → right
start = mid + 1
```

```text
If arr[mid] > arr[mid + 1]

       ↑
      mid
       \
        \

Peak → left or mid
end = mid
```

### Complexity

Time Complexity: `O(log n)`

Space Complexity: `O(1)`

### Approach Used

Binary Search based on the increasing and decreasing parts of the mountain array.
