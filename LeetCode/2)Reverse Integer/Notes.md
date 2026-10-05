# Approach

1. First I create a `temp` variable to store the reversed number.

2. I use a `while` loop which runs until `x` becomes `0`.

3. In every iteration, I get the last digit of the number using:

   ```java
   int digit = x % 10;
   ```

4. Then I remove the last digit from `x` using:

   ```java
   x = x / 10;
   ```

5. Before adding the digit to `temp`, I check whether `temp * 10 + digit` will cause integer overflow.

6. For positive overflow, I check:

   ```java
   temp > Integer.MAX_VALUE / 10
   ```

   or if it is equal, I check whether the digit is greater than `7`.

7. For negative overflow, I check:

   ```java
   temp < Integer.MIN_VALUE / 10
   ```

   or if it is equal, I check whether the digit is smaller than `-8`.

8. If overflow happens, I return `0` because the problem says to return `0` when the reversed number is outside the 32-bit integer range.

9. If there is no overflow, I add the digit to `temp`:

   ```java
   temp = temp * 10 + digit;
   ```

10. After the loop finishes, I return `temp`.

### Example

```text
x = 123

digit = 3
temp = 3

digit = 2
temp = 32

digit = 1
temp = 321

Answer = 321
```

### Negative Number Example

```text
x = -123

digit = -3
temp = -3

digit = -2
temp = -32

digit = -1
temp = -321

Answer = -321
```

### Complexity

Time Complexity: `O(log₁₀(n))`

Space Complexity: `O(1)`

### Approach Used

Mathematical approach using `% 10` and `/ 10`, with integer overflow checking.
