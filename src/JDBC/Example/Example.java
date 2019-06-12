import java.sql.*;

public class Example
{
	public static void main(String args[]) 
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:temp");
			System.out.println("Connection Successful..\n");
			Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into Student(Name,Eno) values(?,?)");
			
			ps.setString(1,"Student1");
			ps.setInt(2,1234);
			int o=ps.executeUpdate();
			
			System.out.println("Inserted Successfully");
			ResultSet rs=st.executeQuery("select * from Student");
			while(rs.next())
			{
				System.out.print(rs.getString("Name")+"\t");
				System.out.println(rs.getInt("Eno"));
			}
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}