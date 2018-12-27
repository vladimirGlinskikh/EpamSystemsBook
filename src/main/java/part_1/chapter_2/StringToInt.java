package part_1.chapter_2;

public class StringToInt {
    public static void main(String[] args) {
        String arg = "71";
        try {
            int value1 = Integer.parseInt(arg);// возвращает int
            int value2 = Integer.valueOf(arg); // возвращает Integer
            int value3 = Integer.decode(arg); // возвращает Integer
            System.out.println(value1);
            System.out.println(value2);
            System.out.println(value3);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат числа " + e);
        }
    }
}
