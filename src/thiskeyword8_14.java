public class thiskeyword8_14
{
    public static void main(String[] args)
    {
        keyThis obj = new keyThis(6);
        obj.show();

    }
}
class keyThis
{
    private int x; // Instance variable
    public keyThis(int x) //local
    {
        this.x=x; //current instance
    }
    public void show()
    {
        System.out.println("X is " +x);
    }
}
