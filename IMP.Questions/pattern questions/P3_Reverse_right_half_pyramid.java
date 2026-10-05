public class P3_Reverse_right_half_pyramid{
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Approach
//1. We will take the number of rows as input from the user.
//2. We will use two nested loops to print the pattern. 
//      The outer loop will run for the number of rows, and the inner loop will run from 0 to the current row number (i).
//3. Inside the inner loop, we will print the star character followed by a space.
//4. After the inner loop, we will print a new line to move to the next row.
