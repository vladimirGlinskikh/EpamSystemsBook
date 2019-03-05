package part_2.chapter_11.synch;

import java.io.FileWriter;
import java.io.IOException;

public class Resource {
    private FileWriter fileWriter;

    public Resource(String file) throws IOException {
        fileWriter = new FileWriter(file, true);
    }

    public synchronized void writing(String str, int i) {
        try {
            fileWriter.append(str + i);
            System.out.println(str + i);
            Thread.sleep((long) (Math.random() * 50));
            fileWriter.append("->" + i + " ");
            System.out.println("->" + i + " ");
        } catch (IOException e) {
            System.err.println("Ошибка файла: " + e);
        } catch (InterruptedException e) {
            System.err.println("Ошибка потока: " + e);
        }
    }

    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Ошибка закрытия файла: " + e);
        }
    }
}
