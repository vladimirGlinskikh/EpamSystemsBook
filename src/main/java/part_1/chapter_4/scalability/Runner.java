package part_1.chapter_4.scalability;

public class Runner {
    public static void main(String[] args) {
        TestAction bt = new TestAction();
        AbstractQuest[] test = bt.generateTest(60, 2);
        bt.checkTest(test);
    }
}
