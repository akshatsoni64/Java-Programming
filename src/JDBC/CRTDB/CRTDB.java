import java.sql.*;

public class CRTDB
{
	
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			System.out.println("Connection Established");
			
			Statement st=c.createStatement();
			st.executeUpdate("create database db21"); 
			System.out.println("Done");
			
			st.executeUpdate("use db21");
			
			st.executeUpdate("create table tb1(c1 int,c2 varchar(20))");
			System.out.println("DOne");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}