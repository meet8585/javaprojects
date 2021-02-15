package ex;

import java.lang.reflect.Array;
import java.util.*;

public class colectionngenerics14_2
{
    public static void main(String[] args)
    {
       // int values[] = new int [4];
       // Object values1[] = new Object[4];
       // values1[0] = "Navin";
        //values[1] = 7;


        //Collection<Integer> values = new ArrayList<>();
        List<Integer> values = new ArrayList<>(); //you can add using index number

        values.add(4);
       // values.add("Meet");
       // values.add(9.0);
        values.add(939393);
        values.add(1, 909);

        Collections.sort(values);//this works only with list

        values.forEach(System.out::println); //other way of printing this

//        for (Object i : values)
//        {
//            System.out.println(i);
//        }

       // Iterator i = values.iterator();

       // while(i.hasNext())
       // {
       //     System.out.println(i.next());
       // }

    }
}
