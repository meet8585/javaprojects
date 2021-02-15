package ex;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class serializationxml12_4
{
    public static void main(String[] args)
    {
        student st1 = new student();
        st1.setRollno(101);
        st1.setSname("Meet");

        student st2 = new student();
        st2.setRollno(102);
        st2.setSname("redddy");

        List<student> s = new ArrayList<>();

        s.add(st1);
        s.add(st2);

        college c = new college();
        c.setStudents(s);


      // XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("mycollege.xml")));

        //catch(FileNotFoundException ex)
        {
            //Logger.getLogger(SerializeXML.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}
