public class abstractcontd8_18
{
    public static void main(String[] args)
    {
        Iphone obj = new Iphone();
        samsung objs = new samsung();
        show(objs);
    }
    public static void show(phone obj)
    {
        obj.showConfig();
    }

}

abstract class phone
{
    public abstract void showConfig();
}
class Iphone extends phone
{
    public void showConfig()
    {
        System.out.println("2 gb 105 9.3");
    }
}
class samsung extends phone
{
    public void showConfig()
    {
        System.out.println("2 gvb 100r 9.8, lolipop");
    }
}