package part_2.chapter_7.format;

import java.util.Formatter;

public class SimpleFormatString {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("This %s is about %n%S %s", "book", "java", '8');
        System.out.println(f);
    }
}
