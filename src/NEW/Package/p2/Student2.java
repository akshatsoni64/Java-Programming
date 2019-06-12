//Write a java program to demonstrate use of static import
package p2;

import static p1.Student1.*;

class Student2
{
	static void printy()
	{
		System.out.println("A : "+a);
	}
	
	public static void main(String args[])
	{
		printy();
	}
}