import java.util.Scanner;
public class Operator_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int originalNum = num;
        int rev = 0;

        while(num!=0){
            int digit = num%10;
            rev = rev*10+digit;
            num/=10;
        }
        if(originalNum == rev){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
