import java.util.*;

//math.lang packkage is belongs to java.lang package and it is automatically imported in every java program.
//  It contains the pow() method which is used to calculate the power of a number.

public class PowerofNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        scanner.close();
    }
    
}
