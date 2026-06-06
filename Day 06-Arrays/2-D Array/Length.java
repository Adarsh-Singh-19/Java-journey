import java.util.*;
public class Length{
    public static void main(String[] args){
        System.out.print("Enter the number of rows: ");
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols= sc.nextInt();
        create2DArray(rows,cols,sc);//2D array creation calling function
        
    }

    public static void create2DArray(int rows, int cols, Scanner sc){
        double [][] arr= new double[rows][cols];//2D array creation
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextDouble();
            }
        }
        sc.close();
        System.out.println("The elements of the array are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } 
        System.out.println("Rows: " + arr.length);
        System.out.println("Columns: " + arr[0].length);
        System.out.println("Total Elements: " + (arr.length * arr[0].length));     
    }
}