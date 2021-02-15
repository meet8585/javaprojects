public class method_overiding8_9
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();


    }
}
class Abs //method overriding, late bnding, dynamic binding, runtime poly morphism
{
    public void show()
    {
        System.out.println("Hello Abs");
    }
}
class B extends Abs
{
    public void show()

    {
        System.out.println("Hello B");
    }
}