package annotation15_8;

@interface  smartPhone
{
    String OS();
    int version();
    //multi value annotation
    //if no value then marker annotation
    ///if single then single value annotation
}

public class annotations18_8
{
    public static void main(String[] args)
    {
        A obj = new B();
        obj.show();

    }
}
class A
{
    public void show()
    {

    }

}
class B extends  A
{
    @Override
   public void show()
   {

   }
}
@smartPhone(OS = "Meet", version = 2)
        class NokiaAseries
{
    String model;
    int size;

    public NokiaAseries(String model, int size)
    {
        this.model = model;
        this.size = size;

    }
}

