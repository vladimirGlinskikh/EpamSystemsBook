package part_1.chapter_5.nested;

public class Ship {
    private int id;

    public static class LifeBoat {
        private int boatId;

        public static void down() {
            System.out.println("Шлюпки на воду!");
        }

        public void swim() {
            System.out.println("Отплытие шлюпки...");
        }
    }
}
