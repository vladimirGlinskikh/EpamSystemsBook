package part_2.chapter_12.data.main;

import part_2.chapter_12.data.subject.Abonent;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class SimpleJDBCRunner {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/testphones";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "root");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        Connection cn = null;
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try {
            cn = DriverManager.getConnection(url, prop);
            Statement st = null;
            try {
                st = cn.createStatement();
                ResultSet rs = null;
                try {
                    rs = st.executeQuery("SELECT * FROM phonebook");
                    ArrayList<Abonent> lst = new ArrayList<>();
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        int phone = rs.getInt(3);
                        String name = rs.getString(2);
                        lst.add(new Abonent(id, phone, name));
                    }
                    if (lst.size() > 0) {
                        System.out.println(lst);
                    } else {
                        System.out.println("Not found");
                    }
                } finally {
                    if (rs != null) {
                        rs.close();
                    } else {
                        System.err.println("Ошибка во время чтения из Базы данных");
                    }
                }
            } finally {
                if (st != null) {
                    st.close();
                } else {
                    System.err.println("Statement не создан!");
                }
            }
        } catch (SQLException e) {
            System.err.println("DB connection error: " + e);
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.err.println("Connection close error: " + e);
                }
            }
        }
    }
}
