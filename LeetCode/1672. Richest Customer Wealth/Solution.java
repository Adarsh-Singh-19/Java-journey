//https://leetcode.com/problems/richest-customer-wealth/

// import java.util.*;
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
        int accounts[][]={{1,2,3},{3,2,1}};
        int ans= maximumWealth(accounts);
        System.out.println("Maximum wealth: " + ans);
        //sc.close();
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
        
    }
}
