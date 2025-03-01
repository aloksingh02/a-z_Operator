import java.lang.*;
import java.util.Scanner;
public class Operator_circleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();

        double area = Math.PI*Math.pow(radius, 2);
        System.out.println("area of circle is: "+area);
    }
}
