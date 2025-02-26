import java.lang.*;
import java.util.Scanner;
public class inc {
    public static void main(String[] args) {
        int a =5;
        int b = 7;
        int c = (8 * a++ + ++b + b++);
        System.out.println(c);
    }
}
