package part_1.chapter_4.gc;

public class Manager {
    private int id;

    public Manager(int value) {
        id = value;
    }

    protected void finalize() throws Throwable {
        try {
            System.out.println("Объект будет удален, id = " + id);
        } finally {
            super.finalize();
        }
    }
}
