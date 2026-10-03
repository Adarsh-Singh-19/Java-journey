import java.util.Scanner;
public class SearchString{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string");
        String str=sc.nextLine();
        System.out.print("Enter the target character");
        char target=sc.next().charAt(0);

        int ans=searchString(str,target);
        if(ans==-1){
            System.out.print("Character not found");
        }
        else{
            System.out.print("Character found at index "+ans);
        }
    }

    public static int searchString(String str, char target){
        if(str.length()==0){
            return -1;
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}