package part_2.chapter_11.management;

public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    public void run() {
        String nameT = getName();
        long timeOut = 0;
        System.out.println("Старт потока " + nameT);
        try {
            switch (nameT) {
                case "First":
                    timeOut = 5_000;
                    break;
                case "Second":
                    timeOut = 1_000;
            }
            Thread.sleep(timeOut);
            System.out.println("Завершение потока " + nameT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
