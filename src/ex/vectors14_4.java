package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class vectors14_4
{
    public static void main(String[] args)
    {
//        Vector <Integer> v = new Vector<>();
//        v.add(4);
//        v.add(6);
//        v.add(823);
//        v.add(856);
//        v.add(66);
//
//        System.out.println("the capacity is: " + v.capacity());

        ArrayList v = new ArrayList();

        v.add(633);
        v.add(456);
        v.add(986);
        v.add(789);
        v.add(456);

        Collections.sort(v);
        Collections.reverse(v);




        for (Object i : v)
        {
            System.out.println(i);
        }









       // System.out.println(v.capacity());


    }
}
