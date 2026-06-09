import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        System.out.println("Enter your size of array:");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        subarray(arr, size);// calling subarray method
        sc.close();
    }

    public static void subarray(int arr[], int size) {
        System.out.println("Your subarrays are:");

        for (int start = 0; start < size; start++) { // starting point of the subarray
            for (int end = start; end < size; end++) {// ending point of the subarray

                System.out.print("[ ");

                for (int k = start; k <= end; k++) {//subarray
                    System.out.print(arr[k] + " ");
                }

                System.out.println("]");
            }
        }
    }
}