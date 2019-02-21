package part_2.chapter_7.strings;

public class DemoStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("Длина -> " + sb.length());
        System.out.println("Размер -> " + sb.capacity());
        sb.append("Java");
        System.out.println("Строка -> " + sb);
        System.out.println("Длина -> " + sb.length());
        System.out.println("Размер -> " + sb.capacity());

        sb.append("Internationalization");
        System.out.println("Строка -> " + sb);
        System.out.println("Длина -> " + sb.length());
        System.out.println("Размер -> " + sb.capacity());

        System.out.println("Реверс -> " + sb.reverse());
    }
}
