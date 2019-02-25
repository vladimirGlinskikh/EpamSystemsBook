package part_2.chapter_9.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) {
        String file = "data\\file.txt";
        File f = new File(file);
        int b, count = 0;
        FileReader is = null;
        try {
            is = new FileReader(f);
            while ((b = is.read()) != -1) {
                System.out.print((char) b);
                count++;
            }
            System.out.print("\n число байт = " + count);
        } catch (IOException e) {
            System.err.println("Ошибка файла: " + e);
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                System.err.println("Ошибка закрытия: " + e);
            }
        }
    }
}
