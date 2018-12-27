package part_1.chapter_2;

public class StringToInt {
    public static void main(String[] args) {
        String arg = "71";
        int value = 71;
        try {
            int value1 = Integer.parseInt(arg);// возвращает int
            int value2 = Integer.valueOf(arg); // возвращает Integer
            int value3 = Integer.decode(arg); // возвращает Integer
            // обратное преобразование из int в String
            String arg1 = Integer.toString(value);
            String arg2 = String.valueOf(value);
            String arg3 = "" + value; // плохой способ
            System.out.println(value1);
            System.out.println(value2);
            System.out.println(value3);
            System.out.println("--------------------");
            System.out.println(arg1);
            System.out.println(arg2);
            System.out.println(arg3);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат числа " + e);
        }
    }
}
