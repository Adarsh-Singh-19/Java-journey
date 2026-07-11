import java.util.Scanner;

public class Char {

    public static void move(String str, char ch, int index, int count, String newstr) {

        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr += ch;
            }

            System.out.println("The new string is: " + newstr);
            return;
        }

        char currentChar = str.charAt(index);

        if (currentChar == ch) {
            count++;
        } else {
            newstr += currentChar;
        }

        move(str, ch, index + 1, count, newstr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character which you want to move at the end: ");
        char ch = sc.next().charAt(0);

        move(str, ch, 0, 0, "");

        sc.close();
    }
}