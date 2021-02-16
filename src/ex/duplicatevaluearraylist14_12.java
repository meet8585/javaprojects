package ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class duplicatevaluearraylist14_12
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Meet");
        names.add("nAVIN");
        names.add("mangesh");

        Set<String> s = new HashSet<>();


        for(String name : names)
        {
            if(s.add(name) == false)
            System.out.println(name);
        }

    }
}
