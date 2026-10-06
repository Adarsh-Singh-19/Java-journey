//import java.util.*;
public class Floor{
    public static void main(String[]args){
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the size of the array: ");
        //int n = sc.nextInt();

        //int arr[] = new int[n];
        //System.out.println("Enter the elements of the array:");
        //for(int i = 0; i < n; i++){
            //arr[i] = sc.nextInt();
        //}

        //System.out.print("Enter the number to find the ceiling of: ");
        //int target = sc.nextInt();
        //sc.close();
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target,0, arr.length - 1);
        System.out.println("The ceiling of the number is: " + ans);
    }
    
    static int ceiling (int arr[], int target, int start, int end){
        
        if(target < arr[0]){
            return -1; // Ceiling does not exist
        }
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end]; // Return the floor value if not found
    }
}