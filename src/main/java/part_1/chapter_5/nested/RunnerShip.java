package part_1.chapter_5.nested;

public class RunnerShip {
    public static void main(String[] args) {
        Ship.LifeBoat.down();
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
        lifeBoat.swim();
    }
}
