# Day 06 - Arrays (1-D Array)

## What is an Array?

An Array is a collection of elements of the same data type stored in contiguous memory locations.

Instead of creating multiple variables:

```java
int a = 10;
int b = 20;
int c = 30;
```

We can use:

```java
int[] arr = {10, 20, 30};
```

---

# Why Arrays?

Arrays help us:

* Store multiple values using a single variable.
* Access elements using indexes.
* Reduce code repetition.
* Process data efficiently using loops.

---

# Declaration of Array

### Syntax

```java
dataType[] arrayName;
```

Example:

```java
int[] arr;
double[] marks;
String[] names;
```

---

# Creating an Array

### Syntax

```java
arrayName = new dataType[size];
```

Example:

```java
double[] arr = new double[5];
```

Creates an array capable of storing 5 double values.

---

# Array Indexing

Array indexes start from 0.

Example:

```java
double[] arr = {10, 20, 30, 40};
```

| Index | Value |
| ----- | ----- |
| 0     | 10    |
| 1     | 20    |
| 2     | 30    |
| 3     | 40    |

Accessing:

```java
System.out.println(arr[2]);
```

Output:

```text
30
```

---

# Taking Input in Array

```java
for(int i = 0; i < size; i++){
    arr[i] = sc.nextDouble();
}
```

Flow:

1. Start from index 0.
2. Read input.
3. Store value in array.
4. Move to next index.
5. Repeat until array is full.

---

# Traversing an Array

Traversing means visiting every element of the array.

```java
for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
}
```

Output:

```text
10 20 30 40 50
```

---

# Length of an Array

The length property gives the total number of elements.

Example:

```java
System.out.println(arr.length);
```

Output:

```text
5
```

Important:

```java
arr.length
```

NOT

```java
arr.length()
```

because length is a property, not a method.

---

# Creating Array Using Method

Example:

```java
public static double[] createArray(int size, Scanner sc)
```

Purpose:

* Creates array.
* Takes input.
* Returns the created array.

Benefit:

* Code becomes reusable.
* Improves readability.

---

# Changing an Element

Example:

```java
arr[index] = newValue;
```

If:

```java
arr = [10, 20, 30, 40]
```

and

```java
index = 2
newValue = 99
```

Result:

```java
arr = [10, 20, 99, 40]
```

---

# Index Validation

Before changing an element:

```java
if(index < 0 || index >= arr.length)
```

Why?

To prevent:

```java
ArrayIndexOutOfBoundsException
```

Example:

Array Size = 5

Valid indexes:

```text
0 1 2 3 4
```

Invalid:

```text
-1
5
6
```

---

# Flowchart : Create Array

```text
Start
  |
Input Size
  |
Create Array
  |
Input Elements
  |
Store Elements
  |
Display Array
  |
 End
```

---

# Flowchart : Change Element

```text
Start
  |
Input Index
  |
Valid Index?
 /      \
No      Yes
 |        |
Error  Input New Value
 |        |
End   Replace Element
          |
     Display Array
          |
         End
```

---

# Time Complexity

### Creating Array

```text
O(n)
```

### Traversing Array

```text
O(n)
```

### Accessing an Element

```text
O(1)
```

### Updating an Element

```text
O(1)
```

---

# Key Concepts Learned

* Array Declaration
* Array Creation
* User Input in Array
* Array Traversal
* Array Length Property
* Passing Array to Methods
* Returning Array from Methods
* Updating Array Elements
* Index Validation
* Time Complexity

---

# Important Formula

Valid Array Index:

```java
0 <= index < arr.length
```

This condition should always be checked before accessing or modifying an array element.
