import java.lang.*;
import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1");
        int a = sc.nextInt();
        System.out.println("enter the num2");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping the number ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);

    }
}
