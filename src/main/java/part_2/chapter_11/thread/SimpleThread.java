package part_2.chapter_11.thread;

public class SimpleThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println("end of SimpleThread");
    }
}
