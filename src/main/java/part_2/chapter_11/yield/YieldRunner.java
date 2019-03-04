package part_2.chapter_11.yield;

public class YieldRunner {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Старт потока 1");
            Thread.yield();
            System.out.println("Завершение 1");
        }).start();
        new Thread(() -> {
            System.out.println("Старт потока 2");
            System.out.println("Завершение 2");
        }).start();
    }
}
