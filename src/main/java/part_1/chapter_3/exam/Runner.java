package part_1.chapter_3.exam;

public class Runner {
    public static void main(String[] args) {
        Exam<Double> md1 = new Exam<>(71.41D, "Progr");
        Exam<Double> md2 = new Exam<>(71.45D, "Progr");
        System.out.println(md1.equalsToMark(md2));
        Exam<Integer> mi = new Exam<>(71, "Progr");
        System.out.println(md1.equalsToMark(mi));
    }
}
