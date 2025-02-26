import java.lang.*;
import java.util.Scanner;
public class Operator_incdec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2");
        int num2 = sc.nextInt();

        num1 = num1++;
        num2 = num2--;
        System.out.println("increment= "+num1);
        System.out.println("decrement= "+num2);
    }
}
