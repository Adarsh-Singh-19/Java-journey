import java.util.*;
public class Factorial {
    public static int factorial(int n) {
        if(n<0){
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Return -1 to indicate an error
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial: ");
        int n = sc.nextInt();
        int ans = factorial(n);
        if(ans != -1) { // Check if the factorial was calculated successfully
            System.out.println("Factorial of " + n + " is: " + ans);
        }
        sc.close();
    }
}