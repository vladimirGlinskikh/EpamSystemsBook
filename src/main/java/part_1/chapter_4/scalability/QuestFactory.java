package part_1.chapter_4.scalability;

public class QuestFactory {
    public static AbstractQuest getQuestFromFactory(int mode) {
        switch (mode) {
            case 0:
                return new DragnDropQuest();
            case 1:
                return new SingleChoiceQuest();
            default:
                throw new IllegalArgumentException("illegal mode");
        }
    }
}
