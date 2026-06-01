import java.util.Scanner;
public class Brake{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("You entered: " + num);
        sc.close();
        for(int i=1;i<=num;i++){
            if(i==5){
                break; // this will exit the loop when i is 5
            }
            System.out.print(i + " ");
        }
    }
}