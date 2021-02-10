public class ternary
{
    public static void main(String[] args)
    {
        int i = 1;
        int j = 5;

      //  if (i == 1)
        //    j =6;
       // else
        //    j = 7;

        //ternary operator
        j =  i ==1? 6 : 7; //if i = 1 ? j = 6 if i != 1 then print 7
        System.out.println(j);

        Object obj1;
        Object obj2;

        if(true)
        {
            obj1 = new Integer (10);

        }
        else
            {
                obj1 = new Double (15.0);

            }

        System.out.println(obj1);

        obj2 = true? new Integer (10) : new Double (15.0);
        System.out.println(obj2);
    }
}
//THIS DID NOT WORK NOT SURE WHAT WAS THE PROBLEM
//But the main purpose was to learn ternary here in the last
//lines of code it will take the biggest data type and convert it to the same
// so the interger will become double
