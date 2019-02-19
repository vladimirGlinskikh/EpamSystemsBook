package part_1.chapter_5.inner.study;

public class Runner {
    public static void main(String[] args) {
        TeacherLogic teacherLogic = new TeacherLogic();
        teacherLogic.excludeProcess(777, "Олейников");
        teacherLogic.excludeProcess(6, "Олейников");
    }
}
