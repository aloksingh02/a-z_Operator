import java.lang.*;
import java.util.Scanner;
public class Operator_absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        num = Math.abs(num);
        System.out.println("absolute value is: "+num);
    }
}
