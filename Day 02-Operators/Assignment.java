import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();     // we assign the input value to the variable num;
        System.out.println("You entered: " + num);
        sc.close();
    }
}
