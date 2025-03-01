import java.lang.*;
import java.util.Scanner;
public class Operator_power {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Enter the base");
        int base = sc.nextInt();
        System.out.println("Enter the exponent");
        int exponent = sc.nextInt();
        num = Math.pow(base, exponent);
        System.out.println("power "+num);
    }
}
