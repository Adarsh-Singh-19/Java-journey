// we are going to find the power of a number using recursion X^n
import java.util.*;
public class Power{
    public static int power(int n, int x){
        if(n==0){
            return 1;
        }
        int p=x;
        p*=power(n-1,x);
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int x=sc.nextInt();
        System.out.println("Enter the power");
        int n=sc.nextInt();
        int ans=power(n,x);
        System.out.println(ans);
        sc.close();
    }
}