import java.util.*;
public class Merge {
    public static void sort(int[] arr) {
        // Base case
        if (arr.length <= 1) {
            return;
        }

        // Find middle
        int mid = arr.length / 2;

        // Create left and right arrays
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copy elements into left array
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        // Copy elements into right array
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort both halves
        sort(left);
        sort(right);

        // Merge both sorted arrays
        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {

        int i = 0;  // left array pointer
        int j = 0;  // right array pointer
        int k = 0;  // original array pointer

        // Compare elements from both arrays
        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from left
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements from right
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);

        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}