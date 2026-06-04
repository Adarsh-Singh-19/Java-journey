# Calculator Project

## Objective

Build a simple calculator in Java using methods and switch-case statements.

## Concepts Used

* Scanner Class
* Methods (Functions)
* Switch Case
* User Input
* Return Values
* Conditional Statements
* Package Concept

---

## Project Workflow

1. Display a menu of operations:

   * Addition
   * Subtraction
   * Multiplication
   * Division
   * Modulus

2. Take the user's choice as input.

3. Use a switch-case statement to determine the selected operation.

4. Ask the user for two numbers.

5. Call the corresponding method:

   * add()
   * subtract()
   * multiply()
   * divide()
   * modulus()

6. Perform the calculation.

7. Return the result from the method.

8. Display the result to the user.

9. Close the Scanner object.

---

## Methods Used

### add(double a, double b)

Returns the sum of two numbers.

Formula:
result = a + b

---

### subtract(double a, double b)

Returns the difference between two numbers.

Formula:
result = a - b

---

### multiply(double a, double b)

Returns the product of two numbers.

Formula:
result = a * b

---

### divide(double a, double b)

Returns the division of two numbers.

Formula:
result = a / b

Special Condition:
Division by zero is not allowed.

---

### modulus(double a, double b)

Returns the remainder after division.

Formula:
result = a % b

Special Condition:
Modulus by zero is not allowed.

---

## Error Handling

### Division by Zero

If the second number is 0:

Output:
Error: Division by zero is not allowed.

---

### Modulus by Zero

If the second number is 0:

Output:
Error: Modulus by zero is not allowed.

---

## Flowchart

Start
|
Display Menu
|
Take User Choice
|
Switch(choice)
|
+--> Addition ------> add(a,b)
|
+--> Subtraction ---> subtract(a,b)
|
+--> Multiplication -> multiply(a,b)
|
+--> Division ------> divide(a,b)
|
+--> Modulus -------> modulus(a,b)
|
Display Result
|
End

---

## Learning Outcome

After completing this project, I learned:

* How to create and call methods.
* How to use switch-case statements.
* How to take user input using Scanner.
* How to return values from methods.
* How to handle invalid operations.
* How to prevent division and modulus by zero errors.
* How to organize Java programs using functions.
