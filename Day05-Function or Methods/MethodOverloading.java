public class MethodOverloading {
    // Method with two integer parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(5, 10));
        System.out.println("Sum of three integers: " + add(5, 10, 15));
        System.out.println("Sum of two doubles: " + add(5.5, 10.5));
    }
}