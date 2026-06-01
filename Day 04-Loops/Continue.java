import java.util.Scanner;
public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Even numbers from 1 to " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.print(i + " ");
        }
        sc.close();
    }
    
}