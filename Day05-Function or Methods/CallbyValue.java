public class CallbyValue {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before calling the function: " + num);
        modifyValue(num);
        System.out.println("After calling the function: " + num);
    }

    // Function to modify the value of the parameter
    public static void modifyValue(int value) {
        value = value * 2; // This will not affect the original variable 'num' in main
        System.out.println("Inside the function, modified value: " + value);
    }
}