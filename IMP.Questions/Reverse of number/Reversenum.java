import java.util.*;
public class Reversenum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int rev= reverseNumber(number);
        System.out.println("Reversed number: " + rev);
        scanner.close();
    }

    public static int reverseNumber(int number) {
        int temp= 0;

        /*By While Loop*/
        while (number != 0) {
            int digit = number % 10;    //to get the last digit of the number
            temp = temp * 10 + digit;   //to add the digit to the reversed number
            number = number / 10;       //to remove the last digit from the number
        }

        /*By For Loop
        for(int i=0; number != 0; i++) {
            int digit = number % 10;    //to get the last digit of the number
            temp = temp * 10 + digit;   //to add the digit to the reversed number
            number = number / 10;       //to remove the last digit from the number
        }
        */
        return temp;
    }
}
