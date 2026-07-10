import java.util.*;

public class Occurance {
    public static int first = -1;
    public static int last = -1;

    public static void find_Occurance(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println("First Occurrence of " + element + " is at index " + first);
            System.out.println("Last Occurrence of " + element + " is at index " + last);
            return;
        }

        char current = str.charAt(index);
        if (current == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        find_Occurance(str, index + 1, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to find: ");
        char element = sc.next().charAt(0);
        //This line sc.next().charAt(0) is used to read a single character from the user input. 
        //It reads the next token (word) from the input and then takes the first character of that token.

        find_Occurance(str, 0, element);

        sc.close();
    }
}