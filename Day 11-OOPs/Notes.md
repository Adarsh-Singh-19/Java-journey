# Object-Oriented Programming System (OOPS) in Java

## What is OOPS?

**Object-Oriented Programming System (OOPS)** is a programming paradigm that organizes software design around **objects** rather than functions.

An **object** is an instance of a class that contains **data (fields)** and **behavior (methods)**.

Java is a **pure object-oriented programming language** (except for primitive data types).

---

# Why OOPS?

OOPS helps to:

- Organize code efficiently.
- Improve code reusability.
- Increase security through data hiding.
- Reduce code duplication.
- Make programs easier to maintain.
- Model real-world entities.

---

# Real-Life Example

Consider a **Car**.

A car has:

### Properties (Data)

- Color
- Brand
- Model
- Speed

### Behaviors (Methods)

- Start()
- Stop()
- Accelerate()
- Brake()

In Java,

```
Car
```

is a **Class**, and

```
BMW
Audi
Tesla
```

are **Objects**.

---

# What is a Class?

A **Class** is a blueprint or template used to create objects.

It defines the properties and behaviors of objects.

### Syntax

```java
class Student {

    String name;
    int age;

    void display() {
        System.out.println(name);
    }
}
```

---

# What is an Object?

An **Object** is an instance of a class.

Objects occupy memory and can access the class members.

### Syntax

```java
Student s1 = new Student();
```

---

# Class vs Object

| Class | Object |
|--------|---------|
| Blueprint | Instance |
| Logical Entity | Physical Entity |
| No Memory Allocation | Memory Allocated |
| Can Create Many Objects | Created from a Class |

---

# Four Pillars of OOPS

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

# 1. Encapsulation

Encapsulation means **wrapping data and methods into a single unit (class)**.

Data is protected using **private** variables and accessed using **getter** and **setter** methods.

### Advantages

- Data Hiding
- Better Security
- Controlled Access

Example

```java
class Student{

    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
```

---

# 2. Inheritance

Inheritance allows one class to acquire the properties and methods of another class.

### Syntax

```java
class Animal{

    void eat(){
    }
}

class Dog extends Animal{

}
```

### Types of Inheritance in Java

- Single
- Multilevel
- Hierarchical

Java **does not support Multiple Inheritance with classes**.

It supports Multiple Inheritance using **Interfaces**.

---

# 3. Polymorphism

Polymorphism means **one interface, many forms**.

## Compile-Time Polymorphism

Achieved using

- Method Overloading

Example

```java
add(int a,int b)

add(double a,double b)
```

---

## Run-Time Polymorphism

Achieved using

- Method Overriding

Example

```java
Animal a = new Dog();
a.sound();
```

---

# 4. Abstraction

Abstraction hides implementation details and shows only essential information.

Implemented using

- Abstract Classes
- Interfaces

Example

```
ATM Machine

You press buttons.

You don't know the internal implementation.
```

---

# Constructor

A constructor initializes an object.

Rules

- Same name as the class.
- No return type.
- Called automatically.

### Types

- Default Constructor
- Parameterized Constructor
- Copy Constructor (User Defined)

Example

```java
class Student{

    Student(){

    }
}
```

---

# this Keyword

`this` refers to the current object.

Uses

- Access instance variables.
- Call another constructor.
- Pass current object.
- Return current object.

Example

```java
this.name = name;
```

---

# super Keyword

Used to refer to the parent class.

Uses

- Access parent variables.
- Call parent methods.
- Call parent constructor.

Example

```java
super();
```

---

# Method Overloading

Same method name.

Different parameters.

Example

```java
sum(int,int)

sum(double,double)
```

Achieves

- Compile-Time Polymorphism

---

# Method Overriding

Child class provides its own implementation of the parent class method.

Example

```java
class Animal{

    void sound(){

    }
}

class Dog extends Animal{

    void sound(){

    }
}
```

Achieves

