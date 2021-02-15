package ex;

import java.io.*;

public class filehandling12_1
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Demo content");

       // writeUTF("Demo content");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);


    }
}
