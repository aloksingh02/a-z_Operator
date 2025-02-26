//import java.lang.*;
//import java.util.Scanner;
//public class Operator_triarea {
//    public static void main(String[] args) {
//
//        float area, height, base;
//        System.out.println("enter the base and height");
//
//        Scanner sc = new Scanner(System.in);
//        base = sc.nextFloat();
//        height= sc.nextFloat();
//
//        area = height*base/2;
//        System.out.println("Area of triangle is " +area);
//    }
//}

//import java.lang.*;
//import java.util.Scanner;
//
//public class Operator_triarea {
//    public static void main(String[] args) {
//        float area, s,a,b,c;
//        System.out.println("Enter 3 side ");
//
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextFloat();
//        b = sc.nextFloat();
//        c = sc.nextFloat();
//
//        s=(a+b+c)/2f;  //2f because it return float value other way is (float)(a+b+c)/2
//         area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
//        System.out.println("Area is "+area);
//    }
//}


import java.lang.*;
import java.util.Scanner;

public class Operator_triarea {
    public static void main(String[] args) {
        float a,b,c,s,area;
        System.out.println("Enter 3 number");

        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        s = (a+b+c)/2f;
        area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area is" +area);
    }
}

//import java.lang.*;
//import java.util.Scanner;
//public class Operator_triarea {
//    public static void main(String[] args) {
//
//        float area, height, base;
//        System.out.println("Enter height and base");
//
//        Scanner sc = new Scanner(System.in);
//        base = sc.nextFloat();
//        height = sc.nextFloat();
//
//        area = height*base/2f;
//        System.out.println("areea is "+area);
//    }
//}
