package ex;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertiesoffiles12_2
{
    public static void main(String[] args) throws Exception
    {

        Properties p = new Properties();
        OutputStream os = new FileOutputStream("dataConfig.properties");


        p.setProperty("url", "localhost:3306/myDb");
        p.setProperty("uname", "meet");
        p.setProperty("pass", "0000");

        p.store(os, null);

    }
}

