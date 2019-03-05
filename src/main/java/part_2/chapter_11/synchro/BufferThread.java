package part_2.chapter_11.synchro;

public class BufferThread {
    private static int counter = 0;
    private static final StringBuffer s = new StringBuffer();

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (s) {
                while (BufferThread.counter++ < 3) {
                    s.append("A");
                    System.out.println("> " + counter + " ");
                    System.out.println(s);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        Thread.sleep(100);
        while (BufferThread.counter++ < 6) {
            System.out.println("< " + counter + " ");
            s.append("B");
            System.out.println(s);
        }
    }
}
