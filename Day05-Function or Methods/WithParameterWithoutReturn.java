import java.util.*;
public class WithParameterWithoutReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        greet(name); // Example usage with a parameter
        sc.close();
    }

    // Function with parameters and without return type
    public static void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }
}