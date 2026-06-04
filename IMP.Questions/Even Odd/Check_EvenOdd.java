import java.util.*;
public class Check_EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();
        sc.close();

        // Calling the checkEven method
        boolean isEven = checkEven(num);
        
        if (isEven) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
    public static boolean checkEven(int number) {
        // boolean use to return true if the number is even, otherwise false.
        return number % 2 == 0;
    }
    
}
        