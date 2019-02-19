package part_1.chapter_5.inner.study;

public class TeacherLogic {
    public void excludeProcess(int rectorId, String nameStudent) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);

        System.out.println("Студент: " + nameStudent + " отчислен:" + teacher.excludeStudent(nameStudent));
    }
}
