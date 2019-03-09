package part_2.chapter_12.data.main;

import part_2.chapter_12.data.connect.DataBaseHelper;
import part_2.chapter_12.data.subject.Abonent;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PreparedJDBCRunner {
    public static void main(String[] args) {
        ArrayList<Abonent> list = new ArrayList<>() {
            {
                add(new Abonent(87, 1658468, "Дмитрий"));
                add(new Abonent(51, 8866711, "Александр"));
            }
        };
        DataBaseHelper helper = null;
        PreparedStatement statement = null;
        try {
            helper = new DataBaseHelper();
            statement = helper.getPreparedStatement();
            for (Abonent abonent : list) {
                helper.insertAbonent(statement, abonent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            helper.closeStatement(statement);
        }
    }
}
