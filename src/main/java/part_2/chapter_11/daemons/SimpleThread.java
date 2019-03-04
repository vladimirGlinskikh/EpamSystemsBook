package part_2.chapter_11.daemons;

public class SimpleThread extends Thread {
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("Старт потока-демона");
                Thread.sleep(10_000);
            } else {
                System.out.println("Старт обычного потока");
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        } finally {
            if (!isDaemon()) {
                System.out.println("Завершение обычного потока");
            } else {
                System.out.println("Завершение потока-демона");
            }
        }
    }
}
