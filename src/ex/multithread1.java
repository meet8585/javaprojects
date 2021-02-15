package ex;

import java.sql.SQLOutput;
import java.util.logging.Level;
import java.util.logging.Logger;

public class multithread1
{
    public static void main(String[] args)
    {
        M obj = new M();
        obj.start();



        N obj1 = new N();
        obj1.start();
    }
}
class M extends Thread
{
    public void show()

    {
        for(int i=1; i<=5;i++)
        {
            System.out.println("HI");
            try {

                Thread.sleep(1000);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(M.class.getName()) .log(Level.SEVERE, null, ex);
            }
            }
    }
    public void run()
    {
         show();
    }
}

class H
{
    public void demo()
    {

    }
}
class N extends Thread
{
    public void show()

    {
        for(int i=1; i<=5;i++)
        {
            System.out.println("Hello");
            try {

                Thread.sleep(1000);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(M.class.getName()) .log(Level.SEVERE, null, ex);
            }
        }
    }
    public void run()
    {
        show();
    }
}