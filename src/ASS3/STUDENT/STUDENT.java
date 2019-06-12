import java.util.Scanner;
class STU
{
	int rollNo;
	String str;
	public void display(int x,String y)
	{
		rollNo=x;
		str=y;
		System.out.println(rollNo);
		System.out.println(str);
	}
}
class STUDENT
{
	public static void main(String args[])
	{
		STU s1=new STU();
		STU s2=new STU();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Roll No. : ");
		s1.rollNo=s.nextInt();
		System.out.println("Enter Name : ");
		s1.str=s.next();
		s2.display(s1.rollNo,s1.str);
	}
}