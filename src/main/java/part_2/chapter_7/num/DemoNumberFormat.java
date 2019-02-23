package part_2.chapter_7.num;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class DemoNumberFormat {
    public static void main(String[] args) {
        NumberFormat nfGe = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
        NumberFormat nfF = NumberFormat.getInstance(Locale.FRANCE);
        double iGe = 0, iUs = 0, iFr = 0;
        String str = "1.234,5";
        try {
            iGe = nfGe.parse(str).doubleValue();
            iUs = nfUs.parse(str).doubleValue();
            iFr = nfF.parse(str).doubleValue();
        } catch (ParseException e) {
            System.err.print("Error position: " + e.getErrorOffset());
        }
        System.out.printf("iGe = %f\niUs = %f\niFr = %f", iGe, iUs, iFr);

        String sUs = nfUs.format(iGe);
        String sFr = nfF.format(iGe);
        System.out.println("\nUs " + sUs + "\nFr " + sFr);
    }
}
