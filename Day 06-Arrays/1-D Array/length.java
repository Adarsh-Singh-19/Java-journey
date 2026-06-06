import java.util.Scanner;
public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        double[] arr = new double[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }
        sc.close();
        System.out.println("The length of the array is: " + arr.length);
    }
}