import java.lang.*;
import java.util.Scanner;
public class vowelConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().toLowerCase().charAt(0);

        if(!Character.isLetter(ch)){
            System.out.println("Enter the valid alphabet");
        }
        else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch +"is a vowel");
        }
        else{
            System.out.println("it is consonant");
        }
    }
}
