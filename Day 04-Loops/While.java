import java.util.*;
public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Numbers from 1 to " + num + ":");
        int i = 1;
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
        sc.close();
    }
    
}