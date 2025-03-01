import java.lang.*;
import java.util.Scanner;
public class Operator_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("It is prime number");
        }
        else{
            System.out.println("It is not prime number");
        }
    }
}
