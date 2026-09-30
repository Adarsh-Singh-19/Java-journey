import java.util.*;
public class Insertion {
    public static void sort(int[] arr, int n){
        for(int i=1;i<n;i++){
            int current = arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>current){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;
        }
        System.out.println("The sorted array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr,n);
        sc.close();
    }
}