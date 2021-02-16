package annotation15_8;

public class singletonclass
{
    public static void main(String[] args)
    {
        A1 obj = A1.getInstance();
        A1 obj1 = A1.getInstance();



    }
}

class A1 //creating the singleton class
{
    public static A1 obj = new A1(); // eager
    private A1()
    {

    }
    public static A1 getInstance()
    {
        return obj;

    }
}