# Approach

1. First I create a `count` variable to count numbers having even number of digits.

2. I run a `for` loop through the complete array.

3. For every number, I call the `even()` method to check whether the number has even digits or not.

4. In the `even()` method, I call the `digit()` method to count the number of digits.

5. In the `digit()` method:

   * I create a `count` variable.
   * I use `while(nums > 0)`.
   * Every time I divide the number by `10`, I increase the count.
   * When the number becomes `0`, the count is the total number of digits.

6. Then I check:

   ```text
   number of digits % 2 == 0
   ```

7. If it is true, I increase the main `count`.

8. Finally, I return the `count`.

### Example

```text
arr = {12, 345, 2, 6, 7896}

12   → 2 digits → Even ✅
345  → 3 digits → Odd ❌
2    → 1 digit  → Odd ❌
6    → 1 digit  → Odd ❌
7896 → 4 digits → Even ✅

Answer = 2
```

### Complexity

Time Complexity: `O(n × d)`

Space Complexity: `O(1)`
