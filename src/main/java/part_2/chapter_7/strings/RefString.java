package part_2.chapter_7.strings;

public class RefString {
    public static void changeStr(String s) {
        s = s.concat(" Certified");
    }

    public static void main(String[] args) {
        String str = new String("Java");
        changeStr(str);
        System.out.print(str);
    }
}
