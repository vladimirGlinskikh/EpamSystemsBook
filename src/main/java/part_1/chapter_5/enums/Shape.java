package part_1.chapter_5.enums;

public enum Shape {
    RECTANGLE, SQUARE, TRIANGLE {
        public double computeSquare() {
            return this.getA() * this.getB() / 2;
        }
    };
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setShape(double a, double b) {
        if ((a <= 0 || b <= 0) || a != b && this == SQUARE) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
    }

    public double computeSquare() {
        return a * b;
    }

    public String toString() {
        return name() + "-> a=" + a + ", b=" + b;
    }
}
