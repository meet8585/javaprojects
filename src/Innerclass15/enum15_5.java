package Innerclass15;
enum  MobileCompany
{
    Apple, samsung, htc;

    int price;

    MobileCompany()
    {
        price = 80;
    }
    MobileCompany(int p)
    {
        price= p ;
    }
     public int getPrice()
     {
         return price;
     }



}

public class enum15_5
{
    public static void main(String[] args)
    {

        // System.out.println(MobileCompany.Apple);
        MobileCompany m = MobileCompany.samsung;
        System.out.println(MobileCompany.Apple.getPrice());

        switch (m)
        {
            case samsung:
                System.out.println("It is the best");
                break;
            case Apple:
                System.out.println("It is ok");
                break;
            case htc:
                System.out.println("It vanished");
                break;
        }
    }
}
