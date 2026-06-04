import java.util.*;
    public class CALCULATOR{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("\t\tWhat you want to do:");
            System.out.println("\t\tClick (1)-->Addition");
            System.out.println("\t\tClick (2)-->Subtraction");
            System.out.println("\t\tClick (3)-->Multiplication");
            System.out.println("\t\tClick (4)-->Division");
            System.out.println("\t\tClick (5)-->Modulus");
            System.out.print("Enter your choice: ");
            int choice =sc.nextInt();
            
            switch(choice){
                case 1:{
                    System.out.println("Enter 1st number");
                    double a=sc.nextDouble();
                    System.out.println("Enter 2nd number");
                    double b=sc.nextDouble();
                    double result = add(a, b);
                    System.out.println("Result: " + result);
                    break;
                }
                case 2:{
                    System.out.println("Enter 1st number");
                    double a=sc.nextDouble();
                    System.out.println("Enter 2nd number");
                    double b=sc.nextDouble();
                    double result = subtract(a, b);
                    System.out.println("Result: " + result);
                    break;
                }
                case 3:{
                    System.out.println("Enter 1st number");
                    double a=sc.nextDouble();
                    System.out.println("Enter 2nd number");
                    double b=sc.nextDouble();
                    double result = multiply(a, b);
                    System.out.println("Result: " + result);
                    break;
                }
                case 4:{
                    System.out.println("Enter 1st number");
                    double a=sc.nextDouble();
                    System.out.println("Enter 2nd number");
                    double b=sc.nextDouble();
                    double result = divide(a, b);
                    System.out.println("Result: " + result);
                    break;
                }
                case 5:{
                    System.out.println("Enter 1st number");
                    double a=sc.nextDouble();
                    System.out.println("Enter 2nd number");
                    double b=sc.nextDouble();
                    double result = modulus(a, b);
                    System.out.println("Result: " + result);
                    break;
                }
                default:{
                    System.out.println("Invalid choice. Please select a valid operation.");
                }
            }
            sc.close();
        }

        public static double add(double a, double b) {
            return a + b;
        }

        public static double subtract(double a, double b) {
            return a - b;
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return 0;
            }
        }

        public static double modulus(double a, double b) {
            if (b != 0) {
                return a % b;
            } else {
                System.out.println("Error: Modulus by zero is not allowed.");
                return 0;
            }
        }
    }