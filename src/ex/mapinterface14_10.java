package ex;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class mapinterface14_10
{
    public static void main(String[] args)
    {
      // Map <String, String> map = new HashMap<>();
        Map <String, String> map = new Hashtable<>();
        map.put("My name","Meetlkumar");
        map.put("ACTOR" , "Jphn");
        map.put("ceo", "Patel");
        Set<String> keys = map.keySet();

        for(String key : keys)
        {
            System.out.println(key + " " + map.get(key));
        }
    }
}
