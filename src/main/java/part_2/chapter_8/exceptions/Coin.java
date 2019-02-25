package part_2.chapter_8.exceptions;

public class Coin {
    private double diameter;
    private double weight;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) throws CoinLogicException {
        if (value <= 0) {
            throw new CoinLogicException("diameter is incorrect");
        }
        diameter = value;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
