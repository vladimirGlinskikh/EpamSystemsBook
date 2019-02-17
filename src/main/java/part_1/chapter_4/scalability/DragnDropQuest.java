package part_1.chapter_4.scalability;

public class DragnDropQuest extends AbstractQuest {
    @Override
    public boolean check(Answer ans) {
        System.out.println("Drag'n Drop quest!");
        return true;
    }
}
