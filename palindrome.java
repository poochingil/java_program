import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int a = sc.nextInt();
        int reverse = 0,remainder,original=a;
        while (a != 0) {
            remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a=a/10;
        }
        if (original == reverse) {
            System.out.println("palindrome");
        } else
            System.out.println("not a palindrome");
    }
}
