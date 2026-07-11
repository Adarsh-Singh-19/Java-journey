# Searching in Data Structures and Algorithms (DSA)

## What is Searching?

Searching is the process of finding the position or existence of a particular element in a collection of data such as an array, list, tree, or graph.

### Example

Array

```
10 20 30 40 50
```

Search for `30`

Output

```
Element found at index 2
```

---

# Why is Searching Important?

Searching is used to:

- Find an element quickly.
- Retrieve records from databases.
- Check whether data exists.
- Improve application performance.
- Build efficient software.

---

# Types of Searching Algorithms

## 1. Linear Search

Linear Search checks every element one by one until the target element is found.

### Steps

1. Start from the first element.
2. Compare each element with the target.
3. If matched, return the index.
4. If the end of the array is reached, the element is not present.

### Example

```
Array = [12, 25, 18, 40, 30]

Search = 40
```

Comparisons

```
12 ❌
25 ❌
18 ❌
40 ✅
```

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(1) |
| Average | O(n) |
| Worst | O(n) |

### Space Complexity

```
O(1)
```

Works on:

- Sorted Arrays ✅
- Unsorted Arrays ✅

---

# 2. Binary Search

Binary Search repeatedly divides the search space into two halves.

**Binary Search works only on sorted arrays.**

### Steps

1. Find the middle element.
2. Compare it with the target.
3. If equal, return the index.
4. If the target is smaller, search the left half.
5. Otherwise, search the right half.
6. Repeat until the element is found or the search space becomes empty.

### Example

```
Array

10 20 30 40 50 60 70

Search = 50
```

```
Middle = 40

50 > 40

Search Right Half

50 60 70

Middle = 60

50 < 60

Search Left Half

50

Found
```

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(1) |
| Average | O(log n) |
| Worst | O(log n) |

### Space Complexity

Iterative

```
O(1)
```

Recursive

```
O(log n)
```

Works on:

- Sorted Arrays ✅
- Unsorted Arrays ❌

---

# 3. Jump Search

Jump Search jumps ahead by fixed block sizes.

Usually

```
Jump = √n
```

Works only on sorted arrays.

### Time Complexity

```
O(√n)
```

---

# 4. Interpolation Search

Estimates where the target is likely to be based on its value.

Works well when data is uniformly distributed.

### Time Complexity

Best

```
O(1)
```

Average

```
O(log log n)
```

Worst

```
O(n)
```

---

# 5. Exponential Search

First finds a range where the element may exist, then applies Binary Search.

### Time Complexity

```
O(log n)
```

---

# 6. Fibonacci Search

Uses Fibonacci numbers to divide the search space.

Works only on sorted arrays.

### Time Complexity

```
O(log n)
```

---

# 7. Hashing Search

Uses a hash function to locate elements directly.

### Time Complexity

Average

```
O(1)
```

Worst

```
O(n)
```

Used in

- HashMap
- HashSet
- Dictionary

---

# 8. Breadth First Search (BFS)

Used for searching in graphs and trees.

Explores nodes level by level.

Uses a Queue.

### Time Complexity

```
O(V + E)
```

where

- V = Number of Vertices
- E = Number of Edges

---

# 9. Depth First Search (DFS)

Explores one branch completely before moving to another.

Uses

- Stack
- Recursion

### Time Complexity

```
O(V + E)
```

---

# 10. Ternary Search

Divides the search space into three parts.

Works only on sorted arrays.

### Time Complexity

```
O(log₃ n)
```

---

# Comparison Table

| Algorithm | Sorted Required | Best | Average | Worst |
|-----------|-----------------|------|---------|-------|
| Linear Search | ❌ | O(1) | O(n) | O(n) |
| Binary Search | ✅ | O(1) | O(log n) | O(log n) |
| Jump Search | ✅ | O(1) | O(√n) | O(√n) |
| Interpolation Search | ✅ | O(1) | O(log log n) | O(n) |
| Exponential Search | ✅ | O(1) | O(log n) | O(log n) |
| Fibonacci Search | ✅ | O(1) | O(log n) | O(log n) |
| Hashing | ❌ | O(1) | O(1) | O(n) |
| BFS | Graph | O(V+E) | O(V+E) | O(V+E) |
| DFS | Graph | O(V+E) | O(V+E) | O(V+E) |
| Ternary Search | ✅ | O(1) | O(log₃ n) | O(log₃ n) |

---

# Linear Search vs Binary Search

| Feature | Linear Search | Binary Search |
|----------|---------------|---------------|
| Sorted Array Required | ❌ No | ✅ Yes |
| Time Complexity | O(n) | O(log n) |
| Easy to Implement | ✅ | ✅ |
| Efficient for Large Data | ❌ | ✅ |
| Works on Unsorted Data | ✅ | ❌ |

---

# Iterative vs Recursive Binary Search

## Iterative

- Uses loops.
- Space Complexity: **O(1)**

## Recursive

- Uses recursion.
- Space Complexity: **O(log n)**

---

# Searching in Different Data Structures

| Data Structure | Common Search Technique |
|----------------|-------------------------|
| Array | Linear Search, Binary Search |
| Linked List | Linear Search |
| Binary Search Tree (BST) | BST Search |
| Hash Table | Hashing |
| Graph | BFS, DFS |
| Trie | Prefix Search |

---

# Applications of Searching

- Search engines
- Database management systems
- Contact lists
- File systems
- Navigation systems
- E-commerce product search
- Social media search
- Library management systems

---

# Interview Tips

Remember these points:

- Binary Search **requires a sorted array**.
- Linear Search works on both sorted and unsorted arrays.
- Hashing provides **O(1)** average search time.
- BFS uses a **Queue**.
- DFS uses a **Stack** or **Recursion**.
- Binary Search is much faster than Linear Search for large sorted datasets.

---

# Common Interview Questions

1. What is searching?
2. What is the difference between Linear Search and Binary Search?
3. Why does Binary Search require a sorted array?
4. Which searching algorithm is the fastest?
5. What is the time complexity of Binary Search?
6. What is the difference between BFS and DFS?
7. What data structure is used in BFS?
8. What data structure is used in DFS?
9. What are the applications of Hashing?
10. When should you use Linear Search?

---

# Key Concepts

- Searching
- Linear Search
- Binary Search
- Recursive Binary Search
- Iterative Binary Search
- Jump Search
- Interpolation Search
- Exponential Search
- Fibonacci Search
- Hashing
- Breadth First Search (BFS)
- Depth First Search (DFS)
- Ternary Search
- Time Complexity
- Space Complexity
- Sorted Array
- Unsorted Array
- Graph Traversal