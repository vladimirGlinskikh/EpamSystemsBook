package part_2.chapter_7.strings;

public class EqualsStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(48);
        sb1.append("Java");
        sb2.append("Java");
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.hashCode() == sb2.hashCode());
        System.out.println(sb1.toString().contentEquals(sb2));
    }
}
