//Program to reverse an integer number
import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		int n,n1=0,n2=0,r=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Number :");
		n=s1.nextInt();
		
		while(n>0)
		{
			n1=n;
			r=n1%10;
			n2=(n2*10)+r;
			n=n/10;
		}
		
		System.out.println("\nReverse Number : "+n2);
	}
}