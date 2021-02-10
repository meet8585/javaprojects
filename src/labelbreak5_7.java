public class labelbreak5_7
{
    public static void main(String[] args)
    {
        // break outer loop by labeling it
        meet:
        for (int i=1; i<=4; i++)
        {
            for (int j=1; j<=4; j++)
            {
                if(i==3)
                    break meet; //this will break inner loop
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
