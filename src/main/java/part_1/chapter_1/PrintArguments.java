package part_1.chapter_1;

public class PrintArguments {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.printf("Аргумент -> %s%n", str);
        }
    }
}
