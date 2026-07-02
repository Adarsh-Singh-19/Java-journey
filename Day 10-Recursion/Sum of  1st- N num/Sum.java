import java.util.Scanner;
public class Sum {

    public static int printSum(int n) {
        if (n == 0) {
            return 0;
        }

        System.out.println(n);
        return n + printSum(n - 1);
        // in this line return n returns the value of n to thee previous function
        //and printSum(n-1) calls the function again with n-1 until n becomes 0 
        // and then it returns 0 to the previous function and then the previous function adds n 
        // to the returned value and returns it to the previous function and 
        // so on until it reaches the main function and then it prints the sum.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number from where you want to calculate the sum: ");
        int n = sc.nextInt();
        int ans = printSum(n);
        System.out.println("Sum = " + ans);

        sc.close();
    }
}