package part_2.chapter_8.conn;

public class Runner {
    public static void main(String[] args) {
        SameResource f = new SameResource();
        try {
            Connector.loadResource(f);
        } catch (IllegalArgumentException e) {
            System.err.println("Обработка unchecked-исключения вне метода: " + e);
        }
    }
}
