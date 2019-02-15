package part_1.chapter_4.point;

public class Point1D {
    private int x;

    public Point1D(int x) {
        this.x = x;
    }

    public double length() {
        return Math.abs(x);
    }

    @Override
    public String toString() {
        return "Point1D{" +
                "x=" + x +
                '}';
    }
}
