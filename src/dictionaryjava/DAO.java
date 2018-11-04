package dictionaryjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.sqlite.SQLiteException;

public class DAO {

    protected Connection conn;

    public DAO() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Le Hung\\Downloads\\dict.sqlite");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void AddWord(Word s) {
        String sqlite = "INSERT INTO tbl_edict (idx,word,detail)" + "VALUES(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlite);
            ps.setString(1, "1");
            ps.setString(2, s.word_taget);
            ps.setString(3, s.word_explain);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editWord(String word_target, String word_explain) throws SQLException {
        String sqlite = "update tbl_edict set detail =? where word = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sqlite);

            preparedStatement.setString(2, word_target);

            preparedStatement.setString(1, word_explain);

            preparedStatement.executeUpdate();
            preparedStatement.close();
            conn.close();

        } catch (SQLiteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteWord(String word_target) {

        String sqlite = "delete from tbl_edict where word = ?";
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập từ cần xóa: ");
//        String word_target = scanner.nextLine();

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sqlite);

            preparedStatement.setString(1, word_target);
            preparedStatement.executeUpdate();

            preparedStatement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