- Run-Time Polymorphism

---

# Access Modifiers

| Modifier | Same Class | Same Package | Subclass | Other Package |
|----------|------------|--------------|-----------|----------------|
| public | ✅ | ✅ | ✅ | ✅ |
| protected | ✅ | ✅ | ✅ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| private | ✅ | ❌ | ❌ | ❌ |

---

# Static Keyword

Belongs to the class rather than an object.

Can be used with

- Variables
- Methods
- Blocks
- Nested Classes

Example

```java
static int count;
```

---

# Final Keyword

Used to restrict modification.

Can be used with

- Variable
- Method
- Class

Example

```java
final int MAX = 100;
```

---

# Abstract Class

Cannot be instantiated.

May contain

- Abstract methods
- Concrete methods

Example

```java
abstract class Animal{

    abstract void sound();
}
```

---

# Interface

An Interface contains method declarations and constants.

Supports Multiple Inheritance.

Example

```java
interface Animal{

    void sound();
}
```

---

# Abstract Class vs Interface

| Abstract Class | Interface |
|---------------|-----------|
| Can have constructors | No constructors |
| Can have instance variables | Only constants |
| Single Inheritance | Multiple Inheritance |
| Uses `extends` | Uses `implements` |

---

# Association

A relationship between two independent classes.

Example

```
Teacher ---- Student
```

---

# Aggregation

Weak "Has-A" relationship.

Example

```
Department has Employees
```

Employees can exist independently.

---

# Composition

Strong "Has-A" relationship.

Example

```
House has Rooms
```

Rooms cannot exist without the House.

---

# Object Class Methods

Every Java class inherits from `Object`.

Common methods

- toString()
- equals()
- hashCode()
- clone()
- getClass()

---

# Advantages of OOPS

- Code Reusability
- Security
- Modularity
- Flexibility
- Easy Maintenance
- Easy Testing
- Real-World Modeling

---

# Disadvantages of OOPS

- Slightly higher memory usage.
- Can be complex for small programs.
- Requires proper design.

---

# Interview Tips

Remember these points:

- A **Class** is a blueprint.
- An **Object** is an instance of a class.
- Java supports **Single, Multilevel, and Hierarchical Inheritance**.
- Java **does not support Multiple Inheritance with classes**, but it does through **Interfaces**.
- **Method Overloading** → Compile-Time Polymorphism.
- **Method Overriding** → Run-Time Polymorphism.
- **Encapsulation** provides data hiding.
- **Abstraction** hides implementation details.

---

# Common Interview Questions

1. What is OOPS?
2. What are the four pillars of OOPS?
3. Difference between Class and Object?
4. Difference between Abstraction and Encapsulation?
5. Difference between Overloading and Overriding?
6. What is Inheritance?
7. What is Polymorphism?
8. Difference between Interface and Abstract Class?
9. What is the `this` keyword?
10. What is the `super` keyword?
11. What are Constructors?
12. What are Access Modifiers?
13. What is the `static` keyword?
14. What is the `final` keyword?
15. What is Composition vs Aggregation?

---

# OOPS Learning Roadmap

```
Class
      ↓
Object
      ↓
Methods
      ↓
Constructors
      ↓
this Keyword
      ↓
Inheritance
      ↓
super Keyword
      ↓
Method Overloading
      ↓
Method Overriding
      ↓
Polymorphism
      ↓
Encapsulation
      ↓
Abstraction
      ↓
Interfaces
      ↓
Static Keyword
      ↓
Final Keyword
      ↓
Packages
      ↓
Object Class
```

---

# Key Concepts

- OOPS
- Class
- Object
- Constructor
- `this`
- `super`
- Inheritance
- Polymorphism
- Encapsulation
- Abstraction
- Method Overloading
- Method Overriding
- Interface
- Abstract Class
- Access Modifiers
- Static Keyword
- Final Keyword
- Association
- Aggregation
- Composition
- Object Class