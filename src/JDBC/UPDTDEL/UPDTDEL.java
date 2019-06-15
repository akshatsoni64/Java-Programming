package JDBC.UPDTDEL;
import java.sql.*;

public class UPDTDEL {
    public static void main(String[] args) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:temp");
            System.out.println("Connection Successful..\n");
            Statement st = con.createStatement();

            PreparedStatement ps1 = con.prepareStatement("update Student set Eno='7592' where Name='Akshat'");
            int o = ps1.executeUpdate();
            System.out.println("Updated Successfully");

            PreparedStatement ps2 = con.prepareStatement("delete from Student where Eno=7598");
            int p = ps2.executeUpdate();
            System.out.println("Deleted Successfully");

            ResultSet rs = st.executeQuery("select * from Student");
            while (rs.next()) {
                System.out.print(rs.getString("Name") + "\t");
                System.out.println(rs.getInt("Eno"));
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
} 