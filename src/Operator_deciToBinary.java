import java.util.Scanner;
public class Operator_deciToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        StringBuilder binary = new StringBuilder();

        if(num == 0){
            System.out.println("binary: 0");
        }

        while(num>0){
            int remainder = num %2;
            binary.append(remainder);
            num/=2;
        }
        System.out.println("binary:" +binary.reverse());
    }
}
