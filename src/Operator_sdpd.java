import java.lang.*;
import java.util.Scanner;
public class Operator_sdpd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();


        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1*num2;
        double division = num1 / num2;

        System.out.println("sum "+sum);
        System.out.println("difference "+difference);
        System.out.println("product "+product);
        System.out.println("division "+division);
    }
}
