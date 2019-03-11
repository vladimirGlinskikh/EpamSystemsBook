package part_2.chapter_14.jaxb;

import part_2.chapter_14.xmlstudents.Student;
import part_2.chapter_14.xmlstudents.Students;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MarshalMain {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Students.class);
            Marshaller m = context.createMarshaller();
            Students st = new Students() {
                {
                    Student.Address addr = new Student.Address("BLR", "Minsk", "Skoriny 4");
                    Student s = new Student("gochette", "Klimenko", "mmf", 2095306, addr);
                    this.add(s);

                    addr = new Student.Address("KZ", "Rudny", "Studencheskay 11");
                    s = new Student("ivette", "Teran", "mmf", 2345386, addr);
                    this.add(s);
                }
            };
            m.marshal(st, new FileOutputStream("src\\main\\resources\\data\\studs_marsh.xml"));
            m.marshal(st, System.out);
            System.out.println("XML-файл создан!");
        } catch (FileNotFoundException e) {
            System.out.println("XML-файл не может быть создан: " + e);
        } catch (JAXBException e) {
            System.out.println("JAXB-контекст ошибочен " + e);
        }
    }
}
