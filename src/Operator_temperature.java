import java.lang.*;
import java.util.Scanner;
public class Operator_temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the celsius");
        int celsius = sc.nextInt();

        int isFahrenheit = (celsius * 9/5) +32;
        System.out.println("Fahreneheit: "+isFahrenheit);
    }
}
