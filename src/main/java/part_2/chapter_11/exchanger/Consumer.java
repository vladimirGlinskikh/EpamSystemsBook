package part_2.chapter_11.exchanger;

public class Consumer extends Subject implements Runnable {
    public Consumer(String name, Item item) {
        super(name, item);
    }

    @Override
    public void run() {
        try {
            synchronized (item) {
                int requiredNumber = item.getNumber();
                item = exchanger.exchange(item);
                if (requiredNumber >= item.getNumber()) {
                    System.out.println("Consumer " + getName()
                            + " повышает стоимость товара");
                } else {
                    System.out.println("Consumer " + getName()
                            + " снижает стоимость товара");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
