import java.util.*;

public class swappingNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        scanner.close();
    }
}

/*
Swapping without using a temporary variable

num1 = num1 + num2;
num2 = num1 - num2;
num1 = num1 - num2;

System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
*/