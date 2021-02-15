package ex;

import net.glxn.qrgen.image.ImageType;
import net.glxn.qrgen.QRCode;
import java.io.FileOutputStream;

import java.io.ByteArrayOutputStream;

public class qrcodegeneration11_4
{
    public static void main(String[] args)
    {
        String details = "Meetkumar Patel: Channel name: Rangeela.....";


        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG). stream();
        //File f = new File()


    }
}
