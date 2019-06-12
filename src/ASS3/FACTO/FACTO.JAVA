import java.util.Scanner;
class FACTO
{
	public static int fact(int x)
	{
		int f=1;
		for(int i=1;i<=x;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static void main(String args[])
	{
		int a,f;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Number : ");
		a=s1.nextInt();
		System.out.println("Factorial : "+fact(a));
	}
}