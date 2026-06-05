import java.util.*;
public class WithoutParameterWithReturn {
    public static void main(String[] args) {
        String greeting = greet();
        System.out.println(greeting);
    }

    // Function without parameters and with return type
    public static String greet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        sc.close();
        String massage = "Hello, " + name + "! Welcome to Java programming.";
        return massage;
    }
}