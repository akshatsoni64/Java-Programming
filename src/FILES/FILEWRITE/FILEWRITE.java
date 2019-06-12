import java.io.*;
class FILEWRITE
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("C://JAVA/FILES/FILECREATE/FILE/file1.txt");
			String s="Akshat";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Writing Complete");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}