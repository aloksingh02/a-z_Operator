import java.lang.*;
import java.util.Scanner;
public class Operator_remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int remainder;
        System.out.println("enter the dividend");
        int dividend = sc.nextInt();
        System.out.println("enter the divisor");
        int divisor = sc.nextInt();

        remainder = dividend % divisor;

        System.out.println("Remainder "+remainder);
    }
}
