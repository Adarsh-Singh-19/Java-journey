import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Relational Operators
        System.out.println("num1 == num2: " + (num1 == num2)); // Equal to
        System.out.println("num1 != num2: " + (num1 != num2)); // Not equal to
        System.out.println("num1 > num2: " + (num1 > num2));   // Greater than
        System.out.println("num1 < num2: " + (num1 < num2));   // Less than
        System.out.println("num1 >= num2: " + (num1 >= num2)); // Greater than or equal to
        System.out.println("num1 <= num2: " + (num1 <= num2)); // Less than or equal to

        sc.close();
    }
    
}
