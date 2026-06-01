import java.util.Scanner;
public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();

        // Bitwise AND (&)
        int andResult = a & b; // Result: 1 (0001 in binary)
        System.out.println("Bitwise AND (a & b): " + andResult);

        // Bitwise OR (|)
        int orResult = a | b; // Result: 7 (0111 in binary)
        System.out.println("Bitwise OR (a | b): " + orResult);

        // Bitwise XOR (^)
        int xorResult = a ^ b; // Result: 6 (0110 in binary)
        System.out.println("Bitwise XOR (a ^ b): " + xorResult);

        // Bitwise NOT (~)
        int notResult = ~a; // Result: -6 (in two's complement, ~0101 is 1010 which is -6)
        System.out.println("Bitwise NOT (~a): " + notResult);
    }
}
