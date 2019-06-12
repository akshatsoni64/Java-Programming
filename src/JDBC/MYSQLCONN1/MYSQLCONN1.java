import java.sql.*;

public class MYSQLCONN1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:testsql","root"," ");
			System.out.println("Connection Successful");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from product");
			
			while(rs.next())
			{
				System.out.print(rs.getInt("pid")+"\t");
				System.out.print(rs.getString("pname")+"\n");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}