package ex;

public class userdefinedexcep10_8
{
    public static void main(String[] args)
    {
        int i =5;
        if(i < 10)
        try
        {
            throw new MyException("Erorrr");


        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class MyException extends Exception
{
    public MyException(String msg)
    {
        super(msg);
    }
}