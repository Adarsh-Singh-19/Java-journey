import java.util.*;

public class Maxsubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        maxSubarray(arr, size);

        sc.close();
    }

    public static void maxSubarray(int[] arr, int size) {
        int maxSum = Integer.MIN_VALUE;

        for(int start = 0; start < size; start++) {
            for(int end = start; end < size; end++) {

                int currentSum = 0;

                for(int k = start; k <= end; k++) {
                    currentSum += arr[k];//calculate the sum of every subarray
                }

                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}