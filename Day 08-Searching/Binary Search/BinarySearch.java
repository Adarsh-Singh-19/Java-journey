import java.util.*;
public class BinarySearch{
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
        int ans=search(arr,target,0,size-1);
        System.out.println("Element found at index: " + ans);
        sc.close();

    }

    public static int search(int arr[], int target,int start, int end){
        if(start>end){
            return -1; 
        }
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                return search(arr,target,mid+1,end);
            }
            else{
                return search(arr,target,start,mid-1);
            }
        }
        return -1;
    }
}