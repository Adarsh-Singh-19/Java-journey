import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Numbers from 1 to " + num + ":");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= num);
        sc.close();
    }
    
}
