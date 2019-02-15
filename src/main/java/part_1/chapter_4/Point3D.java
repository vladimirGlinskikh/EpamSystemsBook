package part_1.chapter_4;

public class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        this(-1, -1, -1); // вызов конструктора Point3D с параметрами
    }
}
