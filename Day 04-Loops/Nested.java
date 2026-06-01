import java.util.Scanner;
public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for triangular pattern: ");
        int rows = sc.nextInt();

        System.out.println("Nested Loop Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
