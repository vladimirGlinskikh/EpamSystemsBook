package part_1.chapter_4.entity;

public class Student {
    private int id;
    private int age;
    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (age != other.age)
            return false;
        if (id != other.id)
            return false;
        if (name == null)
            if (other.name != null)
                return false;
            else if (!name.equals(other.name))
                return false;
        return true;
    }

    public int hashCode() {
        return (int) (31 * id + age + ((name == null) ? 0 : name.hashCode()));
    }

    public String toString() {
        return getClass().getName() + "@name" + name + " id:" + id + " age:" + age;
    }
}
