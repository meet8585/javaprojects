package api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Locale;

public class datetimeapi
{
    public static void main(String[] args)
    {

        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now(ZoneId.of("GMT"));
        System.out.println(t);
        LocalDateTime e = LocalDateTime.now();
        System.out.println(e);
    }
}
