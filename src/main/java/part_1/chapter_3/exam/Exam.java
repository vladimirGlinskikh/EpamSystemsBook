package part_1.chapter_3.exam;

public class Exam<T extends Number> {
    private String name;
    private T mark;

    public Exam(T mark, String name) {
        this.name = name;
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }

    private int roundMark() {
        return Math.round(mark.floatValue());
    }

    public boolean equalsToMark(Exam<?> ob) {
        return roundMark() == ob.roundMark();
    }
}
