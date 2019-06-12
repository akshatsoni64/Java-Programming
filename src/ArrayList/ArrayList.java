import java.util.*;

class ArrayList
{
	public static void main(String args[])
	{
		ArrayList<String> c=new ArrayList<String>();
		c.add("A");
		c.add("C");
		c.add("D");
		
		int index=c.indexOf("C");
		
		System.out.println(c+" "+index);
		c.add(index,"B");
		System.out.println(c);
	}
}