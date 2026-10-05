import java.util.*;
public class HeapSort {

}

public static void heapify(int[] arr, int n, int i) {
   
}
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    
    System.out.println("Original array:");
    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    sc.close();
}