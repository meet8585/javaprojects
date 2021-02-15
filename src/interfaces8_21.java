
interface abc
{
     void show();
}
interface pqr
{
    void xyz();
}
class abcImplement implements abc
{
    public void show()
    {
        System.out.println("In show");
    }
}

public class interfaces8_21
{
    public static void main(String[] args)
    {
        abc obj = new abcImplement();
        obj.show();


    }
}
