public class polymorhismoverloading8_8
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show(5.5);

    }
}
class A  //method overloading, early binding, static binding, compile time polymorhism
{
    public void show()
    {
        System.out.println("Hello");
    }
    public void show(int i)
    {
        System.out.println("Hello" + i);
    }
    public void show (double d)
    {
        System.out.println("Hello double");
    }
}
