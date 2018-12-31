package part_1.chapter_3.logic;

public class Department {
    {
        System.out.println("logic(1) id=" + this.id);
        //проверка и инициализация параметров конкретного объекта
    }

    static {
        System.out.println("static logic");
    }

    private int id = 7;

    public Department(int id) {
        this.id = id;
        System.out.println("Конструктор id=" + id);
    }

    public int getId() {
        return id;
    }

    {
        System.out.println("logic(2) id=" + id);
    }
}
