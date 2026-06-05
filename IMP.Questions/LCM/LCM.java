import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 == 0 || num2 == 0) {
        System.out.println("LCM is 0");
        scanner.close();
        return;
        }

        int lcm = Math.abs((num1 * num2) / hcf(num1, num2));
        // LCM can be calculated using the formula: a*b = LCM(a, b) * HCF(a, b)

        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        scanner.close();
    }

    public static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }
    
}
