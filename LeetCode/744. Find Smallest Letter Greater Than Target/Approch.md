# Approach

1. First I take a **sorted array of characters** and a `target` character.

2. I use **Binary Search** because the letters are sorted.

3. First I check if the target is greater than the last letter:

   ```java
   if(target > letters[letters.length - 1]){
       return letters[0];
   }
   ```

   If it is greater, then there is no greater letter in the array, so I return the first letter because the problem follows a circular order.

4. I use a `while` loop:

   ```java
   while(end >= start)
   ```

5. I calculate the middle index:

   ```java
   int mid = start + (end - start) / 2;
   ```

6. If the target is smaller than `letters[mid]`, then `letters[mid]` can be the answer, but there may be a smaller valid letter on the left side. So I search left:

   ```java
   end = mid - 1;
   ```

7. Otherwise, if:

   ```java
   target >= letters[mid]
   ```

   I search on the right:

   ```java
   start = mid + 1;
   ```

8. I use `>=` here because the problem asks for a letter **strictly greater** than the target. If the target is equal to `letters[mid]`, I cannot use that letter.

9. When the loop finishes, `start` points to the smallest letter greater than the target.

10. I return:

```java
return letters[start];
```

### Example

```text
letters = [c, f, j]
target = a

a < c

Answer = c
```

### Another Example

```text
letters = [c, f, j]
target = f

f == f
→ search right

j > f

Answer = j
```

### Wrap Around Example

```text
letters = [c, f, j]
target = z

z > j

No greater letter exists.

Answer = c
```

### Complexity

Time Complexity: `O(log n)`

Space Complexity: `O(1)`

### Approach Used

Binary Search with circular/wrap-around handling.
