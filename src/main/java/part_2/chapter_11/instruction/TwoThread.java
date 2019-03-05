package part_2.chapter_11.instruction;

public class TwoThread {
    private static int counter = 0;

    public static void main(String[] args) {
        final StringBuilder s = new StringBuilder();
        new Thread(() -> {
            synchronized (s) {
                do {
                    s.append("A");
                    System.out.println(s);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        //noinspection ThrowablePrintedToSystemOut
                        System.err.println(e);
                    }
                } while (TwoThread.counter++ < 2);
            }
        }).start();
        new Thread(() -> {
            synchronized (s) {
                while (TwoThread.counter++ < 6) {
                    s.append("B");
                    System.out.println(s);
                }
            }
        }).start();
    }
}
