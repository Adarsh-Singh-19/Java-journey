import java.util.*;
public class Check_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isFibonacci(number)) {
            System.out.println(number + " is a Fibonacci number.");
        } else {
            System.out.println(number + " is not a Fibonacci number.");
        }
        scanner.close();
    }

    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }
        else if (n == 0 || n == 1) {
            return true;
        }
        else {
            
        int a = 0, b = 1;
        while (b < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }
    
        return b == n;
    }
}
}
