# Approach

1. First I create a `maxWealth` variable to store the maximum wealth.

2. I use the first `for` loop to go through every customer.

3. For every customer, I create a `sum` variable and set it to `0`.

4. I use another `for` loop to go through all the bank accounts of that customer.

5. I add every account value to `sum`.

6. After calculating the total wealth of one customer, I compare `sum` with `maxWealth`.

7. If `sum` is greater than `maxWealth`, I update `maxWealth`.

8. After checking all the customers, I return `maxWealth`.

### Example

```text
accounts = {{1,2,3}, {3,2,1}}

Customer 1 → 1 + 2 + 3 = 6
Customer 2 → 3 + 2 + 1 = 6

Maximum Wealth = 6
```

### Complexity

Time Complexity: `O(m × n)`

Space Complexity: `O(1)`
