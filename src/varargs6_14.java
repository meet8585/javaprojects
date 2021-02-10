public class varargs6_14
{
    public static void main(String[] args) {

    Display obj = new Display();
    obj.show(5,6,7);
    }
}
class Display
{
    public void show(int ... a)
    {
        for(int i : a) {
            System.out.println(i);
        }
    }
}
