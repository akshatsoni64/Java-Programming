package JDBC.MYSQLCONN4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MYSQLCONN4 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ppud", "root", "");
            System.out.println("Connection Successful");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from product");

            while (rs.next()) {
                System.out.print(rs.getInt("pid") + "\t");
                System.out.print(rs.getString("pname") + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}