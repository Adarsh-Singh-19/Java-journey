package Armstrong;
import java.util.*;
public class Check_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        if (isArmstrong(number)) {// Calling the isArmstrong method
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        // boolean use to return true if the number is an Armstrong number, otherwise false.
        
        int originalNum = num;
        int sum = 0;
        int power= String.valueOf(num).length();
        //String.valueOf(num).length() is used to calculate the number of digits in the input number,
        // which determines the power to which each digit will be raised in the Armstrong number calculation.

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, power);
            // Calculating the sum of the digits raised to the power
            num /= 10;
        }

        return sum == originalNum;
    }
    
}
