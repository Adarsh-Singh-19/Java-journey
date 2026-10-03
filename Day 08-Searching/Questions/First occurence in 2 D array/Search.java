import java.util.Scanner;
public class Search {
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
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        sc.close();

        int [] ans= search(arr,row,col,target);

        if(ans[0]==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+ans[0]+","+ans[1]);
        }
    }

    public static int [] search (int arr[][], int row, int col, int target){
        if(arr.length==0){
            return new int[]{-1, -1};
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    
}
