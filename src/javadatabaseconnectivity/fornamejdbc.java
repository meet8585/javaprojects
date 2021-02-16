package javadatabaseconnectivity;

import java.sql.DriverManager;

public class fornamejdbc
{
    public static void main(String[] args) throws  Exception
    {
        Class.forName("pqr");

        //DriverManager.registerDriver(new com.msql.jdbc.driver);
        //connection con = Dr

    }
}
class pqr
{
    static
    {
        System.out.println("Instart");
    }
    {
        System.out.println("In instance");
    }
}