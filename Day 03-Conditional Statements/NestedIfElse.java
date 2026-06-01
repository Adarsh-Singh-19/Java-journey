import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is a positive even number.");
            } else {
                System.out.println(num + " is a positive odd number.");
            }
        } else if (num < 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is a negative even number.");
            } else {
                System.out.println(num + " is a negative odd number.");
            }
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
    
}
