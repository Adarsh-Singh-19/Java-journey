import java.util.*;
public class ChangeElement {
    public static void main(String[] args){
        System.out.print("Enter the number of rows: ");
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols= sc.nextInt();

        double[][] arr = create2DArray(rows, cols, sc);//2D array creation calling function

        System.out.print("Do you want to change an element? (yes/no): ");//asking user if they want to change an element
            String response = sc.next();
            if (response.equalsIgnoreCase("yes")) {
                changeElement(arr, sc);
            }
        else {
            System.out.println("No changes made\nyour array is:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }

    public static double[][] create2DArray(int rows, int cols, Scanner sc){
        double [][] arr= new double[rows][cols];//2D array creation
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextDouble();//input of array elements
            }
        }

        System.out.println("The elements of the array are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+"  ");//Traversing the array
            }
            System.out.println();
        }        
        return arr;
    }

    public static void changeElement(double[][] arr, Scanner sc) {
        System.out.print("Enter the row index of the element to change: ");
        int rowIndex = sc.nextInt();
        System.out.print("Enter the column index of the element to change: ");
        int colIndex = sc.nextInt();
        System.out.print("Enter the new value: ");
        double newValue = sc.nextDouble();//input of new value for the element

        if (rowIndex >= 0 && rowIndex < arr.length && colIndex >= 0 && colIndex < arr[rowIndex].length) {
            arr[rowIndex][colIndex] = newValue;//changing the element at specified indices
            System.out.println("Element updated successfully.");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid indices. No changes made.");
        }
    }
}