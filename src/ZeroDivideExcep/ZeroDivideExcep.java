import java.util.Scanner;
class testexception
{
	public static void main(String sr[])
	{
	int a,b,c;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter a:");
	a=s1.nextInt();
	System.out.println("enter b:");
	b=s1.nextInt();
		try
		{
			c=a/b;
			System.out.println("c="+c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("system msg : "+a1.getMessage());
			System.out.println("user msg : divided by zero");
		}
	}
}