# Day 05 - Methods in Java

## What is a Method?

A method is a block of code that executes only when it is called.

Methods help in:
- Code Reusability
- Better Organization
- Reduced Code Duplication
- Easy Maintenance

---

## Method Syntax

```java
returnType methodName(parameters) {
    // code
}
```

Example:

```java
static void greet() {
    System.out.println("Hello");
}
```

---

## Calling a Method

```java
greet();
```

Flow:

main() → Method Call → Execute → Return → main()

---

## Components of a Method

### Access Modifier

```java
public
private
protected
```

### Static

Method belongs to the class.

```java
static
```

### Return Type

Specifies what method returns.

```java
void
int
double
boolean
String
```

### Method Name

User-defined identifier.

```java
greet()
sum()
average()
```

---

## Method Without Parameters

```java
static void greet() {
    System.out.println("Welcome");
}
```

Call:

```java
greet();
```

---

## Method With Parameters

```java
static void sum(int a, int b) {
    System.out.println(a + b);
}
```

Call:

```java
sum(10, 20);
```

Output:

30

---

## Parameters vs Arguments

### Parameters

Variables declared in method definition.

```java
sum(int a, int b)
```

### Arguments

Actual values passed during method call.

```java
sum(10, 20)
```

---

## Method Returning Value

```java
static int add(int a, int b) {
    return a + b;
}
```

Call:

```java
int result = add(10, 20);
```

---

## Types of Methods

### 1. No Parameter, No Return

```java
static void show()
```

### 2. Parameter, No Return

```java
static void sum(int a, int b)
```

### 3. Parameter, Return

```java
static int sum(int a, int b)
```

### 4. No Parameter, Return

```java
static int sum()
```

---

## Method Overloading

Multiple methods having same name but different parameter list.

```java
static int add(int a, int b)

static double add(double a, double b)
```

Benefits:
- Readability
- Flexibility

---

## Scope in Java

### Method Scope

Variables declared inside a method can only be used inside that method.

```java
void show() {
    int x = 10;
}
```

---

### Block Scope

Variables declared inside braces {} exist only within that block.

```java
if(true){
    int x = 10;
}
```

---

### Loop Scope

Variables declared inside loops exist only inside the loop.

```java
for(int i=0;i<5;i++){
}
```

---

## Call By Value

Java always uses Call By Value.

A copy of the variable is passed to the method.

Original value remains unchanged.

---

## Recursion

A method calling itself is called recursion.

Example:

```java
static void count(int n){
    if(n==0)
        return;

    System.out.println(n);
    count(n-1);
}
```

Advantages:
- Simpler code
- Useful for Tree and Graph problems

Disadvantages:
- More memory usage
- Stack Overflow if base case missing

---

## Flowchart of Method Execution

Start
  |
main()
  |
Call Method
  |
Execute Method
  |
Return Value
  |
End

---

## Key Learnings

✔ Creating Methods

✔ Method Calling

✔ Parameters & Arguments

✔ Return Type

✔ Method Overloading

✔ Variable Scope

✔ Call By Value

✔ Introduction to Recursion