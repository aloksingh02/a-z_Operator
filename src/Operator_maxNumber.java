import java.lang.*;
import java.util.Scanner;
public class Operator_maxNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float max;
        System.out.println("enter num1");
        float num1 = sc.nextFloat();
        System.out.println("enter num2");
        float num2 = sc.nextFloat();

        max = (num1>num2) ? num1:num2;
        System.out.println("max "+max);
    }
}
