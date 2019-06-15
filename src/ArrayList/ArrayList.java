import java.util.*;

class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList<Integer> c=new ArrayList<Integer>();
		c.add(1);
		c.add(2);
		c.add(3);

		int index=c.indexOf(2);

		System.out.println(c+" "+index);
		c.add(index,4);
		System.out.println(c);
	}
}
