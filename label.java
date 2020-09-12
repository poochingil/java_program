public class label {
    public static void main(String[] args)
    {
        first:
            for(int i=0;i<10;i++)
            {
                inner:
                    for(int j=0;j<5;j++)
                    {
                        System.out.println("jai");
                        break first;
                    }
                    System.out.println("YO");
            }
    }
}
