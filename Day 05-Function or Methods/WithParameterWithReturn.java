import java.util.*;
public class WithParameterWithReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        String greeting = greet(name); // Example usage with a parameter
        System.out.println(greeting);   
        sc.close();
    }

    // Function with parameters and with return type
    public static String greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
        String massage = "Okey its Running";  
        return massage;
    }
}