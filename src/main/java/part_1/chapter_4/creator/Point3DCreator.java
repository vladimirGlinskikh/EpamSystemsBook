package part_1.chapter_4.creator;

import part_1.chapter_4.point.Point3D;

public class Point3DCreator extends Point2DCreator {
    @Override
    public Point3D createPoint() {
        System.out.println("Point3D");
        return new Point3D(3, 7, 8);
    }
}
