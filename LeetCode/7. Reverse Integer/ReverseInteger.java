import java.util.*;
class Solution {
    public int reverse(int x) {
        int temp = 0;

        while (x != 0) {
            int digit = x % 10;

            if (temp > Integer.MAX_VALUE / 10 ||
                (temp == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (temp < Integer.MIN_VALUE / 10 ||
                (temp == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            temp = temp * 10 + digit;
            x = x / 10;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Solution obj = new Solution();
        int rev = obj.reverse(number);

        System.out.println("Reversed number: " + rev);
        sc.close();
    }
}