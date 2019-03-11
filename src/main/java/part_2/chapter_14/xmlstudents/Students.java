package part_2.chapter_14.xmlstudents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Students {
    @XmlElement(name = "student")
    private ArrayList<Student> list = new ArrayList<>();

    public Students() {
        super();
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public boolean add(Student st) {
        return list.add(st);
    }

    @Override
    public String toString() {
        return "Students [list=" + list + "]";
    }
}
