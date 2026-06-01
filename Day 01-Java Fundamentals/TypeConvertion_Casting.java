public class TypeConvertion_Casting {
    public static void main(String[] args) {
        // Type Convertion
        int a = 10;
        double b = a; // Implicit type conversion (widening)
        System.out.println("Value of b: " + b); // Output: 10.0

        // Type Casting
        double c = 9.99;
        int d = (int) c; // Explicit type casting (narrowing)
        System.out.println("Value of d: " + d); // Output: 9
    }
    
}
