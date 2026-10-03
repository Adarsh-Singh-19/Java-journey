import java.util.*;
public class LinearSearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of your array");
        int n=sc.nextInt();
        System.out.print("Enter the element of your array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element");
        int target=sc.nextInt();
        int ans=linearSearch(arr,target);
        if(ans==-1){
            System.out.print("Element not found");
        }
        else{
            System.out.print("Element found at index "+ans);
            sc.close();
        }
    }

    public static int linearSearch (int arr[], int target){
        for(int index=0;index<arr.length;index++){
            if(arr.length==0){
                return -1;
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    return i;
                }
            }
        }
            return -1;
    }
}