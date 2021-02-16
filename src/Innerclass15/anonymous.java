package Innerclass15;

public class anonymous {
    public static void main(String[] args)
    {


        D obj = new D()
        {
            public void show()
            {
                System.out.println("Hi");
            }
        };
        obj.show();

    }
}



class D
{
    public void show()
    {
        System.out.println("Hello");
    }
}

