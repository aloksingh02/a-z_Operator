//import java.lang.*;
//import java.util.Scanner;
//
//public class Operator_quadequation {
//    public static void main(String[] args) {
//        int a,b,c;
//        double r1,r2;
//        System.out.println("Enter 3 side");
//
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//
//        r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
//        r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
//
//        System.out.println("area is "+ r1 +" " +r2);
//    }
//}




import java.lang.*;
import java.util.Scanner;
public class Operator_quadequation {
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2;
        System.out.println("enter 3 side");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double sqrt = Math.sqrt(b * b - 4 * a * c);
        r1 = (-b+ sqrt)/(2*a);
        r2 = (-b- sqrt)/(2*a);
        System.out.println("area is"+ r1+" "+r2);
    }
}

