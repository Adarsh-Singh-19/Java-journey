# Day 04 - Loops in Java

## Topics Covered

* Introduction to Loops
* for Loop
* while Loop
* do-while Loop
* Nested Loops
* Infinite Loops
* break Statement
* continue Statement
* Pattern Printing

---

# What are Loops?

Loops are used to execute a block of code repeatedly until a specified condition becomes false.

Without loops:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

Using a loop:

```java
for(int i = 1; i <= 5; i++){
    System.out.println("Hello");
}
```

Advantages:

* Reduces code repetition.
* Makes programs shorter and cleaner.
* Improves efficiency.

---

# 1. for Loop

A for loop is used when the number of iterations is known.

## Syntax

```java
for(initialization; condition; update){
    // code
}
```

## Flowchart

```text
Start
  |
Initialization
  |
Condition?
 /      \
T        F
|        |
Code     End
|
Update
|
Condition
```

## Example

```java
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
```

### Output

```text
1
2
3
4
5
```

---

# Components of a for Loop

### Initialization

Executed only once.

```java
int i = 1;
```

### Condition

Checked before every iteration.

```java
i <= 5
```

### Update

Executed after every iteration.

```java
i++
```

---

# 2. while Loop

A while loop is used when the number of iterations is unknown.

## Syntax

```java
while(condition){
    // code
}
```

## Flowchart

```text
Start
  |
Condition?
 /      \
T        F
|        |
Code     End
|
Condition
```

## Example

```java
int i = 1;

while(i <= 5){
    System.out.println(i);
    i++;
}
```

### Output

```text
1
2
3
4
5
```

---

# 3. do-while Loop

A do-while loop executes at least once, even if the condition is false.

## Syntax

```java
do{
    // code
}
while(condition);
```

## Flowchart

```text
Start
  |
 Code
  |
Condition?
 /      \
T        F
|        |
Code     End
```

## Example

```java
int i = 1;

do{
    System.out.println(i);
    i++;
}
while(i <= 5);
```

### Output

```text
1
2
3
4
5
```

---

# Difference Between while and do-while

| while                   | do-while               |
| ----------------------- | ---------------------- |
| Condition checked first | Code executes first    |
| May execute zero times  | Executes at least once |
| Entry-controlled loop   | Exit-controlled loop   |

---

# 4. Nested Loops

A loop inside another loop is called a nested loop.

## Syntax

```java
for(...){
    for(...){
        // code
    }
}
```

## Example

```java
for(int i = 1; i <= 3; i++){

    for(int j = 1; j <= 3; j++){
        System.out.print("* ");
    }

    System.out.println();
}
```

### Output

```text
* * *
* * *
* * *
```

---

# 5. Infinite Loop

A loop that never ends.

## Example

```java
while(true){
    System.out.println("Hello");
}
```

⚠ Avoid infinite loops unless intentionally required.

---

# 6. break Statement

Used to terminate a loop immediately.

## Example

```java
for(int i = 1; i <= 10; i++){

    if(i == 5){
        break;
    }

    System.out.println(i);
}
```

### Output

```text
1
2
3
4
```

---

# 7. continue Statement

Used to skip the current iteration.

## Example

```java
for(int i = 1; i <= 5; i++){

    if(i == 3){
        continue;
    }

    System.out.println(i);
}
```

### Output

```text
1
2
4
5
```

---

# Pattern Printing

Pattern printing is one of the most common applications of nested loops.

## Pattern 1

```java
for(int i = 1; i <= 5; i++){

    for(int j = 1; j <= i; j++){
        System.out.print("* ");
    }

    System.out.println();
}
```

### Output

```text
*
* *
* * *
* * * *
* * * * *
```

---

## Pattern 2

```java
for(int i = 5; i >= 1; i--){

    for(int j = 1; j <= i; j++){
        System.out.print("* ");
    }

    System.out.println();
}
```

### Output

```text
* * * * *
* * * *
* * *
* *
*
```

---

# Programs Created

* ForLoop.java
* WhileLoop.java
* DoWhileLoop.java
* NestedLoop.java
* BreakStatement.java
* ContinueStatement.java
* Pattern1.java
* Pattern2.java

---

# Key Learnings

* Learned how loops reduce repetitive code.
* Used for loops when the number of iterations is known.
* Used while loops when iterations are uncertain.
* Learned do-while loops execute at least once.
* Understood nested loops.
* Learned break and continue statements.
* Created pattern printing programs.

---