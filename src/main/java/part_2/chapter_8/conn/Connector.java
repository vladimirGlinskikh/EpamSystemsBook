package part_2.chapter_8.conn;

public class Connector {
    public static void loadResource(SameResource f) {
        if (f == null || !f.exists() || !f.isCreate()){
            throw new IllegalArgumentException();
        }
    }
}
