package ex;
public class exceptionhandle10_2
{
    public static void main(String[] args)
    {
        int i,j, k = 0;

        int a[] = new int [4];

        i= 8;
        j = 2;

        //System.out.println(k);

        try
        {
            k = i/j;

            for (int c = 0; c<4; c++)
            {
                a[c] = c+1;
            }
            for (int value : a)
            {
                System.out.println(value);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Maximum number of value is 4");
        }
        catch(Exception e)
        {
            System.out.println("Unknown Exception");
        }
        System.out.println(k);

    }
}
