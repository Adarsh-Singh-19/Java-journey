import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        long fact=factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
        scanner.close();
    }
    public static long factorial(int n) {
        if (n<0){
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        else if (n == 0 || n == 1) {
            return 1;
        }
        else {
        return n * factorial(n - 1);
        }
    }
}
