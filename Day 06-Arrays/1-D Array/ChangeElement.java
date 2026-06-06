import java.util.*;

public class ChangeElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        double[] arr = createArray(size, sc);

        System.out.println("\nDo you want to change an element in the array?");
        System.out.print("Enter 'yes' to change an element or 'no' to exit: ");

        String response = sc.next();

        if (response.equalsIgnoreCase("yes")) {

            changeElement(arr, sc);

            System.out.println("\nUpdated Array:");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        } else {

            System.out.println("\nNo changes made.");
            System.out.println("Array:");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }

    public static double[] createArray(int size, Scanner sc) {

        double[] arr = new double[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println("\nArray Elements:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        return arr;
    }

    public static void changeElement(double[] arr, Scanner sc) {

        System.out.print("\n\nEnter the index of the element you want to change: ");
        int index = sc.nextInt();

        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid Index!");
            return;
        }

        System.out.print("Enter the new value: ");
        double newValue = sc.nextDouble();

        arr[index] = newValue;
    }
}