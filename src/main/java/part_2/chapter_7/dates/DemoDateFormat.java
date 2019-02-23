package part_2.chapter_7.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DemoDateFormat {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        Date d = null;
        String str = "February 24, 2019";
        try {
            d = df.parse(str);
            System.out.println(d);
        } catch (ParseException e) {
            System.err.println("Error position: " + e.getErrorOffset());
        }
        df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RU"));
        System.out.println(df.format(d));

        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
        System.out.println(df.format(d));
    }
}
