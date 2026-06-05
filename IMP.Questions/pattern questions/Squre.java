import java.util.*;
public class Squre{
public static void main(String[]args){
    Scanner p=new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = p.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = p.nextInt();
    p.close(); 
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
}

//Approach
//1. We will take the number of rows and columns as input from the user.
//2. We will use two nested loops to print the pattern. 
//      The outer loop will run for the number of rows, and the inner loop will run for the number of columns.
//3. Inside the inner loop, we will print the star character followed by a space.
//4. After the inner loop, we will print a new line to move to the next row.