package part_1.chapter_4.sample;

public class Runner {
    public static void main(String[] args) {
        Base ob = new Sub();
        ob.go();
        Base.go();
    }
}
