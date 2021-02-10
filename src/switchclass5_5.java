public class switchclass5_5
{
    public static void main(String[] args)
    {
        int i =0;



/*
        if(i==4)
        System.out.println("Four");

        if(i==5)
            System.out.printf("Five");
            using if for more than 2 situation will take lot of lines of code
            instead lets use switch
*/
        switch(9)
        {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 7:
                System.out.println("seven" );
            break;
            case 8:
                System.out.println("Eight");
                break;
            default:
                    System.out.println("somenumber");
        }
        String s ="Hi";
        switch(s)
        {
            case "Hi":
                System.out.println("Hi");
                break;
            case "Hello":
                    System.out.println("Hello");
                    break;
        }
    }
}
