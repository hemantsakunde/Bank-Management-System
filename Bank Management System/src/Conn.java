import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "He2002@Dhan107");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
