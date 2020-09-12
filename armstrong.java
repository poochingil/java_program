import java.util.Scanner;

public class armstrong {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no.");
    int a = sc.nextInt();
    int original=a,remainder,number=0;
    while (a!=0)
    {
        remainder=a%10;
        number=(remainder*remainder*remainder)+number;
        a=a/10;
    }
    if(number==original)
    {
        System.out.println("armstrong no.");
    }
    else
        System.out.println("NOT AN ARMSTRONG NO.");}
}
