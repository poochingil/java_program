import java.util.Scanner;

public class prime_or_not {
    public static void main(String[]args)
{
    int num,i,flag=0;
    Scanner s = new Scanner(System.in)
    num = s.nextInt();
    for(i=2;i<=num/2;i++)
    {
        if(num%i==0){
            flag=1;
            break;
        }
    }
    if(num==1){
    System.out.println("niether prime nor composite");
    }else
{   if(flag!=0)
      System.out.println("composite");
    else
        System.out.println("prime");
}}}