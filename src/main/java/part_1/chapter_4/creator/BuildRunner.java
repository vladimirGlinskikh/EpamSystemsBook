package part_1.chapter_4.creator;

import part_1.chapter_4.point.Point2D;

public class BuildRunner {
    public static void main(String[] args) {
        Point2DCreator br = new Point3DCreator();
        Point2D p = br.createPoint();
        System.out.println(br.createPoint().x);
        System.out.println(br.createPoint().y);
    }
}
