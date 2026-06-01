# Day 03 - Conditional Statements

## Topics Covered

* if Statement
* if-else Statement
* else-if Ladder
* Nested if
* switch Statement

---

## What are Conditional Statements?

Conditional statements allow a program to make decisions based on certain conditions. They execute different blocks of code depending on whether a condition is true or false.

---

## 1. if Statement

The `if` statement executes a block of code only when the specified condition is true.

### Syntax

```java
if(condition){
    // code
}
```

### Example

```java
int age = 20;

if(age >= 18){
    System.out.println("Eligible to Vote");
}
```

---

## 2. if-else Statement

The `if-else` statement provides two possible execution paths.

### Syntax

```java
if(condition){
    // code if true
}
else{
    // code if false
}
```

### Example

```java
int number = 5;

if(number % 2 == 0){
    System.out.println("Even");
}
else{
    System.out.println("Odd");
}
```

---

## 3. else-if Ladder

Used when multiple conditions need to be checked.

### Syntax

```java
if(condition1){
}
else if(condition2){
}
else{
}
```

### Example

```java
int marks = 85;

if(marks >= 90){
    System.out.println("Grade A");
}
else if(marks >= 75){
    System.out.println("Grade B");
}
else{
    System.out.println("Grade C");
}
```

---

## 4. Nested if

A nested if is an if statement placed inside another if statement.

### Example

```java
int age = 20;
boolean hasLicense = true;

if(age >= 18){
    if(hasLicense){
        System.out.println("Can Drive");
    }
}
```

---

## 5. switch Statement

The switch statement is used when there are multiple fixed choices.

### Syntax

```java
switch(expression){

    case value1:
        break;

    case value2:
        break;

    default:
}
```

### Example

```java
int day = 3;

switch(day){

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

---

## Flowcharts

### if Statement

```text
Start
  |
Condition?
 / \
T   F
|   |
Code
 |
End
```

### if-else Statement

```text
Start
  |
Condition?
 /      \
T        F
|        |
Code1  Code2
 \      /
   End
```

### else-if Ladder

```text
Start
  |
Condition1?
 /      \
T        F
|        |
Block1  Condition2?
          /     \
         T       F
         |       |
      Block2   Else Block
           \     /
             End
```

### switch Statement

```text
Start
  |
Expression
  |
Case 1 / Case 2 / Case 3
  |
Execute Matching Case
  |
 End
```

---

## Programs Created

* IfStatement.java
* IfElse.java
* ElseIfLadder.java
* NestedIf.java
* SwitchCase.java

---

## Key Learnings

* Learned decision-making in Java.
* Used if statements for single conditions.
* Used if-else statements for two-way decisions.
* Used else-if ladders for multiple conditions.
* Implemented nested if statements.
* Learned switch statements for multiple fixed choices.

---






