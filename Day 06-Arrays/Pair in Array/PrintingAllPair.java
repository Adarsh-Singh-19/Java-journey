//Printing all the pair of an Array

import java.util.*;
public class PrintingAllPair {
    public static void main(String[] args) {
        System.out.println("Enter the size of your array");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("Enter your Element array");
        int [] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        traverse(arr,size);

        System.out.println("Do you want pair of it:");
        System.out.println("yes-->");
        System.out.println("NO-->");
        String ch=sc.next();
        if(ch.equalsIgnoreCase("yes")){
            pair(arr,size);

        }
        sc.close();
    }

    public static void traverse(int arr[],int size) {
        System.out.println("Your array is:");
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    public static void pair(int arr[],int size){
        System.out.println("your all apir is-->");
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                System.out.println("["+arr[i]+","+arr[j]+"]");
            }
        }
    }
    
}
