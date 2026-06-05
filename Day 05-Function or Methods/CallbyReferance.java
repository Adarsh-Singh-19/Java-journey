import java.util.*;
public class CallbyReferance{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before calling the function: " + Arrays.toString(numbers));
        modifyArray(numbers);
        System.out.println("After calling the function: " + Arrays.toString(numbers));
    }

    // Function to modify the array
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2; // This will affect the original array 'numbers' in main
        }
    }
}