import java.util.*;
public class Search {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements of your array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target element to be searched");
        int target=sc.nextInt();

        int ans=orderAgnosticBinarySearch(arr,target);
        System.out.println("Element found at index: " + ans);
        sc.close();

    }  

    public static int orderAgnosticBinarySearch(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        if(start>end){
            return -1; 
        }
        
        //find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start]<arr[end];

        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
