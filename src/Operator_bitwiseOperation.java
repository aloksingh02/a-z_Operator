import java.lang.*;
import java.util.Scanner;
public class Operator_bitwiseOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = sc.nextInt();
        System.out.println("Enter the num2");
        int b = sc.nextInt();

        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(a^b);
        System.out.println(~b);
        System.out.println(~a);
        System.out.println(a<<1);
        System.out.println(b<<1);
        System.out.println(a>>1);
        System.out.println(b>>1);
    }
}
