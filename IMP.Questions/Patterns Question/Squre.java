import java.util.*;
public class Squre{
public static void main(String[]args){
    Scanner p=new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = p.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = p.nextInt(); 
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
}