# Length of a 2-D Array

## Aim

Create a 2-D array, take elements as input, display the array, and find its length.

---

## Concept

A 2-D array stores data in rows and columns.

Example:

1 2 3

4 5 6

Rows = 2

Columns = 3

Total Elements = 2 × 3 = 6

---

## Array Creation

```java
double[][] arr = new double[rows][cols];
```

* `rows` → Number of rows
* `cols` → Number of columns

---

## Taking Input

Nested loops are used to store values.

```java
for(int i = 0; i < rows; i++){
    for(int j = 0; j < cols; j++){
        arr[i][j] = sc.nextDouble();
    }
}
```

---

## Traversing the Array

```java
for(int i = 0; i < rows; i++){
    for(int j = 0; j < cols; j++){
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

Traversal means visiting every element of the array.

---

## Finding Length

### Number of Rows

```java
arr.length
```

### Number of Columns

```java
arr[0].length
```

### Total Elements

```java
arr.length * arr[0].length
```

---

## Example

Rows = 3

Columns = 4

Total Elements = 3 × 4 = 12

Output:

Rows: 3

Columns: 4

Total Elements: 12

---

## Time Complexity

### Input

O(rows × cols)

### Traversal

O(rows × cols)

### Length Calculation

O(1)

---

## Learning Outcomes

* Creating a 2-D array
* Taking input using nested loops
* Traversing a matrix
* Understanding `arr.length`
* Understanding `arr[0].length`
* Finding total elements in a 2-D array
