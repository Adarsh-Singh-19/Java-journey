import java.util.*;
public class Fabonacci {
    
    public static void faboo(int a, int b, int n){
        if(n==0){
            return;
        }
        int i=a+b;
        System.out.println(i);
        faboo(b, i, n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number till you want to print fabonacci series");
        int n = sc.nextInt();
        if (n >= 1) {
            System.out.println(0);
        }

        if (n >= 2) {
            System.out.println(1);
            faboo(0, 1, n - 2);
        }
        sc.close();
    }
}