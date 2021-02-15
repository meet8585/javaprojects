package ex;

public class cloningobject11_2
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        clo obj = new clo();
        obj.i = 5;
        obj.j = 6;

        clo obj1 = (clo) obj.clone();
        obj1.i =8;

        //obj1.i = obj.i;
       // obj1.j = obj.j;

        System.out.println(obj1);
        System.out.println(obj);

    }
}
class clo implements Cloneable
{
    int i ;
    int j;

    @Override
    public String toString() {
        return "clo{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
    public Object clone() throws CloneNotSupportedException

    {
        return super.clone();
    }
}