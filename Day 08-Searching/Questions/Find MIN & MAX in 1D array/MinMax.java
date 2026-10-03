import java.util.Scanner;
public class MinMax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int n=sc.nextInt();
        System.out.println("Enter the element of your array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans1=findMin(arr);
        System.out.println("Minimum element in the array is "+ans1);
        int ans2=findMax(arr);
        System.out.println("Maximum element in the array is "+ans2);
        sc.close();
    }

    public static int findMin(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int findMax(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

