import java.util.*;
public class Selection{
    public static void sort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int si=i;   // start index of the unsorted part of arr.
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[si]){
                    si=j;
                }
            }
            swap(arr,si,i);     // swap the smallest element with the first element of the unsorted part of arr.
        }

    }

    public static void swap(int[] arr, int si, int i){
        int temp=arr[si];
        arr[si]=arr[i];
        arr[i]=temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr,n);
        System.out.println("The sorted array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}