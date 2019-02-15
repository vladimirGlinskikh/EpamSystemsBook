package part_1.chapter_4;

public class Coin {
    private double diameter;

    public Coin(double diameter) {
        super();
        initDiameter(diameter);
    }

    public final void initDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Отрицательный диаметр!");
        }
    }
}
