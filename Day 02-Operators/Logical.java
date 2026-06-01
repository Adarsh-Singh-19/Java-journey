import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Logical AND (&&)
        if (num1 > 0 && num2 > 0) {
            System.out.println("Both numbers are positive.");
        } else {
            System.out.println("At least one number is not positive.");
        }

        // Logical OR (||)
        if (num1 > 0 || num2 > 0) {
            System.out.println("At least one number is positive.");
        } else {
            System.out.println("Neither number is positive.");
        }

        // Logical NOT (!)
        if (!(num1 > 0)) {
            System.out.println("First number is not positive.");
        }
        
        sc.close();
    }
    
}
