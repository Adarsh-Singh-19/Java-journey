import java.util.*;
public class Star_Pattern{
    public static void main(String[]args){
        Scanner p=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = p.nextInt();
        p.close(); 
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}