package part_1.chapter_4.gc;

public class FinalizeDemo {
    public static void main(String[] args) {
        Manager d1 = new Manager(1);
        d1 = null;
        Manager d2 = new Manager(2);
        Object d3 = d2;
        d2 = d1;
        System.gc();
    }
}
