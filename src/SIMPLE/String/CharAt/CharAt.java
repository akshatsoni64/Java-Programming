import java.util.Scanner;
class CharAt
{
	public static void main(String args[])
	{
		char c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a Character:");
		c=s1.next().charAt(0);
		System.out.println("Entered Character is :"+c);
	}
}