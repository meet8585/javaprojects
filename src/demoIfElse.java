public class demoIfElse
{
    public static void main(String[] args)
    {
        //even or odd
        int num1 = 8;

        if (num1%2 == 0)
        {
            System.out.println("EVEN");
        }
        else
            {
                System.out.println("ODD");
            }

        int a, b, c;
        a = 4;
        b = 14;
        c = 8;

        if(a>b && a>c)
        {
            System.out.println("A");
        }
        else if(b >c)
        {
            System.out.println("B");
        }
        else
            {
                System.out.println("C");
            }


    }
}
