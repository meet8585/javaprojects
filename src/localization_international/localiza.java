package localization_international;

import java.util.Locale;
import java.util.ResourceBundle;

public class localiza {
    public static void main(String[] args)
    {

        //l10n _> localization
        //I18N internationalizatiion

        //locale
        //resourcebunble ->java.util


      String lang = "en";
      String country = "us";

      Locale l = new Locale(lang, country);
       // ResourceBundle r = ResourceBundle.getBundle(localiza/.properties, l);


       // String str= r.getString("wish");
       // System.out.println(str);


    }
}
