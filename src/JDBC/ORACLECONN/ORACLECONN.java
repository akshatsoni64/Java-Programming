import java.sql.*;

public class ORACLECONN
{
		public static void main(String args[])
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("connecting...");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
				System.out.println("Connection Successful");
				Statement s=con.createStatement();
				ResultSet rs=s.executeQuery("select * from student");
				while(rs.next())
				{
					System.out.println(rs.getInt(2)+"\t"+rs.getString(1));
				}
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}
}