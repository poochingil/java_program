public class sum_digits {public static void main(String[]args)
{
    int num = 2123, sum = 0, a=0;
    while(num>0)
    {
        sum=num%10;
        num=num/10;
        a=sum+a;
    }
    System.out.println(a);
}
}
