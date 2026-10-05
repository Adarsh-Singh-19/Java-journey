// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

//import java.util.*;
public class Solution {
    public static void main(String [] args){
        /* 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of your array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        */
        int arr[]={12,345,2,6,7896};

        int ans=findNumbers(arr);
        System.out.println("Count of numbers with even number of digits: " + ans);
        //sc.close();
    }

    public static int findNumbers(int arr[]){
        int count=0;
        for(int i=0;i<arr.length; i++){
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean even (int nums){
        int numOfDigits=digit(nums);
        if(numOfDigits %2==0){
            return true;
        }
        return false;
    }

    public static int digit(int nums){
        int count=0;

        if(nums <0){
            nums=nums*-1;
        }
        
        if(nums==0){
            return 1;
        }

        while (nums>0) {
            count++;
            nums=nums/10;
        }
        return count;
    }
}
