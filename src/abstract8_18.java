//abstract class and methods
public class abstract8_18
{
    public static void main(String[] args)
    {
        MaheshPhone obj = new SureshPhone(); //cannot instantiate abstact class
        obj.call();
        obj.cook();
        obj.dance();
        obj.move();

    }
}

abstract class MaheshPhone //abstract class
{
    public void call()
    {
        System.out.println("Calling");
    }
    public abstract void move();   //abstract method
    public abstract void dance();
    public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone //abstract class
{
    public void move()
    {
        System.out.println("Moving");
    }
}
class SureshPhone extends RameshPhone //concrete class
{
    public void dance()
    {
        System.out.println("Dancing");
    }
    public void cook()
    {
        System.out.println("Cooking");
    }
}