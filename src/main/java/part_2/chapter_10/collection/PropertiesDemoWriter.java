package part_2.chapter_10.collection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemoWriter {
    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            props.setProperty("db.driver", "com.mysql.jdbc.Driver");
            props.setProperty("db.user", "root");
            props.setProperty("db.password", "pass");
            props.setProperty("db.pollsize", "5");
            props.store(new FileWriter("prop" + File.separator + "database.properties"), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
