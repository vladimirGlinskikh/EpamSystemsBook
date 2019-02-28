package part_2.chapter_9.serial;

import java.io.*;

public class Serializator {
    public boolean serialization(Student s, String fileName) {
        boolean flag = false;
        File f = new File(fileName);
        ObjectOutputStream ostream = null;
        try {
            FileOutputStream fos = new FileOutputStream(f);
            if (fos != null) {
                ostream = new ObjectOutputStream(fos);
                ostream.writeObject(s);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не может быть создан: " + e);
        } catch (NotSerializableException e) {
            System.err.println("Класс не поддерживает сериализацию: " + e);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (ostream != null) {
                    ostream.close();
                }
            } catch (IOException e) {
                System.err.println("Ошибка закрытия потока");
            }
        }
        return flag;
    }

    public Student deserialization(String fileName) throws InvalidObjectException {
        File fr = new File(fileName);
        ObjectInputStream istream = null;
        try {
            FileInputStream fis = new FileInputStream(fr);
            istream = new ObjectInputStream(fis);
            Student st = (Student) istream.readObject();
            return st;
        } catch (ClassNotFoundException e) {
            System.err.println("Класс не существует: " + e);
        } catch (FileNotFoundException e) {
            System.err.println("Файл для сериализации не существует: ");
        } catch (InvalidClassException e) {
            System.err.println("Несовпадение версий классов: " + e);
        } catch (IOException e) {
            System.err.println("Общая I/O ошибка: " + e);
        } finally {
            try {
                if (istream != null) {
                    istream.close();
                }
            } catch (IOException e) {
                System.err.println("Ошибка закрытия потока ");
            }
        }
        throw new InvalidObjectException("Объект не восстановлен");
    }
}
