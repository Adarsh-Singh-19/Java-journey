import java.util.*;
public class Bubble{

    public static void bubbleshort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array's element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleshort(arr);
    }
}