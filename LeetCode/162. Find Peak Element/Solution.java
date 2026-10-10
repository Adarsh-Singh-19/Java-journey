//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

//import java.util.*;
class Solution {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the size of the array: ");
        //int n = sc.nextInt();
        //int[] arr = new int [n];
        //System.out.println("Enter the elements of the array:");
        //for(int i = 0; i < n; i++){
            //arr[i] = sc.nextInt();
        //}

        int[]arr={0,1,0};
        int ans=peakIndexInMountainArray(arr);
        System.out.println("Peak element is present at index: " + ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        if (start>end){
            return -1;
        }
        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]<arr[mid+1]){
                //in incresing part of array
                
                 start=mid+1;
            }
            else {
                //in decresing part of array

                end=mid;
            }
        }
    return start;
    }    
}