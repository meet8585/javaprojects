public class perfectnumber5_15 {
    public static void main(String[] args)
    {
        int n =28;
        boolean b = isPerfect(n);
        if(b)

            System.out.println("Its perfect number");
        else
            System.out.println("Its not");


    }
    public static boolean isPerfect (int n)
    {
        int sum =0;
        for (int i =1; i<n; i++)
        {
            if (n%i ==0)
                sum = sum+i;

        }
        if(n==sum)
            return true;
        return false;
    }
}
