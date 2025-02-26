import java.lang.*;
import java.util.Scanner;

public class Operator_cuboid {
    public static void main(String[] args) {

        int length, breadth, height, totalarea, volume;
        System.out.println("enter 3d");
        Scanner sc = new Scanner(System.in);

        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        volume = length * breadth * height;
        totalarea = (2*(length*breadth)+(breadth*height)+(height*length));

        System.out.println("answer is "+volume+" "+totalarea);

    }
}
