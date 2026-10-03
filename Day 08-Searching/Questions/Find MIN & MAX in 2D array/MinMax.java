import java.util.Scanner;
public class MinMax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows of your 2D array");
        int row=sc.nextInt();
        System.out.println("Enter the columns of your 2D array");
        int col=sc.nextInt();
        System.out.println("Enter the elements of your 2D array");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ans1=findMin(arr,row,col);
        System.out.println("Minimum element in the array is "+ans1);

        int ans2=findMax(arr,row,col);
        System.out.println("Maximum element in the array is "+ans2);
        sc.close();
    }
    public static int findMin (int arr[][], int row, int col){
        int min=arr[0][0];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
    public static int findMax (int arr[][], int row, int col){
        int max=arr[0][0];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}

