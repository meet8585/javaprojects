public class constructor7_5
{
    public static void main(String[] args)
    {
        Abc obj = new Abc();   //constructor
    }
}
class Abc
{
    public Abc() //constructor overloading
    {
        System.out.println("In abc");
    }
    public Abc(int i)
    {
        System.out.println(" In abc Const para");
    }
}