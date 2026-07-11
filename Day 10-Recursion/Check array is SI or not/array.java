import java.util.Scanner;
public class array {
    public static boolean check(int arr[], int n) {
        if (n == 1) {
            return true;
        }
        if (arr[n - 1] <= arr[n - 2]) {
            return false;
        }
        return check(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (check(arr, n)) {
            System.out.println("Array is strictly increasing");
        } else {
            System.out.println("Array is not strictly increasing");
        }
        sc.close();
    }
}