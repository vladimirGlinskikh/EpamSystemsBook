package part_1.chapter_4.entity;

public class Runner {
    private static void mutation(Student p) {
        try {
            p = (Student) p.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        p.setId(1000);
        System.out.println("->id = " + p.getId());
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("id = " + student.getId());
        mutation(student);
        System.out.println("id = " + student.getId());
    }
}
