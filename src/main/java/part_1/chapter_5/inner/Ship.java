package part_1.chapter_5.inner;

public class Ship {
    private Engine eng;

    public class Engine {
        public void launch() {
            System.out.println("Запуск двигателя!");
        }
    }

    public final void init() {
        eng = new Engine();
        eng.launch();
    }
}
