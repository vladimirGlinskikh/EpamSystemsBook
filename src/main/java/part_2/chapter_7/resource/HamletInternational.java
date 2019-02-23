package part_2.chapter_7.resource;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class HamletInternational {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("1 - английский \n 2 - белорусский \n любой - русский ");
            char j = 0;
            try {
                j = (char) System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String country = "";
            String language = "";
            switch (j) {
                case '1':
                    language = "en";
                    country = "US";
                    break;
                case '2':
                    language = "be";
                    country = "BY";
                    break;
            }
            Locale current = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("property.text", current);
            String s1 = rb.getString("str1");
            System.out.println(s1);

            String s2 = rb.getString("str2");
            System.out.println(s2);
        }
    }
}
