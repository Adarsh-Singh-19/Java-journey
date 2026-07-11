import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your Array is :");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"  ");
        }

        int ans = linearSearch(arr, size, sc);
        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }

    public static int linearSearch(int[] arr, int size, Scanner sc) {
        System.out.print("What do you want to search? ");
        int choice = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == choice) {
                return i;
            }
        }
        return -1;
    }
}