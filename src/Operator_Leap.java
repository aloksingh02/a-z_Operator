import java.lang.*;
import java.util.Scanner;
public class Operator_Leap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year= sc.nextInt();

        boolean isLeap = (year%4==0 && year%100!=0) || (year%400 == 0);

        if(isLeap){
            System.out.println("it is leap year");
        }
        else{
            System.out.println("it is not leap year");
        }
    }
}
