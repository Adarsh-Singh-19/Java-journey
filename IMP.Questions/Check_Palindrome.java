import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        System.out.println("\t\tWhat you want to check:");
        System.out.println("\t\tClick (1)-->Number");
        System.out.println("\t\tClick (2)-->String");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice =sc.nextInt();
        
        switch(choice){
            case 1:{
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                sc.close();
                int originalNum = num;
                int reversedNum = 0;

                while(num != 0) {
                    int digit = num % 10;// Extracting the last digit
                    reversedNum = reversedNum * 10 + digit;// Building the reversed number
                    num /= 10;// Removing the last digit
                }

                if (originalNum == reversedNum) {// Checking for palindrome
                    System.out.println(originalNum + " is a palindrome number.");
                } else {// Not a palindrome
                    System.out.println(originalNum + " is not a palindrome number.");
                }
                if(originalNum<0){// Checking for negative numbers
                    System.out.println("Negative numbers cannot be palindromes.");
                }
                break;
            }

            case 2:{
                System.out.print("Enter a string: ");
                String str = sc.next();
                sc.close();
                String originalStr = str.toLowerCase();
                String reversStr = "";
                for(int i=originalStr.length()-1;i>=0;i--){
                    reversStr+=originalStr.charAt(i);
                    
                }
                if(originalStr.equals(reversStr)){
                    System.out.println("The string is a palindrome.");
                }else{
                    System.out.println("The string is not a palindrome.");
                }
                break;
            }
        }
    }
}
