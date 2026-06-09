import java.util.*;
public class Create {
    public static void main(String[]args){
        System.out.print("Enter the size of the array: ");
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        createArray(size,sc);//1D array creation calling function
    }
    
    public static void createArray(int size, Scanner sc){
        double [] arr= new double[size];//1D array creation
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
        arr[i]=sc.nextDouble();//input of array elements
        }
        sc.close();
        System.out.println("The elements of the array are:");//Traversing the array
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }        
    }
}