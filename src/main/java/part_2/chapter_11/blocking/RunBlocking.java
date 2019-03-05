package part_2.chapter_11.blocking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class RunBlocking {
    public static void main(String[] args) {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
        new Thread(() -> {
            for (int i = 1; i < 4; i++) {
                try {
                    queue.put("Java" + i);
                    System.out.println("Element " + i + " added");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(1_000);
                System.out.println("Element " + queue.take() + " took");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
