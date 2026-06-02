import java.util.*;
public class MethodBasic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name: ");
        String name = sc.nextLine();
        collageid(name);
        sc.close();
    }

        public static void collageid(String name){
            System.out.println("Hello "+ name + " your ID is 12345");
    }
    }

