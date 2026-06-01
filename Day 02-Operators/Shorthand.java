import java.util.Scanner;
public class Shorthand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Shorthand Operators
        num += 5; // Equivalent to num = num + 5
        System.out.println("After adding 5: " + num);

        num -= 5; // Equivalent to num = num - 5
        System.out.println("After subtracting 5: " + num);

        num *= 5; // Equivalent to num = num * 5
        System.out.println("After multiplying by 5: " + num);

        num /= 5; // Equivalent to num = num / 5
        System.out.println("After dividing by 5: " + num);

        sc.close();
    }
    
}
