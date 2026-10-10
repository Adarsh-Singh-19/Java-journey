//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

//import java.util.*;
class Solution {
    public static void main(String[] args) {
        
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the size of the array: ");
        //int n = sc.nextInt();
        //char[] letters = new char[n];
        //System.out.println("Enter the elements of the array:");
        //for(int i = 0; i < n; i++){
            //letters[i] = sc.next().charAt(0);
        //}

    char[] letters = {'c', 'f', 'j'};
    char target = 'a';

    char ans= nextGreatestLetter(letters, target,0, letters.length - 1);
    System.out.println("The smallest letter greater than the target is: " + ans);

    }
    static char nextGreatestLetter(char[] letters, char target, int start, int end) {
        
        if(target>letters[letters.length-1]){
            return letters[0];
        }

        while(end>=start){
            int mid = start + (end - start) / 2;
            if(target<letters[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}