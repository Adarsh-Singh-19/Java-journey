# Contains Duplicate — LeetCode 217

## Problem

Given an integer array `nums`, return `true` if any value appears at least twice, otherwise return `false`.

## Example

```text
Input:  nums = [1,2,3,1]
Output: true
```

```text
Input:  nums = [1,2,3,4]
Output: false
```

---

## Approach 1 — Brute Force

Compare every element with all elements after it.

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
```

### Complexity

* Time: `O(n²)`
* Space: `O(1)`

### Problem with this approach

For a large array, the number of comparisons becomes very high, so LeetCode can give **Time Limit Exceeded (TLE)**.

---

## Approach 2 — HashSet

Use a `HashSet` to store numbers that have already appeared.

```java
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
```

### Complexity

* Time: `O(n)` average
* Space: `O(n)`

---

## Key Idea

Instead of comparing every pair:

```text
Current number
      ↓
Already in HashSet?
   ↙        ↘
 YES         NO
  ↓           ↓
true       Add it
```

### What I Learned

* Nested loops can solve the problem but may cause TLE.
* `HashSet` gives fast average `O(1)` lookup.
* Always think about how to reduce `O(n²)` to `O(n)` when possible.
* `i + 1` is important in the brute-force approach because we don't need to compare an element with itself.

## Pattern

**Array + Duplicate Detection → HashSet**

## Difficulty

Easy

## Status

* Brute Force: ❌ TLE
* HashSet: ✅ Accepted
