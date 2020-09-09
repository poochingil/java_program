public class sum_of1 {
    public static void main(String[]args)
    {
        int n=1293832,num1=0,num2=0,i=0,d=0;
        while(n>0) {
            d = n % 10;
            n = n / 10;

            if (i % 2 == 0) {
                num1 = num1 + d;
            } else {
                num2 = num2 + d;
            }
            i++;
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}
